package pagesclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_04_AddressPage {
	
    WebDriver driver;
	
    @FindBy(xpath = "(//*[@name='username'])[2]")
    WebElement email;
    
    @FindBy(xpath = "(//*[@class='col col-method'])[3]")
    WebElement HomeDelivery;
    
    @FindBy(xpath = "//*[@id='SHO03VE']")
    WebElement FirstName;
    
    @FindBy(xpath = "//*[@id='SNMFBPJ']")
    WebElement LastName;
    
    @FindBy(xpath = "//*[@id='TWODBNJ']")
    WebElement PostalCode;
    
    @FindBy(xpath = "//*[@id='XWQCSXE']")
    WebElement Place;
    
    @FindBy(xpath = "//*[@id='DKI3NG9']")
    WebElement Address;
    
    @FindBy(xpath = "//*[@id='TUO6YE2']")
    WebElement HouseNumber;
    
    @FindBy(xpath = "(//*[@class='button action continue primary'])[2]")
    WebElement ContinuePayment;
    
    public PC_04_AddressPage(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
    
    public void scrollUp() {
      	 JavascriptExecutor js = (JavascriptExecutor)driver;
   	    js.executeScript("window.scrollBy(0,-50)");
      	
      }
    
    public void ClickHomeDelivery() throws InterruptedException {
    	HomeDelivery.click();
    	Thread.sleep(2000);
	}
    
    public void enterEmail() {
    
		    JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("window.scrollBy(0,-50)");

			js.executeScript("arguments[0].click();", email);
		
			email.sendKeys("devanand.rathod@apoyar.eu");
		//	js.executeScript("arguments[0].value='T-Shirt';", Searchtextbox);
			
			email.sendKeys(Keys.ENTER);
	}
    
    
    
    public void EnterFirstName() throws InterruptedException {
    	 JavascriptExecutor js = (JavascriptExecutor)driver;
    	 js.executeScript("window.scrollBy(0,-50)");
    	FirstName.sendKeys("Dev");
   	 Thread.sleep(1000);

	}
    
    public void EnterLastName() throws InterruptedException {
    	LastName.sendKeys("Rathod");
   	 Thread.sleep(1000);

    	}
    
    public void EnterPostalCode() throws InterruptedException {
    	PostalCode.sendKeys("1060");	
   	 Thread.sleep(1000);

    	}
    
    public void EnterPlace() throws InterruptedException {
    	Place.sendKeys("Saint-Gilles");	
   	 Thread.sleep(1000);

    	}
    
    public void EnterAddress() throws InterruptedException {
    	Address.sendKeys("Taminesstraat");	
   	 Thread.sleep(1000);

    	}
    
    public void EnterHouseNumber() throws InterruptedException {
    	HouseNumber.sendKeys("1020");
   	 Thread.sleep(1000);

    	}
    
    
    
    
    
    
    
    

    
    public void ProceedPayment() {
    	ContinuePayment.click();
	}
    
    
    
    
}
