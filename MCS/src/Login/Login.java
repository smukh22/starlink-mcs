/**
 * 
 */
package Login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author mukhso
 *
 */
public class Login {

	
WebDriver driver;


By username = By.id("ctl00_ContentSection_rtbUserID");
By password = By.id("ctl00_ContentSection_rtbPassword");
By login = By.id("ctl00_ContentSection_rbLogin_input");
By consignee = By.id("ContentSection_lbConsigneeList");
By login2 = By.id("ctl00_ContentSection_rbContinue_input");

public Login(WebDriver driver)
{
	this.driver = driver;
}


public void enterUsername()
{
	driver.findElement(username).sendKeys("belkshp");
}

public void enterPassword()
{
	driver.findElement(password).sendKeys("BELKSHP31");
}

public void clickLogin()
{
	driver.findElement(login).click();
}

public void chooseConsignee()
{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement list = wait.until(ExpectedConditions.visibilityOfElementLocated(consignee));
	//Select consignee1 = new Select(list);
	//consignee1.selectByIndex(16);
	list.findElement(By.xpath("//option[contains(text(),'MICHAELS STORES PROCUREMENT')]")).click();

}

public void clickLogin2()
{
	driver.findElement(login2).click();
}


}
