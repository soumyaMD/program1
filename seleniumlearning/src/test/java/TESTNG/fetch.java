package TESTNG;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class fetch {
  @Test
  public static void main(String[] args) {
	  
	  String baseUrl="https://newtours.demoaut.com/";
	  String path="C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars/geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver", path);
	  WebDriver driver = new ChromeDriver();
	  driver.get(baseUrl);
	  
	  WebDriverWait wait = new WebDriverWait(driver, 20);
	  wait.until(ExpectedConditions.titleContains("Welcome: Mercury Tours"));
	  
	  List<WebElement> linkList = driver.findElements(By.tagName("a"));
	  
	  System.out.println("Number of links :-" + linkList.size());
	  
	  for (WebElement link :linkList) {
		  
		  System.out.println(link.getText()+" :- " +link.getAttribute("href"));
	  }
	  
  }
}
