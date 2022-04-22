package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotsaveinElicpse {
	
	public static void Screenshot1(WebDriver g, String name) throws IOException
    {
  TakesScreenshot a = (TakesScreenshot) g ; // object making TakesScreen 
  
     File source = a.getScreenshotAs(OutputType.FILE);
     
     
         String path = System.getProperty("user.dir")+"\\PradeepScreenshot\\"+name+".png";
         
         File destination =  new  File(path);
     
        FileHandler.copy(source, destination);
     
    }

//public static void main(String[] args) throws IOException {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
//	      
//	      WebDriver g = new ChromeDriver();
//	      
//	      g.get("https://www.facebook.com/signup");
//	      
//	      g.manage().window().maximize();
//	      ScreenshotsaveinElicpse.Screenshot1(g, "pradeepjadhav"); }
	      

}


	
	

