package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.StaticInitializerCoercer;
import org.openqa.selenium.support.FindBy;

public class ProductPageObjects {

	@FindBy(id="product-price-1") 
	public static WebElement SonyExperia;
	
	//@FindBy(xpath = "//img[@id='product-collection-image-1']")
	//public static WebElement clickonimage;
	
	/*
	 * @FindBy(xpath =
	 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[3]/a[1]/img[1]")
	 * public static WebElement clickonimage;
	 */
	
	/*
	 * @FindBy (linkText = "Sony Xperia") public static WebElement clickonExperia;
	 */
	
	@FindBy(xpath = "//ul[@class='products-grid products-grid--max-4-col first last odd']/li[3]/a")
	public static WebElement clickonSonyimage;
	
	@FindBy(xpath = "//span[@id='product-price-1']") 
	public static WebElement actualprice;
	
}
