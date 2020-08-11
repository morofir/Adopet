package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import AdopetProject.AdopetException;
import AdopetProject.testFunction;
import Model.Database;
import View.BlockUser;

public class BlockUserController {

	BlockUser theGetView;
	Database db;

	public BlockUserController(BlockUser theView, Database db)
	{
		theGetView = theView;
		this.db = db;

		theGetView.getFrame().setVisible(true);

		theGetView.addBlockUserListener(new BlockUserListener());
	}

	class BlockUserListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String emailToBlock = theGetView.getEmail();
			try
			{
				testFunction.validateEmail(emailToBlock);
			}
			catch (AdopetException ex)
			{
				JOptionPane.showMessageDialog(null,ex.getMessage(),"Failed", JOptionPane.ERROR_MESSAGE );
				return;
			}
			db.getUserToBlock(emailToBlock);
			theGetView.getFrame().setVisible(false);
		}
	}
}
