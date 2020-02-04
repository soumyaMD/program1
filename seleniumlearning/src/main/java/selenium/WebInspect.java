package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebInspect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromepath="C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("manu");
		driver.findElement(By.name("lastName")).sendKeys("gowda");
		
		driver.findElement(By.name("register")).click();
		Select select=new Select(driver.findElement(By.className("Country")));
		select.selectByVisibleText("INDIA");
		
		
		
	}

}