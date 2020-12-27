package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReOrderPageObjects {

	@FindBy(xpath = "//body/div[1]/div[1]/div[3]/div[1]/div[4]/ul[1]/li[1]/a[1]") 
	public static WebElement clickonMyaccount;
	
	@FindBy(name="login[username]") 
	public static WebElement userName;
	
	@FindBy(name="login[password]") 
	public static WebElement password;
	
	@FindBy(id="send2") 
	public static WebElement submitButton;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/a[2]") 
	public static WebElement clickonReOrder;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tfoot[1]/tr[1]/td[2]/strong[1]/span[1]") 
	public static WebElement BeforechangeGrandTotal;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tfoot[1]/tr[1]/td[2]/strong[1]/span[1]") 
	public static WebElement AfterChangeGrandTotal;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]") 
	public static WebElement QuantityEdit;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[4]/button[1]") 
	public static WebElement QuantityUpdate;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/button[1]") 
	public static WebElement ClickonCheckout;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[1]/div[2]/form[1]/div[1]/div[1]/button[1]") 
	public static WebElement BillClickonContinue;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[3]/div[2]/form[1]/div[3]/button[1]") 
	public static WebElement ShipClickonContinue;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[4]/div[2]/form[1]/div[1]/dl[1]/dt[2]/label[1]") 
	public static WebElement clickonMoneyOrder;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[4]/div[2]/div[2]/button[1]") 
	public static WebElement PaymentclickonContinue;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ol[1]/li[5]/div[2]/div[2]/div[2]/div[1]/button[1]") 
	public static WebElement PlacetheOrder;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]/a[1]") 
	public static WebElement OrderNumber;
	

}
