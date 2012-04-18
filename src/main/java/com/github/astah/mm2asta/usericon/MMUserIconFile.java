package com.github.astah.mm2asta.usericon;

import com.github.astah.mm2asta.AstahAPIHandler;

public enum MMUserIconFile {
	PRO_AND_UML("JudeMMUserIconP.xml"),
	THINK("JudeMMUserIconT.xml");
	
	private static AstahAPIHandler handler = new AstahAPIHandler();
	private String fileName;
	
	MMUserIconFile(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}
	
	public static MMUserIconFile current() {
		MMUserIconFile currentEdition;
		
		String edition = handler.getAstahEdition();
		if ("think".equalsIgnoreCase(edition)) {
			currentEdition = THINK;
		} else {
			currentEdition = PRO_AND_UML;
		}
		
		return currentEdition;
	}
}
