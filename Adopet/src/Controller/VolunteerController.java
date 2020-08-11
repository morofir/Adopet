package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import AdopetProject.AdopetException;
import AdopetProject.testFunction;
import Model.Database;
import Model.Volunteer;
import View.VolunteerForm;
import View.VolunteerFormMail;

public class VolunteerController 
{
	Database db;
	Volunteer volunteerModel;
	VolunteerForm volunteerFormView;
	VolunteerFormMail volunteerMailView;

	public VolunteerController(Volunteer theModel, VolunteerForm theFormView, VolunteerFormMail theMailView)
	{
		this.volunteerModel = theModel;
		this.volunteerMailView = theMailView;
		this.volunteerFormView = theFormView;
		db = Database.getInstance();
		
		volunteerFormView.getFrmVolunteerForm().setVisible(true);
		volunteerFormView.addVolunteerFormListener(new VolunteerFormListener());
	}

	class VolunteerFormListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				String name = volunteerFormView.getName();
				String phone = volunteerFormView.getPhone();
				String startDay = volunteerFormView.getDay();
				String startMonth = volunteerFormView.getMonth();
				String startYear = volunteerFormView.getYear();
				String region = volunteerFormView.getRegion();
				String msg = volunteerFormView.getMsg();	

				if (name.isEmpty() || phone.isEmpty() || startDay.isEmpty() || startMonth.isEmpty() || startYear.isEmpty() || region.isEmpty())
				{
					throw new AdopetException("Please fill up all the fields");
				}
				testFunction.validateName(name);
				testFunction.validatePhone(phone);
				testFunction.validatePetRegion(region);
				testFunction.validateDay(startDay);
				testFunction.validateMonth(startMonth);
				testFunction.validateYear(startYear);

				volunteerModel.setName(name);
				volunteerModel.setPhoneNum(phone);
				volunteerModel.setStartDay(startDay);
				volunteerModel.setStartMonth(startMonth);
				volunteerModel.setStartYear(startYear);
				volunteerModel.setRegion(region);
				volunteerModel.setMsg(msg);
				
				db.addNewVolunteerForm(volunteerModel);
				try {
					db.saveVolunteerForm();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				JOptionPane.showMessageDialog(volunteerFormView.getFrmVolunteerForm(),"Form Sent!","Successful!", JOptionPane.PLAIN_MESSAGE );
				
				volunteerFormView.getFrmVolunteerForm().setVisible(false);
			}
			catch (AdopetException ex)
			{
				JOptionPane.showMessageDialog(volunteerFormView.getFrmVolunteerForm(),ex.getMessage(),"Failed", JOptionPane.ERROR_MESSAGE );
				return;
			}	
		}
	}
}
