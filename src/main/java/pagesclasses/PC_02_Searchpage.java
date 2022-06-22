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
	
	@FindBy(xpath = "//*[@id='product-item-info_649880']")
	WebElement Product;
	
	@FindBy(xpath = "//*[@id='attribute180']")
	WebElement  Size;
	
	@FindBy(xpath = "//*[@id='product-addtocart-button']")
	WebElement WINKEL;
	
	@FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
	WebElement cookies1;

	public PC_02_Searchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SelectProduct() {
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("window.scrollBy(0,100)");
		   Product.click();	
	}
	
	public void SelectSize() throws InterruptedException {

	Size.click();
	Select se = new Select (Size);
    se.selectByIndex(3);
    Size.click();
    JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(2000);
    js.executeScript("window.scrollBy(0,150)");
	}
	
	public void checkout1() throws InterruptedException {
		//driver.switchTo().frame(iframe);
		WINKEL.click();
		Thread.sleep(3000);
	//	popup.click();
	}
	
	
}
