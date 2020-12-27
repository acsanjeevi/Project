package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlacedOrderSaveasPDFPageObjects {

	@FindBy(name = "login[username]")
	public static WebElement userName;

	@FindBy(name = "login[password]")
	public static WebElement password;

	@FindBy(id = "send2")
	public static WebElement submitButton;

	@FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[1]/a[1]")
	public static WebElement clickonMyaccount;

	@FindBy(xpath = "//a[contains(text(),'My Orders')]")
	public static WebElement clickonMyOrders;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]/a[1]")
	public static WebElement clickonViewOrder;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/h1[1]")
	public static WebElement RecentOrderStatus;

	@FindBy(xpath = "//div[@class='page-title title-buttons']/a[2]")
	public static WebElement clickonPrintOrder;

	@FindBy(xpath = "//div[@class='action-button']")
	public static WebElement clickonPrintbtn;
	/*
	 * @FindBy(id="") public static WebElement submitButton;
	 * 
	 * @FindBy(id="") public static WebElement submitButton;
	 */
}
