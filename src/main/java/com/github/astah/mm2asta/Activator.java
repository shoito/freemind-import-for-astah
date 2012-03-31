package com.github.astah.mm2asta;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.xml.bind.JAXB;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import com.change_vision.jude.api.inf.ui.IMessageDialogHandlerFactory;
import com.github.astah.mm2asta.updater.AutoUpdater;
import com.github.astah.mm2asta.usericon.MmUserIcon;
import com.github.astah.mm2asta.util.ConfigurationUtils;

public class Activator implements BundleActivator {
	private static final Logger logger = (Logger) LoggerFactory.getLogger(Activator.class);
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
					+ File.separator + ".astah" + File.separator + handler.getAstahEdition(), MmUserIcon.FILE_NAME);
			initializeUserIcon(userIconXmlFile);
		} catch (Exception e) {
			logger.error("Initialization error: " + MmUserIcon.FILE_NAME);
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
		InputStream inputStreamForPlugin = MmUserIcon.class.getResourceAsStream(MmUserIcon.FILE_NAME);
		MmUserIcon mmUserIconForPlugin = MmUserIcon.unmarshall(inputStreamForPlugin);
		MmUserIcon mmUserIcon = (userIconXmlFile.canRead()) ? 
				MmUserIcon.unmarshall(new FileInputStream(userIconXmlFile))	: new MmUserIcon();
		if (!mmUserIcon.containsAll(mmUserIconForPlugin)) {
			mmUserIcon.merge(mmUserIconForPlugin);
			JAXB.marshal(mmUserIcon, new FileWriter(userIconXmlFile));
		}
	}
	
	private void runAutoUpdater() {
		new Runnable() {
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
	}
}
