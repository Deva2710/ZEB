package testsclasses;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class InformationHealthcare1 extends Listeners {

	@Test(priority = 5)
	public void filldata() throws InterruptedException
	{
		dff.datafilling();
	}
}
