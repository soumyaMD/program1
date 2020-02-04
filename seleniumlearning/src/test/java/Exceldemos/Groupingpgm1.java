package Exceldemos;

import org.testng.annotations.Test;

public class Groupingpgm1 {
  @Test(groups= {"car"})
  public void CarTest() {
	  System.out.println("Batch Scooter - Test Scooter 1");
	  
  }
  @Test(groups= {"Scooter"})
  public void ScooterTest() {
	  System.out.println("Batch Scooter - Test Scooter 2");
	  
  }
  @Test(groups= {"Car","Sedan"})
  public void Sedan1() {
	  System.out.println("Batch SedanCar - Test Scooter 3");
	  
  }
  @Test(groups= {"Scooterbike"})
  public void ScooterbikeTest() {
	  System.out.println("Batch Scooterbike - Test Scooter 4");
	  
  }
  
}
