package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFile_AutoIT {

	public WebDriver driver;
	@Test
	public void UploadFile() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("file:///C:/Users/praneethM/Desktop/Praneeth/AutoIT/fileupload.html");
        
        driver.manage().window().maximize();
        driver.findElement(By.id("1")).click();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\praneethM\\Desktop\\Praneeth\\AutoIT\\FileUploadAutoIT.exe");
       

	}

}
