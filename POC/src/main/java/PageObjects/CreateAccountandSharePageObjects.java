package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountandSharePageObjects 
{
	@FindBy(xpath = "//div[@class='footer']//a[@title='My Account'][normalize-space()='My Account']") 
	public static WebElement clickonMyaccount;
	
	
	@FindBy (xpath="//span[contains(text(),'Create an Account')]")
	public static WebElement clickonCreateAccount;
	
	@FindBy (xpath="//input[@id='firstname']")
	public static WebElement enterfirstname;
	
	@FindBy (xpath="//input[@id='lastname']")
	public static WebElement enterlastname;
	
	@FindBy (xpath="//input[@id='email_address']")
	public static WebElement enteremailaddress;
	
	@FindBy (xpath="//input[@id='password']")
	public static WebElement regpassword;
	
	@FindBy (xpath="//input[@id='confirmation']")
	public static WebElement regconfirmpasswrod;
	
	@FindBy (xpath="//button[@title='Register']")
	public static WebElement clickonRegister;
	
	@FindBy (xpath="//li[@class='level0 nav-2 last']")
	public static WebElement clickonTVlink;
	
	@FindBy (xpath="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")
	public static WebElement addWishList;
	
	@FindBy (xpath="//button[@title='Share Wishlist']")
	public static WebElement clickonShareWishList;
	
	@FindBy (xpath="//textarea[@id='email_address']")
	public static WebElement shareEamiladdress;
	
	@FindBy (xpath="//span[contains(text(),'Your Wishlist has been shared.')]")
	public static WebElement WishListsharedconfirmation;
	
	
	/*
	 * @FindBy (xpath="") public static WebElement ;
	 * 
	 * @FindBy (xpath="") public static WebElement ;
	 */
	
}
