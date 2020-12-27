package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import PageObjects.AddToCardPageObjects;
import PageObjects.ProductPageObjects;
import TakeScreenshots.TakeScreenshots;

public class AddToCard extends CommonFunctions {

	String errormessage;
	String sonyexperiaprice;
	
	@Test
	public void clickonaddtocard() throws InterruptedException
	{
		PageFactory.initElements(driver, AddToCardPageObjects.class);
				
		AddToCardPageObjects.AddtoCard.click();
		Thread.sleep(2000);
		AddToCardPageObjects.setthequantity.clear();
		AddToCardPageObjects.setthequantity.sendKeys("1000");
		Thread.sleep(1000);
		AddToCardPageObjects.updatecartbutton.click();
		Thread.sleep(1000);
		errormessage=AddToCardPageObjects.GettheErrormessage.getText();
		System.out.println(errormessage);
		
		AddToCardPageObjects.clickonemptycart.click();
		
		


	}
}
