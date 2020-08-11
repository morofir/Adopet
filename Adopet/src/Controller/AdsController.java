package Controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import AdopetProject.AdopetException;
import Model.Ads;
import Model.Database;
import View.AdsView;
import View.HomePage;

public class AdsController {

	Ads adsModel;
	HomePage homePageView;
	AdsView adsView;
	String adType;
	Database db;

	public AdsController(String Type, Ads theModel, AdsView theView, HomePage theGetView)
	{
		this.adsModel = theModel;
		this.adsView = theView;
		this.homePageView = theGetView;
		this.adType = Type;
		db = Database.getInstance();
		db.loadAdsData();
		try {
			searchAds(adType);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void searchAds(String adType) throws Exception
	{
		try {
			String pet = homePageView.getPetType();
			String age = homePageView.getPetAge();
			String size = homePageView.getPetSize();
			String sex = homePageView.getPetSex();
			String region = homePageView.getPetRegion();
			String breed = homePageView.getPetBreed();

			ArrayList<Ads> AdsToShow = new ArrayList<Ads>();
			if(adType.equals("Adoption"))
			{
				AdsToShow = db.getMatchingAds(pet, age, size, sex, region,breed);
			}
			else if(adType.equals("Lost"))
			{
				AdsToShow = db.getLastLostAds();
			}
		
			showAds(AdsToShow);	
		}
		catch (AdopetException ex)
		{
			JOptionPane.showMessageDialog(adsView.getFrmPetAds(), ex.getMessage(), "Ads Not Found", JOptionPane.ERROR_MESSAGE);
		}		
	}

	private void showAds(ArrayList<Ads> AdsToShow) throws Exception {
		int i = 0;

		if(AdsToShow.size() > i)
		{
			adsView.setEmail_1(AdsToShow.get(i).getPublisherEmail());
			adsView.setAnimalField_1(AdsToShow.get(i).getAnimal());
			adsView.setAgeField_1(AdsToShow.get(i).getAge());
			adsView.setRegionField_1(AdsToShow.get(i).getRegion());
			adsView.setContactNameField_1(AdsToShow.get(i).getPublisherName());
			adsView.setBreedField_1(AdsToShow.get(i).getBreed());
			adsView.setTextArea_1(AdsToShow.get(i).getDescription());
			adsView.setSex_1(AdsToShow.get(i).getSex());
			adsView.setSize_1(AdsToShow.get(i).getSize());
		}

		i+=1;
		if(AdsToShow.size() > i)
		{
			adsView.setEmail_2(AdsToShow.get(i).getPublisherEmail());
			adsView.setAnimalField_2(AdsToShow.get(i).getAnimal());
			adsView.setAgeField_2(AdsToShow.get(i).getAge());
			adsView.setRegionField_2(AdsToShow.get(i).getRegion());
			adsView.setContactNameField_2(AdsToShow.get(i).getPublisherName());
			adsView.setBreedField_2(AdsToShow.get(i).getBreed());
			adsView.setTextArea_2(AdsToShow.get(i).getDescription());
			adsView.setSex_2(AdsToShow.get(i).getSex());
			adsView.setSize_2(AdsToShow.get(i).getSize());
		}

		i+=1;
		if(AdsToShow.size() > i)
		{
			adsView.setEmail_3(AdsToShow.get(i).getPublisherEmail());
			adsView.setAnimalField_3(AdsToShow.get(i).getAnimal());
			adsView.setAgeField_3(AdsToShow.get(i).getAge());
			adsView.setRegionField_3(AdsToShow.get(i).getRegion());
			adsView.setContactNameField_3(AdsToShow.get(i).getPublisherName());
			adsView.setBreedField_3(AdsToShow.get(i).getBreed());
			adsView.setTextArea_3(AdsToShow.get(i).getDescription());
			adsView.setSex_3(AdsToShow.get(i).getSex());
			adsView.setSize_3(AdsToShow.get(i).getSize());
		}

		i+=1;
		if(AdsToShow.size() > i)
		{
			adsView.setEmail_4(AdsToShow.get(i).getPublisherEmail());
			adsView.setAnimalField_4(AdsToShow.get(i).getAnimal());
			adsView.setAgeField_4(AdsToShow.get(i).getAge());
			adsView.setRegionField_4(AdsToShow.get(i).getRegion());
			adsView.setContactNameField_4(AdsToShow.get(i).getPublisherName());
			adsView.setBreedField_4(AdsToShow.get(i).getBreed());
			adsView.setTextArea_4(AdsToShow.get(i).getDescription());
			adsView.setSex_4(AdsToShow.get(i).getSex());
			adsView.setSize_4(AdsToShow.get(i).getSize());
		}

		adsView.getFrmPetAds().setVisible(true);
	}
}