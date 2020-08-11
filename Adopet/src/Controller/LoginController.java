package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import AdopetProject.AdminMVC;
import AdopetProject.AdopetException;
import AdopetProject.UserMVC;
import AdopetProject.testFunction;
import Model.Admin;
import Model.Database;
import Model.Guest;
import Model.User;
import View.Login;
import View.Signup;

public class LoginController {

	Guest userModel;
	Login loginView;
	Signup signUpView;
	Database db;

	public LoginController(Guest theModel, Database db, Login theView)
	{ 
		userModel = theModel;
		loginView = theView;
		signUpView = new Signup();
		this.db = db;
		db.loadUserData();
		loginView.addSignupListener(new createAcountListener());
		loginView.addAdminLoginListener(new adminLoginListener());
		loginView.addLoginListener(new loginListener());
	}

	class loginListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			try 
			{
				String email = loginView.getEmail();
				String password = loginView.getPassword();

				try
				{
					if (email.isEmpty() || password.isEmpty()) 
					{
						throw new AdopetException("Please fill up all the fields");
					}
					testFunction.validateEmail(email);	
				}
				catch(AdopetException ex)
				{
					JOptionPane.showMessageDialog(Login.getLogin(),ex.getMessage(),"Failed", JOptionPane.ERROR_MESSAGE );
					return;
				}

				if((userModel = db.getUser(email, password)) != null)
				{
					try
					{
						if(db.isUserBlocked(email) == true)
						{
							throw new Exception();
						}
						else
						{
							UserMVC.main(email);
							Login.getLogin().setVisible(false);
						}
					}
					catch(Exception ex) {
						JOptionPane.showMessageDialog(Login.getLogin(),"User Is Blocked!","Cannot Login",JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				else
				{
					JOptionPane.showMessageDialog(Login.getLogin(),"Email & Password didn't Match!","Failed",JOptionPane.ERROR_MESSAGE);
					return;
				}
			}
			catch (Exception ex) 
			{
				JOptionPane.showMessageDialog(Login.getLogin(),"Email & Password didn't Match!","Login Failed",JOptionPane.ERROR_MESSAGE);
				return;
			}
		}
	}

	class adminLoginListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			userModel = new Admin();
			if(loginView.getEmail().equals(((Admin) userModel).getUserName()) && loginView.getPassword().contentEquals(((Admin) userModel).getPassword())) 
			{
				try {
					AdminMVC.main();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				Login.getLogin().setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(Login.getLogin(), "The password/email is not correct!", "ERROR", JOptionPane.ERROR_MESSAGE);	
			}
		}
	}

	class createAcountListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			Login.getLogin().setVisible(false);
			signUpView.getFrmSignup().setVisible(true);
			signUpView.addSignupListener(new signUpListener());
		}
	}

	class signUpListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			createUserActionPerformed(e);
		}

		private void createUserActionPerformed(ActionEvent evt) {
			try{
				if(isFormFilled())
				{
					boolean check = createNewUser();
					if(!check){
						return;
					}
					db.saveUserData();
					signUpView.getFrmSignup().setVisible(false);
					Login.getLogin().setVisible(true);
				}
				else
				{
					throw new Exception();
				}
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(signUpView.getFrmSignup(),"Please fill up all the fields","Failed", JOptionPane.ERROR_MESSAGE );
			}
		}

		boolean isFormFilled()
		{
			if(signUpView.getUserNameField().isEmpty() || signUpView.getEmailField().isEmpty()  || signUpView.getOrganizationField().isEmpty() || signUpView.getPasswordField().isEmpty())
			{
				return false;
			}
			return true;
		}

		boolean createNewUser()
		{
			String name=signUpView.getUserNameField();
			String em=signUpView.getEmailField();
			String org=signUpView.getOrganizationField();
			String pass=signUpView.getPasswordField();

			try{
				testFunction.validateName(name);
				testFunction.validateOrganization(org);
				testFunction.validateEmail(em);
			}
			catch(AdopetException e){
				JOptionPane.showMessageDialog(null,e.getMessage(),"Failed", JOptionPane.ERROR_MESSAGE );
				return false;
			}

			try
			{
				if (db.isUserBlocked(em) == true)
				{
					throw new Exception("Email Is Blocked.");
				}
				else if (db.isUserExist(em) == true)
				{
					throw new Exception("This Email is already registerd!");
				}
				userModel = new User(name, em, pass, org);
				db.addNewUser((User) userModel);
				JOptionPane.showMessageDialog(null,"Username:"+((User) userModel).getEmail(),"Successful signup!", JOptionPane.PLAIN_MESSAGE );
			}
			catch (Exception ex)
			{
				JOptionPane.showMessageDialog(null,ex.getMessage(),"Error!", JOptionPane.ERROR_MESSAGE );
				return false;
			}

			return true;
		}
	}
}
