package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwiggyLogin {

	
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/div[1]/div/div[1]/div[1]/div/div[1]/div/a[1]")
	WebElement loginlink;
	
	@FindBy(xpath="//*[@id=\"mobile\"]")
	WebElement mobile;
	
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/form/div[2]/a")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"overlay-sidebar-root\"]/div/div/div[2]/div/div/div/div[2]/form/div[2]/div[2]/a")
	WebElement verifybtn;
	
	
	
	public SwiggyLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void login()
	{
		loginlink.click();	
		
	}
	
	public void loginform(String num)
	{
		mobile.sendKeys(num);
		
	}
	public void log()
	{
		loginbtn.click();
	}
	
	public void verify()
	{
		verifybtn.click();
	}
}
