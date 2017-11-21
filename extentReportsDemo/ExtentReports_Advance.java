package extentReportsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import library.PropertyFileConfiguration;
import library.Utility;

public class ExtentReports_Advance {

	
	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	//PropertyFileConfiguration config ;
	
	@Test
	public void verifylogin(){
		
		  report = new ExtentReports("C:\\Users\\praneethM\\Desktop\\Praneeth\\ExtendReports\\Extentreport.html");
		  logger= report.startTest("verifyBlogTitle");
		//  config = new PropertyFileConfiguration();
		  
		 // System.setProperty("webdriver.gecko.driver", config.getGeckoPath());
		  System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
		  driver = new FirefoxDriver();
		  logger.log(LogStatus.INFO, "Browser is started");
		 // driver.get(config.applicationURL());
		  driver.get("https://wordpress.com/log-in");
		  logger.log(LogStatus.INFO, "URL opens application is up and running");
		  String title = driver.getTitle();
		  Assert.assertTrue(title.contains("selenium"));
		  logger.log(LogStatus.PASS, "Title is verified");
		  driver.get("C:\\Users\\praneethM\\Desktop\\Praneeth\\ExtendReports\\Extentreport.html");
		  
		}
	/*@AfterMethod
	public void teardown(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE){
			String screenshotpath=Utility.captureScreenshot(driver, result.getName());
	       String image = logger.addScreenCapture(screenshotpath);
			logger.log(LogStatus.FAIL, "Title verification", image);
		}
		report.endTest(logger);
        report.flush();
        driver.get("C:\\Users\\praneethM\\Desktop\\Praneeth\\ExtendReports\\Extentreport.html");
	}*/
}
