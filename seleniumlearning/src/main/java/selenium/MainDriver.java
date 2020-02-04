package selenium;

import org.openqa.selenium.WebDriver;

public class MainDriver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver=new Driver().getDriver("ie");
driver.get("http://google.com");
	}

}
