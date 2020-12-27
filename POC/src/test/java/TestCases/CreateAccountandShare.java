package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import PageObjects.CreateAccountandSharePageObjects;
import PageObjects.LoginPageObjects;
import PageObjects.ProductPageObjects;


public class CreateAccountandShare extends CommonFunctions{

	String Wishlistconfirm;
	@Test
	public void CreateAaccount() throws InterruptedException 
	{
		String browser=properties.getProperty("browser");
		String urlString1=properties.getProperty("registrationurl");
		String driverLocation=properties.getProperty("driverLocation");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(urlString1);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
			
		PageFactory.initElements(driver, CreateAccountandSharePageObjects.class);
		CreateAccountandSharePageObjects.clickonMyaccount.click();
		CreateAccountandSharePageObjects.clickonCreateAccount.click();
		CreateAccountandSharePageObjects.enterfirstname.sendKeys(properties.getProperty("firstname"));
		Thread.sleep(1000);
		CreateAccountandSharePageObjects.enterlastname.sendKeys(properties.getProperty("lastname"));
		Thread.sleep(1000);
		CreateAccountandSharePageObjects.enteremailaddress.sendKeys(properties.getProperty("Regemailadd"));
		Thread.sleep(1000);
		CreateAccountandSharePageObjects.regpassword.sendKeys(properties.getProperty("Pwd"));
		Thread.sleep(1000);
		CreateAccountandSharePageObjects.regconfirmpasswrod.sendKeys(properties.getProperty("CPwd"));	
		CreateAccountandSharePageObjects.clickonRegister.click();
		Thread.sleep(1000);
		CreateAccountandSharePageObjects.clickonTVlink.click();

		CreateAccountandSharePageObjects.addWishList.click();
		CreateAccountandSharePageObjects.clickonShareWishList.click();
		CreateAccountandSharePageObjects.shareEamiladdress.sendKeys(properties.getProperty("shareEmail"));
		CreateAccountandSharePageObjects.clickonShareWishList.click();
		

		Wishlistconfirm = CreateAccountandSharePageObjects.WishListsharedconfirmation.getText();
		System.out.println(Wishlistconfirm);
		
	}
	
}
