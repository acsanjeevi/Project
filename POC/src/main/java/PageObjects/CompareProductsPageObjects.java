package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompareProductsPageObjects 
{
	@FindBy(xpath = "//li[@class='level0 nav-1 first']") 
	public static WebElement MobileLink;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[3]/ul[1]/li[2]/a[1]")
	public static WebElement addtoCompare1;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[2]/div[1]/div[3]/ul[1]/li[2]/a[1]")
	public static WebElement addtoCompare2;
	
	@FindBy(xpath = "//button[@title='Compare']")
	public static WebElement clickonComparebtn;
	
	@FindBy(xpath = "//button[@title='Close Window']")
	public static WebElement closeWindow1;
}
