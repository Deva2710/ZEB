package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static String Screenshot1(WebDriver g, String name) throws IOException
    {
  TakesScreenshot a = (TakesScreenshot) g ; // object making TakesScreen 
  
         File source = a.getScreenshotAs(OutputType.FILE);
    
         String path = System.getProperty("user.dir")+"\\PradeepScreenshot\\"+name+".png";
         
         File destination =  new  File(path);
     
         FileHandler.copy(source, destination);
        
         return path;
     
    }
}
