package com.github.astah.mm2asta;

import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

import com.change_vision.jude.api.inf.ui.IMessageProvider;

public class Messages implements IMessageProvider {
	public static final String DEFAULT_BUNDLE = "com.github.astah.mm2asta.messages";

	private static ResourceBundle bundle = ResourceBundle.getBundle(DEFAULT_BUNDLE, Locale.getDefault(),
			Messages.class.getClassLoader());

	public Messages() {

	}

	public static String getMessage(String key, Object... parameters) {
		String entry = bundle.getString(key);
		return MessageFormat.format(entry, parameters);
	}
	
	@Override
	public String provideMessage(String key, Object... parameters) {
		return getMessage(key, parameters);
	}

	static Enumeration<String> getKeys() {
		return bundle.getKeys();
	}

	static Locale getLocale() {
		return bundle.getLocale();
	}
}
