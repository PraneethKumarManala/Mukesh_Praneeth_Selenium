package headLessBrowser;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import library.Utility;

public class PhantomJsDemo {

	@Test
	public void Phantomdriver_verify(){
		
		File src = new File("C:\\Users\\praneethM\\Desktop\\Praneeth\\HeadLessBrowser\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.facebook.com/login/");
		String facebook_Title=driver.getTitle();
		System.out.println(facebook_Title);
		Utility.captureScreenshot(driver, "PhantomjsExample");
		Assert.assertTrue(facebook_Title.contains("Facebook"));
	    System.out.println("Test Passed");
	}
	
	
}
