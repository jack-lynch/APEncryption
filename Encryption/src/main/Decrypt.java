package main;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Decrypt extends JPanel {
	private JTextField DecryptTF;

	private String encryptedText;
	
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	private int t = 2;
	
	public Decrypt() {
		setLayout(null);
		
		DecryptTF = new JTextField();
		DecryptTF.setText("");
		DecryptTF.setBounds(124, 113, 202, 26);
		add(DecryptTF);
		DecryptTF.setColumns(10);
		
		JLabel msgLbl = new JLabel("Enter A Decyrpted Mesage");
		msgLbl.setHorizontalAlignment(SwingConstants.CENTER);
		msgLbl.setBounds(124, 62, 202, 16);
		add(msgLbl);
		
		JLabel decryptedMsgLbl = new JLabel("Decrypted Message Output");
		decryptedMsgLbl.setHorizontalAlignment(SwingConstants.CENTER);
		decryptedMsgLbl.setBounds(6, 231, 438, 16);
		add(decryptedMsgLbl);
		
		JButton decryptBtn = new JButton("Decrypt");
		decryptBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encryptedText = DecryptTF.getText();
				DecryptMsg();
				decryptedMsgLbl.setText(encryptedText);
			}
		});
		decryptBtn.setBounds(170, 175, 117, 29);
		add(decryptBtn);

	}
	
	
	public void DecryptMsg(){
		
        String plainText = "";
        
        for (int i = 0; i < encryptedText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(encryptedText.charAt(i));
            int keyVal = (charPosition - t) % 26;
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
