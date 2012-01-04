package com.github.astah.mm2asta.updater;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class UpdateCheck {
	@XmlAttribute(name="codebase")
	private String codeBase;
	
	@XmlAttribute
	private String version;

	public UpdateCheck() {
	}
	
	public String getCodeBase() {
		return codeBase;
	}

	public void setCodeBase(String codeBase) {
		this.codeBase = codeBase;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
/*
http://dl.dropbox.com/u/227786/app/astah/plugins/connector-backlog/update.xml
*/

/*
<?xml version='1.0' encoding='UTF-8'?>
<update xmlns='http://plugin.astah.net/update/response' protocol='1.0'>
  <plugin id='com.github.astah.connector.backlog'>
    <updatecheck codebase='http://dl.dropbox.com/u/227786/app/astah/plugins/connector-backlog/connector-backlog.jar' version='0.1.1' />
  </plugin>
</update>
*/