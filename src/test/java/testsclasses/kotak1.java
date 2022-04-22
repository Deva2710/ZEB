package testsclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagesclasses.kotak2;

public class kotak1 {
	
	static WebDriver d;
	static kotak2 kk;
	@BeforeSuite
	public void data() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		options.addArguments("--disable-notification");
		
		options.addArguments("--incognito");
		
		//options.addArguments("--headless");
			 
		 d = new ChromeDriver(options);
		
		
		 
		 Properties prop = new  Properties();
		 
		 String path = System.getProperty("user.dir")+"\\config.properties";
		 
			FileInputStream fosc = new FileInputStream(path);
			
			prop.load(fosc);
			
			String launchurl = prop.getProperty("testsiteurl");
			
			d.get(launchurl);
		
		
	}
	
	@BeforeClass
	public void createobject ()
	{
		  kk = new kotak2(d);
	}

}
