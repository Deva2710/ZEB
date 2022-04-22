package pagesclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kotak2 {
	
	WebDriver d; 
	@FindBy(xpath = "//*[@data-action='group plans']")
	WebElement grouplans;
	
	public kotak2(WebDriver d) 
	{
		this.d = d;
		
		PageFactory.initElements(d,this);
	}
	
	public void group()
	{
		grouplans.click();
	}

}
