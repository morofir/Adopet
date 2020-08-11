package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import AdopetProject.AdopetException;

public class Database {

	private static Database instance;
	ArrayList<User> user = new ArrayList<User>();	
	ArrayList<Ads> ads = new ArrayList<Ads>();
	ArrayList<Volunteer> volunteerForms = new ArrayList<Volunteer>();
	ArrayList<Contact> contactForm = new ArrayList<Contact>();

	public static Database getInstance()
	{
		if(instance==null)
		{
			instance=new Database();
		}
		return instance;
	}

	public void addNewUser(User newUser)
	{
		this.user.add(newUser);
	}

	public void saveUserData() throws IOException
	{
		BufferedWriter bw= new BufferedWriter(new FileWriter(new File("UserList.txt"),true));
		try
		{
			bw.write("---------");
			bw.newLine();
			bw.write(String.valueOf(user.get(user.size()-1).getName()));
			bw.newLine();
			bw.write(String.valueOf(user.get(user.size()-1).getEmail()));
			bw.newLine();
			bw.write(String.valueOf(user.get(user.size()-1).getPassword()));
			bw.newLine();
			bw.write(String.valueOf(user.get(user.size()-1).getOrganization()));
			bw.newLine();

			bw.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}                
	}

	@SuppressWarnings("unused")
	public void loadUserData()
	{
		try
		{
			user = new ArrayList<User>();
			BufferedReader br = new BufferedReader(new FileReader(new File("UserList.txt")));
			String userNum;

			while((userNum=br.readLine()) != null)
			{
				User us = new User(br.readLine(), br.readLine(), br.readLine(), br.readLine()); //filling in user info from DB
				addNewUser(us);
			}
			br.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (NumberFormatException e)
		{	
			e.printStackTrace();
		}
	}
	
	void printUsers()
	{
		for(int i=0;i<user.size();i++)
		{
			System.out.println(user.get(i).getName() +" "+ user.get(i).getOrganization() +" "+ user.get(i).getEmail());
		}
	}
	
	public void addNewAd(Ads newAd)
	{
		this.ads.add(newAd);
	}

	public void addNewVolunteerForm(Volunteer newForm)
	{
		this.volunteerForms.add(newForm);
	}

	public void addNewContactForm(Contact newForm)
	{
		this.contactForm.add(newForm);
	}

	public boolean isUserExist(String email)
	{
		for(int i=0;i<user.size();i++)
		{
			if(user.get(i).getEmail().equals(email))
			{
				return true;
			}
		}

		return false;
	}

	public void saveAdsData() throws IOException
	{
		BufferedWriter bw= new BufferedWriter(new FileWriter(new File("AdsList.txt"),true));

		try
		{		
			bw.write("=================");
			bw.newLine();
			bw.write(ads.get(ads.size()-1).getAdType());
			bw.newLine();
			bw.write(ads.get(ads.size()-1).getAnimal());
			bw.newLine();
			bw.write(ads.get(ads.size()-1).getSex());
			bw.newLine();
			bw.write(ads.get(ads.size()-1).getSize());
			bw.newLine();
			bw.write(ads.get(ads.size()-1).getAge());
			bw.newLine();
			bw.write(ads.get(ads.size()-1).getBreed());
			bw.newLine();
			bw.write(ads.get(ads.size()-1).getRegion());
			bw.newLine();
			bw.write(ads.get(ads.size()-1).getDescription());
			bw.newLine();
			bw.write(ads.get(ads.size()-1).getPublisherName());
			bw.newLine();
			bw.write(ads.get(ads.size()-1).getPublisherEmail());
			bw.newLine();
			bw.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}                
	}

	@SuppressWarnings("unused")
	public void loadAdsData()
	{
		try
		{
			ads = new ArrayList<Ads>();
			BufferedReader br = new BufferedReader(new FileReader(new File("AdsList.txt")));
			String adsNum;
			String adType;

			while((adsNum=br.readLine()) != null)
			{
				Ads ad = null;
				if((adType = br.readLine()).equals("Adoption"))
				{
					ad = new AdoptionAds();
				}
				else
				{
					ad = new LostAds();
				}
				ad.setAdType(adType);
				ad.setAnimal(br.readLine());
				ad.setSex(br.readLine());
				ad.setSize(br.readLine());
				ad.setAge(br.readLine());
				ad.setBreed(br.readLine());
				ad.setRegion(br.readLine());
				ad.setDescription(br.readLine());
				ad.setPublisherName(br.readLine());
				ad.setPublisherEmail(br.readLine());
				//filling in ads info from DB
				addNewAd(ad);
			}
			br.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (NumberFormatException e)
		{	
			e.printStackTrace();
		}
	}
	
	public String getStatistics()
	{
		String stat = "";
		loadAdsData();
		loadUserData();	
		String separator = " ========================== ";
		int countAdoptionAd = 0;
		int countLostAd = 0;

		stat += " Number of users in database (by email): ";
		stat += user.size();
		stat += "\n" ;
		stat += " Number of Blocked users: ";
		stat += getBlockedUsers();
		stat += "\n" ;
		stat += separator;
		stat += "\n" ;
		stat += " Number of ads in database: ";
		stat += ads.size();
		stat += "\n" ;
		stat += " Number of Adoption ads: ";
		countAdoptionAd = getStatisticsForReport().get(0);
		stat += countAdoptionAd;
		stat += "\n" ;
		stat += " Number of Lost ads: ";
		countLostAd = getStatisticsForReport().get(1);
		stat += countLostAd;
		stat += "\n" ;
		stat += separator;
		stat += "\n" ;
		stat += " Number of Dogs in database: ";
		stat += getStatisticsForReport().get(2);
		stat += "\n" ;
		stat += " Number of Cats in database: ";
		stat += getStatisticsForReport().get(3);
		stat += "\n" ;

		return stat;

	}

	private ArrayList<Integer> getStatisticsForReport()
	{
		int i = 0;
		int countAdoptionAd = 0;
		int countLostAd = 0;
		int numOfDogs = 0;
		int numOfCats = 0;
		ArrayList<Integer> counters = new ArrayList<Integer>();
		loadAdsData();
		for (i = 0; i < ads.size(); i++)
		{
			if(ads.get(i).getAdType().equals("Adoption"))
			{
				countAdoptionAd++;
			}
			else if (ads.get(i).getAdType().equals("Lost"))	
			{
				countLostAd++;
			}

			if(ads.get(i).getAnimal().equals("Dog"))
			{
				numOfDogs++;
			}
			else if(ads.get(i).getAnimal().equals("Cat"))
			{
				numOfCats++;
			}
		}
		counters.add(countAdoptionAd);
		counters.add(countLostAd);
		counters.add(numOfDogs);
		counters.add(numOfCats);

		return counters;
	}

	public ArrayList<Ads> getMatchingAds(String pet, String age, String size, String sex, String petRegion, String breed) throws AdopetException 
	{
		ArrayList<Ads> matchingAds = new ArrayList<Ads>();
		for(int i = ads.size() - 1; i >= 0; i--)
		{
			if(ads.get(i).getAdType().equals("Adoption")) 
			{	
				if((ads.get(i).getAge().equals(age) || age.equals("All")) && (ads.get(i).getAnimal().equals(pet) || 
						pet.equals("All")) && (ads.get(i).getSize().equals(size) || size.equals("All")) && 
						(ads.get(i).getSex().equals(sex) || sex.equals("All")) && (ads.get(i).getRegion().equals(petRegion) || 
								petRegion.equals("All")) && (ads.get(i).getBreed().equals(breed) || breed.equals("All")))
				{
					matchingAds.add(ads.get(i));
					if (matchingAds.size() == 4)
					{
						return matchingAds;
					}
				}
			}
		}
		if(matchingAds.size() == 0) 
		{
			throw new AdopetException("No Matching Ads!");
		}
		return matchingAds;		
	}

	public ArrayList<Ads> getLastLostAds() throws AdopetException 
	{
		ArrayList<Ads> lostAds = new ArrayList<Ads>();
		for(int i = ads.size() - 1; i >= 0; i--)
		{
			if(ads.get(i).getAdType().equals("Lost")) 
			{
				lostAds.add(ads.get(i));
				if (lostAds.size() == 4)
				{
					return lostAds;
				}
			}
		}
		if(lostAds.size() == 0)
		{
			throw new AdopetException("No Lost Ads!");			
		}
		return lostAds;	
	}
	
	public User getUser(String email, String password)
	{
		for(int i=0;i<user.size();i++)
		{
			if(user.get(i).getEmail().equals(email) && user.get(i).getPassword().equals(password))
			{
				return user.get(i);
			}
		}

		return null;
	}

	public void blockUser(String emailToBlock) 
	{
		try
		{		
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("BlockList.txt"),true));
			bw.write(emailToBlock);
			bw.newLine();
			bw.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}     
	}

