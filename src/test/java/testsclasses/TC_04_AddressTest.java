package testsclasses;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class TC_04_AddressTest extends Listeners {
@Test
public void RunTC_04_AddressTest() throws InterruptedException {
	
	log.info("TC_04_ enter first name ");
	zeb4.EnterFirstName();
	
	log.info("TC_04_ enter first name ");
	zeb4.EnterLastName();
	
	log.info("TC_04_ enter postal code ");
	zeb4.EnterPostalCode();
	
	log.info("TC_04_ enter place ");
	zeb4.EnterPlace();
	
	log.info("TC_04_ enter place ");
	zeb4.EnterAddress();
	
	log.info("TC_04_ enter house number ");
	zeb4.EnterHouseNumber();
	
	log.info("TC_04_ click to procced to payment ");
	zeb4.ProceedPayment();
	
}
}



