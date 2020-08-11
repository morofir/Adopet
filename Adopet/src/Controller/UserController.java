package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import AdopetProject.PublishAdMVC;
import Model.Database;
import View.UserAdsManagment;
import View.UserReport;

public class UserController {

	Database db;
	UserAdsManagment theView;
	UserReport reportView;

	public UserController(Database db, UserAdsManagment theView, UserReport reportView) {

		this.db = db;
		this.theView = theView;
		this.reportView = reportView;

		String email = theView.getUser();
		String usAds = db.getUserAds(email);
		theView.setAds(usAds);

		theView.addPublishAdListener(new PublishAdListener());
		theView.addReportListener(new ReportListener());

	}

	class PublishAdListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			PublishAdMVC.main();
		}
	}
	
	class ReportListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String reports = db.getUserStatistics(theView.getUser());
			reportView.setReport(reports);
			reportView.getFrame().setVisible(true);
		}
	}
}
