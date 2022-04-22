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
import pagesclasses.ChooseplanHealthcarekotak2;
import pagesclasses.GetQuotepageHealthcarekotak2;
import pagesclasses.HomepageHealthcarekotak2;
import pagesclasses.InformationHealthcare1;

public class Healthcarekotak1 {
 
	public static WebDriver d;
	public static HomepageHealthcarekotak2 hhh;
	public static  GetQuotepageHealthcarekotak2 ggg;
	public static InformationHealthcare1 dff;
	public static ChooseplanHealthcarekotak2 chh;
	
	@BeforeSuite
	public void launch() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		 
	ChromeOptions options = new ChromeOptions();
	
	options.addArguments("--start-maximized");
	
	options.addArguments("--disable-notification");
	
	//options.addArguments("--incognito");
	
	//options.addArguments("--headless");
		 
	 d = new ChromeDriver(options);
	 
		// d.manage().window().maximize();
		 
		 Properties prop = new Properties();
		 
		 String path = System.getProperty("user.dir")+"//config.properties";
		 
		 FileInputStream fos = new FileInputStream(path);
		 
		 prop.load(fos);
		 
		 String URL = prop.getProperty("mainlink1");
		 
		 d.get(URL);	
	}
	@BeforeClass
	public void createobject() throws IOException
	{
		 hhh = new HomepageHealthcarekotak2(d);
		 ggg = new GetQuotepageHealthcarekotak2(d);
		 dff = new InformationHealthcare1(d);
		chh = new ChooseplanHealthcarekotak2(d);
	}
}
