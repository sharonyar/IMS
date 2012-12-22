import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;


public class loginGUI extends JDialog
{

  private final JPanel contentPanel= new JPanel();
  private JPasswordField passwordField;
  private JTextField textFieldUsername;
  

	public loginGUI(mainWindows m)
	{
		super(m, true);
		setTitle("Identification");
		setBounds(100, 100, 464, 430);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(12, 225, 226, 21);
		contentPanel.add(passwordField);

		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblUsername.setBounds(12, 125, 150, 30);
		contentPanel.add(lblUsername);

		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPassword.setBounds(13, 199, 163, 20);
		contentPanel.add(lblPassword);

		JLabel lblLogIn = new JLabel("Enter your username and your password for identification :");
		lblLogIn.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLogIn.setBounds(20, 84, 428, 30);
		contentPanel.add(lblLogIn);

		JButton btnAddNewUser = new JButton("Add New User");
		btnAddNewUser.setBounds(262, 282, 136, 51);
		contentPanel.add(btnAddNewUser);

		JButton btnAddNewManager = new JButton("Add New Manager");
		btnAddNewManager.setBounds(52, 283, 136, 51);
		contentPanel.add(btnAddNewManager);
		
		JLabel lblWelcomToIms = new JLabel("Welcome to IMS");
		lblWelcomToIms.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblWelcomToIms.setBounds(72, 11, 343, 47);
		contentPanel.add(lblWelcomToIms);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 69, 448, 17);
		contentPanel.add(separator);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setBounds(12, 156, 226, 20);
		contentPanel.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						String getUsername = textFieldUsername.getText();
						String getPassword = passwordField.getSelectedText();
						dispose(); // close the jdialog
						//if(isUserExist(getUsername, getPassword) == true)
						//{
							 // close the login window
						//}
					 // end of run()	 
					}
				});
			}
			
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			setVisible(true);
		}
	}
}