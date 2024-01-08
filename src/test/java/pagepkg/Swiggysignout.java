package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Swiggysignout {

	
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/ul/li[1]/div/div/div/a")
	WebElement myaccount;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/ul/li[1]/div/div[2]/div/div/div/div/a[5]")
	WebElement out;

	
	
	

	public Swiggysignout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void logout()
	{
		
	Actions act=new Actions(driver);
	act.moveToElement(myaccount).moveToElement(out).click();
	act.build();
	act.perform();
		
		
	}
	
}
