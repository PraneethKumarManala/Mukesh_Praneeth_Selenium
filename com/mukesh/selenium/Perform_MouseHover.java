package com.mukesh.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Perform_MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
        WebDriver   driver = new FirefoxDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele =driver.findElement(By.xpath("//button[text()='Automation Tools']"));
	
	     Actions act = new Actions(driver);
	     
	     act.moveToElement(ele).perform();
	     
	     List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
	     
	     System.out.println(list.size());
	     for(int i=0;i<list.size();i++){
	    	 WebElement element = list.get(i);
	    	String text= element.getAttribute("innerHTML");
	    	
	    	System.out.println("The Links are "+text);
	    	if(text.equalsIgnoreCase("Appium")){
	    		element.click();
	    		break;
	    	}
	    	 
	     }
	     
	
	}

}
