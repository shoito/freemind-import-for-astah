package com.github.astah.mm2asta.usericon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FilenameUtils;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder={ "uuid", "iconContent", "iconExtension", "iconLabel" })
public class UserIcon {
	public static final String UUID_PREFIX = "freemind-";
	public static final String[] EXTENSIONS = new String[] { "gif", "png", "jpg", "jpeg" };
	
	@XmlElement
	private String uuid;
	@XmlElement
	private String iconContent;
	@XmlElement
	private String iconExtension;
	@XmlElement
	private String iconLabel;
	
	public UserIcon() {
	}
	
	@Override
	public boolean equals(Object obj) {
		if (uuid == null || !(obj instanceof UserIcon)) {
			return false;
		}
		
		if (uuid.equals(((UserIcon) obj).getUuid())) {
			return true;
		}
		
		return false;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getIconContent() {
		return iconContent;
	}

	public void setIconContent(String iconContent) {
		this.iconContent = iconContent;
	}

	public String getIconExtension() {
		return iconExtension;
	}

	public void setIconExtension(String iconExtension) {
		this.iconExtension = iconExtension;
	}

	public String getIconLabel() {
		return iconLabel;
	}

	public void setIconLabel(String iconLabel) {
		this.iconLabel = iconLabel;
	}
	
	public static UserIcon create(File iconFile) throws IOException {
		byte[] binaryData = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(iconFile);
			binaryData = new byte[(int) (iconFile.length())];
			fis.read(binaryData);
		} finally {
			if (fis != null) { try { fis.close(); } catch (IOException e) {} }
		}
		
		UserIcon userIcon = new UserIcon();
		userIcon.setUuid(UserIcon.UUID_PREFIX + FilenameUtils.getBaseName(iconFile.getName()));
		userIcon.setIconContent(new String(Base64.encodeBase64(binaryData)));
		userIcon.setIconExtension(FilenameUtils.getExtension(iconFile.getName()));
		userIcon.setIconLabel(FilenameUtils.getBaseName(iconFile.getName()));
		return userIcon;
	}
}