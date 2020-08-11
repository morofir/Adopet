package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import AdopetProject.AdopetException;
import AdopetProject.testFunction;
import Model.Contact;
import Model.Database;
import View.ContactUsForm;
import View.ContactUsFormMail;

public class ContactController {
	Contact contactModel;
	ContactUsForm contactUsFormView;
	ContactUsFormMail ContactUsMailView;
	Database db;

	public ContactController(Contact theModel, ContactUsForm theFormView, ContactUsFormMail theMailView)
	{
		this.contactModel = theModel;
		this.ContactUsMailView = theMailView;
		this.contactUsFormView  = theFormView;
		this.db = Database.getInstance();
		
		contactUsFormView.getFrmContactUs().setVisible(true);
		contactUsFormView.addContactUsFormListener(new ContactUsFormListener());
	}

	class ContactUsFormListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				String name = contactUsFormView.getName();
				String phone = contactUsFormView.getPhone();
				String email = contactUsFormView.getEmail();
				String subject = contactUsFormView.getSubject();
				String msgBody = contactUsFormView.getMsgBody();	

				if (name.isEmpty() || phone.isEmpty() || email.isEmpty())
				{
					throw new AdopetException("Please fill up all the fields");
				}
				testFunction.validateName(name);
				testFunction.validatePhone(phone);
				testFunction.validateEmail(email);

				contactModel.setName(name);
				contactModel.setPhoneNum(phone);
				contactModel.setEmail(email);
				contactModel.setcontactSubject(subject);
				contactModel.setmessageBody(msgBody);
				
				db.addNewContactForm(contactModel);
				try {
					db.saveContactForm();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(contactUsFormView.getFrmContactUs(),"Form Sent!","Successful!", JOptionPane.PLAIN_MESSAGE );
				
				contactUsFormView.getFrmContactUs().setVisible(false);
			}
			catch (AdopetException ex)
			{
				JOptionPane.showMessageDialog(contactUsFormView.getFrmContactUs(),ex.getMessage(),"Failed", JOptionPane.ERROR_MESSAGE );
				return;
			}	
		}
	}
}
