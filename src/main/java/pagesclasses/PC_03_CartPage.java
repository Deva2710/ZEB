package pagesclasses;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
	
	@FindBy(xpath = "//*[@id=\"html-body\"]/iframe[2]")
	WebElement iframe;
	
	@FindBy(xpath = "(//button[@class='viewcart'])")
	WebElement popup;
	
	@FindBy(xpath = "//*[@class='cart-edit-qty plus']")
	WebElement itemsQuantity;
	
	
    @FindBy(xpath = "//*[@class='action primary checkout']")
    WebElement checkout3;
    
    @FindBy(xpath = "//input[@id='s_method_bposthomedelivery_bposthomedelivery']")
    WebElement HomeDelivery;
    
    public PC_03_CartPage(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
    }

     public void Checkout() {
	    //driver.switchTo().frame(iframe);
	    popup.click();
	    //driver.switchTo().parentFrame();
	    //driver.switchTo().alert().accept();
  }

     public void Quantity() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,300)");
     	itemsQuantity.click();
	    Thread.sleep(2000);
   }

    public void Addcart1() throws InterruptedException {
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
	    checkout3.click();
	    Thread.sleep(5000);

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5))	;    
	    wait.until(ExpectedConditions.visibilityOf(HomeDelivery));
	    HomeDelivery.click();
	    js.executeScript("window.scrollBy(0,500)");

   }

    
   




}
