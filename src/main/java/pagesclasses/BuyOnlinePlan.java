package pagesclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyOnlinePlan {  // page class comprises locator,constructor,methods

	      WebDriver driver;
	      
	      //1.locator
	      
	      @FindBy(xpath = "//*[@data-action='online plans']")
	        private WebElement onlineplans;
	      
	      @FindBy(xpath = "//*[@class='third_navUL third_navUL03']//span[text()='Protection Plan']")
	      private  WebElement retirementplan;
	      
	     //2.constructor
	      
	      public BuyOnlinePlan (WebDriver driver)
	      {
	    	  this.driver = driver;
	    	  
	    	  PageFactory.initElements(driver,this);
	      }
	      
	      //3.methods
		   public void selectplan()
		   {
			   Actions act = new Actions(driver);
			   
			   act.moveToElement(onlineplans).perform();
			   
			   retirementplan.click();
		   }
		   
		   public String getUrl()
		   {
			String url = driver.getCurrentUrl();
			
			return url;
		   }
}
