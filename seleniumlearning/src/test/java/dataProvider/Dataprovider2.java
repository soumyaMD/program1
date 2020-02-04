package dataProvider;

import org.testng.annotations.Test;



	public class Dataprovider2 {
	  @Test(dataProvider="dp",dataProviderClass=NewTestDataprovider .class)
	  public void client1Test(Integer p,String p1)
	  {
		  System.out.println("client1 testing:Data("+p+" ,"+"String is"+"-"+p1+")");
	  }
	  @Test(dataProvider="dp",dataProviderClass=NewTestDataprovider .class)
	  public void client2Test(Integer x,String y)
	  {
		  System.out.println("client2 testing:Data("+x+" ,"+"String is"+"-"+y+")");
	  }
	}

