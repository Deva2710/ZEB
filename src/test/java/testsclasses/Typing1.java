package testsclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Typing1 {
 
	static WebDriver driver1;
	
	@BeforeSuite
	public void launch() throws IOException
	{
	  WebDriverManager.chromedriver().setup();
	  
	  driver1 = new ChromeDriver();
	  
	  Properties prop = new Properties();
	  
	  String path = System.getProperty("user.dir")+"\\config.properties";
	  
	  FileInputStream fos = new FileInputStream(path);
	  
	    prop.load(fos);
	    
	    String url = prop.getProperty("typing");
	    
	    driver1.get(url);
	}
	
}
