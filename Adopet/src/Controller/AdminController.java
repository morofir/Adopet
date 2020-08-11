package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import AdopetProject.PublishAdMVC;
import Model.Database;
import View.AdminAdsManagment;
import View.AdminReport;
import View.ContactUsFormMail;
import View.VolunteerFormMail;

public class AdminController {

	Database db;
	VolunteerFormMail volunteerMailView;
	ContactUsFormMail contactMailView;
	AdminAdsManagment theGetView;
	AdminReport reportView;

	public AdminController(Database db, AdminAdsManagment getView, AdminReport reportView, VolunteerFormMail volunteerMailView, ContactUsFormMail contactMailView) throws IOException 
	{
		this.db = db;
		this.volunteerMailView = volunteerMailView;
		this.contactMailView = contactMailView;
		this.theGetView = getView;
		this.reportView = reportView;

		String allAds = db.getAllAds();
		theGetView.setAllAds(allAds);

		theGetView.addVolunteerMailListener(new volunteerMailListener());
		theGetView.addContactMailListener(new contactMailListener());
		theGetView.addReportListener(new ReportListener());
		theGetView.addPublishAdListener(new PublishAdListener());
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
			String reports = db.getStatistics();
			reportView.setReport(reports);
			reportView.getFrame().setVisible(true);
		}
	}

	class volunteerMailListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try {
				volunteerMailView.getFrame().setVisible(true);
				volunteerMailView.setText(db.LoadVolunteerFormMail());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	class contactMailListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try {
				contactMailView.getFrame().setVisible(true);
				contactMailView.setText(db.LoadContactFormMail());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

}
