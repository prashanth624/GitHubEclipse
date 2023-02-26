package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

	@Parameters("CityName")
	@Test
	public void LoginTestClass(String city) {
		System.out.println("Name of the city is: "+city);
		System.out.println("this is login test class");
		System.out.println("new comment after ngrok setup for automatic build in jenkins ");
		System.out.println("new comment to check Poll SCM build for regular time intervals");
	}
}
