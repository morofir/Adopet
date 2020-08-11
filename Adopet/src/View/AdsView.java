package View;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class AdsView {

	private JFrame frmPetAds;
	private JTextField animalField_1;
	private JTextField ageField_1;
	private JTextField BreedField_1;
	private JTextField regionField_1;
	private JTextField contactNameField_1;
	private JTextField emailField_1;
	private JTextField BreedField_2;
	private JTextField ageField_2;
	private JTextField animalField_2;
	private JTextField emailField_2;
	private JTextField contactNameField_2;
	private JTextField regionField_2;
	private JTextField animalField_3;
	private JTextField BreedField_3;
	private JTextField ageField_3;
	private JTextField emailField_3;
	private JTextField contactNameField_3;
	private JTextField regionField_3;
	private JTextField animalField_4;
	private JTextField BreedField_4;
	private JTextField ageField_4;
	private JTextField emailField_4;
	private JTextField contactNameField_4;
	private JTextField regionField_4;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	private JTextArea textArea_4;
	private JTextField sexField1;
	private JTextField sizeField1;
	private JTextField sexField_2;
	private JTextField sizeField_2;
	private JTextField sexField_3;
	private JTextField sizeField_3;
	private JTextField sexField_4;
	private JTextField sizeField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdsView window = new AdsView();
					window.frmPetAds.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdsView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPetAds = new JFrame();
		frmPetAds.setTitle("Pet Ads");
		frmPetAds.setBounds(100, 100, 1197, 714);
		frmPetAds.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmPetAds.getContentPane().setLayout(null);
		frmPetAds.setLocationRelativeTo(null);

		JLabel title = new JLabel("Find Your Pet");
		title.setFont(new Font("Tahoma", Font.PLAIN, 24));
		title.setBounds(522, 16, 158, 42);
		frmPetAds.getContentPane().add(title);

		animalField_1 = new JTextField();
		animalField_1.setEditable(false);
		animalField_1.setBounds(137, 90, 146, 26);
		frmPetAds.getContentPane().add(animalField_1);
		animalField_1.setColumns(10);

		ageField_1 = new JTextField();
		ageField_1.setEditable(false);
		ageField_1.setBounds(137, 132, 146, 26);
		frmPetAds.getContentPane().add(ageField_1);
		ageField_1.setColumns(10);

		BreedField_1 = new JTextField();
		BreedField_1.setEditable(false);
		BreedField_1.setBounds(137, 174, 146, 26);
		frmPetAds.getContentPane().add(BreedField_1);
		BreedField_1.setColumns(10);

		JLabel animalLabel_1 = new JLabel("Animal:");
		animalLabel_1.setBounds(39, 90, 69, 20);
		frmPetAds.getContentPane().add(animalLabel_1);

		JLabel ageLabel_1 = new JLabel("Age:");
		ageLabel_1.setBounds(39, 132, 69, 20);
		frmPetAds.getContentPane().add(ageLabel_1);

		JLabel breadLabel_1 = new JLabel("Breed:");
		breadLabel_1.setBounds(39, 174, 69, 20);
		frmPetAds.getContentPane().add(breadLabel_1);

		textArea_1 = new JTextArea();
		textArea_1.setLineWrap(true);
		textArea_1.setEditable(false);
		textArea_1.setBounds(422, 216, 146, 111);
		frmPetAds.getContentPane().add(textArea_1);

		JLabel descriptionLabel_1 = new JLabel("Description:");
		descriptionLabel_1.setBounds(314, 216, 85, 20);
		frmPetAds.getContentPane().add(descriptionLabel_1);

		JLabel regionLabel_1 = new JLabel("Region:");
		regionLabel_1.setBounds(314, 93, 69, 20);
		frmPetAds.getContentPane().add(regionLabel_1);

		regionField_1 = new JTextField();
		regionField_1.setEditable(false);
		regionField_1.setColumns(10);
		regionField_1.setBounds(422, 90, 146, 26);
		frmPetAds.getContentPane().add(regionField_1);

		JLabel nameLabel_1 = new JLabel("Contact Name:");
		nameLabel_1.setBounds(314, 135, 105, 20);
		frmPetAds.getContentPane().add(nameLabel_1);

		contactNameField_1 = new JTextField();
		contactNameField_1.setEditable(false);
		contactNameField_1.setColumns(10);
		contactNameField_1.setBounds(422, 132, 146, 26);
		frmPetAds.getContentPane().add(contactNameField_1);

		JLabel emailLabel_1 = new JLabel("Email:");
		emailLabel_1.setBounds(314, 177, 96, 20);
		frmPetAds.getContentPane().add(emailLabel_1);

		emailField_1 = new JTextField();
		emailField_1.setEditable(false);
		emailField_1.setColumns(10);
		emailField_1.setBounds(422, 174, 146, 26);
		frmPetAds.getContentPane().add(emailField_1);

		JLabel animalLabel_2 = new JLabel("Animal:");
		animalLabel_2.setBounds(39, 380, 69, 20);
		frmPetAds.getContentPane().add(animalLabel_2);

		JLabel ageLabel_2 = new JLabel("Age:");
		ageLabel_2.setBounds(39, 422, 69, 20);
		frmPetAds.getContentPane().add(ageLabel_2);

		JLabel breadLabel_2 = new JLabel("Breed:");
		breadLabel_2.setBounds(39, 464, 69, 20);
		frmPetAds.getContentPane().add(breadLabel_2);

		JLabel descriptionLabel_2 = new JLabel("Description:");
		descriptionLabel_2.setBounds(314, 506, 85, 20);
		frmPetAds.getContentPane().add(descriptionLabel_2);

		textArea_2 = new JTextArea();
		textArea_2.setLineWrap(true);
		textArea_2.setEditable(false);
		textArea_2.setBounds(422, 506, 146, 111);
		frmPetAds.getContentPane().add(textArea_2);

		BreedField_2 = new JTextField();
		BreedField_2.setEditable(false);
		BreedField_2.setColumns(10);
		BreedField_2.setBounds(137, 464, 146, 26);
		frmPetAds.getContentPane().add(BreedField_2);

		ageField_2 = new JTextField();
		ageField_2.setEditable(false);
		ageField_2.setColumns(10);
		ageField_2.setBounds(137, 422, 146, 26);
		frmPetAds.getContentPane().add(ageField_2);

		animalField_2 = new JTextField();
		animalField_2.setEditable(false);
		animalField_2.setColumns(10);
		animalField_2.setBounds(137, 380, 146, 26);
		frmPetAds.getContentPane().add(animalField_2);

		JLabel regionLabel_2 = new JLabel("Region:");
		regionLabel_2.setBounds(314, 380, 69, 20);
		frmPetAds.getContentPane().add(regionLabel_2);

		JLabel nameLabel_2 = new JLabel("Contact Name:");
		nameLabel_2.setBounds(314, 425, 105, 20);
		frmPetAds.getContentPane().add(nameLabel_2);

		JLabel emailLabel_2 = new JLabel("Email:");
		emailLabel_2.setBounds(314, 464, 96, 20);
		frmPetAds.getContentPane().add(emailLabel_2);

		emailField_2 = new JTextField();
		emailField_2.setEditable(false);
		emailField_2.setColumns(10);
		emailField_2.setBounds(422, 464, 146, 26);
		frmPetAds.getContentPane().add(emailField_2);

		contactNameField_2 = new JTextField();
		contactNameField_2.setEditable(false);
		contactNameField_2.setColumns(10);
		contactNameField_2.setBounds(422, 422, 146, 26);
		frmPetAds.getContentPane().add(contactNameField_2);

		regionField_2 = new JTextField();
		regionField_2.setEditable(false);
		regionField_2.setColumns(10);
		regionField_2.setBounds(422, 380, 146, 26);
		frmPetAds.getContentPane().add(regionField_2);

		animalField_3 = new JTextField();
		animalField_3.setEditable(false);
		animalField_3.setColumns(10);
		animalField_3.setBounds(706, 90, 146, 26);
		frmPetAds.getContentPane().add(animalField_3);

		JLabel animalLabel_3 = new JLabel("Animal:");
		animalLabel_3.setBounds(608, 90, 69, 20);
		frmPetAds.getContentPane().add(animalLabel_3);

		JLabel ageLabel_3 = new JLabel("Age:");
		ageLabel_3.setBounds(608, 132, 69, 20);
		frmPetAds.getContentPane().add(ageLabel_3);

		JLabel breadLabel_3 = new JLabel("Breed:");
		breadLabel_3.setBounds(608, 174, 69, 20);
		frmPetAds.getContentPane().add(breadLabel_3);

		JLabel descriptionLabel_3 = new JLabel("Description:");
		descriptionLabel_3.setBounds(883, 216, 85, 20);
		frmPetAds.getContentPane().add(descriptionLabel_3);

		textArea_3 = new JTextArea();
		textArea_3.setLineWrap(true);
		textArea_3.setEditable(false);
		textArea_3.setBounds(991, 216, 146, 111);
		frmPetAds.getContentPane().add(textArea_3);

		BreedField_3 = new JTextField();
		BreedField_3.setEditable(false);
		BreedField_3.setColumns(10);
		BreedField_3.setBounds(706, 174, 146, 26);
		frmPetAds.getContentPane().add(BreedField_3);

		ageField_3 = new JTextField();
		ageField_3.setEditable(false);
		ageField_3.setColumns(10);
		ageField_3.setBounds(706, 132, 146, 26);
		frmPetAds.getContentPane().add(ageField_3);

		JLabel regionLabel_3 = new JLabel("Region:");
		regionLabel_3.setBounds(883, 93, 69, 20);
		frmPetAds.getContentPane().add(regionLabel_3);

		JLabel nameLabel_3 = new JLabel("Contact Name:");
		nameLabel_3.setBounds(883, 135, 105, 20);
		frmPetAds.getContentPane().add(nameLabel_3);

		JLabel emailLabel_3 = new JLabel("Email:");
		emailLabel_3.setBounds(883, 177, 96, 20);
		frmPetAds.getContentPane().add(emailLabel_3);

		emailField_3 = new JTextField();
		emailField_3.setEditable(false);
		emailField_3.setColumns(10);
		emailField_3.setBounds(991, 174, 146, 26);
		frmPetAds.getContentPane().add(emailField_3);

		contactNameField_3 = new JTextField();
		contactNameField_3.setEditable(false);
		contactNameField_3.setColumns(10);
		contactNameField_3.setBounds(991, 132, 146, 26);
		frmPetAds.getContentPane().add(contactNameField_3);

		regionField_3 = new JTextField();
		regionField_3.setEditable(false);
		regionField_3.setColumns(10);
		regionField_3.setBounds(991, 90, 146, 26);
		frmPetAds.getContentPane().add(regionField_3);

		animalField_4 = new JTextField();
		animalField_4.setEditable(false);
		animalField_4.setColumns(10);
		animalField_4.setBounds(706, 380, 146, 26);
		frmPetAds.getContentPane().add(animalField_4);

		JLabel animalLabel_4 = new JLabel("Animal:");
		animalLabel_4.setBounds(608, 380, 69, 20);
		frmPetAds.getContentPane().add(animalLabel_4);

		JLabel ageLabel_4 = new JLabel("Age:");
		ageLabel_4.setBounds(608, 422, 69, 20);
		frmPetAds.getContentPane().add(ageLabel_4);

		JLabel breadLabel_4 = new JLabel("Breed:");
		breadLabel_4.setBounds(608, 464, 69, 20);
		frmPetAds.getContentPane().add(breadLabel_4);

		JLabel descriptionLabel_4 = new JLabel("Description:");
		descriptionLabel_4.setBounds(883, 506, 85, 20);
		frmPetAds.getContentPane().add(descriptionLabel_4);

		textArea_4 = new JTextArea();
		textArea_4.setLineWrap(true);
		textArea_4.setEditable(false);
		textArea_4.setBounds(991, 506, 146, 111);
		frmPetAds.getContentPane().add(textArea_4);

		BreedField_4 = new JTextField();
		BreedField_4.setEditable(false);
		BreedField_4.setColumns(10);
		BreedField_4.setBounds(706, 464, 146, 26);
		frmPetAds.getContentPane().add(BreedField_4);

		ageField_4 = new JTextField();
		ageField_4.setEditable(false);
		ageField_4.setColumns(10);
		ageField_4.setBounds(706, 422, 146, 26);
		frmPetAds.getContentPane().add(ageField_4);

		JLabel regionLabel_4 = new JLabel("Region:");
		regionLabel_4.setBounds(883, 380, 69, 20);
		frmPetAds.getContentPane().add(regionLabel_4);

		JLabel nameLabel_4 = new JLabel("Contact Name:");
		nameLabel_4.setBounds(883, 425, 105, 20);
		frmPetAds.getContentPane().add(nameLabel_4);

		JLabel emailLabel_4 = new JLabel("Email:");
		emailLabel_4.setBounds(883, 464, 96, 20);
		frmPetAds.getContentPane().add(emailLabel_4);

		emailField_4 = new JTextField();
		emailField_4.setEditable(false);
		emailField_4.setColumns(10);
		emailField_4.setBounds(991, 464, 146, 26);
		frmPetAds.getContentPane().add(emailField_4);

		contactNameField_4 = new JTextField();
		contactNameField_4.setEditable(false);
		contactNameField_4.setColumns(10);
		contactNameField_4.setBounds(991, 422, 146, 26);
		frmPetAds.getContentPane().add(contactNameField_4);

		regionField_4 = new JTextField();
		regionField_4.setEditable(false);
		regionField_4.setColumns(10);
		regionField_4.setBounds(991, 380, 146, 26);
		frmPetAds.getContentPane().add(regionField_4);

		Box Ad_1 = Box.createVerticalBox();
		Ad_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Ad_1.setBounds(26, 74, 556, 271);
		frmPetAds.getContentPane().add(Ad_1);
		
		JLabel sexLabel1 = new JLabel("Sex:");
		sexLabel1.setBounds(39, 216, 69, 20);
		frmPetAds.getContentPane().add(sexLabel1);
		
		JLabel sizeLabel1 = new JLabel("Size:");
		sizeLabel1.setBounds(39, 256, 69, 20);
		frmPetAds.getContentPane().add(sizeLabel1);
		
		sexField1 = new JTextField();
		sexField1.setEditable(false);
		sexField1.setBounds(137, 213, 146, 26);
		frmPetAds.getContentPane().add(sexField1);
		sexField1.setColumns(10);
		
		sizeField1 = new JTextField();
		sizeField1.setEditable(false);
		sizeField1.setBounds(137, 253, 146, 26);
		frmPetAds.getContentPane().add(sizeField1);
		sizeField1.setColumns(10);
		
		JLabel sexLabel_2 = new JLabel("Sex:");
		sexLabel_2.setBounds(39, 503, 69, 20);
		frmPetAds.getContentPane().add(sexLabel_2);
		
		sexField_2 = new JTextField();
		sexField_2.setEditable(false);
		sexField_2.setColumns(10);
		sexField_2.setBounds(137, 503, 146, 26);
		frmPetAds.getContentPane().add(sexField_2);
		
		JLabel sizeLabel_2 = new JLabel("Size:");
		sizeLabel_2.setBounds(39, 543, 69, 20);
		frmPetAds.getContentPane().add(sizeLabel_2);
		
		sizeField_2 = new JTextField();
		sizeField_2.setEditable(false);
		sizeField_2.setColumns(10);
		sizeField_2.setBounds(137, 540, 146, 26);
		frmPetAds.getContentPane().add(sizeField_2);
		
		sexField_3 = new JTextField();
		sexField_3.setEditable(false);
		sexField_3.setColumns(10);
		sexField_3.setBounds(706, 216, 146, 26);
		frmPetAds.getContentPane().add(sexField_3);
		
		JLabel sexLabel_3 = new JLabel("Sex:");
		sexLabel_3.setBounds(608, 216, 69, 20);
		frmPetAds.getContentPane().add(sexLabel_3);
		
		JLabel sizeLabel_3 = new JLabel("Size:");
		sizeLabel_3.setBounds(608, 256, 69, 20);
		frmPetAds.getContentPane().add(sizeLabel_3);
		
		sizeField_3 = new JTextField();
		sizeField_3.setEditable(false);
		sizeField_3.setColumns(10);
		sizeField_3.setBounds(706, 253, 146, 26);
		frmPetAds.getContentPane().add(sizeField_3);
		
		sexField_4 = new JTextField();
		sexField_4.setEditable(false);
		sexField_4.setColumns(10);
		sexField_4.setBounds(706, 506, 146, 26);
		frmPetAds.getContentPane().add(sexField_4);
		
		JLabel sexLabel_4 = new JLabel("Sex:");
		sexLabel_4.setBounds(608, 506, 69, 20);
		frmPetAds.getContentPane().add(sexLabel_4);
		
		JLabel sizeLabel_4 = new JLabel("Size:");
		sizeLabel_4.setBounds(608, 546, 69, 20);
		frmPetAds.getContentPane().add(sizeLabel_4);
		
		sizeField_4 = new JTextField();
		sizeField_4.setEditable(false);
		sizeField_4.setColumns(10);
		sizeField_4.setBounds(706, 543, 146, 26);
		frmPetAds.getContentPane().add(sizeField_4);
		
		Box Ad_2 = Box.createVerticalBox();
		Ad_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Ad_2.setBounds(26, 361, 556, 271);
		frmPetAds.getContentPane().add(Ad_2);
		
		Box Ad_3 = Box.createVerticalBox();
		Ad_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Ad_3.setBounds(597, 74, 556, 271);
		frmPetAds.getContentPane().add(Ad_3);
		
		Box Ad_4 = Box.createVerticalBox();
		Ad_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Ad_4.setBounds(597, 361, 556, 271);
		frmPetAds.getContentPane().add(Ad_4);
	}

	public void setEmail_1(String email) {
		emailField_1.setText(email);
	}
	public void setEmail_2(String email) {
		emailField_2.setText(email);
	}
	public void setEmail_3(String email) {
		emailField_3.setText(email);
	}
	public void setEmail_4(String email) {
		emailField_4.setText(email);
	}
	
	public void setSex_1(String sex) {
		sexField1.setText(sex);
	}
	public void setSex_2(String sex) {
		sexField_2.setText(sex);
	}
	public void setSex_3(String sex) {
		sexField_3.setText(sex);
	}
	public void setSex_4(String sex) {
		sexField_4.setText(sex);
	}
	
	public void setSize_1(String size) {
		sizeField1.setText(size);
	}
	public void setSize_2(String size) {
		sizeField_2.setText(size);
	}
	public void setSize_3(String size) {
		sizeField_3.setText(size);
	}
	public void setSize_4(String size) {
		sizeField_4.setText(size);
	}
	
	public void setAnimalField_1(String animal) {
		animalField_1.setText(animal);
	}
	public void setAnimalField_2(String animal) {
		animalField_2.setText(animal);
	}
	public void setAnimalField_3(String animal) {
		animalField_3.setText(animal);
	}
	public void setAnimalField_4(String animal) {
		animalField_4.setText(animal);
	}
	
	public void setAgeField_1(String age) {
		ageField_1.setText(age);
	}
	public void setAgeField_2(String age) {
		ageField_2.setText(age);
	}
	public void setAgeField_3(String age) {
		ageField_3.setText(age);
	}
	public void setAgeField_4(String age) {
		ageField_4.setText(age);
	}
	
	public void setRegionField_1(String region) {
		regionField_1.setText(region);
	}
	public void setRegionField_2(String region) {
		regionField_2.setText(region);
	}
	public void setRegionField_3(String region) {
		regionField_3.setText(region);
	}
	public void setRegionField_4(String region) {
		regionField_4.setText(region);
	}
	
	public void setBreedField_1(String breed) {
		BreedField_1.setText(breed);
	}
	public void setBreedField_2(String breed) {
		BreedField_2.setText(breed);
	}
	public void setBreedField_3(String breed) {
		BreedField_3.setText(breed);
	}
	public void setBreedField_4(String breed) {
		BreedField_4.setText(breed);
	}
	
	public void setTextArea_1(String description) {
		textArea_1.setText(description);
	}
	public void setTextArea_2(String description) {
		textArea_2.setText(description);
	}
	public void setTextArea_3(String description) {
		textArea_3.setText(description);
	}
	public void setTextArea_4(String description) {
		textArea_4.setText(description);
	}
	
	public void setContactNameField_1(String publisherName) {
		contactNameField_1.setText(publisherName);		
	}
	public void setContactNameField_2(String publisherName) {
		contactNameField_2.setText(publisherName);		
	}
	public void setContactNameField_3(String publisherName) {
		contactNameField_3.setText(publisherName);		
	}
	public void setContactNameField_4(String publisherName) {
		contactNameField_4.setText(publisherName);		
	}
	
	public JFrame getFrmPetAds() {
		return frmPetAds;		
	}
}
