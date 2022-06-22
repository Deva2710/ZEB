package testsclasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagesclasses.PC_04_AddressPage;
import pagesclasses.PC_02_Searchpage;
import pagesclasses.PC_03_CartPage;
import pagesclasses.PC_01_HomePage;

public class BaseTest {

	public static WebDriver driver;
	public PC_01_HomePage zeb1;
	public PC_02_Searchpage zeb2;
	public PC_03_CartPage zeb3;
	public PC_04_AddressPage zeb4;
	
	@BeforeSuite
	public void intiDriver() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		
		
		
	//	driver.manage().window().maximize();
		ChromeOptions options =new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		driver = new ChromeDriver(options);
		
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
		zeb1 = new PC_01_HomePage(driver);
		zeb2 = new PC_02_Searchpage(driver);
		zeb3 = new PC_03_CartPage(driver);
		zeb4 = new PC_04_AddressPage(driver);
	}
}
