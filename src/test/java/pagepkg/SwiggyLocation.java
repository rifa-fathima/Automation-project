package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyLocation {

WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/a")
	WebElement logo;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div/div[1]/div[1]/div/div[2]/div/button")
	WebElement locate;

	
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/div/span[2]")
	WebElement loc;
	
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div/div[1]/div/div/div[2]/div[1]")
	WebElement gps;
	
	
	
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div[3]/a[2]")
	WebElement save;
	
	public SwiggyLocation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void location()
	{
		logo.click();
		locate.click();
		loc.click();
		gps.click();
		save.click();
	}
	
}
