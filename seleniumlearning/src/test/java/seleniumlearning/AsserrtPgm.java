package seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserrtPgm {
	public String baseUrl="http://newtours.demoaut.com/";
	String chromepath="C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
	
	public WebDriver driver ;
	
  @Test(priority=1)
  public void verifyHomepagetitle() {
	  System.out.println("lanuching firefox browser");
	  System.setProperty("webdriver.chrome.driver",chromepath);
	  driver=new ChromeDriver();
	  driver.get(baseUrl);
	  String expected="Welcome: Mercury Tours";
	  String actual=driver.getTitle();
	  Assert.assertEquals(actual, expected);
	  driver.close();
	  
  }
}
