package CommonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.naming.ldap.ExtendedRequest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import TakeScreenshots.TakeScreenshots;

public class CommonFunctions {

	public static WebDriver driver=null;
    public static Properties properties=null;
    
	public Properties loadPropertyFile() throws IOException {
	
	FileInputStream fileInputStream= new FileInputStream("config.properties");
	properties =new Properties();
	properties.load(fileInputStream);
	return properties;
	
	}
	
   @BeforeTest	
	public void launchBrowser() throws IOException
	{
		/*
		 * extentReports = new ExtentReports(); htmlReport = new
		 * ExtentHtmlReporter("ExtentReort.html");
		 */
		loadPropertyFile();
		String browser=properties.getProperty("browser");
		String urlString=properties.getProperty("url");
		String driverLocation=properties.getProperty("driverLocation");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(urlString);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	
	
	@AfterSuite
	public void tearDown(ITestResult result)
	{
		
		if(result.FAILURE==result.getStatus())
		{
			TakeScreenshots.screenshot(driver, result.getName());
		}
		
		driver.quit();
	}

}
