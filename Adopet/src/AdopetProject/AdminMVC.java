package AdopetProject;

import java.io.IOException;

import Controller.AdminController;
import Model.Database;
import View.AdminAdsManagment;
import View.AdminReport;
import View.ContactUsFormMail;
import View.VolunteerFormMail;

public class AdminMVC {
	@SuppressWarnings("unused")
	public static void main() throws IOException
	{
		Database db = Database.getInstance();
		AdminAdsManagment theGetView = new AdminAdsManagment();
		AdminReport reportView = new AdminReport();
		VolunteerFormMail volunteerMailView = new VolunteerFormMail();
		ContactUsFormMail contactMailView = new ContactUsFormMail();
		
		theGetView.getFrmAdminBoard().setVisible(true);
		AdminController theController = new AdminController(db, theGetView, reportView, volunteerMailView, contactMailView);
	}
}
