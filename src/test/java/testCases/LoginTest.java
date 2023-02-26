package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

	@Parameters("CityName")
	@Test
	public void LoginTestClass(String city) {
		System.out.println("Name of the city is: "+city);
		System.out.println("this is login test class");
	}
}
