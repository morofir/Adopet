package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class ContactUsFormMail {

	private JFrame frmAdminMail;
	private JTextArea ContactMail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUsFormMail window = new ContactUsFormMail();
					window.frmAdminMail.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ContactUsFormMail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminMail = new JFrame();
		frmAdminMail.setTitle("Admin Mail");
		frmAdminMail.setBounds(100, 100, 427, 538);
		frmAdminMail.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAdminMail.getContentPane().setLayout(null);
		frmAdminMail.setLocationRelativeTo(null);
		
		JLabel AdminContactUsMailLabel = new JLabel("Admin contact us mail");
		AdminContactUsMailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		AdminContactUsMailLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		AdminContactUsMailLabel.setBounds(49, 0, 310, 60);
		frmAdminMail.getContentPane().add(AdminContactUsMailLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 68, 344, 381);
		frmAdminMail.getContentPane().add(scrollPane);
		
		ContactMail = new JTextArea();
		ContactMail.setEditable(false);
		ContactMail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ContactMail.setBounds(32, 68, 463, 381);
		scrollPane.setViewportView(ContactMail);
	}

	public JFrame getFrame() {
		return frmAdminMail;
	}

	public void setText(String forms) {
		ContactMail.setText(forms);
	}
}
