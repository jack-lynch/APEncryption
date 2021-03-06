package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Encrypt extends JPanel {
	
	private JTextField EncryptTF;

	private String decryptedText;
	
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	
	public Encrypt() {
		setLayout(null);
		
		EncryptTF = new JTextField();
		EncryptTF.setText("");
		EncryptTF.setBounds(175, 117, 202, 26);
		add(EncryptTF);
		EncryptTF.setColumns(10);
		
		JLabel msgLbl = new JLabel("Enter A Message to Encrypt");
		msgLbl.setHorizontalAlignment(SwingConstants.CENTER);
		msgLbl.setBounds(175, 60, 202, 16);
		add(msgLbl);
		
		JLabel decryptedMsgLbl = new JLabel("Encrypted Message Output");
		decryptedMsgLbl.setHorizontalAlignment(SwingConstants.CENTER);
		decryptedMsgLbl.setBounds(67, 216, 438, 16);
		add(decryptedMsgLbl);
		
		JButton decryptBtn = new JButton("Encrypt");
		decryptBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decryptedText = EncryptTF.getText();
				EncryptMsg();
				decryptedMsgLbl.setText(decryptedText);
			}
		});
		decryptBtn.setBounds(220, 175, 117, 29);
		add(decryptBtn);

	}
	
	
	public void EncryptMsg(){
		
        String plainText = "";
        
        for (int i = 0; i < decryptedText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(decryptedText.charAt(i));
            int keyVal = (charPosition + MainFrame.moveSpaces) % 26;
            if (keyVal > ALPHABET.length()) {
            	keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        
        decryptedText = plainText;
		
	}
	

}
