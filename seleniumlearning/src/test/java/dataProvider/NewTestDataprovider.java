package dataProvider;

import org.testng.annotations.Test;

public class NewTestDataprovider {
  
	public static Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 15, "abc" },
	      new Object[] { 25, "def" },
	      new Object[] { 35, "ghi" },
	    };
}
}