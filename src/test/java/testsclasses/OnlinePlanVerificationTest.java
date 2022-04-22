package testsclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OnlinePlanVerificationTest extends BaseTest {

   @Test(priority = 1)
   public void buyonlinePlan()
   {
	   buyonline.selectplan();
   }
   
   @Test(priority = 2)
   public void verifyUrl()
   {
	   String actualurl = buyonline.getUrl();
	   
	   String expectedurldata = "retirement";
	   
	   boolean ispresent = actualurl.contains(expectedurldata);
	   
	   Assert.assertTrue(ispresent);
   }
}
