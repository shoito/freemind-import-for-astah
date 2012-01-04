package com.github.astah.mm2asta;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.apache.commons.lang.StringUtils;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import ch.qos.logback.classic.Logger;

import com.change_vision.jude.api.inf.editor.MindmapEditor;
import com.change_vision.jude.api.inf.editor.TransactionManager;
import com.change_vision.jude.api.inf.model.IDiagram;
import com.change_vision.jude.api.inf.model.IMindMapDiagram;
import com.change_vision.jude.api.inf.model.IModel;
import com.change_vision.jude.api.inf.presentation.INodePresentation;
import com.change_vision.jude.api.inf.project.ProjectAccessor;
import com.change_vision.jude.api.inf.project.ProjectAccessorFactory;
import com.github.astah.mm2asta.model.Cloud;
import com.github.astah.mm2asta.model.Icon;
import com.github.astah.mm2asta.model.Map;
import com.github.astah.mm2asta.model.Node;
import com.github.astah.mm2asta.usericon.UserIcon;

public class MmWalker {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(MmWalker.class);
	private static final String ICONS_PROPERTY = "icons";
	
	ProjectAccessor projectAccessor;
	MindmapEditor mindmapEditor;
	String currentPosition = "right";

	public void walk(String filePath) throws Throwable {
		projectAccessor = ProjectAccessorFactory.getProjectAccessor();
		mindmapEditor = projectAccessor.getDiagramEditorFactory().getMindmapEditor();
		
		if (!TransactionManager.isInTransaction()) {
			TransactionManager.beginTransaction();
		}
		
		try {
			Map map = read(filePath);
			Node node = map.getNode();
			scan(null, node);
		} catch (Exception e) {
			logger.error("Import failed:" + filePath, e);
			if (TransactionManager.isInTransaction()) {
				TransactionManager.abortTransaction();
			}
		}
		
		if (TransactionManager.isInTransaction()) {
			TransactionManager.endTransaction();
		}
	}
	
	private Map read(String filePath) throws SAXException, JAXBException, FileNotFoundException {
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		URL schemaURL = Map.class.getClassLoader().getResource("schema/freemind.xsd");
		Schema schema = factory.newSchema(schemaURL);
		
		JAXBContext context = JAXBContext.newInstance(Map.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		unmarshaller.setSchema(schema);
		Map map = (Map) unmarshaller.unmarshal(new BufferedInputStream(new FileInputStream(filePath)));
		return map;
	}

	private void scan(INodePresentation parent, Node node) throws Throwable {
		INodePresentation topic = scanNode(parent, node);	
		
		List<Object> arrowlinkOrCloudOrEdge = node.getArrowlinkOrCloudOrEdge();
		for (Object element : arrowlinkOrCloudOrEdge) {
			if (element instanceof Node) {
				scan(topic, (Node) element);
			} else if (element instanceof Cloud) {
				mindmapEditor.setBoundaryVisibility(topic, true);
			} else if (element instanceof Icon) {
				String icon = ((Icon) element).getBUILTIN();

				@SuppressWarnings("rawtypes") HashMap properties = topic.getProperties();
				String icons = (String) properties.get(ICONS_PROPERTY);
				icons = (icons.isEmpty()) ? UserIcon.UUID_PREFIX + icon : icons + "," + UserIcon.UUID_PREFIX + icon;
				topic.setProperty(ICONS_PROPERTY, icons);
			}
		}
	}
	
	private INodePresentation scanNode(INodePresentation parent, Node node) throws Throwable {
		INodePresentation topic = null;
		String text = node.getTEXT();
		
		StringBuilder lineText = new StringBuilder();
		if (text != null) {
			lineText.append(text);
			lineText.append("¥t");
		}
		
		String topicText = StringUtils.defaultIfBlank(text, "_");
		if (parent == null) {
			IMindMapDiagram mindmap = createMindmap(topicText);
			return mindmap.getRoot();
		}
		
		currentPosition = node.getPOSITION();
		
		lineText.append(currentPosition);
		if (currentPosition != null && currentPosition.equals("left")) {
			topic = mindmapEditor.createTopic(parent, topicText, "left");
		} else {
			topic = mindmapEditor.createTopic(parent, topicText);
		}
		
		String link = node.getLINK();
		if (link != null) {
			topic.createURLHyperlink(link, "Link");
		}
		
		return topic;
	}
	
	private IMindMapDiagram createMindmap(String text) throws Exception {
		if (hasSameMindmap(text)) {
			return createMindmap(text + "_0");
		}
		IModel project = projectAccessor.getProject();
		IMindMapDiagram mindmap = mindmapEditor.createMindmapDiagram(project, text);
		mindmapEditor.setDiagram(mindmap);
		return mindmap;
	}
	
	private boolean hasSameMindmap(String name) throws Exception {
		IModel project = projectAccessor.getProject();
		IDiagram[] diagrams = project.getDiagrams();
		for (IDiagram diagram : diagrams) {
			if (diagram instanceof IMindMapDiagram 
					&& ((IMindMapDiagram) diagram).getRoot().getLabel().equals(name)) {
				return true;
			}
		}
		return false;
	}
}
