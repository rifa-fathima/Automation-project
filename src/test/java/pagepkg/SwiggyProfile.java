package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyProfile {

	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div/div[1]/div[1]/div/div[1]/a")
	WebElement profilelink;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div/div[1]/div/div[1]")
	WebElement editprofile;
	
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[2]/div[2]")
	WebElement change;
	
	
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[2]/form/div[1]/input")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[3]/div[2]/form/div[2]/div/a")
	WebElement updt;
	
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div[1]/span")
	WebElement close;

	
	public SwiggyProfile(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void pro()
	{
		profilelink.click();
	}
	
	public void edit()
	{
		
		editprofile.click();
	}
	
	public void cng()
	{
		change.click();
		
	}
	
	public void emailchange(String mail)
	{
		email.clear();
		email.sendKeys(mail);
		updt.click();
		close.click();
	}
}
