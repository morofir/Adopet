package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import Model.Database;

import javax.swing.JButton;
import java.awt.event.ActionListener;

public class AdForm {

	private JFrame frmPublishAd;
	Database db=Database.getInstance();
	private JTextField emailField;
	private JTextField nameField;
	private JTextArea descriptionArea;
	private JComboBox<String> adTypeBox;
	private JComboBox<String> petTypeBox;
	private JComboBox<String> ageBox_1;
	private JComboBox<String> breedBox_1;
	private JComboBox<String> regionBox_1;
	private JComboBox<String> sexBox;
	private JComboBox<String> sizeBox;
	private JButton publishAdButton;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdForm window = new AdForm();
					window.frmPublishAd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPublishAd = new JFrame();
		frmPublishAd.setTitle("Publish New Ad");
		frmPublishAd.setBounds(100, 100, 716, 585);
		frmPublishAd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmPublishAd.getContentPane().setLayout(null);
		frmPublishAd.setLocationRelativeTo(null);
		
		JLabel titleLabel = new JLabel("Create Ad");
		titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		titleLabel.setBounds(292, 16, 111, 39);
		frmPublishAd.getContentPane().add(titleLabel);
		
		JLabel adTypeLabel = new JLabel("Ad Type:");
		adTypeLabel.setBounds(44, 90, 80, 20);
		frmPublishAd.getContentPane().add(adTypeLabel);
		
		adTypeBox = new JComboBox<String>();
		adTypeBox.addItem("Adoption");
		adTypeBox.addItem("Lost");
		adTypeBox.setBounds(148, 84, 165, 26);
		frmPublishAd.getContentPane().add(adTypeBox);
		
		JLabel lblPetType = new JLabel("Pet Type:");
		lblPetType.setBounds(44, 129, 80, 20);
		frmPublishAd.getContentPane().add(lblPetType);
		
		petTypeBox = new JComboBox<String>();
		petTypeBox.addItem("Choose Pet:");
		petTypeBox.addItem("Dog");
		petTypeBox.addItem("Cat");
		petTypeBox.setBounds(148, 126, 165, 26);
		frmPublishAd.getContentPane().add(petTypeBox);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(44, 171, 80, 20);
		frmPublishAd.getContentPane().add(lblAge);
		
		ageBox_1 = new JComboBox<String>();
		ageBox_1.setBounds(148, 168, 165, 26);
		ageBox_1.addItem("Choose Age:");
		ageBox_1.addItem("0-2");
		ageBox_1.addItem("3-6");
		ageBox_1.addItem("7-10");
		ageBox_1.addItem("11+");
		frmPublishAd.getContentPane().add(ageBox_1);
		
		JLabel lblBreed = new JLabel("Breed:");
		lblBreed.setBounds(44, 213, 80, 20);
		frmPublishAd.getContentPane().add(lblBreed);
		
		breedBox_1 = new JComboBox<String>();
		breedBox_1.setBounds(148, 210, 165, 26);
		breedBox_1.addItem("Choose Breed:");
		breedBox_1.addItem("Mix");
		breedBox_1.addItem("Labrador");
		breedBox_1.addItem("Chihuahua");
		breedBox_1.addItem("Husky");
		breedBox_1.addItem("Pitbull");
		breedBox_1.addItem("Domestic");
		frmPublishAd.getContentPane().add(breedBox_1);
		
		JLabel lblRegion = new JLabel("Region:");
		lblRegion.setBounds(382, 244, 80, 20);
		frmPublishAd.getContentPane().add(lblRegion);
		
		regionBox_1 = new JComboBox<String>();
		regionBox_1.setBounds(477, 241, 165, 26);
		regionBox_1.addItem("Choose Region:");
		regionBox_1.addItem("Center");
		regionBox_1.addItem("South");
		regionBox_1.addItem("North");
		frmPublishAd.getContentPane().add(regionBox_1);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setBounds(44, 330, 99, 20);
		frmPublishAd.getContentPane().add(lblDescription);
		
		descriptionArea = new JTextArea();
		descriptionArea.setBounds(148, 333, 468, 112);
		frmPublishAd.getContentPane().add(descriptionArea);
		
		JLabel contactInfoLabel = new JLabel("Contact info:");
		contactInfoLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		contactInfoLabel.setBounds(382, 90, 111, 20);
		frmPublishAd.getContentPane().add(contactInfoLabel);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(382, 189, 80, 20);
		frmPublishAd.getContentPane().add(lblEmail);
		
		emailField = new JTextField();
		emailField.setBounds(477, 186, 165, 26);
		frmPublishAd.getContentPane().add(emailField);
		emailField.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(382, 140, 80, 20);
		frmPublishAd.getContentPane().add(lblName);
		
		nameField = new JTextField();
		nameField.setBounds(477, 140, 165, 26);
		frmPublishAd.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		publishAdButton = new JButton("Publish Ad");
		publishAdButton.setBounds(270, 462, 170, 51);
		frmPublishAd.getContentPane().add(publishAdButton);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setBounds(44, 291, 80, 20);
		frmPublishAd.getContentPane().add(lblSex);
		
		sexBox = new JComboBox<String>();
		sexBox.setBounds(148, 288, 165, 26);
		sexBox.addItem("Choose Sex:");
		sexBox.addItem("Male");
		sexBox.addItem("Female");
		frmPublishAd.getContentPane().add(sexBox);
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(44, 255, 80, 20);
		frmPublishAd.getContentPane().add(lblSize);
		
		sizeBox = new JComboBox<String>();
		sizeBox.setBounds(148, 252, 165, 26);
		sizeBox.addItem("Choose Size:");
		sizeBox.addItem("Small");
		sizeBox.addItem("Medium");
		sizeBox.addItem("Large");
		frmPublishAd.getContentPane().add(sizeBox);
	}
	
	public String getAdType()
	{
		return adTypeBox.getModel().getSelectedItem().toString();
	}
	
	public String getName()
	{
		return nameField.getText().trim();
	}
	
	public String getEmail()
	{
		return emailField.getText().trim();
	}
	
	public String getPetType()
	{
		return petTypeBox.getModel().getSelectedItem().toString();
	}
	
	public String getAge()
	{
		return ageBox_1.getModel().getSelectedItem().toString();
	}
	
	public String getBreed()
	{
		return breedBox_1.getModel().getSelectedItem().toString();
	}
	
	public String getRegion()
	{
		return regionBox_1.getModel().getSelectedItem().toString();
	}
	
	public String getDescription()
	{
		return descriptionArea.getText().trim();
	}
	
	public JFrame getFrame()
	{
		return frmPublishAd;
	} 

	public void addPublishAdListener(ActionListener publishAdListener) {
		publishAdButton.addActionListener(publishAdListener);		
	}

	public String getSex() 
	{
		return sexBox.getModel().getSelectedItem().toString();
	}

	public String getSize() {
		return sizeBox.getModel().getSelectedItem().toString();
	}
}
