package extentlisteners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	
	static ExtentReports extent;

	public static ExtentReports extentReportGeneration()
	{
		String path = System.getProperty("user.dir")+"//Reports//Zebtestreport.html";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		reporter.config().setTheme(Theme.DARK);
		
		reporter.config().setReportName("Zeb Test Report");
		
		 extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project name", "ZEB");
		
	//	extent.setSystemInfo("Environment", "SIT");
		
		extent.setSystemInfo("Executed by", "Devanand Rathod");
		
		return extent;
	}
}
