package AdopetProject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testFunction {
	// validate input functions

	public static void validateEmail(String email) throws AdopetException 
	{
		String regex = "^[A-Za-z0-9+_-]+@[A-Za-z]+.[A-Za-z]+$";

		Pattern pattern = Pattern.compile(regex);		 
		Matcher matcher = pattern.matcher(email);
		if(!matcher.matches())
		{
			throw new AdopetException("Please enter a valid email");
		}
	}

	public static void validateName(String name) throws AdopetException
	{
		if(name.isEmpty())
		{
			throw new AdopetException("Please enter your name");
		}
		else if(name.equals("Enter Full Name"))
		{
			throw new AdopetException("Please enter your name");
		}
		else if(name.length() < 2)
		{
			throw new AdopetException("Please enter a valid name");
		}
		for(char c: name.toCharArray()){
			if(Character.isDigit(c)){
				throw new AdopetException("Please enter a valid name");
			}
		}
	}

	public static void validateOrganization(String org) throws AdopetException {
		for(char c: org.toCharArray()){
			if(Character.isDigit(c)){
				throw new AdopetException("Please enter a valid organization name");
			}
		}
	}

	public static void validateAdType(String adType) throws AdopetException
	{
		if(!adType.equals("Adoption") && !adType.equals("Lost"))
		{
			throw new AdopetException("Please choose Ad Type");
		}
	}

	public static void validatePetType(String pet) throws AdopetException {
		if(!pet.equals("Dog") && !pet.equals("Cat"))
		{
			throw new AdopetException("Please choose Pet Type");
		}
	}

	public static void validatePetAge(String age) throws AdopetException {
		if(!age.equals("0-2") && !age.equals("3-6") && !age.equals("7-10") && !age.equals("11+"))
		{
			throw new AdopetException("Please choose Pet Age");
		}
	}

	public static void validatePetBreed(String breed, String pet) throws AdopetException {
		if(!breed.equals("Mix") && !breed.equals("Labrador") && !breed.equals("Chihuahua") && !breed.equals("Husky") && 
				!breed.equals("Pitbull") && !breed.equals("Domestic"))
		{
			throw new AdopetException("Please choose Pet Breed");
		}

		if(pet.equals("Cat") && (!breed.equals("Domestic") && !breed.equals("Mix")))
		{
			throw new AdopetException("Cat breed can be only Domestic/Mix!");
		}
	}

	public static void validatePetRegion(String petRegion) throws AdopetException {
		if(!petRegion.equals("Center") && !petRegion.equals("South") && !petRegion.equals("North"))
		{
			throw new AdopetException("Please choose Pet Region");
		}	
	}

	public static void validatePetSex(String sex) throws AdopetException {
		if(!sex.equals("Male") && !sex.equals("Female"))
		{
			throw new AdopetException("Please choose Pet Sex");
		}			
	}

	public static void validatePetSize(String size) throws AdopetException 
	{
		if(!size.equals("Small") && !size.equals("Medium") && !size.equals("Large"))
		{
			throw new AdopetException("Please choose Pet Size");
		}		
	}

	public static void validateDescription(String description) throws AdopetException 
	{
		if(description.length() < 1)
		{
			throw new AdopetException("Please enter short description");
		}
	}

	public static void validatePhone(String phone) throws AdopetException 
	{
		if(phone.length() != 10)
		{
			throw new AdopetException("Please enter a valid phone number (10 digits)");
		}
		else 
		{
			for(char d: phone.toCharArray()){
				if(!Character.isDigit(d)){
					throw new AdopetException("Please enter a valid phone number (10 digits)");
				}
			}
		}
	}

	public static void validateDay(String startDay) throws AdopetException 
	{
		if(startDay.length() != 2)
		{
			throw new AdopetException("Please enter a valid day (DD)");
		}
		for(char d: startDay.toCharArray()){
			if(!Character.isDigit(d)){
				throw new AdopetException("Please enter a valid day (2 digits)");
			}
		}

	}

	public static void validateMonth(String startMonth) throws AdopetException 
	{
		if(startMonth.length() != 2)
		{
			throw new AdopetException("Please enter a valid month (MM)");
		}
		for(char d: startMonth.toCharArray()){
			if(!Character.isDigit(d)){
				throw new AdopetException("Please enter a valid month (2 digits)");
			}
		}

	}

	public static void validateYear(String startYear) throws AdopetException 
	{
		if(startYear.length() != 4)
		{
			throw new AdopetException("Please enter a valid year (YYYY)");
		}
		for(char d: startYear.toCharArray()){
			if(!Character.isDigit(d)){
				throw new AdopetException("Please enter a valid year (4 digits)");
			}
		}		
	}
}
