package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;

public class Signup {

	private JFrame frmSignup;
	private JTextField userNameField;
	private JTextField organizationField;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JButton signupButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
					window.frmSignup.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSignup = new JFrame();
		frmSignup.setTitle("Signup");
		frmSignup.setBounds(100, 100, 503, 458);
		frmSignup.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSignup.getContentPane().setLayout(null);
		frmSignup.setLocationRelativeTo(null);

		userNameField = new JTextField();
		userNameField.setBounds(216, 107, 195, 26);
		frmSignup.getContentPane().add(userNameField);
		userNameField.setColumns(10);

		organizationField = new JTextField();
		organizationField.setBounds(216, 163, 195, 26);
		frmSignup.getContentPane().add(organizationField);
		organizationField.setColumns(10);

		emailField = new JTextField();
		emailField.setBounds(216, 212, 195, 26);
		frmSignup.getContentPane().add(emailField);
		emailField.setColumns(10);

		JLabel userNameLabel = new JLabel("Full Name:");
		userNameLabel.setBounds(53, 110, 86, 20);
		frmSignup.getContentPane().add(userNameLabel);

		JLabel organizationNameLabel = new JLabel("Organization Name:");
		organizationNameLabel.setBounds(53, 166, 148, 20);
		frmSignup.getContentPane().add(organizationNameLabel);

		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setBounds(53, 215, 45, 20);
		frmSignup.getContentPane().add(emailLabel);

		passwordField = new JPasswordField();
		passwordField.setBounds(216, 266, 195, 26);
		frmSignup.getContentPane().add(passwordField);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(53, 269, 73, 20);
		frmSignup.getContentPane().add(passwordLabel);

		signupButton = new JButton("SignUp");
		signupButton.setBounds(171, 319, 124, 59);
		frmSignup.getContentPane().add(signupButton);

		JLabel createAccountLabel = new JLabel("Create Account");
		createAccountLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		createAccountLabel.setBounds(148, 32, 171, 59);
		frmSignup.getContentPane().add(createAccountLabel);
	}

	public JFrame getFrmSignup() {
		return frmSignup;
	}

	public void addSignupListener(ActionListener signUpListener) {
		signupButton.addActionListener(signUpListener);
	}

	public String getUserNameField()
	{
		return userNameField.getText().toString();
	}

	public String getEmailField()
	{
		return emailField.getText().toString();
	}

	public String getOrganizationField()
	{
		return organizationField.getText().toString();
	}

	@SuppressWarnings("deprecation")
	public String getPasswordField()
	{
		return passwordField.getText().toString();
	}
}
