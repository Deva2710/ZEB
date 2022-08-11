package pagesclasses;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PC_04_AddressPage {
	
    WebDriver driver;
    
    @FindBy(xpath = "(//*[@name='firstname'])[1]")
    private WebElement FirstName;
    
    @FindBy(xpath = "(//*[@name='lastname'])[1]")
    private WebElement LastName;
    
    @FindBy(xpath = "(//*[@name='postcode'])[1]")
    private WebElement PostalCode;
    
    @FindBy(xpath = "(//*[@name='city'])[1]")
    private WebElement Place;
    
    @FindBy(xpath = "(//*[@name='street[0]'])[1]")
    private WebElement Address;
    
    @FindBy(xpath = "(//*[@class='select-zipcode'])[1]")
    private WebElement HiddenAddress;
    
    @FindBy(xpath = "(//*[@name='street[1]'])[1]")
    private WebElement HouseNumber;
    
    @FindBy(xpath = "(//*[@class='button action continue primary'])[2]")
    private WebElement ContinuePayment;
    
    public PC_04_AddressPage(WebDriver driver) {
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	
    }
       
    public void EnterFirstName() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
 	    jse.executeScript("window.scrollBy(0,500)");
 	    FirstName.click();
    	FirstName.sendKeys("Dev");
	
    }
    
    public void EnterLastName() throws InterruptedException {
    	LastName.click();
    	LastName.sendKeys("Rathod");
   	        Thread.sleep(3000);
    	
    }
    
    public void EnterPostalCode() throws InterruptedException {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
 	    jse.executeScript("window.scrollBy(0,500)");
    	PostalCode.click();
    	PostalCode.sendKeys("1060");	
       	   Thread.sleep(3000);
    	
    }
    
    public void EnterPlace() throws InterruptedException {
    	Place.click();
    	Place.sendKeys("Saint-Gilles");	
   	       Thread.sleep(3000);
    	
    }
    
    public void EnterAddress() throws InterruptedException {
    	Address.click();
    	Address.sendKeys("1060");
 	    //  Thread.sleep(10000);	

 	      //Actions ac=new Actions(driver);
 	     // ac.moveToElement(HiddenAddress).click();
 	      
 	      Thread.sleep(3000);	
   	      
    }
    
    public void EnterHouseNumber() throws InterruptedException {
    	HouseNumber.click();
    	HouseNumber.sendKeys("1020");
   	    Thread.sleep(3000);    	
   	    
    }
    
    public void ProceedPayment() {
    	ContinuePayment.click();
    	
	}
    
}
