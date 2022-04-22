package extentlisteners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Utility.Screenshot;
import Utility.ScreenshotsaveinElicpse;
import testsclasses.Healthcarekotak1;

public class Listeners extends Healthcarekotak1 implements ITestListener{

	ExtentReports extent = ExtentReportGen.extentReportGeneration();
	
	public static ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case Started: "+ result.getName());
		
		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Passed: "+ result.getName());
		
		test.log(Status.PASS, "Test case is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed: "+ result.getName());
	
		test.fail(result.getThrowable());
		
		try
		{
			test.addScreenCaptureFromPath(Screenshot.Screenshot1(d, result.getName()));
		} 
		catch (IOException e) {
			
			System.out.println("Exception arrived while taking the screenshot");
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case Skipped: "+ result.getMethod());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Started: "+  context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test completed: "+  context.getName());
		
		extent.flush();
	}
	

}
