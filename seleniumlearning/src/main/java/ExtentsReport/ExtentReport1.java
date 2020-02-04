package ExtentsReport;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport1 {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	
	@BeforeTest
	public void startReport()throws UnknownHostException {
		System.out.println(System.getProperty("user.dir"));
		htmlReporter =new ExtentHtmlReporter(System.getProperty("user.dir")+"/extent.reports/"+new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy").format(new Date() )+".html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name","GFT NextGen Testing Stream");
		extent.setSystemInfo("Environment","Automation Testing Stream");
		extent.setSystemInfo("User Name","BMC");
		
		htmlReporter.config().setDocumentTitle("Reports-Extends_GFT");
		htmlReporter.config().setReportName("Execution report-Mercury Tours");
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		Inet4Address inet=(Inet4Address)Inet4Address.getLocalHost();
		extent.setSystemInfo("System Host Address",":" +inet.getHostAddress());
		extent.setSystemInfo("System Host Name is",":" +inet.getHostName());
		System.out.println("Host Address is"+inet.getHostAddress());
		System.out.println("Host Name is"+inet.getHostName());
	}
	@Test
	public void passTest()
	{
		logger=extent.createTest("passTest");
		Assert.assertTrue(true);
		logger.log(Status.PASS,MarkupHelper.createLabel("Test Case passed is passTest",ExtentColor.GREEN));
	}
		
		public void failTest()
	{
			logger=extent.createTest("failTest");
			Assert.assertTrue(false);


	}
			
		public void  skipTest()
		{
			logger=extent.createTest("SkipTest");
			throw new SkipException("Skippingf-This is not ready for Testing");
			
		}
		@AfterMethod
		public void getResult(ITestResult result)
		{
			if(result.getStatus()==ITestResult.FAILURE)
			{
			logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"Test Case Failed",ExtentColor.GREEN));
			logger.log(Status.PASS,MarkupHelper.createLabel(result.getThrowable()+"Test Case Failed",ExtentColor.RED));
			}
			else if(result.getStatus()==ITestResult.FAILURE)
			{
				logger.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+ "test case failed", ExtentColor.ORANGE));
			}
			
		}
		@AfterTest
		public void endReport()
		{
			extent.flush();
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
			
		
				
		
		

