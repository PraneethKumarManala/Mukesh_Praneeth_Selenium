package MultipleWindows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandles {

	public WebDriver driver;
	@Test
	public void MultipleWindow() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C://Users//praneethM//Desktop//Praneeth//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
        driver.manage().window().maximize();
        String parent = driver.getWindowHandle();
        System.out.println(driver.getTitle());
        System.out.println("The Window Id is " +parent);
        
        driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
       
         Set<String> allwindows=driver.getWindowHandles();
         
        System.out.println("The total No of Windows "+allwindows.size());
        for(String child:allwindows){
        	
           if(!parent.equalsIgnoreCase(child)){
        	   
        	   driver.switchTo().window(child);
        	   Thread.sleep(4000);
        	   System.out.println(driver.getTitle());
        	   driver.findElement(By.name("q")).sendKeys("selenium");
        	   Thread.sleep(2000);
        	   driver.close();
        	   
           }
        	
        }
       
        	driver.switchTo().window(parent);
        
        
	}
}
