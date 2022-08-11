package testsclasses;

import org.testng.annotations.Test;
import extentlisteners.Listeners;

public class TC_03_CartTest extends Listeners {
@Test
public void RunTC_03_CartTest() throws InterruptedException {
	
	
	
	log.info("TC_03_ select quantity of product ");
	zeb3.Quantity();
	
	//Thread.sleep(4000);
	log.info("TC_03_ Procced to final checkout");
	zeb3.Addcart1();
}
}
