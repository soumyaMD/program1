package seleniumlearning;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderTwoDime {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println("age is"+" "+n);
	  System.out.println("name is"+" "+s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 15, "abc" },
      new Object[] { 25, "def" },
      new Object[] { 35, "ghi" },
    };
  }
}
