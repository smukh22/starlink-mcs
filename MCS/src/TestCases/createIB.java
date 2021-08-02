package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import InternetBooking.internetBooking;
public class createIB {
	
	@Test
	public void IBCreation()
	{
	
		WebDriver driver = verifyLogin.driver;
		
		internetBooking IBCreation = new internetBooking(driver);
		IBCreation.openIB();
		IBCreation.selectPO();
		IBCreation.enterIBData();
		IBCreation.submitIB();
				
	}

}
