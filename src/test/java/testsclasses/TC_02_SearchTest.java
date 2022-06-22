package testsclasses;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class TC_02_SearchTest extends Listeners {
@Test
public void searchbox2() throws InterruptedException {
	
	zeb2.SelectProduct();
	zeb2.SelectSize();
	zeb2.checkout1();
}
}
