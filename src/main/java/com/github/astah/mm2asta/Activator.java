package com.github.astah.mm2asta;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.xml.bind.JAXB;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.change_vision.jude.api.inf.ui.IMessageDialogHandlerFactory;
import com.github.astah.mm2asta.updater.AutoUpdater;
import com.github.astah.mm2asta.usericon.MMUserIconFile;
import com.github.astah.mm2asta.usericon.MmUserIcon;
import com.github.astah.mm2asta.util.ConfigurationUtils;

public class Activator implements BundleActivator {
	private static final Logger logger = LoggerFactory.getLogger(Activator.class);
	private static Activator activator;
	private AstahAPIHandler handler = new AstahAPIHandler();
	
	public Activator() {
		activator = this;
	}

	public void start(BundleContext context) {
		EditionChecker checker = new EditionChecker();
		if (checker.hasError()) {
			return;
		}
		
		ServiceTracker tracker = new ServiceTracker(context, IMessageDialogHandlerFactory.class.getName(), null);
		tracker.open();
		
		try {
			File userIconXmlFile = new File(System.getProperty("user.home")
					+ File.separator + ".astah" + File.separator + handler.getAstahEdition(), MMUserIconFile.current().getFileName());
			initializeUserIcon(userIconXmlFile);
		} catch (Exception e) {
			logger.error("Initialization error: " + MMUserIconFile.current().getFileName());
			return;
		}
		
		Map<String, String> config = ConfigurationUtils.load();
		String updateCheckStr = config.get(ConfigurationUtils.UPDATE_CHECK);
		logger.info("Are there newer versions available? " + updateCheckStr);
		
		if ("false".equalsIgnoreCase(updateCheckStr)) {
			return;
		}
		
		runAutoUpdater();
	}

	public void stop(BundleContext context) {
	}
	
	public static Activator getActivator() {
		return Activator.activator;
	}
	
	private void initializeUserIcon(File userIconXmlFile) throws IOException, FileNotFoundException {
		InputStream inputStreamForPlugin = MmUserIcon.class.getResourceAsStream(MMUserIconFile.PRO_AND_UML.getFileName());
		MmUserIcon mmUserIconForPlugin = MmUserIcon.unmarshall(inputStreamForPlugin);
		MmUserIcon mmUserIcon = (userIconXmlFile.canRead()) ? 
				MmUserIcon.unmarshall(new FileInputStream(userIconXmlFile))	: new MmUserIcon();
		if (!mmUserIcon.containsAll(mmUserIconForPlugin)) {
			mmUserIcon.merge(mmUserIconForPlugin);
			JAXB.marshal(mmUserIcon, new FileWriter(userIconXmlFile));
		}
	}
	
	private void runAutoUpdater() {
		Runnable task = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(320000);
				} catch (InterruptedException e) {
					logger.warn(e.getMessage(), e);
				}
				
				AutoUpdater autoUpdater = new AutoUpdater();
				try {
					autoUpdater.check();
				} catch (IOException e) {
					logger.warn(e.getMessage(), e);
				}
			}
		};
		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(task);
	}
}
