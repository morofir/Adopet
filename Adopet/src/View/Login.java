package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import AdopetProject.LoginMVC;
import Model.Database;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Login {

	static Database db = Database.getInstance();
	private static JFrame Login;
	private JPasswordField passwordField;
	private JTextField emailField;
	private JButton signinButton;
	private JButton adminLoginButton;
	private JButton loginButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setLogin(new JFrame());
		getLogin().setTitle("Login");
		getLogin().setBounds(100, 100, 400, 407);
		getLogin().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getLogin().getContentPane().setLayout(null);
		getLogin().setLocationRelativeTo(null);

		passwordField = new JPasswordField();
		passwordField.setBounds(139, 79, 145, 26);
		getLogin().getContentPane().add(passwordField);

		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(71, 82, 99, 20);
		getLogin().getContentPane().add(passwordLabel);

		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setBounds(82, 32, 69, 20);
		getLogin().getContentPane().add(emailLabel);

		emailField = new JTextField();
		emailField.setBounds(139, 29, 145, 26);
		getLogin().getContentPane().add(emailField);
		emailField.setColumns(10);

		JLabel OrLabel = new JLabel("Or");
		OrLabel.setHorizontalAlignment(SwingConstants.CENTER);
		OrLabel.setBounds(164, 182, 69, 20);
		getLogin().getContentPane().add(OrLabel);

		signinButton = new JButton("Create Account");
		signinButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMVC.Main();
				getLogin().setVisible(false);
				//Signup.main(null);
			}
		});
		signinButton.setBounds(122, 289, 153, 29);
		getLogin().getContentPane().add(signinButton);

		adminLoginButton = new JButton("Admin Login");
		adminLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				getLogin().setVisible(false);
				LoginMVC.Main();
			}
		});
		adminLoginButton.setBounds(134, 218, 129, 34);
		getLogin().getContentPane().add(adminLoginButton);

		loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				LoginMVC.Main();
				getLogin().setVisible(false);
			}
		});

		loginButton.setBounds(139, 121, 114, 45);
		getLogin().getContentPane().add(loginButton);

		JSeparator separator = new JSeparator();
		separator.setBounds(21, 276, 338, 2);
		getLogin().getContentPane().add(separator);
	}

	public static JFrame getLogin() {
		return Login;
	}

	public void setLogin(JFrame login) {
		Login = login;
	}

	public void addSignupListener(ActionListener signUpListener) {
		signinButton.addActionListener(signUpListener);		
	}

	public void addAdminLoginListener(ActionListener adminLoginListener) {
		adminLoginButton.addActionListener(adminLoginListener);		
	}

	public void addLoginListener(ActionListener loginListener) {
		loginButton.addActionListener(loginListener);		
	}

	public String getEmail()
	{
		return emailField.getText().toString();
	}

	@SuppressWarnings("deprecation")
	public String getPassword()
	{
		return passwordField.getText().toString();
	}
}
