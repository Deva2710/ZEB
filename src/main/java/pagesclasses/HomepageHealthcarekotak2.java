package pagesclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageHealthcarekotak2 {
	
	static WebDriver d;
	
	@FindBy(xpath = "//*[@class='insurenceTypes']//*[text()='Health Insurance']")
	private WebElement healthinsurance;
	
	@FindBy(xpath = "//*[@class='insurenceTypes']//*[text()='Car Insurance']")
	private WebElement CarInsurance;
	
	@FindBy(xpath = "//*[@class='insurenceTypes']//*[text()='Two Wheeler Insurance']")
	private WebElement TwoWheelerInsurance;
	
	
	
	public HomepageHealthcarekotak2 (WebDriver d)
	{
		this.d = d;
		
		PageFactory.initElements(d,this);
	}

	
	public void selectInsurance(String insurancetype)
	{
		if(insurancetype.contains("health"))
      {
	    healthinsurance.click();
       }
		else if(insurancetype.contains("Car"))
		{
			CarInsurance.click();
		}
		else
		{
			TwoWheelerInsurance.click();
		}
	}
}
