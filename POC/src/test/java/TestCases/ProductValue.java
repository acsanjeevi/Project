package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import PageObjects.LoginPageObjects;
import PageObjects.ProductPageObjects;
import TakeScreenshots.TakeScreenshots;


public class ProductValue extends CommonFunctions{

public static String productprice;
public static String sonyexperiaprice;
	@Test
	public void gettheproductprice() throws InterruptedException 
	{
		
		PageFactory.initElements(driver, ProductPageObjects.class);
		productprice = ProductPageObjects.SonyExperia.getText();
		System.out.println(productprice);
		
		Thread.sleep(2000);
		ProductPageObjects.clickonSonyimage.click();
		Thread.sleep(2000);
		
		sonyexperiaprice=ProductPageObjects.actualprice.getText();
		System.out.println(sonyexperiaprice);
		
		//Assert.assertTrue(false);

	}
}
