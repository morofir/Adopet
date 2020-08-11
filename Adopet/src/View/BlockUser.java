package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class BlockUser {

	private JFrame frmBlockUser;
	private JTextField emailField;
	private JButton blockButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlockUser window = new BlockUser();
					window.frmBlockUser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BlockUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBlockUser = new JFrame();
		frmBlockUser.setTitle("Block User");
		frmBlockUser.setBounds(100, 100, 318, 239);
		frmBlockUser.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmBlockUser.getContentPane().setLayout(null);
		frmBlockUser.setLocationRelativeTo(null);

		JLabel blockLabel = new JLabel("Block user by email:");
		blockLabel.setFont(new Font("Tahoma", Font.PLAIN, 19));
		blockLabel.setBounds(60, 16, 183, 33);
		frmBlockUser.getContentPane().add(blockLabel);

		emailField = new JTextField();
		emailField.setBounds(45, 65, 215, 26);
		frmBlockUser.getContentPane().add(emailField);
		emailField.setColumns(10);

		blockButton = new JButton("Block");
		blockButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		blockButton.setBounds(92, 116, 115, 42);
		frmBlockUser.getContentPane().add(blockButton);
	}
	
	public JFrame getFrame() {
		return frmBlockUser;
	}
	
	public String getEmail()
	{
		return emailField.getText().toString();
	}

	public void addBlockUserListener(ActionListener blockUserListener) {
		blockButton.addActionListener(blockUserListener);
	}
}
