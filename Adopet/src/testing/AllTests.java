package testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ContactTest.class,
	testDB.class,
	volunteerTest.class})
public class AllTests {

}
