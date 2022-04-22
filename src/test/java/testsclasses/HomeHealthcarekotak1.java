package testsclasses;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class HomeHealthcarekotak1 extends Listeners{
	
	
	@Test(priority = 1)
	public void selectInsurnaceType()
	{
	
		test.info("Selecting the Insurance");
		
	hhh.selectInsurance("health");
		
		test.info("Selecting the Insurance as health");
	
	}

	
}
