package dataDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.ReadExcelData;
import library.Utility;

public class DataDrivenReadExcel {
	WebDriver driver;
	
	@Test(dataProvider ="WordPressData")
	public void verifyWorkPress(String userName ,String Password) throws InterruptedException{
		Utility screen = new Utility();
		System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.get("https://wordpress.com/log-in");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.id("usernameOrEmail")).sendKeys(userName);
	    driver.findElement(By.id("password")).sendKeys(Password);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Log In']")).click();
	    screen.captureScreenshot(driver, "wordpress");
	    Assert.assertTrue(driver.getTitle().contains("Dashboard"));
		
	}
	/*@AfterMethod
	public void tearDown(){
		driver.quit();
	}*/
	
	@DataProvider(name ="WordPressData")
	public Object[][] passData(){
		ReadExcelData config = new ReadExcelData("C:\\Workspace\\mukeshOwtwani\\ReadData\\DataDrivenData.xlsx");
		
		int row =config.getrowCount(0);
		Object[][] data = new Object[row][2];
		for(int i=0;i<row;i++){
			data[i][0] = config.getData(0, i, 0);
			data[i][1] = config.getData(0, i, 1);
			
		}
		return data;
	}
}
