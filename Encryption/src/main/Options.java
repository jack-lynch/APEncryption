package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

public class Options extends JPanel {

	/**
	 * Create the panel.
	 */
	public Options() {
		
		JPanel mainPanel = new JPanel();
		add(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel submitPanel = new JPanel();
		mainPanel.add(submitPanel);
		submitPanel.setLayout(new BoxLayout(submitPanel, BoxLayout.Y_AXIS));
		
		JPanel submitButton = new JPanel();
		mainPanel.add(submitButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		mainPanel.add(lblNewLabel);

	}

}
