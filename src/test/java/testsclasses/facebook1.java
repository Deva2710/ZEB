package testsclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagesclasses.facebook2;

public class facebook1 {
	
	static WebDriver d;
	
	static facebook2 ccc;
	
	@BeforeSuite
	public void score() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fosc = new FileInputStream(path);
		
		prop.load(fosc);
		
		String launchurl = prop.getProperty("cricbuzzlink1");
		
		d.get(launchurl);
				
	}
	
	@BeforeClass
	public void createobject()
	{
		 ccc = new facebook2(d);
	}

}
