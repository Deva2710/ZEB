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
	
	@FindBy(xpath = "(//*[text()='dames'])[1]")
	private WebElement DAMES;
	
	@FindBy(xpath = "(//*[text()='heren'])[1]")
	private WebElement HEREN;
	
    @FindBy(xpath = "(//*[@class='pe-7s-search'])[2]")
    private WebElement searchbox;
    
    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    private WebElement cookies;
    
    @FindBy(xpath = "//*[@id='search']")
    private WebElement Searchtextbox;	
    
	public PC_01_HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void ClickOnDames() throws InterruptedException {
		Thread.sleep(3000);
		DAMES.click();	
	}

	public void AcceptCookies() throws InterruptedException {
		Thread.sleep(3000);
		cookies.click();
	}
	
	public void Verifysearch() throws InterruptedException{
		Thread.sleep(3000);
		searchbox.click();	
	}
	
	
	public void VerifySearchtextbox() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Searchtextbox);
		Searchtextbox.sendKeys("T-shirt");
		Searchtextbox.sendKeys(Keys.ENTER);
	}

}

