package com.mukesh.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import library.HighlightElements_yellow;

public class HighlightJElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
        WebDriver   driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        
       WebElement username = driver.findElement(By.id("email"));
       HighlightElements_yellow.highlightElement(driver, username);
       username.sendKeys("praneethmanala@gmail.com");
       Thread.sleep(2000);
       
       WebElement password = driver.findElement(By.id("pass"));
       HighlightElements_yellow.highlightElement(driver, password);
       password.sendKeys("praneethmanala");
       
       WebElement button=driver.findElement(By.id("loginbutton"));
       HighlightElements_yellow.highlightElement(driver, button);
       button.click();
       
	}

}
