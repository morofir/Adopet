package View;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import AdopetProject.AdsMVC;
import AdopetProject.ContactMVC;
import AdopetProject.LoginMVC;
import AdopetProject.VolunteerMVC;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage {

	private JFrame AdoptionSystem;
	private JButton searchButton;
	private JComboBox<String> petBreedOptions;
	private JComboBox<String> petSexBox;
	private JComboBox<String> ageOptions;
	private JComboBox<String> petTypes;
	private JComboBox<String> RegionOptions;
	private JComboBox<String> petSizeBox;
	private static HomePage window;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new HomePage();
					window.AdoptionSystem.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AdoptionSystem = new JFrame();
		AdoptionSystem.setTitle("ADOPET - Adoption system");
		AdoptionSystem.setBounds(200, 200, 917, 599);
		AdoptionSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AdoptionSystem.getContentPane().setLayout(null);
		AdoptionSystem.setLocationRelativeTo(null);

		JLabel logo = new JLabel("");
		Image appLogo = new ImageIcon(this.getClass().getResource("/adopetLogo.png")).getImage().getScaledInstance(300, 150, Image.SCALE_SMOOTH);
		logo.setIcon(new ImageIcon(appLogo));
		logo.setBounds(301, 16, 300, 77);
		AdoptionSystem.getContentPane().add(logo);

		JButton adoptionInfoPage = new JButton("Adoption Info");
		adoptionInfoPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdoptionInfo.main(null);
			}
		});
		adoptionInfoPage.setBounds(25, 98, 139, 46);
		AdoptionSystem.getContentPane().add(adoptionInfoPage);

		JButton volunteerForm = new JButton("Volunteer");
		volunteerForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				VolunteerMVC.Main();
			}
		});
		volunteerForm.setBounds(346, 98, 125, 46);
		AdoptionSystem.getContentPane().add(volunteerForm);

		JButton adoptionStoriesPage = new JButton("Success Stories");
		adoptionStoriesPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SuccessStories.main(null);
			}
		});
		adoptionStoriesPage.setBounds(179, 98, 152, 46);
		AdoptionSystem.getContentPane().add(adoptionStoriesPage);

		JButton lostPetsPage = new JButton("Lost Pets");
		lostPetsPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdsMVC.main("Lost", window);
			}
		});
		lostPetsPage.setBounds(486, 98, 115, 46);
		AdoptionSystem.getContentPane().add(lostPetsPage);

		JButton aboutUsPage = new JButton("About Us");
		aboutUsPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs.main(null);
			}
		});
		aboutUsPage.setBounds(616, 98, 115, 46);
		AdoptionSystem.getContentPane().add(aboutUsPage);

		JButton contactUsForm = new JButton("Contact Us");
		contactUsForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactMVC.Main();
			}
		});
		contactUsForm.setBounds(746, 98, 115, 46);
		AdoptionSystem.getContentPane().add(contactUsForm);

		JLabel searchLabel = new JLabel("Find A Friend!");
		searchLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		searchLabel.setBounds(96, 162, 171, 64);
		AdoptionSystem.getContentPane().add(searchLabel);

		JButton adsManagmentPage = new JButton("Ads Manager");
		adsManagmentPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginMVC.Main();
				Login.getLogin().setVisible(true);
			}
		});
		adsManagmentPage.setBounds(722, 16, 139, 38);
		AdoptionSystem.getContentPane().add(adsManagmentPage);

		JLabel homeText1 = new JLabel("Adopt an animal - Hundreds of animals are waiting for a warm house in the Adopet system! ");
		homeText1.setBounds(98, 210, 761, 32);
		AdoptionSystem.getContentPane().add(homeText1);

		JLabel homeText2 = new JLabel("Choose the animal you want, with a simple search you can find the right animal for you.");
		homeText2.setBounds(98, 242, 599, 20);
		AdoptionSystem.getContentPane().add(homeText2);

		petTypes = new JComboBox<String>();
		petTypes.setBounds(96, 307, 153, 32);
		petTypes.addItem("All");
		petTypes.addItem("Dog");
		petTypes.addItem("Cat");
		AdoptionSystem.getContentPane().add(petTypes);

		JLabel petTypeLabel = new JLabel("Pet Type:");
		petTypeLabel.setBounds(96, 278, 80, 26);
		AdoptionSystem.getContentPane().add(petTypeLabel);

		RegionOptions = new JComboBox<String>();
		RegionOptions.setBounds(507, 307, 153, 32);
		RegionOptions.addItem("All");
		RegionOptions.addItem("Center");
		RegionOptions.addItem("South");
		RegionOptions.addItem("North");
		AdoptionSystem.getContentPane().add(RegionOptions);

		JLabel regionLabel = new JLabel("Region:");
		regionLabel.setBounds(509, 281, 69, 20);
		AdoptionSystem.getContentPane().add(regionLabel);

		ageOptions = new JComboBox<String>();
		ageOptions.setBounds(96, 383, 153, 32);
		ageOptions.addItem("All");
		ageOptions.addItem("0-2");
		ageOptions.addItem("3-6");
		ageOptions.addItem("7-10");
		ageOptions.addItem("11+");
		AdoptionSystem.getContentPane().add(ageOptions);

		JLabel ageLabel = new JLabel("Age:");
		ageLabel.setBounds(96, 357, 69, 20);
		AdoptionSystem.getContentPane().add(ageLabel);

		petSizeBox = new JComboBox<String>();
		petSizeBox.setBounds(299, 308, 153, 31);
		petSizeBox.addItem("All");
		petSizeBox.addItem("Small");
		petSizeBox.addItem("Medium");
		petSizeBox.addItem("Large");
		AdoptionSystem.getContentPane().add(petSizeBox);

		JLabel petSizeLabel = new JLabel("Pet Size:");
		petSizeLabel.setBounds(299, 281, 69, 20);
		AdoptionSystem.getContentPane().add(petSizeLabel);

		petSexBox = new JComboBox<String>();
		petSexBox.setBounds(299, 383, 153, 32);
		petSexBox.addItem("All");
		petSexBox.addItem("Male");
		petSexBox.addItem("Female");
		AdoptionSystem.getContentPane().add(petSexBox);

		JLabel petSexLabel = new JLabel("Sex:");
		petSexLabel.setBounds(299, 357, 69, 20);
		AdoptionSystem.getContentPane().add(petSexLabel);

		petBreedOptions = new JComboBox<String>();
		petBreedOptions.setBounds(507, 383, 153, 29);
		petBreedOptions.addItem("All");
		petBreedOptions.addItem("Mix");
		petBreedOptions.addItem("Labrador");
		petBreedOptions.addItem("Chihuahua");
		petBreedOptions.addItem("Husky");
		petBreedOptions.addItem("Pitbull");
		petBreedOptions.addItem("Domestic");
		AdoptionSystem.getContentPane().add(petBreedOptions);

		JLabel breedLabel = new JLabel("Breed:");
		breedLabel.setBounds(509, 357, 69, 20);
		AdoptionSystem.getContentPane().add(breedLabel);

		searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				AdsMVC.main("Adoption", window);
			}
		});
		searchButton.setBounds(705, 324, 115, 64);
		AdoptionSystem.getContentPane().add(searchButton);

		Box searchBox = Box.createVerticalBox();
		searchBox.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		searchBox.setBounds(53, 160, 791, 285);
		AdoptionSystem.getContentPane().add(searchBox);

		JButton slideShowButton = new JButton("Gallery Of Our Pets!");
		slideShowButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		slideShowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SlideShow.main(null);
			}
		});
		slideShowButton.setBounds(120, 461, 658, 71);
		AdoptionSystem.getContentPane().add(slideShowButton);
	}

	public String getPetBreed()
	{
		return petBreedOptions.getModel().getSelectedItem().toString();
	}

	public String getPetRegion()
	{
		return RegionOptions.getModel().getSelectedItem().toString();
	}

	public String getPetSex()
	{
		return petSexBox.getModel().getSelectedItem().toString();
	}

	public String getPetSize()
	{
		return petSizeBox.getModel().getSelectedItem().toString();
	}

	public String getPetAge()
	{
		return ageOptions.getModel().getSelectedItem().toString();
	}

	public String getPetType()
	{
		return petTypes.getModel().getSelectedItem().toString();
	}
}
