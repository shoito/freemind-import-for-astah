package com.github.astah.mm2asta.updater;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Plugin {
	public static final String NAMESPACE = "http://plugin.astah.net/update/response";
	
	@XmlAttribute
	private String id;
	
	@XmlElement(name="updatecheck", namespace=NAMESPACE)
	private UpdateCheck updatecCheck;
	
	public Plugin() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UpdateCheck getUpdatecCheck() {
		return updatecCheck;
	}

	public void setUpdatecCheck(UpdateCheck updatecCheck) {
		this.updatecCheck = updatecCheck;
	}
}