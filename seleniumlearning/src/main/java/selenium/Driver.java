package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
public static WebDriver getDriver(String browserName)
{
	if(browserName.equals("ie"))
	{
		String iepath= "C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",iepath);
		return new InternetExplorerDriver();
	}
	else if(browserName.equals("chrome"))
	{
		String chromepath="C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		return new ChromeDriver();
	}
	else
	
		
	return null;
}
}
