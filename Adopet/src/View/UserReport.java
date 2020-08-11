package View;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class UserReport {

	private JFrame frmUserReport;
	private JTextArea reportArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserReport window = new UserReport();
					window.frmUserReport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserReport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUserReport = new JFrame();
		frmUserReport.setTitle("User Report");
		frmUserReport.setBounds(100, 100, 370, 298);
		frmUserReport.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmUserReport.getContentPane().setLayout(null);
		frmUserReport.setLocationRelativeTo(null);
		
		JLabel UserReport = new JLabel("User Reports/Statistics: ");
		frmUserReport.getContentPane().add(UserReport);
		UserReport.setBounds(10, 12, 263, 31);
		
		reportArea = new JTextArea();
		reportArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		reportArea.setBounds(10, 54, 326, 171);
		reportArea.setEditable(false);
		frmUserReport.getContentPane().add(reportArea);
	}
	
	public JFrame getFrame()
	{
		return frmUserReport;
	}
	
	public void setReport(String report)
	{
		reportArea.setText(report);
	}

}
