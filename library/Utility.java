package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {

	
	public static String captureScreenshot(WebDriver driver , String ScreenShotName){
		
	try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 String dest="./Screenshots/"+ScreenShotName+".png";
		 File destination = new File(dest);
		 FileUtils.copyFile(src, destination);
		 return dest;
		 
	} catch (Exception e) {
       System.out.println("Exception while taking ScreenShot "+e.getMessage());
       return e.getMessage();
	}
	
	}
}
