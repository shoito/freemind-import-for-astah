package com.github.astah.mm2asta.updater;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.astah.mm2asta.util.AWTUtilities;

@SuppressWarnings("serial")
public class NotificationPopup extends JFrame {
	private static final Logger logger = LoggerFactory.getLogger(NotificationPopup.class);
	private Position position = Position.BOTTOM_RIGHT;
	private String message = "";
	private float opacity = .9f;
	private long timeout = 6000;
	private JPanel base;
	private JEditorPane messageText;
	
	enum Position {
		TOP_LEFT, TOP_RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT;
	}

	public NotificationPopup(String message) {
		this.message = message;
		initComponents();
	}
	
	@Override
	public void setVisible(boolean visibility) {
		super.setVisible(visibility);
		
		if (visibility) {
			new Thread() {
				@Override
				public void run() {
					try {
						Thread.sleep(timeout);
						dispose();
					} catch (InterruptedException e) {
					}
				};
			}.start();
		}
	}

	private void initComponents() {
		base = new JPanel();
		base.setBorder(BorderFactory.createEtchedBorder());
		getContentPane().add(base);
		messageText = new JEditorPane();
		messageText.setEditable(false);
		messageText.addHyperlinkListener(new HyperlinkListener() {
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
					try {
						Desktop.getDesktop().browse(e.getURL().toURI());
					} catch (Exception ex) {
						logger.warn(ex.getMessage(), ex);
					}
				}
			}
		});

		messageText.setContentType("text/html");
		messageText.setText(message);
		messageText.setMargin(new Insets(0, 4, 0, 4));
		JButton closeButton = new JButton(new AbstractAction() {
			@Override
			public void actionPerformed(final ActionEvent e) {
				dispose();
			}
		});
		closeButton.setIcon(new ImageIcon(this.getClass().getResource("close.png")));

        GroupLayout layout = new GroupLayout(base);
        base.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(messageText, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(messageText, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
        );
		
		setSize(300, 110);
		setPosition(Position.BOTTOM_RIGHT);
		setOpacity(opacity);
		setAlwaysOnTop(true);
		setUndecorated(true);
		AWTUtilities.setWindowOpaque(this, false);
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Window w = (Window) e.getComponent();
				Shape shape = new RoundRectangle2D.Float(0, 0, w.getWidth(), w.getHeight(), 20, 20);
				AWTUtilities.setWindowShape(w, shape);
			}
		});
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Insets toolBarHeight = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
		
		switch (position) {
		case TOP_LEFT:
			setLocation(0, toolBarHeight.top);
			break;
		case TOP_RIGHT:
			setLocation(screenSize.width - getWidth(), toolBarHeight.top);
			break;
		case BOTTOM_LEFT:
			setLocation(0, screenSize.height - toolBarHeight.bottom - getHeight());
			break;
		default:
			setLocation(screenSize.width - getWidth(), screenSize.height - toolBarHeight.bottom - getHeight());
			break;
		}
	}
	
	public float getOpacity() {
		return opacity;
	}

	public void setOpacity(float opacity) {
		this.opacity = opacity;
		base.setBackground(new Color(.9f, .9f, .9f, opacity));
		messageText.setBackground(new Color(.9f, .9f, .9f, 0));
	}

	public long getTimeout() {
		return timeout;
	}

	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}
}
