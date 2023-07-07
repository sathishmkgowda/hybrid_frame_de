package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_Methods 
{
	public static void javascript(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	public static void dropdown(WebElement address,String value)
	{
		Select sel=new Select(address);
		sel.selectByValue(value);
	}
	
	public static void KeyBoard_Function() throws AWTException
	{
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
	}
}
