package com.github.astah.mm2asta.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.change_vision.jude.api.inf.project.ProjectAccessorFactory;

public class ConfigurationUtils {
	private static final Logger logger = LoggerFactory.getLogger(ConfigurationUtils.class);

	public static final String CURRENT_DIRECTORY = "currentDirectory";
	public static final String UPDATE_CHECK = "updateCheck";
	
	public static String EDITION;
	public static File CONFIG_FILE;
	
	static {
		try {
			EDITION = ProjectAccessorFactory.getProjectAccessor().getAstahEdition();
		} catch (ClassNotFoundException e) {
			EDITION = "professional";
		}
		
		CONFIG_FILE = new File(
				System.getProperty("user.home") + File.separator + ".astah" + File.separator + EDITION,
				"mm2asta.properties");
	}
	
	public static Map<String, String> load() {
		Map<String, String> options = new HashMap<String, String>();
		
    	Properties config = null;
    	try {
    		CONFIG_FILE.createNewFile();
			config = new Properties();
			config.load(new FileInputStream(CONFIG_FILE));
			if (!config.isEmpty()) {
				String updateCheck = config.getProperty(UPDATE_CHECK);
				options.put(UPDATE_CHECK, (String) ObjectUtils.defaultIfNull(updateCheck, "true"));
				setOptionFromConfig(options, CURRENT_DIRECTORY, config);
			}
		} catch (Exception e) {
			logger.warn(e.getMessage(), e);
		}
    	
    	return options;
	}

	private static void setOptionFromConfig(Map<String, String> options, String key, Properties config) {
		if (config.containsKey(key)) {
			options.put(key, config.getProperty(key));
		}
	}
	
	private static void setConfigFromOption(Properties config, String key, Map<String, String> options) {
		if (options.containsKey(key)) {
			config.setProperty(key, options.get(key));
		}
	}
	
	public static void save(Map<String, String> options) {
		Properties config = null;
    	try {
			config = new Properties();
			setConfigFromOption(config, CURRENT_DIRECTORY, options);
			config.store(new FileOutputStream(CONFIG_FILE), "");
		} catch (Exception e) {
			logger.warn(e.getMessage(), e);
		}
	}
	
	public static void save(String key, String value) {
		Map<String, String> config = load();
		config.put(key, value);
		save(config);
	}
}
