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

	private String encryptedText;
	
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	
	public Encrypt() {
		setLayout(null);
		
		EncryptTF = new JTextField();
		EncryptTF.setText("");
		EncryptTF.setBounds(124, 113, 202, 26);
		add(EncryptTF);
		EncryptTF.setColumns(10);
		
		JLabel msgLbl = new JLabel("Enter A Message to Encrypt");
		msgLbl.setHorizontalAlignment(SwingConstants.CENTER);
		msgLbl.setBounds(124, 62, 202, 16);
		add(msgLbl);
		
		JLabel decryptedMsgLbl = new JLabel("Encrypted Message Output");
		decryptedMsgLbl.setHorizontalAlignment(SwingConstants.CENTER);
		decryptedMsgLbl.setBounds(6, 231, 438, 16);
		add(decryptedMsgLbl);
		
		JButton decryptBtn = new JButton("Encrypt");
		decryptBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptedText = EncryptTF.getText();
				EncryptMsg();
				decryptedMsgLbl.setText(encryptedText);
			}
		});
		decryptBtn.setBounds(170, 175, 117, 29);
		add(decryptBtn);

	}
	
	
	public void EncryptMsg(){
		
        String plainText = "";
        
        for (int i = 0; i < encryptedText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(encryptedText.charAt(i));
            int keyVal = (charPosition - MainFrame.moveSpaces) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText += replaceVal;
        }
        
        encryptedText = plainText;
		
	}
	

}
