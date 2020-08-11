package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ContactUsForm {

	private JFrame frmContactUs;
	private JTextField fullNameField;
	private JTextField phoneField;
	private JTextField emailField;
	private JTextField contactSubjectField;
	private JTextField txtEnterYourDetails;
	private JTextArea messageBodyArea;
	private JButton sendContactMsgButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUsForm window = new ContactUsForm();
					window.frmContactUs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ContactUsForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContactUs = new JFrame();
		frmContactUs.setTitle("Contact Us");
		frmContactUs.setBounds(100, 100, 561, 625);
		frmContactUs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmContactUs.getContentPane().setLayout(null);
		frmContactUs.setLocationRelativeTo(null);
		
		JLabel contactUsLabel = new JLabel("Contact Us");
		contactUsLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contactUsLabel.setBounds(200, 16, 146, 40);
		frmContactUs.getContentPane().add(contactUsLabel);
		
		fullNameField = new JTextField();
		fullNameField.setText("Enter Full Name");
		fullNameField.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	fullNameField.setText("");
            }
		});
		fullNameField.setBounds(266, 93, 146, 26);
		frmContactUs.getContentPane().add(fullNameField);
		fullNameField.setColumns(10);
		
		JLabel fullNameLabel = new JLabel("Name:");
		fullNameLabel.setBounds(102, 95, 83, 23);
		frmContactUs.getContentPane().add(fullNameLabel);
		
		phoneField = new JTextField();
		phoneField.setBounds(266, 149, 146, 26);
		frmContactUs.getContentPane().add(phoneField);
		phoneField.setColumns(10);
		
		JLabel phoneLabel = new JLabel("Phone:");
		phoneLabel.setBounds(102, 152, 69, 20);
		frmContactUs.getContentPane().add(phoneLabel);
		
		emailField = new JTextField();
		emailField.setBounds(266, 205, 146, 26);
		frmContactUs.getContentPane().add(emailField);
		emailField.setColumns(10);
		
		JLabel emailLabel = new JLabel("Email:");
		emailLabel.setBounds(102, 208, 69, 20);
		frmContactUs.getContentPane().add(emailLabel);
		
		contactSubjectField = new JTextField();
		contactSubjectField.setBounds(266, 261, 146, 26);
		frmContactUs.getContentPane().add(contactSubjectField);
		contactSubjectField.setColumns(10);
		
		JLabel contactSubjectLabel = new JLabel("Subject");
		contactSubjectLabel.setBounds(102, 264, 125, 20);
		frmContactUs.getContentPane().add(contactSubjectLabel);
		
		messageBodyArea = new JTextArea();
		messageBodyArea.setLineWrap(true);
		messageBodyArea.setBounds(266, 309, 146, 171);
		frmContactUs.getContentPane().add(messageBodyArea);
		
		JLabel messageBodyLabel = new JLabel("Message Body:");
		messageBodyLabel.setBounds(102, 309, 113, 20);
		frmContactUs.getContentPane().add(messageBodyLabel);
		
		txtEnterYourDetails = new JTextField();
		txtEnterYourDetails.setEditable(false);
		txtEnterYourDetails.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterYourDetails.setText("Send us your details and we will contact you!");
		txtEnterYourDetails.setBounds(86, 52, 341, 26);
		frmContactUs.getContentPane().add(txtEnterYourDetails);
		txtEnterYourDetails.setColumns(10);
		
		sendContactMsgButton = new JButton("Send!");
		sendContactMsgButton.setBounds(200, 509, 115, 44);
		frmContactUs.getContentPane().add(sendContactMsgButton);
	}
	
	public JFrame getFrmContactUs()
	{
		return frmContactUs;
	}
	
	public String getName() {
	    return fullNameField.getText().toString();
	}
	public String getPhone() {
	    return phoneField.getText().toString();
	}
	public String getEmail() {
	    return emailField.getText().toString();
	}
	public String getMsgBody() {
	    return messageBodyArea.getText().toString();
	}
	public String getSubject() {
	    return contactSubjectField.getText().toString();
	}
	
	public void addContactUsFormListener(ActionListener contactUsFormListener) 
	{
		sendContactMsgButton.addActionListener(contactUsFormListener);
	}

}

