package com.github.astah.mm2asta.updater;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import javax.swing.WindowConstants;
import javax.xml.bind.JAXB;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.astah.mm2asta.updater.NotificationPopup.Position;

public class AutoUpdater {
	private static final Logger logger = LoggerFactory.getLogger(AutoUpdater.class);
	private String updateXml = "https://raw.github.com/shoito/freemind-import-for-astah/master/update.xml";
	
	public void check() throws IOException {
		HttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet(updateXml);
		client.execute(get, new ResponseHandler<Void>() {
			@Override
			public Void handleResponse(HttpResponse response) throws ClientProtocolException, IOException {
				StatusLine status = response.getStatusLine();
				int statusCode = status.getStatusCode();
				if (statusCode != HttpStatus.SC_OK) {
					logger.info(statusCode + ": " + status.getReasonPhrase());
				}
				
				InputStream is = response.getEntity().getContent();
				Update updateXml = JAXB.unmarshal(is, Update.class);
				Plugin plugin = updateXml.getPlugin();
				UpdateCheck updateCheck = plugin.getUpdatecCheck();
				if (versionCompareTo(updateCheck.getVersion(), getCurrentVersion()) > 0) {
	        		String message = "<html><span style='font-size: 10px;font-family: Arial, Helvetica;'>astah plugin notification</font><br>" +
	        				"<hr>" +
	        				"<span style='font-size: 9px;font-family: Arial, Helvetica;'>The new version has been released. [" + plugin.getId() + "]<br>" +
	        				"<a href=\"" + updateCheck.getCodeBase() + "\">" + updateCheck.getCodeBase() + "</a>" +
	        				"</span></html>";
	        		
	        		NotificationPopup notifier = new NotificationPopup(message);		
	        		notifier.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        		notifier.setTimeout(10000);
	        		notifier.setPosition(Position.BOTTOM_RIGHT);
	        		notifier.setVisible(true);
				}

				return null;
			}
		});
	}
	
	String getCurrentVersion() throws IOException {
	    Class<?> className = this.getClass();
	    String strClassName = className.getResource(className.getSimpleName() + ".class").toExternalForm();
	    String jar = strClassName.substring(0, strClassName.lastIndexOf(StringUtils.replace(className.getPackage().getName(), ".", "/")));
		InputStream is = new URL(jar + "META-INF/MANIFEST.MF").openStream();
		Manifest mf = new Manifest(is);
		is.close();

		Attributes attributes = mf.getMainAttributes();
		String version = attributes.getValue("Bundle-Version");
		return version;
	}
	
	int versionCompareTo(String version1, String version2) {
		Integer[] version1array = versionComponents(version1);
		Integer[] version2array = versionComponents(version2);
		int length = Math.min(version2array.length, version1array.length);
		for (int i = 0; i < length; i++) {
			if (version2array[i].equals(version1array[i])) {
				continue;
			}
			return version1array[i].compareTo(version2array[i]);
		}
		return version1array.length - version2array.length;
	}

	private Integer[] versionComponents(String version) {
		String[] splitted = version.split("\\.");
		if (splitted.length > 0 && splitted[splitted.length - 1].endsWith("-SNAPSHOT")) {
			splitted[splitted.length - 1] = splitted[splitted.length - 1].replaceAll("-SNAPSHOT", "");
		} else if (splitted.length > 0 && splitted[splitted.length - 1].endsWith("SNAPSHOT")) {
			splitted = Arrays.copyOf(splitted, splitted.length - 1);
		}
		Integer[] components = new Integer[splitted.length];
		for (int i = 0; i < splitted.length; i++) {
			components[i] = (Integer.valueOf(splitted[i]));
		}
		return components;
	}

	public String getUpdateXml() {
		return updateXml;
	}

	public void setUpdateXml(String updateXml) {
		this.updateXml = updateXml;
	}
}
