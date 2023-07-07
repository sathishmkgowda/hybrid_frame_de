package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class 
{
	@FindBy(id="firstName")
	private WebElement first_name;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[1]")
	private WebElement gradio;
	
	@FindBy(id = "dateOfBirthInput")
	private WebElement dob;
	
	@FindBy(xpath="//select[@class='react-datepicker__month-select']")
	private WebElement drop1;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	private WebElement drop2;
	
	@FindBy(id="subjectsInput")
	private WebElement autosuggest;
	
	@FindBy(id="uploadPicture")
	private WebElement upload;
	
	@FindBy(xpath = "(//div[@class=' css-1wa3eu0-placeholder'])[1])")
	private WebElement state;
	
	@FindBy(xpath = "(//div[@class=' css-1wa3eu0-placeholder'])[2])")
	private WebElement city;
	
	@FindBy(xpath="//div[.='15']")
	private WebElement date;
	

	
	public Pom_Class(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement firstname()
	{
		return first_name;
	}
	
	public WebElement gender()
	{
		return gradio;
	}
	
	public void dateofbirth()
	{
		dob.click();
	}
	
	public void dateselect()
	{
		date.click();
	}
	
	public WebElement dropdown1()
	{
		return drop1;
	}
	
	public WebElement dropdown2()
	{
		return drop2;
	}
	
	public void auto()
	{
		autosuggest.click();
	}
	
	public void autosuggest(String autosugg)
	{
		autosuggest.sendKeys(autosugg);
	}
	
	public WebElement uploadFile()
	{
		return upload;
	}
	
	public void statedata()
	{
		state.click();
	}
	
	public void stateselect(String stateName)
	{
		state.sendKeys(stateName);
	}
	
	public void citydata()
	{
		city.click();
	}
	
	public void cityselect(String cityname)
	{
		city.sendKeys(cityname);
	}
}