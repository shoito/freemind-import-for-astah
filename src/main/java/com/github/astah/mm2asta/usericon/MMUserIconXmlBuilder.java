package com.github.astah.mm2asta.usericon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXB;

import org.apache.commons.io.FileUtils;

public class MMUserIconXmlBuilder {
	/**
	 * プラグインで利用するアイコンが全てJudeMMUserIconP.xmlに含まれるか確認する。
	 * 
	 * @return 全て含まれている場合はtrue
	 */
	public boolean isCompletely(File userIconXml) {
		try {
			return isCompletely(new FileInputStream(userIconXml));
		} catch (FileNotFoundException e) {
		}
		return false;
	}
	
	/**
	 * プラグインで利用するアイコンが全てJudeMMUserIconP.xmlに含まれるか確認する。
	 * 
	 * @return 全て含まれている場合はtrue
	 */
	public boolean isCompletely(InputStream isForUserIconXml) {
		try {
			InputStream inputStreamToFind = MmUserIcon.class.getResourceAsStream(MMUserIconFile.PRO_AND_UML.getFileName());
			MmUserIcon valueToFind = MmUserIcon.unmarshall(inputStreamToFind);
			MmUserIcon mmUserIcon = MmUserIcon.unmarshall(isForUserIconXml);
			return mmUserIcon.containsAll(valueToFind);
		} catch (Exception e) {
		}
		return false;
	}
	
	/**
	 * JudeMMUserIconP.xmlにプラグインで利用するアイコン情報を作成する。
	 * 
	 * @throws IOException
	 */
	public void build(File userIconXmlFile) throws IOException {
		List<File> iconFiles = getDefaultIconFiles();
		build(userIconXmlFile, iconFiles, true);
	}
	
	/**
	 * JudeMMUserIconP.xmlファイルやアイコンファイルを指定して、アイコン情報を作成する。
	 * 
	 * @throws IOException
	 */
	public void build(File userIconXmlFile, List<File> iconFiles, boolean append) throws IOException {
		MmUserIcon newMmUserIcon = MmUserIcon.create(iconFiles);
		
		if (append && userIconXmlFile.canRead()) {
			MmUserIcon existFile = MmUserIcon.unmarshall(new FileInputStream(userIconXmlFile));
			newMmUserIcon.merge(existFile);
		}
		
        FileWriter xml = new FileWriter(userIconXmlFile);
        JAXB.marshal(newMmUserIcon, xml);
	}

	/**
	 * プラグインで使用するアイコンのリストを返す。
	 * 
	 * @return アイコンファイルのリスト
	 * @throws IOException
	 */
	public static List<File> getDefaultIconFiles() {
		List<File> files = new ArrayList<File>();
		try {
			String className = MmUserIcon.class.getSimpleName();
			URL classUrl = MmUserIcon.class.getResource(className + ".class");
			File classFile = new File(classUrl.getFile());
			File iconsDir = classFile.getParentFile();
			files = (List<File>) FileUtils.listFiles(iconsDir, UserIcon.EXTENSIONS, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return files;
	}
	
	/**
	 * プラグイン用のJudeMMUserIconP.xmlを作るために、アイコン情報を出力する。
	 * 
	 * @param out
	 * @throws IOException
	 */
	public static void writeXmlWithDefaultUserIcons(OutputStream out) throws IOException {
		List<File> iconFiles = getDefaultIconFiles();
		MmUserIcon newMmUserIcon = MmUserIcon.create(iconFiles);
        JAXB.marshal(newMmUserIcon, out);
	}

	public static void main(String[] args) throws Throwable {
		MMUserIconXmlBuilder.writeXmlWithDefaultUserIcons(System.out);
		
//		MMUserIconXmlBuilder maker = new MMUserIconXmlBuilder();
//		File userIconXmlFile = new File(System.getProperty("user.home")
//				+ File.separator + ".astah" + File.separator + "professional",
//				MmUserIcon.FILE_NAME);
//		maker.build(userIconXmlFile);
//		System.out.println(maker.isCompletely(userIconXmlFile));
		
//		InputStream xmlInputStream = MmUserIcon.class.getResourceAsStream("JudeMMUserIconP.xml");
//		MmUserIcon mmUserIcon = MmUserIcon.unmarshall(xmlInputStream);
//		JAXB.marshal(mmUserIcon, System.out);
	}
}
