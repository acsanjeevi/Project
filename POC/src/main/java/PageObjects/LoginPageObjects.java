package PageObjects;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	@FindBy(name="login[username]") 
	public static WebElement userName;
	
	@FindBy(name="login[password]") 
	public static WebElement password;
	
	@FindBy(id="send2") 
	public static WebElement submitButton;
	
	@FindBy(xpath = "//li[@class='level0 nav-1 first']") 
	public static WebElement MobileLink;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/select[1]") 
	public static WebElement Selectdropdown;
	
	
	
	
}
