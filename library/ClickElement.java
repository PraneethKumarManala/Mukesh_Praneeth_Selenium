package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {

	
	//If element not clickable exception will come use this code
	public static void clickByID(WebDriver ldriver,String lid){
		Actions act = new Actions(ldriver);
		act.moveToElement(ldriver.findElement(By.id(lid))).click().build().perform();
	}
}
