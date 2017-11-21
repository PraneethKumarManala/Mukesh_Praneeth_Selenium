package headLessBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HTMLUnitDriver_Headless {
	
	@Test
	public void HTMLDriver(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/login/");
		String facebook_Title=driver.getTitle();
		System.out.println(facebook_Title);
		Assert.assertTrue(facebook_Title.contains("Facebook"));
	    System.out.println("Test Passed");
		
	}
	@Test
	public void HTMLDriver1(){
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/login/");
		String facebook_Title=driver.getTitle();
		System.out.println(facebook_Title);
		Assert.assertTrue(facebook_Title.contains("selenium"));
	    System.out.println("Test Passed");
		
	}

}
