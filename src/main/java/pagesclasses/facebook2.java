package pagesclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook2 {
	
	WebDriver d;
	
	@FindBy(xpath = "//*[@id='email']")
	 WebElement mivspk;
	
	@FindBy(xpath = "//*[@type='password']")
	WebElement scorecard;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement submit;
	
	public facebook2(WebDriver d) 
	{
		this.d = d;
		
		PageFactory.initElements(d,this);
	}

	public void liveScore()
	{
		mivspk.sendKeys("7030209897");  
		
		scorecard.sendKeys("639817");
		
		submit.click();
	}
}
