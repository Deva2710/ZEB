package testsclasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class GetQuotepageHealthcarekotak1 extends Listeners {

	
    @Test(priority = 3)
    public void titlevalidation()
    {
    	
    test.info("Verifying the title");
    boolean returnvalue = ggg.verifyTitle();
    
    Assert.assertEquals(returnvalue, false);
    test.info("Title has been verified");
    	
    }
    

    @Test(priority = 4)
    public void submit() throws InterruptedException
    {
    	  test.info("Entering the data to the form");
    	ggg.enterdata();
    	  test.info("Data has been entered");
    	
    	ggg.submitdata();
    	  test.info("Data has been submitted");
    }
    
}
