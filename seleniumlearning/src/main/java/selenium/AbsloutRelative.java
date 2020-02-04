package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsloutRelative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chromepath="C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demoaut.com/");
		//Absolute path
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/font"));
		//relative path
		driver.findElement(By.xpath("//td[2]/input")).sendKeys("mercury");
		driver.findElement(By.xpath("//tr[3]/td[2]/input")).sendKeys("mercury");
		driver.findElement(By.xpath("//div/input")).click();

	}

}
