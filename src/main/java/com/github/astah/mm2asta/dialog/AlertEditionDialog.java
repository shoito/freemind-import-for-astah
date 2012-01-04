package com.github.astah.mm2asta.dialog;

import java.awt.Container;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.net.URL;

import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkEvent.EventType;
import javax.swing.event.HyperlinkListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.astah.mm2asta.Messages;

public class AlertEditionDialog  extends JDialog {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(AlertEditionDialog.class);
	private static final String MIME_TYPE = "text/html";

	private JEditorPane pane;

	public AlertEditionDialog(Frame owner) {
		super(owner);
		initComponents();
	}

	private void initComponents() {
		logger.trace(Messages.getMessage("AlertEditionDialog.trace_message"));
		setTitle(Messages.getMessage("AlertEditionDialog.title"));
		setSize(new Dimension(280,150));
		setLocationRelativeTo(getOwner());
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		Container c = getContentPane();
		pane = new JEditorPane(MIME_TYPE,
				Messages.getMessage("AlertEditionDialog.main_message"));
		pane.setEditable(false);
		pane.setBackground(getBackground());
		pane.putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
		pane.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		JScrollPane scroll = new JScrollPane(pane);
		c.add(scroll);
		pack();
	}

	@Override
	public void setVisible(boolean b) {
		pane.addHyperlinkListener(new HyperlinkListener() {
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				if (e.getEventType() == EventType.ACTIVATED) {
					URL url = e.getURL();
					Desktop dp = Desktop.getDesktop();
					try {
						dp.browse(url.toURI());
					} catch (Exception ex) {
						logger.error(Messages.getMessage("AlertEditionDialog.error_message"), ex);
					}
				}
			}
		});
		
		super.setVisible(b);
	}
}