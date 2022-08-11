package testsclasses;


import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class TC_End_To_End extends Listeners {
@Test
public void RunTC_End_To_End() throws InterruptedException {
	
	
	zeb6.Verifysearch();
	zeb6.AcceptCookies();
	zeb6.VerifySearchtextbox();
	
	//--**--
	//zeb6.AcceptCookies();
	zeb6.SelectProduct();
	zeb6.SelectSize();
	zeb6.checkout1();
	
	//--**--
	
	zeb6.Checkout();
	zeb6.Quantity();
	zeb6.Addcart1();
	
	//--**--
	
	zeb6.ClickHomeDelivery();
	  
}



}
