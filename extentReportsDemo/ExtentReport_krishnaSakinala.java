package extentReportsDemo;

import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import library.Utility;



public class ExtentReport_krishnaSakinala {

	public static ExtentReports extent;
	public static ExtentTest test;
	WebDriver driver;
	
	
	static {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat farmater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/MyownReport "+farmater.format(calendar.getTime())+ ".html",false);
	    extent.addSystemInfo("HostName", "Praneeth");
	    extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
	    
	    
	}
	/*@Test
	public void demoreportPass(){
	
		test = extent.startTest("demoreportPass");
		System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://google.co.in");
        driver.manage().window().maximize();	
	     String title = driver.getTitle();
	     Assert.assertEquals("Goooooogle123", title);
	    test.log(LogStatus.PASS,"Assertpass as condition is true" );
	
		
	}*/
	/*@Test
	public void demoReportFail(){
		test = extent.startTest("demoReportFail");
		Assert.assertTrue(false);
		test.log(LogStatus.FAIL,"Assert fail as condition is fail "  );
	}*/
	
	public void getResult(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE){
			
			String screenshotPath = Utility.captureScreenshot(driver, "ExtentReportScreenShot_Google");
			test.log(LogStatus.FAIL, result.getThrowable());
			test.log(LogStatus.FAIL, "Screen Shot below : "+test.addScreenCapture(screenshotPath));
			
		} else if(result.getStatus()==ITestResult.SUCCESS){
			test.log(LogStatus.PASS, result.getName()+ " Test is pass");
			
		} else if(result.getStatus()==ITestResult.SKIP){
			test.log(LogStatus.SKIP, result.getName()+ " Test is skipped" +result.getThrowable());
		} else if(result.getStatus()==ITestResult.STARTED){
			test.log(LogStatus.INFO, result.getName()+ " Test is started");
		}
	}
	@AfterMethod()
	public void afterMethod(ITestResult result){
		getResult(result);
	}
	
	@BeforeMethod()
	public void beforeMethod(Method result){
	test = extent.startTest(result.getName());
	test.log(LogStatus.INFO, result.getName()+ " test Started");
	}
	@AfterClass(alwaysRun= true)
	public void endReport(){
		extent.flush();
		extent.endTest(test);
	}
}
