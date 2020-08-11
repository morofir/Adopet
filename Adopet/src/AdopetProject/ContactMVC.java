package AdopetProject;

import Controller.ContactController;
import Model.Contact;
import View.ContactUsForm;
import View.ContactUsFormMail;

public class ContactMVC {
	
	@SuppressWarnings("unused")
	public static void Main()
	{
		Contact theModel = new Contact();
		ContactUsForm theGetView = new ContactUsForm();
		ContactUsFormMail theSetView = new ContactUsFormMail();
		ContactController theController = new ContactController(theModel, theGetView, theSetView);
	}
}
