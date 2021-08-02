package InternetBooking;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

public class internetBooking {
	
	
	WebDriver driver;
	public internetBooking (WebDriver driver)
	{
		this.driver = driver;
	}
	
	WebDriverWait wait = new WebDriverWait(driver, 30);
	
	public void openIB()
	{
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'SUPPLIER TOOLS')]")).click();
		//driver.findElement(By.xpath("//ul[@class='rmRootGroup rmToggleHandles rmHorizontal']//li[9]//div[1]//ul[1]//li[4]//a[1]"));
		
		driver.findElement(By.xpath("//span[contains(text(),'INTERNET BOOKING')]")).click();
		
	}
	
	public void selectPO()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value = 'Create Booking from PO']"))).click();
		//By.xpath("//input[@value = 'Create Booking from PO']")).click();
		driver.findElement(By.xpath("//input[@name = 'ctl00$ctl00$ContentPlaceHolder1$phdMain$txtPONo']")).sendKeys("29119-PO");
		driver.findElement(By.xpath("//input[@value = 'Search']")).click();
		if(driver.findElement(By.xpath("//td[contains(text(),'No records found.')]")).isDisplayed())
		{
			System.out.println("PO Not Found");
		}
		else
		{
			driver.findElement(By.linkText("Select All")).click();
		}
		driver.findElement(By.xpath("//input[@value = 'OK']")).click();
	}
	
	public void enterIBData()
	{
		//General Page
		driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_phdMain_tcWebBooking_tpGeneral_tabCarrRouteDtl_tpRouteDtl_txtLoadPort']")).sendKeys("HONG KONG");
		Select shptermdd = new Select(driver.findElement(By.id("ContentPlaceHolder1_phdMain_tcWebBooking_tpGeneral_ddlShpTerm")));
		
		
	}
	
	public void submitIB()
	{
		
	}
	
	
	
}
