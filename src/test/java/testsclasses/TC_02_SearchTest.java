package testsclasses;

import org.testng.annotations.Test;
import extentlisteners.Listeners;



public class TC_02_SearchTest extends Listeners {
@Test
public void RunTC_02_SearchTest() throws InterruptedException {
	
	log.info("TC_02_ select product frome PLP");
	zeb2.SelectProduct();
	
	log.info("TC_02_ select size of product");
	zeb2.SelectSize();
	
	log.info("TC_02_ click on procced to check out");
	zeb2.checkout1();
	
	log.info("TC_02_ click on popup checkout");
	zeb2.PopUpCheckout();
}
}
