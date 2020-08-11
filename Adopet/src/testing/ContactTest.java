package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Model.Contact;

import java.util.regex.Matcher; 
import java.util.regex.Pattern; 


public class ContactTest {
	public boolean validate(String email) {
		return (email != null && !email.isEmpty() && email.replaceAll("[^@]", "").length() == 1	&& !email.contains(".@"));
	}

	@Test
	public void ContactEmailTest() throws Exception{
		Contact obj = new Contact();
		obj.setEmail("mor@gmail.com");

		assertTrue("not good",validate("morofir@gmail.com"));
		assertTrue(validate("gaya-mor@walla.com"));
		assertTrue(validate("dani.dora.a@hello.co.il"));
		assertTrue(validate("hit@hit.co.il"));
		assertFalse(validate(".."));
		assertFalse(validate(".mor.@gmail.com"));
		assertFalse(validate(null));
	}
	@Test
	public void ContactNameTest() {
		Contact obj = new Contact();
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

		Contact obj = new Contact();
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
	@Test
	public void subjectTest() {
		Contact obj = new Contact();

		Pattern pat1 = Pattern.compile("\\b\\w{1,20}\\b"); //subject is no longer than 20 chars
		Matcher matcher;


		obj.setcontactSubject("");
		String noMsg = "<No Subject>";
		assertTrue(noMsg.equals(obj.getcontactSubject()));
		

		obj.setcontactSubject("ewtertwerdsfgsdf dfgsdfd twegscd sg ert wertw");//too long
		matcher = pat1.matcher(obj.getcontactSubject());
		assertFalse(matcher.matches());

		obj.setcontactSubject("ewtetw");//not too long
		matcher = pat1.matcher(obj.getcontactSubject());
		assertTrue(matcher.matches());
	}

	@Test
	public void messageTest() {
		Contact obj = new Contact();

		obj.setmessageBody("");
		String noMsg = "<No Message Body>";
		assertTrue(noMsg.equals(obj.getmessageBody()));

		obj.setmessageBody("gfdfg");
		assertNotNull(obj.getmessageBody()); 
	}

}
