package propertlyfileDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import library.PropertyFileConfiguration;

public class UsePropertyFile {

	WebDriver driver;
	PropertyFileConfiguration config ;
	
	@BeforeTest
	public void setup(){
		
       config = new PropertyFileConfiguration();
		
		System.setProperty("webdriver.gecko.driver", config.getGeckoPath());
	}
	
	@Test
	public void verifyPropertyFile(){
		
		
		driver = new FirefoxDriver();
		
		driver.get(config.applicationURL());
	}
}
