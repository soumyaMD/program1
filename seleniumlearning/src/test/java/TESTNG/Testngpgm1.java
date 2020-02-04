package TESTNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngpgm1 {
  @Test
  public void vali_sign_on() {
	  System.out.println("Validating sign on");
	  
  }
  @Test
  public void vali_register() {
	  System.out.println("Validating Register");
	  
  }
  @Test
  public void vali_support() {
	  System.out.println("Validating support");
	  
  }
  @Test
  public void vali_contact() {
	  System.out.println("Validating contact");
	  
  }
  @BeforeClass
  public void open_browser() {
	  System.out.println("***Opening browser***");
  
  }
  @AfterClass
  public void closer_browser() {
	  System.out.println("***closing browser***");
  
  }
  @BeforeMethod
  public void Home_page() {
	  System.out.println("###Opening Homepage###");
  
  }
  @AfterMethod
  public void Sign_out() {
	  System.out.println("###sign out...........###");
  
  }
  
  
}
