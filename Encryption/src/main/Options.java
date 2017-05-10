package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Options extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Options(MainFrame parent) {
		setLayout(new BorderLayout(0, 0));
		
		JPanel submitPanel = new JPanel();
		add(submitPanel, BorderLayout.SOUTH);
		
		
		JPanel optionsPanel1 = new JPanel();
		add(optionsPanel1, BorderLayout.CENTER);
		optionsPanel1.setLayout(new BoxLayout(optionsPanel1, BoxLayout.X_AXIS));
		
		JPanel leftPanel = new JPanel();
		optionsPanel1.add(leftPanel);
		leftPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number of Shift Spaces");
		lblNewLabel.setBounds(39, 43, 147, 16);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		leftPanel.add(lblNewLabel);
		
		JPanel rightPanel = new JPanel();
		optionsPanel1.add(rightPanel);
		rightPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(40, 41, 130, 26);
		rightPanel.add(textField);
		textField.setColumns(10);
		

		JButton saveBtn = new JButton("Save");
		saveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parent.moveSpaces = Integer.parseInt(textField.getText());
			}
		});
		submitPanel.add(saveBtn);

	}
}
