package Exceldemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class suitepgm {
  @Test
  public void f() {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("inside before your method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("inside After your method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("inside before yourclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("inside after your class");
  }

}
