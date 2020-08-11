package AdopetProject;

import Controller.BlockUserController;
import Model.Database;
import View.BlockUser;

public class BlockUserMVC {

	@SuppressWarnings("unused")
	public static void main()
	{
		BlockUser theView = new BlockUser();
		Database db = Database.getInstance();
		BlockUserController theController = new BlockUserController(theView, db);
	}
}
