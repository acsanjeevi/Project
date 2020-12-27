package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import PageObjects.CompareProductsPageObjects;
import PageObjects.LoginPageObjects;

public class CompareProducts extends CommonFunctions
{
	@Test
	public void clickonAddtoCompare() throws InterruptedException
	{
		
		PageFactory.initElements(driver,CompareProductsPageObjects.class);
		
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();
		
		CompareProductsPageObjects.MobileLink.click();
		Thread.sleep(2000);
		CompareProductsPageObjects.addtoCompare1.click();
		Thread.sleep(2000);
		CompareProductsPageObjects.addtoCompare2.click();
		Thread.sleep(2000);
		CompareProductsPageObjects.clickonComparebtn.click();
		Thread.sleep(2000);
		
		// Window handling
		System.out.println("The title of the main window: " +driver.getTitle());
		Thread.sleep(1000);
		
		Set<String> windowIdSet = driver.getWindowHandles();
		Iterator<String> iter = windowIdSet.iterator();
		
		String mainWindow = iter.next();
		String childWindow = iter.next();
		
		driver.switchTo().window(childWindow);
		System.out.println("The title of the child window: " +driver.getTitle());
				
		driver.close();
		Thread.sleep(2000);
		
		driver.switchTo().window(mainWindow);
		System.out.println("The title of the main window: " +driver.getTitle());
		
	}
}
