package testsclasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagesclasses.PC_04_AddressPage;
import pagesclasses.PC_05_PaymentPage;
import pagesclasses.PC_End_To_End;
import pagesclasses.PC_02_Searchpage;
import pagesclasses.PC_031_Dilevery_Page;
import pagesclasses.PC_03_CartPage;
import pagesclasses.PC_01_HomePage;

public class BaseTest {

	public static WebDriver driver;
	public PC_01_HomePage    zeb1;
	public PC_02_Searchpage  zeb2;
	public PC_03_CartPage    zeb3;
	public PC_031_Dilevery_Page zeb31;
	public PC_04_AddressPage zeb4;
	public PC_End_To_End     zeb6;
	public PC_05_PaymentPage zeb5;

	public static Logger log;
	
	
	@BeforeSuite
	public void intiDriver() throws IOException
	{
		
		 log = Logger.getLogger("e-commerse");
			PropertyConfigurator.configure("log4j.properties");
			
		WebDriverManager.chromedriver().setup();
		
		
		
		ChromeOptions options =new ChromeOptions();
		
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--incognito");

		//options.addArguments("enable-automation");
		//options.addArguments("--headless");
		//options.addArguments("--no-sandbox");
		//options.addArguments("--disable-dev-shm-usage");
		//options.addArguments("--diable-browser-sid-navigaion");
		//options.addArguments("--disable-gpu");

		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		log.info("lanch browser");
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String url = prop.getProperty("testsiteurl");
	    

		driver.get(url);
		
	}
	
	@BeforeClass
	public void creteobject() throws IOException 
	{
		zeb1 = new PC_01_HomePage(driver);
		zeb2 = new PC_02_Searchpage(driver);
		zeb3 = new PC_03_CartPage(driver);
		zeb31 = new PC_031_Dilevery_Page(driver);
		zeb4 = new PC_04_AddressPage(driver);
		zeb5 = new PC_05_PaymentPage(driver);
		zeb6 = new PC_End_To_End(driver);

	}
}
