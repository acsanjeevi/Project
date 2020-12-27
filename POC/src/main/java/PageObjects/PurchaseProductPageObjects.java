package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.util.concurrent.Service.State;

public class PurchaseProductPageObjects {
	
	@FindBy(name="login[username]") 
	public static WebElement userName;
	
	@FindBy(name="login[password]") 
	public static WebElement password;
	
	@FindBy(id="send2") 
	public static WebElement submitButton;

	@FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[1]/a[1]") 
	public static WebElement clickonMyaccount;
	
	
	@FindBy(xpath = "//div[@id='closeBtn']") 
	public static WebElement clickonClose;
	
	@FindBy(xpath = "//div[@class='block-content']/ul/li[8]") 
	public static WebElement clickonMyWishlist;
	
	// /html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[8]/a[1]")
	//div[@class='block-content']/ul/li[8]
	
	@FindBy (xpath="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[3]/ul[1]/li[1]/a[1]")
	public static WebElement addWishList;
	
	//div[@class='main-container col2-left-layout']/div/div/div/div/ul/li[8]
	
	@FindBy(xpath = "//tbody/tr[@id='item_48317']/td[5]/div/button") 
	public static WebElement clickonAddtoCART;
	
	@FindBy(xpath = "//button[@title='Proceed to Checkout'][1]") 
	public static WebElement clickonProceedtoCheckout;
	
	@FindBy(xpath = "//input[@id='billing:street1']") 
	public static WebElement EnterSreetAddress;
	
	@FindBy(xpath = "//input[@id='billing:city'][1]") 
	public static WebElement EnterCity;
	
	@FindBy(id = "//select[@id='billing:region_id']") 
	public static WebElement SelectSate;
	
	@FindBy(xpath = "//input[@id='billing:postcode']") 
	public static WebElement Enterpinclode;
	
	@FindBy(id = "//select[@id='billing:country_id']") 
	public static WebElement Selectcountry;
	
	@FindBy(id = "//input[@id='billing:telephone']") 
	public static WebElement Enterphonenumber;
	
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[1]/div[2]/form[1]/div[1]/ul[1]/li[2]/label[1]") 
	public static WebElement Shiptothisaddress;
	
	@FindBy(xpath = "//div[@id='billing-buttons-container']/button") 
	public static WebElement clickonshippingContinue1;
	
	@FindBy(xpath = "//div[@id='shipping-method-buttons-container']/button") 
	public static WebElement clickonshippingContinue2;
	
	@FindBy(xpath ="//dt[@id='dt_method_checkmo']/input")
	public static WebElement selectMoneyOrder;
	
	@FindBy(xpath = "//div[@id='payment-buttons-container']/button") 
	public static WebElement clickonshippingContinue3;
	
	@FindBy(xpath = "//div[@id='review-buttons-container']/button") 
	public static WebElement clickonPlaceOrder;
	
	@FindBy(xpath = "//div[@class='main-container col1-layout']/div/div/p[1]") 
	public static WebElement DisplayOrderID;
	
	
	
}
