package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CouponCodePageObjects {

	@FindBy(xpath = "//li[@class='level0 nav-1 first']") 
	public static WebElement MobileLink;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[2]/div[1]/div[3]/button[1]") 
	public static WebElement ClickonIphoneAddtocart;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]") 
	public static WebElement EnterDiscountCouponCode;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/span[1]") 
	public static WebElement ClickonApplyCouponCode;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/span[1]") 
	public static WebElement DiscountCouponCodeAmount;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]") 
	public static WebElement DiscountCoupon;
	
	
	
	
	
	
	
	
	
}
