package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VolunteerForm {

	private JFrame frmVolunteerForm;
	private JTextField txtwantToVolunteer;
	private JTextField nameField;
	private JTextField phoneField;
	private JTextField day;
	private JTextField month;
	private JTextField year;
	private JComboBox<String> RegioncomboBox;
	private JTextArea volunteerMsg;
	private JButton sendVolunteerFormButton;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VolunteerForm window = new VolunteerForm();
					window.frmVolunteerForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VolunteerForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVolunteerForm = new JFrame();
		frmVolunteerForm.setTitle("Volunteer Form");
		frmVolunteerForm.setBounds(100, 100, 546, 533);
		frmVolunteerForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmVolunteerForm.getContentPane().setLayout(null);
		frmVolunteerForm.setLocationRelativeTo(null);

		JLabel volunteerFormLabel = new JLabel("Volunteer Form");
		volunteerFormLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		volunteerFormLabel.setBounds(154, 16, 197, 51);
		frmVolunteerForm.getContentPane().add(volunteerFormLabel);

		txtwantToVolunteer = new JTextField();
		txtwantToVolunteer.setEditable(false);
		txtwantToVolunteer.setHorizontalAlignment(SwingConstants.CENTER);
		txtwantToVolunteer.setText("Want to volunteer? Leave details and we will contact you!");
		txtwantToVolunteer.setBounds(29, 66, 455, 26);
		frmVolunteerForm.getContentPane().add(txtwantToVolunteer);
		txtwantToVolunteer.setColumns(10);

		nameField = new JTextField();
		nameField.setText("Enter Full Name");
		nameField.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	nameField.setText("");
            }
		});
		nameField.setBounds(251, 130, 168, 26);
		frmVolunteerForm.getContentPane().add(nameField);
		nameField.setColumns(10);

		JLabel nameLabel = new JLabel("Name:");
		nameLabel.setBounds(111, 136, 69, 20);
		frmVolunteerForm.getContentPane().add(nameLabel);

		phoneField = new JTextField();
		phoneField.setBounds(251, 167, 168, 26);
		frmVolunteerForm.getContentPane().add(phoneField);
		phoneField.setColumns(10);

		JLabel phoneLabel = new JLabel("Phone:");
		phoneLabel.setBounds(111, 167, 69, 20);
		frmVolunteerForm.getContentPane().add(phoneLabel);

		JLabel RegionLabel = new JLabel("Region:");
		RegionLabel.setBounds(111, 207, 69, 20);
		frmVolunteerForm.getContentPane().add(RegionLabel);

		RegioncomboBox = new JComboBox<String>();
		RegioncomboBox.addItem("Choose where");
		RegioncomboBox.addItem("Center");
		RegioncomboBox.addItem("South");
		RegioncomboBox.addItem("North");
		RegioncomboBox.setBounds(251, 204, 168, 26);
		frmVolunteerForm.getContentPane().add(RegioncomboBox);

		JLabel freeTextLabel_1 = new JLabel("Message:");
		freeTextLabel_1.setBounds(111, 238, 98, 20);
		frmVolunteerForm.getContentPane().add(freeTextLabel_1);

		JLabel startDayLabel = new JLabel("Start Date:");
		startDayLabel.setBounds(111, 344, 83, 20);
		frmVolunteerForm.getContentPane().add(startDayLabel);

		day = new JTextField();
		day.setText("DD");
		day.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	day.setText("");
            }
		});
		day.setBounds(251, 338, 43, 26);
		frmVolunteerForm.getContentPane().add(day);
		day.setColumns(10);

		month = new JTextField();
		month.setText("MM");
		month.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	month.setText("");
            }
		});
		month.setColumns(10);
		month.setBounds(309, 338, 43, 26);
		frmVolunteerForm.getContentPane().add(month);

		year = new JTextField();
		year.setText("YYYY");
		year.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
            	year.setText("");
            }
		});
		year.setColumns(10);
		year.setBounds(367, 338, 52, 26);
		frmVolunteerForm.getContentPane().add(year);

		JLabel backslashLabel = new JLabel("/");
		backslashLabel.setBounds(296, 341, 15, 20);
		frmVolunteerForm.getContentPane().add(backslashLabel);

		JLabel backslashLabel_1 = new JLabel("/");
		backslashLabel_1.setBounds(355, 341, 15, 20);
		frmVolunteerForm.getContentPane().add(backslashLabel_1);

		volunteerMsg = new JTextArea();
		volunteerMsg.setLineWrap(true);
		volunteerMsg.setBounds(251, 238, 168, 90);
		frmVolunteerForm.getContentPane().add(volunteerMsg);

		sendVolunteerFormButton = new JButton("Send!");
		sendVolunteerFormButton.setBounds(196, 403, 115, 58);
		frmVolunteerForm.getContentPane().add(sendVolunteerFormButton);
	}
	
	public JFrame getFrmVolunteerForm()
	{
		return frmVolunteerForm;
	}
	
	public void addVolunteerFormListener(ActionListener listenerForSendButton)
	{
		sendVolunteerFormButton.addActionListener(listenerForSendButton);			
	}

	public String getName() {
		return nameField.getText().toString();
	}

	public String getPhone() {
		return phoneField.getText().toString();
	}

	public String getDay() {
		return day.getText().toString();
	}

	public String getMonth() {
		return month.getText().toString();
	}

	public String getYear() {
		return year.getText().toString();
	}

	public String getRegion() {
		return RegioncomboBox.getSelectedItem().toString();
	}

	public String getMsg() {
		return volunteerMsg.getText().toString();	
	}
}
