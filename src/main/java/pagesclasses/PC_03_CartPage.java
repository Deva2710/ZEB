package pagesclasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PC_03_CartPage {
	
	WebDriver driver;

	@FindBy(xpath = "//span[@class='cart-edit-qty plus']")
	private WebElement itemsQuantity;
	
    @FindBy(xpath = "//*[@class='action primary checkout']")
    private WebElement checkout3;
    
    public PC_03_CartPage(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
    
    }

     public void Quantity() throws InterruptedException {
  	    Thread.sleep(4000);
    	 JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,100)");
	  //  js.executeScript("argument[0].click;", itemsQuantity);
	    itemsQuantity.click();
 	    Thread.sleep(10000);  
     }

    public void Addcart1() throws InterruptedException { 
    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
 	    Thread.sleep(3000);
	    checkout3.click();
   
    }

}
