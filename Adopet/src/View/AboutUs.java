package View;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class AboutUs {

	private JFrame frmAboutUs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs window = new AboutUs();
					window.frmAboutUs.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AboutUs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAboutUs = new JFrame();
		frmAboutUs.setTitle("About Us");
		frmAboutUs.setBounds(100, 100, 629, 677);
		frmAboutUs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAboutUs.getContentPane().setLayout(null);
		frmAboutUs.setLocationRelativeTo(null);
		
		JLabel aboutUsLabel = new JLabel("About US");
		aboutUsLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		aboutUsLabel.setBounds(238, 16, 136, 42);
		frmAboutUs.getContentPane().add(aboutUsLabel);
	
		JLabel aboutUsImg = new JLabel("");
		aboutUsImg.setHorizontalAlignment(SwingConstants.CENTER);
		Image Img = new ImageIcon(this.getClass().getResource("/aboutUs.png")).getImage().getScaledInstance(450, 90, Image.SCALE_SMOOTH);
		aboutUsImg.setIcon(new ImageIcon(Img));
		aboutUsImg.setBounds(50, 53, 514, 102);
		frmAboutUs.getContentPane().add(aboutUsImg);
		
		JTextArea aboutUsText = new JTextArea();
		aboutUsText.setFont(new Font("Tahoma", Font.PLAIN, 16));
		aboutUsText.setText("Adopet is an online, searchable database of animals who need homes. It is also a directory of nearly 2,000 animal shelters and adoption organizations across Israel. Organizations maintain their own home pages and available-pet databases.\r\n\r\nOur missions:\r\nTo use Internet technology and the resources it can generate to:\r\n\r\n1. Increase public awareness of the availability of high-quality adoptable pets\r\n2. Increase the overall effectiveness of pet adoption programs across Israel to the extent that the euthanasia of adoptable pets is eliminated\r\n3. Elevate the status of pets to that of family member\r\n\nFrom the comfort of their personal computers, pet lovers can search for a pet that best matches their needs. They can then reference a shelter\u2019s phone and discover what services it offers. Adopet also includes a pet-care resource directory and a library of free pet-care articles to help keep pets in their homes.\r\n\r\nAdopet is updated DAILY.\r\n\r\nOrganizations wishing to participate should register. A contact person should be responsible for direct communications with Adopet. Only nonprofit organizations will be included.");
		aboutUsText.setBounds(20, 156, 572, 459);
		aboutUsText.setLineWrap(true);
		aboutUsText.setWrapStyleWord(true);
		aboutUsText.setOpaque(false);
        aboutUsText.setEditable(false);
        frmAboutUs.getContentPane().add(aboutUsText);
		
	}

}
