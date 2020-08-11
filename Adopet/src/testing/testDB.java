package testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import static org.junit.Assert.assertNull;
import org.junit.Test;

import AdopetProject.AdopetException;
import Model.Ads;
import Model.Database;
import Model.User;

public class testDB {
    Database db;
    Ads ad;
    User us;

    @Test
    public void testgetUser() throws IOException {

	Database db = Database.getInstance();
	db.loadUserData();
	us = new User("gaya", "g@g.c","22","gg");
	us.setEmail("g@g.c");
	us.setPassword("22");

	//i check with an actual users in database(to test if function doing its job):
	assertTrue(db.isUserExist("g@g.c")); //testing also isUserExist function 
	us.setEmail("mor@gmail.com");
	us.setPassword("a123b");
	db.addNewUser(us);
	assertTrue(db.isUserExist("mor@gmail.com"));
	assertFalse(db.isUserExist("shubi@gmail.com"));
	assertFalse(db.isUserExist("dubi@gmail.com"));
	//other way with get user
	assertTrue(db.getUser("mor@gmail.com", "a123b").getEmail().equals(us.getEmail())); 
	assertTrue(db.getUser("mor@gmail.com", "a123b").getPassword().equals(us.getPassword()));

	assertNull(db.getUser("gaya@gmail.com", "a123bc")); //not in database
	assertNull(db.getUser("gaya@gmail.com", "54")); //not in database
	assertNull(db.getUser("gaya@gmail.com", "456456")); //password dont match (not in database)
	assertNull(db.getUser("gakkj ", "443")); //not in database not valid email
    }

    //The function work on Search button on main page, only adoption search
    @Test
    public void testgetMatchingAds() throws AdopetException {
	Database db = Database.getInstance();
	db.loadAdsData();
	String adType = "Adoption";
	String animal ="Dog";
	String age="0-2";
	String sex="Male";
	String size="Medium";
	String breed="Pitbull";
	String region="Center";
	String description="lololo";
	String publisherName="c";
	String publisherEmail="g@g.c";
	Ads ad1 = new Ads();
	ad1.setAdType(adType);
	ad1.setAnimal(animal);
	ad1.setAge(age);
	ad1.setSize(size);
	ad1.setSex(sex);
	ad1.setBreed(breed);
	ad1.setRegion(region);
	ad1.setDescription(description);
	ad1.setPublisherName(publisherName);
	ad1.setPublisherEmail(publisherEmail);
	db.addNewAd(ad1);
	db.getMatchingAds(animal, age, size, sex, region, breed);
    }


    @Test
    public void TestisUserBlocked() throws IOException{
	Database db = Database.getInstance();
	db.loadUserData();
	//user email m@m.c is Blocked
	us = new User("mor", "m@m.c","22","gg");
	db.addNewUser(us);
	assertTrue(db.isUserBlocked(us.getEmail()));
	us.setEmail("hello@gmail.com");
	assertFalse(db.isUserBlocked(us.getEmail()));
	us.setEmail("jfdnjsgn l");
	assertFalse(db.isUserBlocked(us.getEmail()));
	assertFalse(db.isUserBlocked(null));
	us.setEmail("dani@gmail.com");
	assertTrue(db.isUserBlocked(us.getEmail()));
    }

    @Test
    public void TestisUserExist() throws IOException {
	Database db = Database.getInstance();
	db.loadUserData();
	us = new User("gaya", "g@g.c","22","gg");
	db.addNewUser(us);
	assertTrue(db.isUserExist(us.getEmail()));
	assertTrue(db.isUserExist("mor@gmail.com"));
	assertTrue(db.isUserExist("dani@gmail.com"));
	//not in database:
	us.setEmail("beni@walla.com");
	assertTrue(db.isUserExist(us.getEmail()));
	assertFalse(db.isUserExist(null));
	assertFalse(db.isUserExist("mofdgf@hotmail.com"));
    }
}
