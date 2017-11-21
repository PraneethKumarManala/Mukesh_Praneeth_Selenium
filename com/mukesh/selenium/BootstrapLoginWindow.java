package com.mukesh.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapLoginWindow {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
        WebDriver   driver = new FirefoxDriver();
		
		driver.get("https://www.goibibo.com");
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("scroll(0,400)");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
         driver.findElement(By.linkText("Sign In")).click();
         
		driver.switchTo().frame("authiframe");
		driver.findElement(By.id("authMobile")).clear();
		driver.findElement(By.id("authMobile")).sendKeys("9100108111");
	}

}
