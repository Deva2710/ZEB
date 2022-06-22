package testsclasses;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class TC_01_HomeTest extends Listeners {
@Test
public void RunSearchbox() throws InterruptedException {
	zeb1.Verifysearch();
	zeb1.AcceptCookies();
	zeb1.VerifySearchtextbox();
}
}
