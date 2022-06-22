package pagesclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_01_HomePage {
	
	WebDriver driver;
	
    @FindBy(xpath = "(//*[@class='pe-7s-search'])[2]")
    WebElement searchbox;
    
    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    WebElement cookies;
    
    @FindBy(xpath = "//*[@id='search']")
    WebElement Searchtextbox;	
    
	public PC_01_HomePage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void Verifysearch() throws InterruptedException {
		Thread.sleep(2000);	
		searchbox.click();	
	}
	
	public void AcceptCookies() {
		cookies.click();
	}
	
	public void VerifySearchtextbox() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Searchtextbox);
	
		Searchtextbox.sendKeys("T-shirt");
		Searchtextbox.sendKeys(Keys.ENTER);
	//	js.executeScript("arguments[0].value='T-Shirt';", Searchtextbox);
		

	}
}

