package testsclasses;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class TC_03_CartTest extends Listeners {
@Test
public void Shoppingcart1() throws InterruptedException {
	zeb3.Checkout();
	zeb3.Quantity();
	zeb3.Addcart1();
}
}
