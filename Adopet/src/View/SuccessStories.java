package View;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class SuccessStories {

	private JFrame frmSuccessStories;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuccessStories window = new SuccessStories();
					window.frmSuccessStories.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SuccessStories() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSuccessStories = new JFrame();		
		frmSuccessStories.setTitle("Success Stories");
		frmSuccessStories.setBounds(100, 100, 918, 689);
		frmSuccessStories.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSuccessStories.getContentPane().setLayout(null);
		frmSuccessStories.setLocationRelativeTo(null);

		
		JLabel successStoriesLabel = new JLabel("Success Stories");
		successStoriesLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		successStoriesLabel.setBounds(352, 16, 196, 45);
		frmSuccessStories.getContentPane().add(successStoriesLabel);
		
		JTextArea successStory_1 = new JTextArea();
		successStory_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		successStory_1.setText("Gia, formerly named Gina\r\n" + 
				"Age: 1 year old\r\n" + 
				"Breed: Chihuahua Mix\r\n" + 
				"\r\n" + 
				"Her new mom, Amanda, writes, “Who rescued who?” Is what I always say. We came into the Petsmart Scottsdale location not knowing that we would leave with our perfect angel (well I knew but my fiancé needed a little persuading). She changed our lives and instantly brought us such joy that we decided to return to the same location to save her baby brother, Jax. Nothing can compare to the unconditional love you will receive from a rescue animal! ”");		successStory_1.setBounds(65, 73, 634, 172);
		successStory_1.setLineWrap(true);
		successStory_1.setWrapStyleWord(true);
		successStory_1.setOpaque(false);
		successStory_1.setEditable(false);
		frmSuccessStories.getContentPane().add(successStory_1);
		
		JTextArea successStory_2 = new JTextArea();
		successStory_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		successStory_2.setText("Leo\r\nAge: 2 years old\r\nBreed: Mixed\r\n\r\nHis new dad, Randy, writes, \u201CWe fell in love with Leo when we saw him. He was quiet, & showed ZERO emotion. But something about him made us want him. He now LOVES going on car rides, he went to a dog-friendly hotel in Sedona with us. He went hiking. He cuddles all the time on our bed. You wouldn\u2019t even think it\u2019s the same dog from that day at the shelter. We love him.\u201D");		
		successStory_2.setBounds(231, 254, 584, 172);
		successStory_2.setLineWrap(true);
		successStory_2.setWrapStyleWord(true);
		successStory_2.setOpaque(false);
		successStory_2.setEditable(false);
		frmSuccessStories.getContentPane().add(successStory_2);
		
		JTextArea successStory_3 = new JTextArea();
		successStory_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		successStory_3.setText("Chance, formerly named Zippo\r\n" + 
				"Age:  8 months old\r\n" + 
				"Breed: Domestic Shorthair\r\n" + 
				"\r\n" + 
				"His new mom, Michelle, writes, “I walked by all the cages and this one little guy was just pawing at the glass and really speaking to me. I fell in love instantly and then I looked up at the card and I read a stray kitten? Awww and then it said three legs! What!?! Shut the front door! On the paperwork, there was a second physician that examined him and his damaged leg and it stated “Second Chance” and hence his new name was born.”");
		successStory_3.setBounds(65, 442, 625, 184);
		successStory_3.setLineWrap(true);
		successStory_3.setWrapStyleWord(true);
		successStory_3.setOpaque(false);
		successStory_3.setEditable(false);
		frmSuccessStories.getContentPane().add(successStory_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(45, 249, 807, 8);
		frmSuccessStories.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(39, 435, 807, 8);
		frmSuccessStories.getContentPane().add(separator_1);
		
		JLabel storyImg_3 = new JLabel("");
		storyImg_3.setHorizontalAlignment(SwingConstants.CENTER);
		Image Img_3 = new ImageIcon(this.getClass().getResource("/successStoryCat_3.jpg")).getImage().getScaledInstance(120, 159, Image.SCALE_SMOOTH);
		storyImg_3.setIcon(new ImageIcon(Img_3));
		storyImg_3.setBounds(688, 442, 179, 184);
		frmSuccessStories.getContentPane().add(storyImg_3);
		
		JLabel storyImg_2 = new JLabel("");
		storyImg_2.setHorizontalAlignment(SwingConstants.CENTER);
		Image Img_2 = new ImageIcon(this.getClass().getResource("/successStoryDog_2.jpeg")).getImage().getScaledInstance(149, 307, Image.SCALE_SMOOTH);
		storyImg_2.setIcon(new ImageIcon(Img_2));
		storyImg_2.setBounds(75, 254, 141, 173);
		frmSuccessStories.getContentPane().add(storyImg_2);
		
		JLabel storyImg_1 = new JLabel("");
		storyImg_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image Img_1 = new ImageIcon(this.getClass().getResource("/successStoryDog_1.jpg")).getImage().getScaledInstance(120, 142, Image.SCALE_SMOOTH);
		storyImg_1.setIcon(new ImageIcon(Img_1));
		storyImg_1.setBounds(688, 66, 167, 172);
		frmSuccessStories.getContentPane().add(storyImg_1);		
	}
}
