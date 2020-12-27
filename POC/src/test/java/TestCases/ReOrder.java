package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import PageObjects.ReOrderPageObjects;

public class ReOrder extends CommonFunctions
{
	String GrandTotalBeforechange;
	String GrandTotalAfterchange;
	String UpdatedOrderNumber;
@Test
	public void UpdatetheOrder() throws InterruptedException 
	{
		PageFactory.initElements(driver, ReOrderPageObjects.class);
		ReOrderPageObjects.clickonMyaccount.click();
		ReOrderPageObjects.userName.sendKeys(properties.getProperty("Regemailadd"));
		Thread.sleep(1000);
		ReOrderPageObjects.password.sendKeys(properties.getProperty("Pwd"));
		ReOrderPageObjects.submitButton.click();
		Thread.sleep(1000);
		ReOrderPageObjects.clickonReOrder.click();
		Thread.sleep(1000);
		GrandTotalBeforechange = ReOrderPageObjects.BeforechangeGrandTotal.getText();
		System.out.println("GrandTotalBeforechange: "+GrandTotalBeforechange);
		ReOrderPageObjects.QuantityEdit.clear();
		Thread.sleep(1000);
		ReOrderPageObjects.QuantityEdit.sendKeys("2");
		ReOrderPageObjects.QuantityUpdate.click();
		Thread.sleep(1000);
		GrandTotalAfterchange = ReOrderPageObjects.AfterChangeGrandTotal.getText();
		System.out.println("GrandTotalAfterchange: "+GrandTotalAfterchange);
	
		ReOrderPageObjects.ClickonCheckout.click();
		Thread.sleep(2000);
		
		ReOrderPageObjects.BillClickonContinue.click();
		Thread.sleep(1000);
		ReOrderPageObjects.ShipClickonContinue.click();
		Thread.sleep(1000);
		ReOrderPageObjects.clickonMoneyOrder.click();
		ReOrderPageObjects.PaymentclickonContinue.click();
		Thread.sleep(1000);
		ReOrderPageObjects.PlacetheOrder.click();
		Thread.sleep(1000);
		
		UpdatedOrderNumber = ReOrderPageObjects.OrderNumber.getText();
		System.out.println("After Reorder update complete Order Number is: "+UpdatedOrderNumber);
	}
}
