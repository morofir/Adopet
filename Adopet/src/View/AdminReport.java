package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;

public class AdminReport {

	private JFrame frmAdopetReport;
	private JTextArea reportArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminReport window = new AdminReport();
					window.frmAdopetReport.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminReport() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdopetReport = new JFrame();
		frmAdopetReport.setTitle("Adopet Report");
		frmAdopetReport.setBounds(100, 100, 387, 324);
		frmAdopetReport.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAdopetReport.getContentPane().setLayout(null);
		frmAdopetReport.setLocationRelativeTo(null);
		
		JLabel AdminReport = new JLabel("Admin Reports/Statistics: ");
		frmAdopetReport.getContentPane().add(AdminReport);
		AdminReport.setBounds(10, 12, 263, 31);
		
		reportArea = new JTextArea();
		reportArea.setFont(new Font("Tahoma", Font.PLAIN, 16));
		reportArea.setBounds(10, 54, 341, 200);
		reportArea.setEditable(false);
		frmAdopetReport.getContentPane().add(reportArea);
	}
	
	public JFrame getFrame()
	{
		return frmAdopetReport;
	}
	
	public void setReport(String report)
	{
		reportArea.setText(report);
	}
}
