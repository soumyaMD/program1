package TESTNG;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class html {
	public class alert {
		 
		public void main(String[] args) {
		  
		  String chromepath="C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", chromepath);
		  
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("http://demo.guru99.com/popup.php");
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath(".//a[contains(text(),'Click Here')]")).click();
		  
		  String MainWindow=driver.getWindowHandle();
		  		System.out.println("main window unique no"+MainWindow);
		  Set <String> s1=driver.getWindowHandles();
		  
		  for (String string : s1) {
			  	String ChildWindow=string;
			  System.out.println("child window unique no "+ChildWindow);
			  driver.switchTo().window(ChildWindow);
		  }
		  driver.findElement(By.name("email")).sendKeys("abc@a.com");
		  driver.findElement(By.name("btnLogin")).click();
		  
		  driver.switchTo().window(MainWindow);
		}
	}
}
