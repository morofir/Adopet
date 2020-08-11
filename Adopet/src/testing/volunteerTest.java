package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.Volunteer;

import java.util.regex.Matcher; 
import java.util.regex.Pattern; 


public class volunteerTest {
   
    @Test
    public void VolYearTest() { 	//4 digits
	Volunteer obj = new Volunteer();
	Pattern pattern = Pattern.compile("202\\d{1}"); //202X year
	obj.setStartYear("2021");

	Matcher matcher1 = pattern.matcher(obj.getStartYear());
	assertTrue(matcher1.matches());

	obj.setStartYear("fdsfa");
	Matcher matcher2 = pattern.matcher(obj.getStartYear());
	assertFalse(matcher2.matches());

	obj.setStartYear("1992"); //can't volunteer in past
	Matcher matcher3 = pattern.matcher(obj.getStartYear());
	assertFalse(matcher3.matches());

	obj.setStartYear("fds654fa");
	Matcher matcher4 = pattern.matcher(obj.getStartYear());
	assertFalse(matcher4.matches());


    }
    @Test
    public void VolMonthTest(){//2 digits
	Volunteer obj = new Volunteer();
	obj.setStartMonth("05"); 
	Pattern pattern = Pattern.compile("^\\d{2}$");

	Matcher matcher1 = pattern.matcher(obj.getStartMonth());
	assertTrue(matcher1.matches());

	obj.setStartMonth("fdsfa");
	Matcher matcher2 = pattern.matcher(obj.getStartMonth());
	assertFalse(matcher2.matches());
	

	obj.setStartMonth("9999"); //not valid month
	Matcher matcher3 = pattern.matcher(obj.getStartMonth());
	assertFalse(matcher3.matches());

	obj.setStartMonth("fds654fa");
	Matcher matcher4 = pattern.matcher(obj.getStartMonth());
	assertFalse(matcher4.matches());
	
	obj.setStartMonth("12");
	Matcher matcher5 = pattern.matcher(obj.getStartMonth());
	assertTrue(matcher5.matches());
    }
    @Test
    public void VolDayTest(){//2 digits
	Volunteer obj = new Volunteer();
	obj.setStartDay("05"); 
	Pattern pattern = Pattern.compile("^\\d{2}$");

	Matcher matcher1 = pattern.matcher(obj.getStartDay());
	assertTrue(matcher1.matches());

	obj.setStartDay("fdsfa");
	Matcher matcher2 = pattern.matcher(obj.getStartDay());
	assertFalse(matcher2.matches());
	

	obj.setStartDay("9934a99"); //not valid month
	Matcher matcher3 = pattern.matcher(obj.getStartDay());
	assertFalse(matcher3.matches());

	obj.setStartDay("fds654fa");
	Matcher matcher4 = pattern.matcher(obj.getStartDay());
	assertFalse(matcher4.matches());
	
	obj.setStartDay("12");
	Matcher matcher5 = pattern.matcher(obj.getStartDay());
	assertTrue(matcher5.matches());

    }
    @Test
    public void VolunteerNameTest() {
	Volunteer obj = new Volunteer();
	String regexName = "\\p{Upper}(\\p{Lower}+\\s?)"; 
	//the first and second name must start with an upper case letter
	//using regular expressions
	String patternName = "(" + regexName + "){2,3}";

	obj.setName("Mor");
	assertEquals("Mor",obj.getName());

	obj.setName("Mor Ofir");
	assertTrue(obj.getName().matches(patternName));
	obj.setName("dani cohen");//not upper case letter
	assertFalse(obj.getName().matches(patternName));
	obj.setName("dani cohEn");//not upper case letter
	assertFalse(obj.getName().matches(patternName));
	obj.setName("45");
	assertFalse(obj.getName().matches(patternName));
	obj.setName("45mor");
	assertFalse(obj.getName().matches(patternName));
	obj.setName("вайд");//no hebrew allowed
	assertFalse(obj.getName().matches(patternName));
    }

    @Test
    public void phoneNumTest() {

	Volunteer obj = new Volunteer();
	Pattern pattern = Pattern.compile("^\\d{10}$");
	//phone number can only be 10 digits
	//no spaces or '-' signs

	Matcher matcher = pattern.matcher("0586487521");
	assertTrue(matcher.matches());

	obj.setPhoneNum("0549481884");
	matcher = pattern.matcher(obj.getPhoneNum());
	assertTrue(matcher.matches());

	obj.setPhoneNum("05496565");//only 8 digits
	matcher = pattern.matcher(obj.getPhoneNum());
	assertFalse(matcher.matches());

	obj.setPhoneNum("aba6546");
	matcher = pattern.matcher(obj.getPhoneNum());
	assertFalse(matcher.matches());

	obj.setPhoneNum("");
	matcher = pattern.matcher(obj.getPhoneNum());
	assertFalse(matcher.matches());

	obj.setPhoneNum("lola");
	matcher = pattern.matcher(obj.getPhoneNum());
	assertFalse(matcher.matches());
    }
    private static boolean isRegion(String reg){
	return (reg.equals("South") || reg.equals("North") || reg.equals("Center"));
    }

    @Test
    public void RegionTest() {

	Volunteer obj = new Volunteer();
	obj.setRegion("");
	assertFalse(isRegion(obj.getRegion()));

	obj.setRegion("tel-aviv");
	assertFalse(isRegion(obj.getRegion()));

	obj.setRegion("South");
	assertTrue(isRegion(obj.getRegion()));

	obj.setRegion("North");
	assertTrue(isRegion(obj.getRegion()));
    }

    @Test
    public void msgTest() {
	Volunteer obj = new Volunteer();
	//regular expression to not empty .+(must contain at least one char)
	Pattern pat = Pattern.compile(".+");

	obj.setMsg("");
	String noMsg = "<No Message>";
	assertTrue(noMsg.equals(obj.getMsg()));

	obj.setMsg("gfdfg");
	assertNotNull(obj.getMsg()); 
    }

}
