package testsclasses;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenshotsaveinElicpse;

public class ListenersHealthcare extends Healthcarekotak1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case Started: "+ result.getMethod());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case Passed: "+ result.getMethod());	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed: "+ result.getName());
	
		try {
			ScreenshotsaveinElicpse.Screenshot1(d, "healthcare1");
		} catch (IOException e) {
			
			e.printStackTrace();
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
	}
	
	
	
	

}
