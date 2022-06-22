package testsclasses;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class TC_04_AddressTest extends Listeners {
@Test
public void RunAddress() throws InterruptedException {
	zeb4.scrollUp();
	//zeb4.enterEmail();
	zeb4.ClickHomeDelivery();
	zeb4.EnterFirstName();
	//zeb4.ProceedPayment();
}
}



