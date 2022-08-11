package pagesclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PC_02_Searchpage {

	WebDriver driver;
	
	@FindBy(xpath = "(//*[@class='product photo product-item-photo'])[4]")
	private WebElement Product;
	
	@FindBy(xpath = "//*[@id='attribute180']")
	private WebElement  Size;
	
	@FindBy(xpath = "//*[@id='product-addtocart-button']")
	private WebElement WINKEL;
	
	@FindBy(xpath = "(//button[@class='viewcart'])")
	WebElement popup;
	
	@FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
	private WebElement cookies1;
	

	public PC_02_Searchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public void SelectProduct() throws InterruptedException {
		Thread.sleep(3000);  
		Product.click();	
		  }
	
	public void SelectSize() throws InterruptedException {
		Thread.sleep(3000);
		   JavascriptExecutor js = (JavascriptExecutor)driver;
	         js.executeScript("window.scrollBy(0,400)");
		  Size.click();
		  Thread.sleep(3000);
	      Select se = new Select (Size);
         se.selectByVisibleText("L");
		  
         Size.click();
         Thread.sleep(2000);
	
	}
	
	public void checkout1() throws InterruptedException {
		  WINKEL.click();
	
	}
	
	public void PopUpCheckout() throws InterruptedException {
   	 Thread.sleep(3000);
	    popup.click();

 
    }
	
	
}
