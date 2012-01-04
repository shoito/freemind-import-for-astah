package com.github.astah.mm2asta.action;

import java.awt.Cursor;
import java.awt.Window;
import java.io.File;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.change_vision.jude.api.inf.exception.ProjectNotFoundException;
import com.change_vision.jude.api.inf.project.ProjectAccessor;
import com.change_vision.jude.api.inf.project.ProjectAccessorFactory;
import com.change_vision.jude.api.inf.ui.IPluginActionDelegate;
import com.change_vision.jude.api.inf.ui.IWindow;
import com.github.astah.mm2asta.Messages;
import com.github.astah.mm2asta.MmWalker;
import com.github.astah.mm2asta.filter.MmFilter;
import com.github.astah.mm2asta.util.ConfigurationUtils;

public class ImportAction implements IPluginActionDelegate {
	private static final Logger logger = LoggerFactory.getLogger(ImportAction.class);

	public Object run(IWindow window) throws UnExpectedException {
		final Window parent = window.getParent();
		
		parent.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		try {	
			checkProjectState();
			showDialog(parent);
		} catch (ProjectNotFoundException e) {
			JOptionPane.showMessageDialog(parent,
					Messages.getMessage("warning.project_is_not_opened"),
					"Warning", JOptionPane.WARNING_MESSAGE);
		} catch (Exception e) {
			logger.error(Messages.getMessage("alert.unexpected_error"), e);
			JOptionPane.showMessageDialog(parent,
					Messages.getMessage("alert.unexpected_error"), "Alert",
					JOptionPane.ERROR_MESSAGE);
			throw new UnExpectedException();
		} finally {
			parent.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		}
		
		return null;
	}

	private void checkProjectState() throws ClassNotFoundException, ProjectNotFoundException {
		ProjectAccessor projectAccessor = ProjectAccessorFactory.getProjectAccessor();
		projectAccessor.getProject();
	}

	private void showDialog(final Window parent) {
		JFileChooser chooser = new JFileChooser();
		chooser.addChoosableFileFilter(new MmFilter());
		chooser.setMultiSelectionEnabled(true);
		
		setCurrentDirectory(chooser);
		
		int selected = chooser.showOpenDialog(parent);
		if (selected == JFileChooser.APPROVE_OPTION) {
			File[] selectedFiles = chooser.getSelectedFiles();
			for (File file : selectedFiles) {
				System.out.println(file.getName());
				try {
					new MmWalker().walk(file.getAbsolutePath());
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
			saveCurrentDirectory(chooser);
		}
	}

	private void saveCurrentDirectory(JFileChooser chooser) {
		File currentDirectory = chooser.getCurrentDirectory();
		ConfigurationUtils.save(ConfigurationUtils.CURRENT_DIRECTORY, currentDirectory.getAbsolutePath());
	}

	private void setCurrentDirectory(JFileChooser chooser) {
		Map<String, String> config = ConfigurationUtils.load();
		if (config.containsKey(ConfigurationUtils.CURRENT_DIRECTORY)) {
			String currentDirectoryPath = config.get(ConfigurationUtils.CURRENT_DIRECTORY);
			chooser.setCurrentDirectory(new File(currentDirectoryPath));
		}
	}
}
