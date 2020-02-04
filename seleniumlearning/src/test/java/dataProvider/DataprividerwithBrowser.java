package dataProvider;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataprividerwithBrowser {
  @Test(dataProvider = "dp")
  public void dp( String user,String pwd,String confpwd) throws InterruptedException {
  
  String chromepath="C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",chromepath);
	WebDriver driver=new ChromeDriver();
driver.get("http://demoaut.com/");
driver.findElement(By.partialLinkText("REGISTER")).click();
driver.findElement(By.name("email")).sendKeys(user);
driver.findElement(By.name("password")).sendKeys(pwd);
driver.findElement(By.name("confirmPassword")).sendKeys(confpwd);
Thread.sleep(3000);
driver.close();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "soumya", "ab","ab" },
      new Object[] { "suni", "bc","bc" },
    };
  }
}
