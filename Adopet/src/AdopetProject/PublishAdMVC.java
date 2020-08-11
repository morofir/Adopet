package AdopetProject;

import Controller.PublishAdController;
import Model.Database;
import View.AdForm;

public class PublishAdMVC {

	@SuppressWarnings("unused")
	public static void main() {
		
		AdForm theView = new AdForm();
		Database db = Database.getInstance();
		PublishAdController theController = new PublishAdController(theView, db);		
	}
}
