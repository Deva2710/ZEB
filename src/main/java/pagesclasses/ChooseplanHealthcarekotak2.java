package pagesclasses;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseplanHealthcarekotak2 extends BaseClassHealth {

	WebDriver d;
	
	@FindBy(xpath = "//*[@class='sliderWrap']//div[@class='ui-slider-wrap']/descendant::span[@class='ui-slider-handle ui-corner-all ui-state-default ui-state-hover']")
	private WebElement slider1;
	
	@FindBy(xpath = "//*[@id='btnCalPremAllMember']")
	private WebElement calculatepremium;
	
	@FindBy(xpath = "//*[@id='ctl00_Content_C001_btnContinue']")
	private WebElement continue1;
	
	@FindBy(xpath = "//*[@id='ctl00_Content_C001_btnMedicalQuestion']")
	private WebElement next;
	
	
	public ChooseplanHealthcarekotak2 (WebDriver d) throws IOException
	{
		this.d = d;
		
		PageFactory.initElements(d,this);
	}
	
	public void slider () throws InterruptedException
	{
		
		Actions act = new Actions(d);
		
		act.moveToElement(slider1).click().sendKeys(Keys.ARROW_DOWN).
		sendKeys(Keys.ARROW_DOWN).build().perform();
	
		calculatepremium.click();
		
		Thread.sleep(2000);
		
		continue1.click();
		
		Thread.sleep(2000);
		
		next.click();
		
	}
	
}
