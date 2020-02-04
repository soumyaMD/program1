package TESTNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String chromepath="C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", chromepath);
		  
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com/");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  Actions actions=new Actions(driver);
		  actions.moveToElement(driver.findElement(By.xpath("//a[@href='/electronics']"))).perform();
          actions.moveToElement(driver.findElement(By.xpath("//a[@href='/camera-photo']"))).click().build().perform();
	}

}
