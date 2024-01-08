 package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyAddAddress {
	
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"building\"]")
	WebElement building;
	
	@FindBy(xpath="//*[@id=\"area\"]")
	WebElement area;
	
	
	
	@FindBy(xpath="//*[@id=\"landmark\"]")
	WebElement landmark;
	
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div[3]/div[3]/div[3]/div[1]")
	WebElement home;
	
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div[4]/div/div/a")
	WebElement save;
	
	
	
	
	public SwiggyAddAddress(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void addaddress(String build,String ar,String land)
	{
		building.sendKeys(build);
		
		area.sendKeys(ar);
		
		landmark.sendKeys(land);
	
	}
	
	public void savebtn()
	{
		
		
		home.click();
		save.click();
	}
	

}
