package pagesclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseClassZeb {
	
	Properties prop;
	FileInputStream fis;

	public  BaseClassZeb() throws IOException
	{
		prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		 fis = new FileInputStream(path);
		
		prop.load(fis);
		
		
	}
}
