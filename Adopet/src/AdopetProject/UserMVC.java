package AdopetProject;

import Controller.UserController;
import Model.Database;
import View.UserAdsManagment;
import View.UserReport;

public class UserMVC {

	@SuppressWarnings("unused")
	public static void main(String email)
	{
		Database db = Database.getInstance();
		UserAdsManagment theView = new UserAdsManagment(email);
		UserReport reportView  = new UserReport();
		
		UserController theController = new UserController(db, theView, reportView);
		
		theView.getFrmUserAdsManager().setVisible(true);
	}
}
