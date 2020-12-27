package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import PageObjects.CreateAccountandSharePageObjects;
import PageObjects.LoginPageObjects;
import PageObjects.PurchaseProductPageObjects;

public class PurchaseProduct extends CommonFunctions
{
	String OrderID;
	@Test
	public void Purchaseproduct() throws InterruptedException 
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
		 
	        PageFactory.initElements(driver, PurchaseProductPageObjects.class);
			PurchaseProductPageObjects.clickonMyaccount.click();
			
			PurchaseProductPageObjects.userName.sendKeys(properties.getProperty("Regemailadd"));
			Thread.sleep(2000);
			PurchaseProductPageObjects.password.sendKeys(properties.getProperty("Pwd"));
		  PurchaseProductPageObjects.submitButton.click();
		  Thread.sleep(5000);
		  PurchaseProductPageObjects.clickonMyWishlist.click();
			//PurchaseProductPageObjects.addWishList.click();
		
	      PurchaseProductPageObjects.clickonAddtoCART.click();
		  PurchaseProductPageObjects.clickonProceedtoCheckout.click();
		  PurchaseProductPageObjects.EnterSreetAddress.sendKeys("ABC");
		  Thread.sleep(1000);
		  PurchaseProductPageObjects.EnterCity.sendKeys("New York");
		  Thread.sleep(1000); PurchaseProductPageObjects.SelectSate.click(); 
		  Select selectstate=new Select(PurchaseProductPageObjects.SelectSate);
		  selectstate.selectByIndex(43);
		  PurchaseProductPageObjects.Enterpinclode.sendKeys("542896");
		  Thread.sleep(1000); PurchaseProductPageObjects.Selectcountry.click(); Select
		  selectcountry=new Select(PurchaseProductPageObjects.Selectcountry);
		  Thread.sleep(2000); 
		  selectcountry.selectByIndex(233);
		  PurchaseProductPageObjects.Enterphonenumber.sendKeys("12345678");
		  
		  if(PurchaseProductPageObjects.Shiptothisaddress.isSelected()) 
		  {
		  PurchaseProductPageObjects.clickonshippingContinue1.click();
		  Thread.sleep(1500);
		  PurchaseProductPageObjects.clickonshippingContinue2.click();
		  Thread.sleep(1500); PurchaseProductPageObjects.selectMoneyOrder.click();
		  Thread.sleep(1500);
		  PurchaseProductPageObjects.clickonshippingContinue3.click();
		  Thread.sleep(3000); 
		  }
		  PurchaseProductPageObjects.clickonPlaceOrder.click(); Thread.sleep(1000);
		  OrderID=PurchaseProductPageObjects.DisplayOrderID.getText();
		  System.out.println("OrderID");
		 	    
	}
	
}
