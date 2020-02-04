package Exceldemos;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Suitepgm1 {
  
  public void SoftassertEx() {
	  Suitepgm1 sa=new Suitepgm1();
	  System.out.println("*** test case two started ***");
	  sa.assertEquals("hello","Hello","First soft assert failed");
	  
	 System.out.println("hard assert success.......");
	 sa.assertTrue("hello".equals("hello"),"Second soft assert failed");
	 sa.assertTrue("welcome".equals("welcome"),"Third soft assert failed");
	 
	 System.out.println("*** test case two executed succesfully ***");
	 sa.assertAll();
	 
	 
	 
	 
  }
  }


