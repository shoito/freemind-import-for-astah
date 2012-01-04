package com.github.astah.mm2asta;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.xml.sax.SAXException;

public class FreeMindMindmapWalker {
	public static void main(String[] args) throws SAXException, IOException, XMLStreamException {
		XMLInputFactory factory = XMLInputFactory.newInstance();

		BufferedInputStream stream = new BufferedInputStream(new FileInputStream(args[0]));
		XMLStreamReader reader = factory.createXMLStreamReader(stream);

		String current = null;
		String parent = null;
		for (; reader.hasNext(); reader.next()) {
			int eventType = reader.getEventType();

			if (eventType == XMLStreamConstants.START_ELEMENT) {
				QName name = reader.getName();
				if (name.getLocalPart().equals("node")) {
					// <node CREATED="1309179534734" ID="ID_213694605" MODIFIED="1309179539058" TEXT="&#x7b2c;&#x4e09;&#x30ec;&#x30d9;&#x30eb;3-1"/>
					parent = current;
					current = reader.getAttributeValue("", "TEXT");
					System.out.println("Text: " + reader.getAttributeValue("", "TEXT") + ", Parent: " + parent);
				}
			} else if (eventType == XMLStreamConstants.END_ELEMENT) {
				QName name = reader.getName();
				if (name.getLocalPart().equals("node")) {
//					System.out.println("[End]Current: " + current + ", Parent: " + parent);
					current = parent;
				}
			}
		}

		reader.close();
	}
}
