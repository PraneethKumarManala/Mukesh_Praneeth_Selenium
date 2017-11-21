package extentReportsDemo;

import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class Extent_Demo extends ExtentReport_krishnaSakinala {

	
	@Test
	public void method1(){
		//System.out.println("Test method1 is passed");
		Assert.assertTrue(true );
		
	}
	@Test
	public void method2(){
		test = extent.startTest("demoreportPass");
		System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://google.co.in");
        driver.manage().window().maximize();	
	     String title = driver.getTitle();
	     Assert.assertEquals("Goooooogle123", title);
	    test.log(LogStatus.PASS,"Assertpass as condition is true" );
		
	}
}
