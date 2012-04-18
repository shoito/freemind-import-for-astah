package com.github.astah.mm2asta.usericon;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.DataBindingException;
import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="mmUserIcon")
public class MmUserIcon {
	@XmlElement(name="mmUserIconInfo")
	private List<MmUserIconInfo> mmUserIconInfos;

	public MmUserIcon() {
		mmUserIconInfos = new ArrayList<MmUserIconInfo>();
	}
	
	public List<MmUserIconInfo> getMmUserIconInfos() {
		if (mmUserIconInfos == null) {
			return new ArrayList<MmUserIconInfo>();
		}
		return mmUserIconInfos;
	}

	public void setMmUserIconInfos(List<MmUserIconInfo> mmUserIconInfos) {
		this.mmUserIconInfos = mmUserIconInfos;
	}
	
	public boolean containsAll(MmUserIcon valueToFind) {
		if (valueToFind == null) {
			return false;
		}
		
		try {
			List<UserIcon> userIcons = getMmUserIconInfos().get(0).getUserIcons();
			List<UserIcon> userIconsToFind = valueToFind.getMmUserIconInfos().get(0).getUserIcons();
			if (userIcons.containsAll(userIconsToFind)) {
				return true;
			}
		} catch (Exception e) {
		}
		return false;
	}
	
	public static MmUserIcon unmarshall(InputStream xmlInputStream) throws IOException {
		MmUserIcon root = null;
		try {
			root = JAXB.unmarshal(xmlInputStream, MmUserIcon.class);
		} catch (DataBindingException e) {
			throw new IOException(e);
		}
		return root;
	}
	
	public static MmUserIcon create(List<File> iconFiles) throws IOException {
		List<UserIcon> userIcons = new ArrayList<UserIcon>();
		for (File file : iconFiles) {
			UserIcon icon = UserIcon.create(file);
			
			if (icon != null) {
				userIcons.add(icon);
			}
		}
		
		MmUserIcon root = new MmUserIcon();
		MmUserIconInfo iconInfo = new MmUserIconInfo();
		iconInfo.setUserIcons(userIcons);
		root.setMmUserIconInfos(Arrays.asList(iconInfo));
		return root;
	}
	
	public void merge(MmUserIcon from) {
		if (from == null) {
			return;
		}

		List<MmUserIconInfo> fromIconInfos = from.getMmUserIconInfos();
		if (fromIconInfos == null || fromIconInfos.isEmpty()) {
			return;
		}
		
		List<MmUserIconInfo> mmUserIconInfos = getMmUserIconInfos();
		if (mmUserIconInfos.isEmpty()) {
			mmUserIconInfos.add(new MmUserIconInfo());
		}
		
		MmUserIconInfo newUserIconInfo = mmUserIconInfos.get(0);
		List<UserIcon> newUserIcons = newUserIconInfo.getUserIcons();
		
		MmUserIconInfo fromUserIconInfo = fromIconInfos.get(0);
		List<UserIcon> fromUserIcons = fromUserIconInfo.getUserIcons();
		
		if (fromUserIcons == null || fromUserIcons.isEmpty()) {
			return;
		}
		
		for (UserIcon fromUserIcon : fromUserIcons) {
			if (!newUserIcons.contains(fromUserIcon)) {
				newUserIcons.add(fromUserIcon);
			}
		}

		newUserIconInfo.setUserIcons(newUserIcons);
	}
}