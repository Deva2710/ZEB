package testsclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pagesclasses.kotak2;


public class kotak3  extends kotak1{
	
	@Test(priority = 1)
	public void run()
	{
		kk.group();
	
	}
	
	@Test(priority = 2)
	public void verifyUrl()
	{
		String actualurl = d.getCurrentUrl();
		
		String expectedurldata = "retirement";
		
		boolean ispresent = actualurl.contains(expectedurldata);
		
	  Assert.assertTrue(ispresent);
	
	   Assert.fail();
	}

}
