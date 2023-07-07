package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_ScreenShot 
{
	public static void getPhoto(WebDriver driver) throws IOException
	{
		String photo="./photos/";
		Date d=new Date();
		String replaced = d.toString().replace(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+replaced+".jpeg");
		FileHandler.copy(src, dst);
	}
}