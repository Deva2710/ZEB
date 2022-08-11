package pagesclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PC_End_To_End {
	
WebDriver driver;
	
    @FindBy(xpath = "(//*[@class='pe-7s-search'])[2]")
    private WebElement searchbox;
    
    @FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    private WebElement cookies;
    
    @FindBy(xpath = "//*[@id='search']")
    private WebElement Searchtextbox;	
    
    //--------**----
    
    @FindBy(xpath = "(//*[@class='product photo product-item-photo'])[2]")
	private WebElement Product;
	
	@FindBy(xpath = "//*[@id='attribute180']")
	private WebElement  Size;
	
	@FindBy(xpath = "//*[@id='product-addtocart-button']")
	private WebElement WINKEL;
	
	@FindBy(xpath = "//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
	private WebElement cookies1;
	
	//----------**-----
	
	@FindBy(xpath = "(//button[@class='viewcart'])")
	WebElement popup;
	
	@FindBy(xpath = "//*[@class='cart-edit-qty plus']")
	WebElement itemsQuantity;
	
	
    @FindBy(xpath = "//*[@class='action primary checkout']")
    WebElement checkout3;
    
    @FindBy(xpath = "//a[@class='scroll-to-top']")
    WebElement ScrollUP;
  
    
    @FindBy(xpath = "//input[@id='s_method_bposthomedelivery_bposthomedelivery']")
    WebElement HomeDelivery1;
    
    
   //----**----
    
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
    
    //----**----
    
	public PC_End_To_End(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
		
	public void Verifysearch() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		searchbox.click();	
		
	
	}
	
	public void AcceptCookies() {
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		cookies.click();
	
	}
	
	public void VerifySearchtextbox() {
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();", Searchtextbox);
		Searchtextbox.sendKeys("T-shirt");
		Searchtextbox.sendKeys(Keys.ENTER);
	
	}
	
	
	//-----**-----
	
	
	public void SelectProduct() throws InterruptedException {
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 JavascriptExecutor js2 = (JavascriptExecutor)driver;
         js2.executeScript("window.scrollBy(0,300)");
		   Product.click();	

	}
	
	public void SelectSize() throws InterruptedException {
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  JavascriptExecutor js3 = (JavascriptExecutor)driver;
          js3.executeScript("window.scrollBy(0,200)");
		
		  Size.click();
		  Thread.sleep(2000);

	      Select se = new Select (Size);
          se.selectByVisibleText("S");
	      JavascriptExecutor js = (JavascriptExecutor)driver;
          js.executeScript("window.scrollBy(0,200)");
          Size.click();
          Thread.sleep(2000);

          
	
	}
	
	public void checkout1() throws InterruptedException {
		  WINKEL.click();
	
	}
	
	//----**----
	
	 public void Checkout() {
		    popup.click();
	  
	     }

	     public void Quantity() throws InterruptedException {
		    	Thread.sleep(2000);
	    	 JavascriptExecutor js = (JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0,200)");
	     	itemsQuantity.click();
	   
	     }

	    public void Addcart1() throws InterruptedException {
	    	Thread.sleep(2000);
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0,400)");
	    	Thread.sleep(2000);
		    checkout3.click();
	   
	    }	    
	    //----**----
	    
	    
	   public void ClickHomeDelivery() throws InterruptedException {
		   Thread.sleep(2000);
		   HomeDelivery.click();
		
	   }
	   
	   public void enterEmail() {
			    JavascriptExecutor js = (JavascriptExecutor)driver;
		        js.executeScript("window.scrollBy(0,-50)");
				js.executeScript("arguments[0].click();", email);
				email.sendKeys("devanand.rathod@apoyar.eu");			
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
