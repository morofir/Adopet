package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;

public class AdoptionInfo {

	private JFrame frmAdoptionInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdoptionInfo window = new AdoptionInfo();
					window.frmAdoptionInfo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdoptionInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdoptionInfo = new JFrame();
		frmAdoptionInfo.setTitle("Adoption Info");
		frmAdoptionInfo.setBounds(100, 100, 655, 599);
		frmAdoptionInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAdoptionInfo.getContentPane().setLayout(null);
		frmAdoptionInfo.setLocationRelativeTo(null);
		
		JLabel adoptionInfoLabel = new JLabel("Adoption Information");
		adoptionInfoLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		adoptionInfoLabel.setBounds(179, 16, 279, 68);
		frmAdoptionInfo.getContentPane().add(adoptionInfoLabel);
		
		JTextArea txtrWhatAreThe = new JTextArea();
		txtrWhatAreThe.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtrWhatAreThe.setLineWrap(true);
		txtrWhatAreThe.setBackground(SystemColor.menu);
		txtrWhatAreThe.setEditable(false);
		txtrWhatAreThe.setText("What are the requierments to adopt a pet?");
		txtrWhatAreThe.setBounds(27, 90, 373, 22);
		txtrWhatAreThe.setWrapStyleWord(true);
		frmAdoptionInfo.getContentPane().add(txtrWhatAreThe);
		
		JTextArea txtrWhenYouAdopt = new JTextArea();
		txtrWhenYouAdopt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrWhenYouAdopt.setLineWrap(true);
		txtrWhenYouAdopt.setBackground(SystemColor.menu);
		txtrWhenYouAdopt.setEditable(false);
		txtrWhenYouAdopt.setText("When you adopt, you\u2019ll need:\r\r\r\r\r\nProof that you\u2019re at least 18 years of age.\r\r\r\nA picture ID with your current address, or if this isn\u2019t available, a picture ID and a current utility bill.\r\r\r\nA meeting with one of our pet adoption counselors.");
		txtrWhenYouAdopt.setBounds(27, 120, 577, 113);
		txtrWhenYouAdopt.setWrapStyleWord(true);
		frmAdoptionInfo.getContentPane().add(txtrWhenYouAdopt);
		
		JTextArea txtrWhatAreThe_2 = new JTextArea();
		txtrWhatAreThe_2.setWrapStyleWord(true);
		txtrWhatAreThe_2.setText("What are the pet adoption fees?");
		txtrWhatAreThe_2.setLineWrap(true);
		txtrWhatAreThe_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtrWhatAreThe_2.setEditable(false);
		txtrWhatAreThe_2.setBackground(SystemColor.menu);
		txtrWhatAreThe_2.setBounds(27, 240, 373, 22);
		frmAdoptionInfo.getContentPane().add(txtrWhatAreThe_2);
		
		JTextArea txtrAlthoughItCosts = new JTextArea();
		txtrAlthoughItCosts.setWrapStyleWord(true);
		txtrAlthoughItCosts.setText("Although it costs The Animal Foundation an average of over 1000 Nis to care for each adoptable pet, we work constantly to eliminate price barriers, so homeless animals can find a forever home.\r\r\nPuppies (under 6 mos. old) 700 Nis\r\r\r\nAdult Large Dogs (6 mos. and older) 500 Nis\r\r\r\nKittens (under 6 mos. old) 400 Nis\r\r\r\nAdult Cats (6 mos. and older) 300 Nis");
		txtrAlthoughItCosts.setLineWrap(true);
		txtrAlthoughItCosts.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrAlthoughItCosts.setEditable(false);
		txtrAlthoughItCosts.setBackground(SystemColor.menu);
		txtrAlthoughItCosts.setBounds(27, 264, 577, 154);
		frmAdoptionInfo.getContentPane().add(txtrAlthoughItCosts);
		
		JTextArea txtrWhatAreThe_2_1 = new JTextArea();
		txtrWhatAreThe_2_1.setWrapStyleWord(true);
		txtrWhatAreThe_2_1.setText("What does your pet adoption fee include?");
		txtrWhatAreThe_2_1.setLineWrap(true);
		txtrWhatAreThe_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtrWhatAreThe_2_1.setEditable(false);
		txtrWhatAreThe_2_1.setBackground(SystemColor.menu);
		txtrWhatAreThe_2_1.setBounds(27, 417, 373, 22);
		frmAdoptionInfo.getContentPane().add(txtrWhatAreThe_2_1);
		
		JTextArea txtrAdoptionFeesInclude = new JTextArea();
		txtrAdoptionFeesInclude.setWrapStyleWord(true);
		txtrAdoptionFeesInclude.setText("Adoption fees include spay and neuter surgery, all current vaccinations, and a microchip. Additionally, adopters at our campus Adoption Center will receive a transition bag of Hill\u2019s Science Diet pet food (dogs and cats only), a coupon for $5 off Hill\u2019s Science Diet.");
		txtrAdoptionFeesInclude.setLineWrap(true);
		txtrAdoptionFeesInclude.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtrAdoptionFeesInclude.setEditable(false);
		txtrAdoptionFeesInclude.setBackground(SystemColor.menu);
		txtrAdoptionFeesInclude.setBounds(27, 440, 577, 87);
		frmAdoptionInfo.getContentPane().add(txtrAdoptionFeesInclude);
	
	}
}
