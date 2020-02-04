package selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEexplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String iepath= "C:\\Users\\training_b6b.01.07\\Desktop\\selenium\\jars\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver",iepath);
		
		WebDriver Driver= new InternetExplorerDriver();
		Driver.manage().window().maximize();
		Driver.get("http://www.demoaut.com/");
	}

}
