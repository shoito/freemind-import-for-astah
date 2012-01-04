package com.github.astah.mm2asta.filter;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class MmFilter extends FileFilter {
	public boolean accept(File file) {
		if (file.isDirectory()) {
			return true;
		}

		String ext = getExtension(file);
		if (ext != null) {
			if (ext.equals("mm")) {
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

	public String getDescription() {
		return "FreeMind file";
	}

	private String getExtension(File file) {
		String ext = null;
		String filename = file.getName();
		int dotIndex = filename.lastIndexOf('.');

		if ((dotIndex > 0) && (dotIndex < filename.length() - 1)) {
			ext = filename.substring(dotIndex + 1).toLowerCase();
		}

		return ext;
	}
}
