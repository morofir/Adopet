package AdopetProject;

import Controller.LoginController;
import Model.Database;
import Model.Guest;
import View.Login;

public class LoginMVC {
	@SuppressWarnings("unused")
	public static void Main()
	{
		Guest theModel = new Guest();
		Database db = Database.getInstance();
		Login theView = new Login();
		LoginController theController = new LoginController(theModel, db, theView);		
	}
}
