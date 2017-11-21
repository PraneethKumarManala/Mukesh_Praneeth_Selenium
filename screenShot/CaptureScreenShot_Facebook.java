package screenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import library.Utility;

public class CaptureScreenShot_Facebook {

	public WebDriver driver;
	@Test
	public void gecko() throws IOException{
		System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/login.php?login_attempt=1&lwv=120&lwc=1348028");
        driver.manage().window().maximize();
        Utility.captureScreenshot(driver,"One");
        driver.findElement(By.id("email")).sendKeys("praneethmanala");
        Utility.captureScreenshot(driver,"Two");
        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
        
       Utility.captureScreenshot(driver,"Three");
       
	}
      
        
}
