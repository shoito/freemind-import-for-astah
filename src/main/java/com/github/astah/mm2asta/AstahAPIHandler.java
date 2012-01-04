package com.github.astah.mm2asta;

import javax.swing.JFrame;

import com.change_vision.jude.api.inf.editor.BasicModelEditor;
import com.change_vision.jude.api.inf.editor.IDiagramEditorFactory;
import com.change_vision.jude.api.inf.editor.IModelEditorFactory;
import com.change_vision.jude.api.inf.editor.MindmapEditor;
import com.change_vision.jude.api.inf.exception.InvalidEditingException;
import com.change_vision.jude.api.inf.exception.InvalidUsingException;
import com.change_vision.jude.api.inf.project.ProjectAccessor;
import com.change_vision.jude.api.inf.project.ProjectAccessorFactory;
import com.change_vision.jude.api.inf.view.IDiagramViewManager;
import com.change_vision.jude.api.inf.view.IViewManager;
import com.github.astah.mm2asta.exception.APIException;

public class AstahAPIHandler {
	public String getAstahEdition() {
		String edition = getProjectAccessor().getAstahEdition();
		if (edition.isEmpty()) {
			edition = "professional";
		}
		return edition;
	}
	
	public IDiagramViewManager getDiagramViewManager() {
		IViewManager viewManager = getViewManager();
	    IDiagramViewManager diagramViewManager = viewManager.getDiagramViewManager();
		return diagramViewManager;
	}

	public MindmapEditor getMindmapEditor() {
		try {
			return getDiagramEditorFactory().getMindmapEditor();
		} catch (InvalidUsingException e) {
			throw new APIException(e);
		}
	}

	public BasicModelEditor getBasicModelEditor() {
		try {
			return getModelEditorFactory().getBasicModelEditor();
		} catch (InvalidEditingException e) {
			throw new APIException(e);
		}
	}

	public ProjectAccessor getProjectAccessor() {
		ProjectAccessor projectAccessor = null;
		try {
			projectAccessor = ProjectAccessorFactory.getProjectAccessor();
		} catch (ClassNotFoundException e) {
	        throw new IllegalStateException(e);
		}
		if(projectAccessor == null) throw new IllegalStateException("ProjectAccessor must not be null.");
		return projectAccessor;
	}

	public JFrame getMainFrame() {
		return getProjectAccessor().getViewManager().getMainFrame();
	}

	private IViewManager getViewManager() {
		ProjectAccessor projectAccessor = getProjectAccessor();
		IViewManager viewManager = projectAccessor.getViewManager();
		if(viewManager == null) throw new IllegalStateException("ViewManager must not be null.");
		return viewManager;
	}

	private IModelEditorFactory getModelEditorFactory() {
		ProjectAccessor projectAccessor = getProjectAccessor();
		IModelEditorFactory modelEditorFactory = projectAccessor.getModelEditorFactory();
		if(modelEditorFactory == null) throw new IllegalStateException("modelEditorFactory must not be null.");
		return modelEditorFactory;
	}

	private IDiagramEditorFactory getDiagramEditorFactory() {
		ProjectAccessor projectAccessor = getProjectAccessor();
		IDiagramEditorFactory diagramEditorFactory = projectAccessor.getDiagramEditorFactory();
		if(diagramEditorFactory == null) throw new IllegalStateException("diagramEditorFactory must not be null.");
		return diagramEditorFactory;
	}

}
