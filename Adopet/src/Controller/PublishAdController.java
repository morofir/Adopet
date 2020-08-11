package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import AdopetProject.AdopetException;
import AdopetProject.testFunction;
import Model.Ads;
import Model.Database;
import View.AdForm;

public class PublishAdController {

	AdForm theView;
	Database db;

	public PublishAdController(AdForm theView, Database db) {

		this.db = db;
		this.theView = theView;

		theView.getFrame().setVisible(true);

		theView.addPublishAdListener(new PublishAdListener());
	}

	class PublishAdListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			createAdActionPerformed(e);
		}
		
		private void createAdActionPerformed(ActionEvent evt) {
			try{
				if(isFormFilled())
				{
					boolean check = createNewAd();
					if(!check){
						return;
					}
					theView.getFrame().setVisible(false);
				}
				else
				{
					throw new Exception();
				}
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(null,"Please fill up all the fields","Failed", JOptionPane.ERROR_MESSAGE );
			}
		}
		
		boolean isFormFilled()
		{
			if(theView.getEmail().isEmpty()  || theView.getName().isEmpty())
			{
				return false;
			}
			return true;
		}
		
		boolean createNewAd() throws IOException
		{
			String name = theView.getName();
			String em= theView.getEmail();
			String adType = theView.getAdType();
			String pet = theView.getPetType();
			String age = theView.getAge();
			String breed = theView.getBreed();
			String petRegion = theView.getRegion();
			String description = theView.getDescription();		
			String sex = theView.getSex();
			String size = theView.getSize();

			try{
				testFunction.validateName(name);
				testFunction.validateEmail(em);
				testFunction.validateAdType(adType);
				testFunction.validatePetType(pet);
				testFunction.validatePetAge(age);
				testFunction.validatePetBreed(breed, pet);
				testFunction.validatePetSize(size);
				testFunction.validatePetSex(sex);
				testFunction.validatePetRegion(petRegion);
				testFunction.validateDescription(description);
			}
			catch(AdopetException e){
				JOptionPane.showMessageDialog(null,e.getMessage(),"Failed", JOptionPane.ERROR_MESSAGE );
				return false;
			}
			
			Ads ad=new Ads();
			ad.setPublisherName(name);
			ad.setAdType(adType);
			ad.setAge(age);
			ad.setAnimal(pet);
			ad.setBreed(breed);
			ad.setDescription(description);
			ad.setPublisherEmail(em);
			ad.setRegion(petRegion);
			ad.setSex(sex);
			ad.setSize(size);
			
			db.addNewAd(ad);
			db.saveAdsData();
			
			JOptionPane.showMessageDialog(null,"Ad Published!","Successful!", JOptionPane.PLAIN_MESSAGE );

			return true;
		}
	}
}
