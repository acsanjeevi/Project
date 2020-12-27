package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import CommonFunctions.CommonFunctions;
import PageObjects.CouponCodePageObjects;

public class CouponCode extends CommonFunctions
{
	String DiscountAmount;
	String DiscountAmountvalue;
	@Test
	public void verifydiscountcoupon() throws InterruptedException
	{
		PageFactory.initElements(driver, CouponCodePageObjects.class);
		CouponCodePageObjects.MobileLink.click();
		CouponCodePageObjects.ClickonIphoneAddtocart.click();
		Thread.sleep(1000);
		CouponCodePageObjects.EnterDiscountCouponCode.sendKeys("GURU50");
		Thread.sleep(1000);
		CouponCodePageObjects.ClickonApplyCouponCode.click();
		Thread.sleep(1000);
		DiscountAmount = CouponCodePageObjects.DiscountCoupon.getText();
		DiscountAmountvalue = CouponCodePageObjects.DiscountCouponCodeAmount.getText();
		System.out.println(DiscountAmount+":  "+DiscountAmountvalue);
	}
}
