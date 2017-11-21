package com.mukesh.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicRadioButtonCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver","C://Users//praneethM//Desktop//Praneeth//chromedriver.exe");
		WebDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","C://Users//praneethM//Desktop//Praneeth//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
	    System.out.println(radio.size());
		for(int i=0;i<radio.size();i++)
		{
	    	WebElement ele=radio.get(i);
	    	String value=ele.getAttribute("value");
	    	System.out.println("The radio button values are "+value);
	    	if(value.equalsIgnoreCase("RUBY")){
	    		ele.click();
	    		break;
	    	}
	    }
	
	
	
	
	}

}
