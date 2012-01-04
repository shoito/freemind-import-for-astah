package com.github.astah.mm2asta.dialog;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

import com.github.astah.mm2asta.Messages;

import org.osgi.util.tracker.ServiceTracker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import com.change_vision.jude.api.inf.ui.IMessageDialogHandler;
import com.change_vision.jude.api.inf.ui.IMessageDialogHandlerFactory;

@SuppressWarnings("serial")
public class JProgressBarDialog extends JDialog implements IProgress {
	
	private JProgressBar bar;
	private ServiceTracker tracker;
	private IMessageDialogHandler dialogHandler;
	private static final Logger logger = LoggerFactory.getLogger(JProgressBarDialog.class);
	private static final Marker marker = MarkerFactory.getMarker("dialog");

	public JProgressBarDialog(JFrame parent, ServiceTracker tracker) {
		super(parent,true);
		this.tracker = tracker;
		bar = new JProgressBar();
		bar.setIndeterminate(true);
		bar.setStringPainted(true);
		bar.setString("test");
		getContentPane().add(bar);
		setLocationRelativeTo(parent);
		pack();
	}
	
	public void setMessage(String message) {
		bar.setString(message);
	}
	
	@Override
	public void showErrorMessage(Exception e, String message) {
		if(dialogHandler == null) {
			IMessageDialogHandlerFactory factory = (IMessageDialogHandlerFactory)tracker.getService();
			dialogHandler = factory.createMessageDialogHandler(new Messages(), ".astah\\plugins\\mm2asta");
		}
		if(logger.isErrorEnabled(marker)) {
			logger.error("error has occured.",e);
		}
		dialogHandler.showErrorMessage(getParent(), message);
	}

}