package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExportTheOrdersPageoObjects {

	@FindBy(name="/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[2]/div[1]/a[1]/span[2]") 
	public static WebElement ClickonAccount;
	
	@FindBy(name="/html[1]/body[1]/div[1]/div[1]/header[1]/div[1]/div[5]/div[1]/ul[1]/li[6]/a[1]") 
	public static WebElement ClickonLogin;
	
	@FindBy(name="login[username]") 
	public static WebElement userName;
	
	@FindBy(name="login[password]") 
	public static WebElement password;
	
	@FindBy(id="send2") 
	public static WebElement submitButton;
	
	
	@FindBy(name="") 
	public static WebElement aa;
	
	@FindBy(name="") 
	public static WebElement asas;
	
	@FindBy(id="") 
	public static WebElement ad;
	
	
	
}
