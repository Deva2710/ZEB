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
import pagesclasses.BuyOnlinePlan;

public class BaseTest {

	static WebDriver driver;
	BuyOnlinePlan buyonline;
	
	@BeforeSuite
	public void intiDriver() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String url = prop.getProperty("testsiteurl");
		
		driver.get(url);
		
	}
	
	@BeforeClass
	public void creteobject()
	{
		buyonline = new BuyOnlinePlan(driver);
	}
}
