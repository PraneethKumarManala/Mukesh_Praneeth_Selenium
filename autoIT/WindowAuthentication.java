package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WindowAuthentication {
	
	public WebDriver driver;
	@Test
	public void WindowAuthentication_AutoIT() throws IOException, InterruptedException{
			System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
	        driver = new FirefoxDriver();
	        Runtime.getRuntime().exec("C:\\Users\\praneethM\\Desktop\\Praneeth\\AutoIT\\WindowAuthentication_AutoIT.exe");
	        driver.get("ftp://laksanasoft.com/hitech.laksanasoft.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(300);
	        driver.findElement(By.xpath("//a[text()='setup.exe'] ")).click();

}
}
