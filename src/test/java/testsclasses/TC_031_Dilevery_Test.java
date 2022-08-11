package testsclasses;

import org.testng.annotations.Test;

import extentlisteners.Listeners;

public class TC_031_Dilevery_Test extends Listeners{
	

@Test
public void RunTC_031_Dilevery_Test() throws InterruptedException {

	zeb31.EnterMailID();
	zeb31.ClickHomeDilevery();
	
}

}
