package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JFormattedTextField;

public class Options extends JPanel {

	/**
	 * Create the panel.
	 */
	public Options() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel submitPanel = new JPanel();
		add(submitPanel, BorderLayout.SOUTH);
		
		JButton saveBtn = new JButton("Save");
		submitPanel.add(saveBtn);
		
		JPanel optionsPanel1 = new JPanel();
		add(optionsPanel1, BorderLayout.CENTER);
		optionsPanel1.setLayout(new BoxLayout(optionsPanel1, BoxLayout.X_AXIS));
		
		JPanel leftPanel = new JPanel();
		optionsPanel1.add(leftPanel);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		
		JLabel lblNewLabel = new JLabel("Number of Shift Spaces");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		leftPanel.add(lblNewLabel);
		
		JPanel rightPanel = new JPanel();
		optionsPanel1.add(rightPanel);
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.X_AXIS));
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		rightPanel.add(formattedTextField);

	}

}