	public void getUserToBlock(String emailToBlock) {
		loadUserData();
		try
		{
			for(User us : user)
			{
				if(us.getEmail().equals(emailToBlock))
				{
					if(!isUserBlocked(emailToBlock))
					{
						blockUser(emailToBlock);						
					}
					JOptionPane.showMessageDialog(null,emailToBlock,"User is blocked!",JOptionPane.PLAIN_MESSAGE);
					return;
				}
			}

			throw new Exception();
		}
		catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,emailToBlock+" not exists","User not found!",JOptionPane.ERROR_MESSAGE);
			return;
		}

	}

	@SuppressWarnings("resource")
	public boolean isUserBlocked(String userEmail) 
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("BlockList.txt")));
			String email;

			while((email=br.readLine()) != null)
			{
				if(email.equals(userEmail)) 
				{
					return true;
				}
			}
			br.close();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		return false;
	}

	public String getUserAds(String userEmail)
	{
		int i = 0;
		String userAds = "";
		loadAdsData();
		for (i = 0; i < ads.size(); i++)
		{
			if(ads.get(i).getPublisherEmail().equals(userEmail))
			{			
				userAds += " =================";
				userAds += "\n   Ad Type: " ;
				userAds += ads.get(i).getAdType();
				userAds += "\n   Pet Type: " ;
				userAds += ads.get(i).getAnimal();
				userAds += "\n   Pet Sex: " ;
				userAds += ads.get(i).getSex();
				userAds += "\n   Pet Size: " ;
				userAds += ads.get(i).getSize();
				userAds += "\n   Pet Age: " ;
				userAds += ads.get(i).getAge();
				userAds += "\n   Pet Breed: " ;
				userAds += ads.get(i).getBreed();
				userAds += "\n   Pet Region: " ;
				userAds += ads.get(i).getRegion();
				userAds += "\n   Description: " ;
				userAds += ads.get(i).getDescription();
				userAds += "\n   Publisher Name: " ;
				userAds += ads.get(i).getPublisherName();
				userAds += "\n   Publisher Email: " ;
				userAds += ads.get(i).getPublisherEmail();
				userAds += "\n";
			}
		}
		return userAds;
	}

	@SuppressWarnings("resource")
	public String getAllAds() throws IOException 
	{
		String allAds = "";
		String separator = "";
		BufferedReader br = new BufferedReader(new FileReader(new File("AdsList.txt")));

		while((separator = br.readLine()) != null)
		{
			allAds += " ";
			allAds += separator;
			allAds += "\n   Ad Type: " ;
			allAds += br.readLine();
			allAds += "\n   Pet Type: " ;
			allAds += br.readLine();
			allAds += "\n   Pet Sex: " ;
			allAds += br.readLine();
			allAds += "\n   Pet Size: " ;
			allAds += br.readLine();
			allAds += "\n   Pet Age: " ;
			allAds += br.readLine();
			allAds += "\n   Pet Breed: " ;
			allAds += br.readLine();
			allAds += "\n   Pet Region: " ;
			allAds += br.readLine();
			allAds += "\n   Description: " ;
			allAds += br.readLine();
			allAds += "\n   Publisher Name: " ;
			allAds += br.readLine();
			allAds += "\n   Publisher Email: " ;
			allAds += br.readLine();
			allAds += "\n";
		}

		return allAds;
	}

	public void saveVolunteerForm() throws IOException {
		BufferedWriter bw= new BufferedWriter(new FileWriter(new File("VolunteerFormsMail.txt"),true));
		try
		{
			bw.write("======================");
			bw.newLine();
			bw.write(" Message from: " + String.valueOf(volunteerForms.get(volunteerForms.size()-1).getName()));
			bw.newLine();
			bw.write(" Phone number: " + String.valueOf(volunteerForms.get(volunteerForms.size()-1).getPhoneNum()));
			bw.newLine();
			bw.write(" Region: " + String.valueOf(volunteerForms.get(volunteerForms.size()-1).getRegion()));
			bw.newLine();
			bw.write(" Start date: " + String.valueOf(volunteerForms.get(volunteerForms.size()-1).getStartDay()) + " / ");
			bw.write(String.valueOf(volunteerForms.get(volunteerForms.size()-1).getStartMonth()) + " / ");
			bw.write(String.valueOf(volunteerForms.get(volunteerForms.size()-1).getStartYear()));
			bw.newLine();
			bw.write(" Message: " + String.valueOf(volunteerForms.get(volunteerForms.size()-1).getMsg()));
			bw.newLine();
			bw.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}   		
	}

	@SuppressWarnings("resource")
	public String LoadVolunteerFormMail() throws IOException
	{
		String VolunteerForms = "";
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(new File("VolunteerFormsMail.txt")));

		while((line = br.readLine()) != null)
		{			
			VolunteerForms += "   ";
			VolunteerForms += line;
			VolunteerForms += "\n";
		}

		return VolunteerForms;
	}


	public void saveContactForm() throws IOException {
		BufferedWriter bw= new BufferedWriter(new FileWriter(new File("ContactFormsMail.txt"),true));
		try
		{
			bw.write("======================");
			bw.newLine();
			bw.write(" Message from: " + String.valueOf(contactForm.get(contactForm.size()-1).getName()));
			bw.newLine();
			bw.write(" Phone number: " + String.valueOf(contactForm.get(contactForm.size()-1).getPhoneNum()));
			bw.newLine();
			bw.write(" Email: " + String.valueOf(contactForm.get(contactForm.size()-1).getEmail()));
			bw.newLine();
			bw.write(" Subject: " + String.valueOf(contactForm.get(contactForm.size()-1).getcontactSubject()));
			bw.newLine();
			bw.write(" Message: " + String.valueOf(contactForm.get(contactForm.size()-1).getmessageBody()));
			bw.newLine();
			bw.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}   		
	}

	@SuppressWarnings("resource")
	public String LoadContactFormMail() throws IOException
	{
		String ContactForms = "";
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(new File("ContactFormsMail.txt")));

		while((line = br.readLine()) != null)
		{		
			ContactForms += "   ";
			ContactForms += line;
			ContactForms += "\n";
		}

		return ContactForms;
	}

	public String getUserStatistics(String email)
	{
		String userStat = "";
		loadAdsData();
		String separator = " ========================== ";

		userStat += " Number of ads:";
		userStat += countUserAds(email).get(0);
		userStat += "\n";	
		userStat += " Number of Adoption ads: ";
		userStat += countUserAds(email).get(1);
		userStat += "\n";	
		userStat += " Number of Lost ads: ";
		userStat += countUserAds(email).get(2);
		userStat += "\n";	
		userStat += separator;
		userStat += "\n";	
		userStat += " Number of Dogs in user ads: ";
		userStat += countUserAds(email).get(3);
		userStat += "\n" ;
		userStat += " Number of Cats in user ads: ";
		userStat += countUserAds(email).get(4);
		userStat += "\n" ;
		
		return userStat;
	}

	private ArrayList<Integer> countUserAds(String userEmail)
	{
		int i = 0;
		int countUserAds = 0;
		int countLostAds = 0;
		int countAdoptAds = 0;
		int numOfDogs = 0;
		int numOfCats = 0;
		
		ArrayList<Integer> countAds = new ArrayList<Integer>();
		
		for (i = 0; i < ads.size(); i++)
		{
			if(ads.get(i).getPublisherEmail().equals(userEmail))
			{
				countUserAds++;
				if (ads.get(i).getAdType().equals("Adoption"))
				{
					countAdoptAds++;
				}
				else 
				{
					countLostAds++;
				}
				
				if(ads.get(i).getAnimal().equals("Dog"))
				{
					numOfDogs++;
				}
				else if(ads.get(i).getAnimal().equals("Cat"))
				{
					numOfCats++;
				}
			}
		}
		
		countAds.add(countUserAds);
		countAds.add(countAdoptAds);
		countAds.add(countLostAds);
		countAds.add(numOfDogs);
		countAds.add(numOfCats);
		
		return countAds;
	}
	
	public static void main(String[] args) {
	}

	public int getBlockedUsers()
	{
		int numOfBlockUser = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("BlockList.txt")));
			while(br.readLine() != null)
			{
				numOfBlockUser++;
			}
			br.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}

		return numOfBlockUser;
	}
}    

