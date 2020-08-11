	package AdopetProject;

import Controller.VolunteerController;
import Model.Volunteer;
import View.VolunteerForm;
import View.VolunteerFormMail;

public class VolunteerMVC {

	@SuppressWarnings("unused")
	public static void Main()
	{
		Volunteer theModel = new Volunteer();
		VolunteerForm theGetForm = new VolunteerForm();
		VolunteerFormMail theSetView = new VolunteerFormMail();
		VolunteerController theController = new VolunteerController(theModel, theGetForm, theSetView);
	}
}
