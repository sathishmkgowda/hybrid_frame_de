package test_script;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import generic.Base_Class;
import generic.DataProviderClass;
import generic.Utility_Methods;
import pom.Pom_Class;



public class TS_1 extends Base_Class
{
	@Test(dataProvider = "register",dataProviderClass = DataProviderClass.class)
	public static void scripts(String first,String auto,String state,String city,String path) throws AWTException
	{
		Pom_Class pmc=new Pom_Class(driver);
		
		wait.until(ExpectedConditions
				.visibilityOf(pmc.firstname())).sendKeys(first);
		
		pmc.gender().click();
		
		Utility_Methods.javascript(driver);
		
		pmc.dateofbirth();
		
		
		pmc.dateselect();
		
		WebElement drop1 = pmc.dropdown1();
		Utility_Methods.dropdown(drop1, "4");
		
		Utility_Methods.dropdown(pmc.dropdown2(), "1965");
		
		pmc.auto();
		
		pmc.autosuggest(auto);
		
		Utility_Methods.KeyBoard_Function();
		
		pmc.uploadFile().sendKeys(path);
		
		Utility_Methods.javascript(driver);
		
		pmc.statedata();
		
		pmc.stateselect(state);
	
		pmc.citydata();
		
		pmc.cityselect(city);
	}
}