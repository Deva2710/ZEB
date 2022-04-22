package pagesclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformationHealthcare1 extends BaseClassHealth {
	
	public WebDriver d; 
	
	
	
	@FindBy(xpath = "(//*[@name='date_[year]'])[1]") //
	private WebElement adultyear1;
	
	@FindBy(xpath = "(//*[@name='date_[month]'])[1]")
	private WebElement adultmonth1;
	
	@FindBy(xpath = "(//*[@name='date_[day]'])[1]")  
	private WebElement adultday1;
	
	@FindBy(xpath = "//*[@id='ddlAdult1Relation']")
	private WebElement relation1;
	
	@FindBy(xpath = "//div[@id='ctl00_Content_C001_divAdult2']/descendant::input[@value='Female']")
	private WebElement adult2sex;
	
	
	
	@FindBy(xpath = "(//*[@name='date_[year]'])[2]")
	private WebElement adultyear2;
	
	@FindBy(xpath = "(//*[@name='date_[month]'])[2]")
	private WebElement adultmonth2;
	
	@FindBy(xpath = "(//*[@name='date_[day]'])[2]")  
	private WebElement adultday2;
	
	@FindBy(xpath = "//*[@id='ddlAdult2Relation']")
	private WebElement relation2;
	
	@FindBy(xpath = "//div[@id='ctl00_Content_C001_divChild1']/descendant::option[@value='1998']")
	private WebElement adultyear3;
	
	@FindBy(xpath = "//div[@id='ctl00_Content_C001_divChild1']//select[@class='month']/descendant::option[@value='11']")
	private WebElement adultmonth3;
	
	@FindBy(xpath = "//div[@id='ctl00_Content_C001_divChild1']/descendant::option[@value='20']")  
	private WebElement adultday3;
	
    @FindBy(xpath = "//div[@id='ctl00_Content_C001_divChild1']/descendant::option[@value='Son']")
	private WebElement relation3;

	@FindBy(xpath = "//div[@id='ctl00_Content_C001_divChild2']//select[@class='year']/descendant::option[@value='2000']")
	private WebElement adultyear4;
	
	@FindBy(xpath = "//div[@id='ctl00_Content_C001_divChild2']//select[@class='month']/descendant::option[@value='06']")
	private WebElement adultmonth4;
	
	@FindBy(xpath = "//div[@id='ctl00_Content_C001_divChild2']//select[@class='day']/descendant::option[@value='20']")  
	private WebElement adultday4;
	
	@FindBy(xpath = "//div[@id='ctl00_Content_C001_divChild2']/descendant::option[@value='Son']")
	private WebElement relation4;
	
	@FindBy(xpath = "//*[@id='btnViewPrices']")
	private WebElement viewprice;
	

	
	public InformationHealthcare1(WebDriver d) throws IOException
	{
		this.d=d;
		
		PageFactory.initElements(d,this);
		

	}
	
	public void datafilling() throws InterruptedException
	{

		
		Select sel = new Select(adultyear1);
		sel.selectByValue("1988");
		
		Select sel1 = new Select(adultmonth1);
		sel1.selectByValue("10");
		
		Select sel2 = new Select(adultday1);
		sel2.selectByValue("15");
		
		Select sel3 = new Select(relation1);   
		sel3.selectByValue("Father");  
		
		adult2sex.click();
		
		Select sel4 = new Select(adultyear2);
		sel4.selectByValue("1990");
		
		Select sel5 = new Select(adultmonth2);
		sel5.selectByValue("08");
		
		Select sel6 = new Select(adultday2);
		sel6.selectByValue("20");
		
		Select sel7 = new Select(relation2);   
		sel7.selectByValue("Mother");
		
		adultyear3.click();
		
		adultmonth3.click();
		
		adultday3.click();
		
		relation3.click();
		
	     adultyear4.click();
	     
	     adultmonth4.click();
	     
	     adultday4.click();
	     
	     relation4.click();
		
		Thread.sleep(2000);
		viewprice.click();
	}
	
	
	
	

}
