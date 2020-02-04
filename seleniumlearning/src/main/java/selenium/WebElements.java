package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromepath="C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demoaut.com/");
		String title=driver.getTitle();
		System.out.println(title);
		WebElement uname=driver.findElement(By.name("userName"));
		uname.sendKeys("mercury");
		uname.clear();
		
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("mercury");
		pwd.clear();
		WebElement signin=driver.findElement(By.name("login"));
		signin.click();
		WebElement home=driver.findElement(By.linkText("Home"));
		String text=home.getText();
		System.out.println(text);
		home.click();
		
		
	}

}
