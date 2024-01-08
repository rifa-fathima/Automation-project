package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swiggypayment {

	
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div[2]/div/button")
	WebElement proceed;
	
	@FindBy(xpath="//*[@id=\"web-payments-container\"]/div/div/div/div[2]/div[2]/div[4]/div[2]/div[4]/div[1]/div[2]")
	WebElement cashpayment;

	
	

	public Swiggypayment(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void payment()
	{
		proceed.click();
		
	}
	
	public void cash()
	{
		cashpayment.click();
	}
	
}
