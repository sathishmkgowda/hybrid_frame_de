package generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_Class implements Framework_Constants
{
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeClass
	public static void open_browser()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
	}
	
	@BeforeMethod
	public static void openapp()
	{
		driver.get(URL);
		wait=new WebDriverWait(driver, 10);
	}
	
	@AfterMethod
	public static void closeapp(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Generic_ScreenShot.getPhoto(driver);
			ITestNGMethod failed = result.getMethod();
			System.out.println("The Failed Test Script is: " +failed);
		}
		
		driver.close();
	}
}

