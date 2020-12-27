package TestCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import PageObjects.PlacedOrderSaveasPDFPageObjects;

public class PlacedOrderSaveasPDF extends CommonFunctions {
	String OrderStatus;

	@Test
	public void PrintOrderSaveasPDF() throws InterruptedException {

		PageFactory.initElements(driver, PlacedOrderSaveasPDFPageObjects.class);
		PlacedOrderSaveasPDFPageObjects.clickonMyaccount.click();
		PlacedOrderSaveasPDFPageObjects.userName.sendKeys(properties.getProperty("Regemailadd"));
		Thread.sleep(2000);
		PlacedOrderSaveasPDFPageObjects.password.sendKeys(properties.getProperty("Pwd"));
		PlacedOrderSaveasPDFPageObjects.submitButton.click();
		Thread.sleep(1000);
		PlacedOrderSaveasPDFPageObjects.clickonMyOrders.click();
		PlacedOrderSaveasPDFPageObjects.clickonViewOrder.click();
		Thread.sleep(2500);
		OrderStatus=PlacedOrderSaveasPDFPageObjects.RecentOrderStatus.getText();
		System.out.println("OrderStatus");
		PlacedOrderSaveasPDFPageObjects.clickonPrintOrder.click();
		
		String winHandleBefore = driver.getWindowHandle();

		System.out.println("The title of the main window: " +driver.getTitle());
		Thread.sleep(1000);
		
		Set<String> windowIdSet = driver.getWindowHandles();
		Iterator<String> iter = windowIdSet.iterator();
		
		String mainWindow = iter.next();
		String childWindow = iter.next();
		
		driver.switchTo().window(childWindow);
		System.out.println("The title of the child window: " +driver.getTitle());
		
		  WebDriverWait wait = new WebDriverWait(driver, 15);
		  
		  wait.until(ExpectedConditions.elementToBeClickable(By.className("Print"))).
		  click();
		  
		 // click printbutton 
		  WebElement printButton = driver.findElement(By.className("Print")); 
		  printButton.click();
		 
		
		//PlacedOrderSaveasPDFPageObjects.clickonPrintbtn.click();

	}

}
