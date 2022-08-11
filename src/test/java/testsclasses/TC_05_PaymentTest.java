package testsclasses;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class TC_05_PaymentTest extends Listeners {
@Test
public void RunTC_05_PaymentTest() throws InterruptedException {
	
	log.info("TC_05_ click on Credit card option ");
	zeb5.ClickCreditCart();
	
	log.info("TC_05_ enter credit card number");
	zeb5.EnterCardNumber();
	
	//log.info("TC_05_ ente validity date of ard");
	//zeb5.EnterValidityDate();
	
	//log.info("TC_05_ enter CVV number of card");
	//zeb5.EnterCVVNumber();
	
	//log.info("TC_05_ enter card holder name ");
	//zeb5.EnterCardHolderName();
	
	//log.info("TC_05_ click on order and pay botton");
	//zeb5.ClickOrderAndPay();
	  
}

}
