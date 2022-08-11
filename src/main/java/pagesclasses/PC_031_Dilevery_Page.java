package pagesclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_031_Dilevery_Page {
	
WebDriver driver;
    
    @FindBy(xpath = "//*[@class='fa fa-arrow-up']")
    private WebElement Scroll;
	
    @FindBy(xpath = "//*[@class='control _with-tooltip']//input[@class='input-text' and @name='username']")
    private WebElement email;
    
    @FindBy(xpath = "(//*[@class='col col-method'])[3]")
    private WebElement HomeDelivery;
    
    public PC_031_Dilevery_Page(WebDriver driver) {
  		this.driver=driver;	
  		PageFactory.initElements(driver, this);
  	
      }
      
   public void EnterMailID() throws InterruptedException {
	   
	   if(Scroll.isDisplayed()) {
		   Scroll.click();
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
	 	    jse.executeScript("window.scrollBy(0,200)");
	   }
	   else {
		   JavascriptExecutor jse = (JavascriptExecutor)driver;
	 	    jse.executeScript("window.scrollBy(0,200)");
	   
	   jse.executeScript("arguments[0].click();", email);   
	   //email.click();
	   email.sendKeys("devanand.rathod@apoyar.eu");
	   email.sendKeys(Keys.ENTER);
	   }
   }
   
   public void ClickHomeDilevery() throws InterruptedException {
	   Thread.sleep(3000);
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,200)");
	    HomeDelivery.click();
   }

}
