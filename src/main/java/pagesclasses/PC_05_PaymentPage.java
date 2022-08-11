package pagesclasses;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PC_05_PaymentPage {
	
	
WebDriver driver;
	
	@FindBy(xpath = "//*[@id='adyen_cc']")
	private WebElement CreditCard;
	
	//input[contains(@id,'adyen-checkout-encryptedCardNumber-165')][1]
	@FindBy(xpath = "//*[@id='adyen-checkout-encryptedCardNumber-1656930446585']")
	private List<WebElement>  CardNumber;
	
	@FindBy(xpath = "//*[@id='adyen-checkout-encryptedExpiryDate-1656598271437']")
	private WebElement ValidityDate;
	
	@FindBy(xpath = "//*[@id='adyen-checkout-encryptedSecurityCode-1656598271438']")
	private WebElement CVVNumber;
	
	@FindBy(xpath = "//*[@id='adyen-checkout-holderName-1656598271439']")
	private WebElement CardHolderName;
	
	@FindBy(xpath = "(//*[@class='action primary checkout'])[1]")
	private WebElement OrderAndPay;

	public PC_05_PaymentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public void ClickCreditCart() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		CreditCard.click();	
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
	}

	public void EnterCardNumber() throws InterruptedException {
		Iterator<WebElement> itr = CardNumber.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		Thread.sleep(3000);

		
	}
	
	public void EnterValidityDate() throws InterruptedException {
		Thread.sleep(3000);
		ValidityDate.click();
		ValidityDate.sendKeys("03/30");
	}
	
	public void EnterCVVNumber() throws InterruptedException {
		Thread.sleep(3000);
		CVVNumber.click();
		CVVNumber.sendKeys("737");
	}
	
	public void EnterCardHolderName() throws InterruptedException {
		Thread.sleep(3000);
		CardHolderName.click();
		CardHolderName.sendKeys("vikas pal");
	}
	
	public void ClickOrderAndPay() throws InterruptedException {
		Thread.sleep(3000);
		OrderAndPay.click();	
	}
	
}
