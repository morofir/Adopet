package AdopetProject;

import Controller.AdsController;
import Model.Ads;
import View.AdsView;
import View.HomePage;

public class AdsMVC {

	@SuppressWarnings("unused")
	public static void main(String adType, HomePage theGetView)
	{
		Ads theModel = new Ads();
		AdsView theView = new AdsView();
		AdsController theController = new AdsController(adType, theModel, theView, theGetView);
	}
}
