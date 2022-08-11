package testsclasses;

import org.testng.annotations.Test;
import extentlisteners.Listeners;



public class TC_01_HomeTest extends Listeners {
@Test
public void RunTC_01_HomeTest() throws InterruptedException {
	
	log.info("TC_01_ click on Dames");
	zeb1.ClickOnDames();
	
	log.info("TC_01_ Accept cookies");
	zeb1.AcceptCookies();
	
	log.info("TC_01_ click on search button");
	zeb1.Verifysearch();
	
	log.info("TC_01_ Enter product name in search and click");
	zeb1.VerifySearchtextbox();
	  
}
}
