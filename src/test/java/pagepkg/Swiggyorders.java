package pagepkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swiggyorders {

WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/ul/li[4]/div/a")
	WebElement ofr;
	
	@FindBy(xpath="//*[@id=\"seo-core-layout\"]/div[1]/div/div/div[3]/div/button/div/div")
	WebElement srch;
	
	@FindBy(xpath="//*[@id=\"seo-core-layout\"]/div[1]/div/div/div[3]/div/div/div/input")
	WebElement srchtext;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div[2]/div/div/div[3]/div[1]/div/a/div[1]/div[1]/img")
	WebElement clickfood;
	

	
	@FindBy(xpath="//*[@id=\"modal-placeholder\"]/div/div/div[2]/div/div[3]/div[3]")
	WebElement addtoitem;
	
	

	
	@FindBy(xpath="//*[@id=\"cid-Recommended\"]/div[1]/div/div[1]/div[1]/div/div[2]/div[2]/div/div[1]")
	WebElement additem;
	
	@FindBy(xpath="//*[@id=\"view-cart-btn\"]")
	WebElement viewcart;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[3]")
	WebElement addaddress;
	
	
	
	
	
	public Swiggyorders(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void offer()
	{
		ofr.click();
		
		
		
	}
	
	public void add()
	{
		
		additem.click();

		
	}
	
	public void addtoitems()
	{
		addtoitem.click();
	}
	
	public void search(String text)
	{
		srch.click();
		srchtext.sendKeys(text);
		srchtext.sendKeys(Keys.ENTER);
		
	
	}
	
	public void foodclick()
	{
		clickfood.click();
	}
	
	public void cart()
	{
		viewcart.click();
		addaddress.click();
		
	}
	
	
}
