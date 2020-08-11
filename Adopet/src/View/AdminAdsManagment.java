package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import AdopetProject.BlockUserMVC;

public class AdminAdsManagment {

	private JFrame frmAdminBoard;
	private JButton publishAdButton;
	private JTextArea allAdsTxt;
	private JButton volunteerboxButton;
	private JButton contactUsBoxButton;
	private JButton ReportButton;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminAdsManagment window = new AdminAdsManagment();
					window.frmAdminBoard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminAdsManagment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminBoard = new JFrame();
		frmAdminBoard.setTitle("Admin Board");
		frmAdminBoard.setBounds(100, 100, 733, 671);
		frmAdminBoard.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAdminBoard.getContentPane().setLayout(null);
		frmAdminBoard.setLocationRelativeTo(null);

		JLabel title = new JLabel("Administator Ads Manager");
		title.setFont(new Font("Tahoma", Font.BOLD, 30));
		title.setBounds(49, 16, 412, 66);
		frmAdminBoard.getContentPane().add(title);

		publishAdButton = new JButton("Publish Ad");
		publishAdButton.setBounds(494, 165, 141, 54);
		frmAdminBoard.getContentPane().add(publishAdButton);

		JLabel allAdsLabel = new JLabel("All Ads:");
		allAdsLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		allAdsLabel.setBounds(90, 86, 105, 40);
		frmAdminBoard.getContentPane().add(allAdsLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(49, 80, 606, 2);
		frmAdminBoard.getContentPane().add(separator);

		ReportButton = new JButton("Print Report");
		ReportButton.setBounds(494, 305, 141, 54);
		frmAdminBoard.getContentPane().add(ReportButton);

		JButton blockUserButton = new JButton("Block User");
		blockUserButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BlockUserMVC.main();
			}
		});
		blockUserButton.setBounds(494, 235, 141, 54);
		frmAdminBoard.getContentPane().add(blockUserButton);

		volunteerboxButton = new JButton("Volunteer Mail");
		volunteerboxButton.setBounds(494, 398, 141, 78);
		frmAdminBoard.getContentPane().add(volunteerboxButton);

		contactUsBoxButton = new JButton("Contact Us Mail");
		contactUsBoxButton.setBounds(494, 490, 141, 78);
		frmAdminBoard.getContentPane().add(contactUsBoxButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 131, 266, 458);
		frmAdminBoard.getContentPane().add(scrollPane);
		
		allAdsTxt = new JTextArea();
		allAdsTxt.setEditable(false);
		allAdsTxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrollPane.setViewportView(allAdsTxt);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(410, 145, 14, 423);
		frmAdminBoard.getContentPane().add(separator_1);
	}
	
	public JFrame getFrmAdminBoard()
	{
		return frmAdminBoard;
	}
	
	public void setAllAds(String allAds)
	{
		allAdsTxt.setText(allAds);	
	}
	
	public JFrame getAdminFrame()
	{
		return frmAdminBoard;
	}

	public void addVolunteerMailListener(ActionListener volunteerMailListener) {
		volunteerboxButton.addActionListener(volunteerMailListener);
	}

	public void addContactMailListener(ActionListener contactMailListener) {
		contactUsBoxButton.addActionListener(contactMailListener);		
	}
	
	public void addReportListener(ActionListener reportListener) {
		ReportButton.addActionListener(reportListener);		
	}
	
	public void addPublishAdListener(ActionListener publishAdListener) {
		publishAdButton.addActionListener(publishAdListener);		
	}
}
