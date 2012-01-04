package com.github.astah.mm2asta.updater;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="update", namespace=Plugin.NAMESPACE)
public class Update {
	@XmlAttribute
	private String protocol = "1.0";
	
	@XmlElement(nillable=false, namespace=Plugin.NAMESPACE)
	private Plugin plugin;
	
	public Update() {
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Plugin getPlugin() {
		return plugin;
	}

	public void setPlugin(Plugin plugin) {
		this.plugin = plugin;
	}
}