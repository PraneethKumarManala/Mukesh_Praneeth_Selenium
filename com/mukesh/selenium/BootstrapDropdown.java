package com.mukesh.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropdown {

	
	public static void main(String[] args) throws InterruptedException {
		
		/*System.setProperty("webdriver.gecko.driver","C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		System.setProperty("webdriver.chrome.driver","C://Users//praneethM//Desktop//Praneeth//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("menu1")).click();
		List<WebElement> List= driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		System.out.println(List.size());
		
		for(WebElement ele:List){
			System.out.println("The Values are "+ele.getAttribute("innerHTML"));
			if(ele.getAttribute("innerHTML").contains("JavaScript")){
				ele.click();
				break;
				
			}
			
			
			
		}
		

	}

}
