package com.github.astah.mm2asta.util;

import java.awt.Shape;
import java.awt.Window;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AWTUtilities {
	private static final Logger logger = LoggerFactory.getLogger(AWTUtilities.class);
	
	public static void setWindowOpaque(Window w, boolean opaque) {
		try {
			Class<?> AWTUtilities = Class.forName("com.sun.awt.AWTUtilities");
			Method setWindowOpaque = AWTUtilities.getMethod("setWindowOpaque", Window.class, boolean.class);
			setWindowOpaque.invoke(AWTUtilities, w, opaque);
		} catch (Exception e) {
			logger.warn(e.getMessage(), e);
		}
	}

	public static void setOpacity(Window w, float opacity) {
		try {
			Class<?> AWTUtilities = Class.forName("com.sun.awt.AWTUtilities");
			Method setWindowOpacity = AWTUtilities.getMethod("setWindowOpacity", Window.class, float.class);
			setWindowOpacity.invoke(AWTUtilities, w, opacity);
		} catch (Exception e) {
			logger.warn(e.getMessage(), e);
		}
	}

	public static void setWindowShape(Window w, Shape shape) {
		try {
			Class<?> AWTUtilities = Class.forName("com.sun.awt.AWTUtilities");
			Method setWindowShape = AWTUtilities.getMethod("setWindowShape", Window.class, Shape.class);
			setWindowShape.invoke(AWTUtilities, w, shape);
		} catch (Exception e) {
			logger.warn(e.getMessage(), e);
		}
	}
}
