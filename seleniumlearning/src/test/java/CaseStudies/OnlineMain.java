package CaseStudies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineMain {
	WebDriver driver;
	public  void main() {
		// TODO Auto-generated method stub
	
	
		
			// TODO Auto-generated method stub
			String chromepath="C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",chromepath);
			driver=new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp/login.html");
		}
	
		public void testCart() {
			
			 
			driver.findElement(By.xpath("//*[@id=\"myInput\"]")).click();
			  System.out.println("test is end after method");
			  
		  }

	

}
