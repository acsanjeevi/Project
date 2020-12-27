package TestCases;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import PageObjects.LoginPageObjects;
import TakeScreenshots.TakeScreenshots;


public class LoginPage extends CommonFunctions{

	public void sortbyname() 
	{
		LoginPageObjects.Selectdropdown.click();
		Select select=new Select(LoginPageObjects.Selectdropdown);
	    select.selectByIndex(1);	
	}
	
	
	@Test
	public void Login() throws InterruptedException 
	{	
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		LoginPageObjects.userName.sendKeys(properties.getProperty("username"));
		LoginPageObjects.password.sendKeys(properties.getProperty("password"));
		
		LoginPageObjects.submitButton.click();
		Thread.sleep(3000);
		LoginPageObjects.MobileLink.click();
		Thread.sleep(3000);
		sortbyname();
	//	TakeScreenshots.screenshot(driver, "LoginPage_TC_1");
		
	}
	
	
}
