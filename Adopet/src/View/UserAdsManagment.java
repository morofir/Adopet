package View;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;

public class UserAdsManagment {

	private JFrame frmUserAdsManager;
	private JTextArea userAdsTxt;
	private String userEmail;
	private JButton publishAdButton;
	private JButton ReportButton;
	
	/**
	 * Launch the application.
	 */
	public static void main(String userEmail) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserAdsManagment window = new UserAdsManagment(userEmail);
					window.getFrmUserAdsManager().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param us 
	 */
	public UserAdsManagment(String userEmail) {
		initialize();
		setEmail(userEmail);
	}

	private void setEmail(String email) {

		userEmail = email;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrmUserAdsManager(new JFrame());
		getFrmUserAdsManager().setTitle("User Ads Manager");
		getFrmUserAdsManager().setBounds(200, 200, 683, 713);
		getFrmUserAdsManager().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getFrmUserAdsManager().getContentPane().setLayout(null);
		getFrmUserAdsManager().setLocationRelativeTo(null);
		
		JLabel userAdsManagerLabel = new JLabel("User Ads Manager");
		userAdsManagerLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		userAdsManagerLabel.setBounds(50, 16, 299, 50);
		getFrmUserAdsManager().getContentPane().add(userAdsManagerLabel);
		
		publishAdButton = new JButton("Publish Ad");
		publishAdButton.setBounds(458, 191, 155, 119);
		getFrmUserAdsManager().getContentPane().add(publishAdButton);
		
		ReportButton = new JButton("Print User Report");
		ReportButton.setBounds(458, 414, 155, 119);
		getFrmUserAdsManager().getContentPane().add(ReportButton);
		
		JLabel yourAdsLabel = new JLabel("Your Ads:");
		yourAdsLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		yourAdsLabel.setBounds(70, 92, 103, 41);
		getFrmUserAdsManager().getContentPane().add(yourAdsLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(50, 82, 563, 12);
		getFrmUserAdsManager().getContentPane().add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(48, 131, 317, 500);
		getFrmUserAdsManager().getContentPane().add(scrollPane);
		
		userAdsTxt = new JTextArea();
		userAdsTxt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		userAdsTxt.setEditable(false);
		scrollPane.setViewportView(userAdsTxt);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(420, 143, 14, 458);
		getFrmUserAdsManager().getContentPane().add(separator_1);
	}

	public JFrame getFrmUserAdsManager() {
		return frmUserAdsManager;
	}

	public void setFrmUserAdsManager(JFrame frmUserAdsManager) {
		this.frmUserAdsManager = frmUserAdsManager;
	}
	
	public void setAds(String usAds)
	{
		userAdsTxt.setText(usAds);
	}
	
	public String getUser()
	{
		return userEmail;
	}

	public void addPublishAdListener(ActionListener publishAdListener) {
		publishAdButton.addActionListener(publishAdListener);
	}

	public void addReportListener(ActionListener reportListener) {

		ReportButton.addActionListener(reportListener);
	}
}
