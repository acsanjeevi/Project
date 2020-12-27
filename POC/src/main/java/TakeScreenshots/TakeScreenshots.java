package TakeScreenshots;

import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.logging.FileHandler;
import java.awt.AWTException;
import javax.imageio.ImageIO;
import javax.naming.spi.DirStateFactory.Result;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import CommonFunctions.CommonFunctions;

public class TakeScreenshots extends CommonFunctions{

	/*
	 * Robot robot=new Robot(); Dimension
	 * screenSize=Toolkit.getDefaultToolkit().getScreenSize(); java.awt.Rectangle
	 * rectangle=new java.awt.Rectangle(screenSize); BufferedImage source=
	 * robot.createScreenCapture(rectangle); File destination = new
	 * File("E:\\Study\\Project\\robotscreen.png"); ImageIO.write(source, "png",
	 * destination);
	 */

	//take a screenshot here
			
	public static void screenshot(WebDriver driver, String filename)
	{
		TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		File source = takescreenshot.getScreenshotAs(OutputType.FILE);
		
		try {
			File destinationFile=new
					 File("./Screenshots/POC.png"); 
			
			FileUtils.copyFile(source, destinationFile);
		
		} catch (Exception e) 
		{
			e.getMessage();
		}
		
		
	}
	
			 



}
