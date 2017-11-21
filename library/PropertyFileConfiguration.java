package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileConfiguration {
	Properties pro;
	public PropertyFileConfiguration(){
		
		try {
			File src = new File("./PropertyFiles/config.property");
			FileInputStream fis = new FileInputStream(src);
		    pro = new Properties();
			pro.load(fis);
		}catch (Exception e) {
		System.out.println("The message is "+e.getMessage());	
		}
	}
	
	public String getChromePath(){
		
		return pro.getProperty("ChromeDriverpath");
		
	}
	
    public String getGeckoPath(){
		
		return pro.getProperty("GeckoDriverpath");
		
	}
    public String applicationURL(){
		
		return pro.getProperty("URL");
		
	}
	
}
