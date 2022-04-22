package pagesclasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetQuotepageHealthcarekotak2 extends BaseClassHealth{
	
	WebDriver d;
	
	
	@FindBy(xpath = "//*[@class='btnValSec adultMemVal']//*[text()='+']")
	private WebElement adults;
	
	@FindBy(xpath = "//*[@class='btnValSec']//*[text()='+']")
	private WebElement kids;
	
	@FindBy(xpath = "//*[@id='txtMobile']")
	private WebElement mobilenumber;
	
	@FindBy(xpath = "//*[@id='txtPinCode']")
	private WebElement pincode;
	
	@FindBy(xpath = "//*[@id='ctl00_Content_C001_btnCalculte']")
	private WebElement getquote;
	
	
	public GetQuotepageHealthcarekotak2(WebDriver d) throws IOException
	{
		this.d =d;
		
		PageFactory.initElements(d , this);
	}
	
	public boolean verifyTitle() 
	{
		String titleofpage = d.getTitle();
		boolean ispresent = titleofpage.contains("health");
		return ispresent;
	}
	
	public void enterdata() 
	{
		adults.click();
		adults.click();
		kids.click();
		kids.click();
		mobilenumber.sendKeys(prop.getProperty("mobilenumber"));
		
		pincode.sendKeys(prop.getProperty("pincode")); 
	}
	
	public void submitdata() throws InterruptedException 
	{
		Thread.sleep(2000);
		getquote.click();
	}

}
