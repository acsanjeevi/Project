package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCardPageObjects {

	@FindBy(xpath = "//button[@class='button btn-cart']") 
	public static WebElement AddtoCard;
	
	@FindBy(xpath = "//input[@class='input-text qty']") 
	public static WebElement setthequantity;
	
	@FindBy (xpath="//td[@class='product-cart-actions']/button") 
	public static WebElement updatecartbutton;

	@FindBy(xpath = "//p[@class='item-msg error']") 
	public static WebElement GettheErrormessage;
	
	@FindBy (id="empty_cart_button") 
	public static WebElement clickonemptycart;

}
