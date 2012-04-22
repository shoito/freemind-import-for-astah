package com.github.astah.mm2asta.model;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.MutableAttributeSet;
import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.parser.ParserDelegator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "any"
})
@XmlRootElement(name = "html")
public class Html {
	private static final Logger logger = LoggerFactory.getLogger(Html.class);

    @XmlAnyElement
    protected List<Element> any;

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    public String getBodyText() {
		Element body = getBody();
		if (body == null) {
			return "";
		}

		String text = null;
		try {
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty(OutputKeys.METHOD, "html");
			StringWriter stringWriter = new StringWriter();
			transformer.transform(new DOMSource(body), new StreamResult(stringWriter));
			text = convertText(stringWriter.toString());
		} catch (TransformerException e) {
			logger.warn(e.getLocalizedMessage(), e);
		}
		
    	return text;
    }
	
	private String convertText(String html) {
		StringReader reader = new StringReader(html);
		HtmlParserCallback callback = new HtmlParserCallback();
		ParserDelegator parser = new ParserDelegator();
		try {
			parser.parse(reader, callback, true);
		} catch (IOException e) {
			logger.warn(e.getLocalizedMessage(), e);
		} finally {
			if (reader != null) {
				reader.close();
			}
		}

		return callback.getText();
	}
    
    private Element getBody() {
		List<Element> elements = getAny();
		for (Element element : elements) {
			if (element.getTagName().equalsIgnoreCase("body")) {
				return element;
			}
		}
		return null;
    }
    
    static class HtmlParserCallback extends HTMLEditorKit.ParserCallback {
    	private StringBuffer sb;

    	public HtmlParserCallback() {
    		sb = new StringBuffer();
    	}

    	public String getText() {
    		return sb.toString().replaceAll("\n$", ""); // remove last new line.
    	}
    	
    	@Override
    	public void handleSimpleTag(HTML.Tag tag, MutableAttributeSet set, final int position) {
            if (tag.equals(HTML.Tag.BR)) {
            	sb.append("\n");
            }
        }

    	@Override
    	public void handleText(char[] data, int position) {
    		sb.append(new String(data));
    		sb.append("\n");
    	}
    }
}
