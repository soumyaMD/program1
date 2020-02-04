package TESTNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alert {
 
	public static void main(String[] args) {
	  
	  String chromepath="C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", chromepath);
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://demo.guru99.com/V4/");
	  driver.findElement(By.name("uid")).sendKeys("mngr30127");
	  driver.findElement(By.name("password")).sendKeys("ezoiikikmk");
	  driver.findElement(By.name("btnLogin")).submit();
	  
	  Alert alert=driver.switchTo().alert();
	  
	  String alertMessage=driver.switchTo().alert().getText();
	  
	  System.out.println(alertMessage);
	  
	  alert.accept();
  }
}
