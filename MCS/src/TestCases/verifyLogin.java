/**
 * 
 */
package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Login.Login;
/**
 * @author mukhso
 *
 */
public class verifyLogin {

@Test
public void verifyValidLogin ()
{
	System.setProperty("webdriver.chrome.driver", "D:\\PERSONAL\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://uat.molconsolidation.com/QASTARlink/");
	driver.switchTo().frame("main");
	
	
	Login loginPage = new Login(driver);
	loginPage.enterUsername();
	loginPage.enterPassword();
	loginPage.clickLogin();
	loginPage.chooseConsignee();
	loginPage.clickLogin2();
	
	
}
	
	
	
	
	
}
