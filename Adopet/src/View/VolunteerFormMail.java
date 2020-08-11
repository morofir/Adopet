package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class VolunteerFormMail{

	private JFrame MailForm;
	private JTextArea VolunteerMail;
	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
	    EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				VolunteerFormMail window = new VolunteerFormMail();
				window.MailForm.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	}

	/**
	 * Create the application.
	 */
	public VolunteerFormMail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		MailForm = new JFrame();
		MailForm.setTitle("Admin Mail");
		MailForm.setBounds(100, 100, 400, 533);
		MailForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		MailForm.getContentPane().setLayout(null);
		MailForm.setLocationRelativeTo(null);
		
		JLabel mailFormLabel = new JLabel("Admin volunteers mail:");
		mailFormLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		mailFormLabel.setBounds(42, 16, 295, 51);
		MailForm.getContentPane().add(mailFormLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 68, 314, 381);
		MailForm.getContentPane().add(scrollPane);

		VolunteerMail = new JTextArea();
		VolunteerMail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		VolunteerMail.setEditable(false);
		VolunteerMail.setBounds(32, 68, 463, 381);
		scrollPane.setViewportView(VolunteerMail);
		
	}
	
	public JFrame getFrame()
	{
		return MailForm;
	}
	
	public void setText(String forms)
	{
		VolunteerMail.setText(forms);
	}
}
