package generic;

import org.testng.annotations.DataProvider;

public class DataProviderClass 
{
	@DataProvider(name="register")
	public String[][] data()
	{
		String [][]arr= {{"Hello world","Eng","NCR","Delhi","C:\\Users\\CSC\\Desktop\\my\\Sathishresume.pdf"}};
		return arr;
	}
}