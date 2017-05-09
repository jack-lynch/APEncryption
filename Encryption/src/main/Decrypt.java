package main;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class Decrypt extends JPanel {
	private JTextField textField;

	
	public Decrypt() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(153, 42, 130, 26);
		add(textField);
		textField.setColumns(10);

	}
}
