package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SwiggyprofileChecking {

 WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/div/ul/li[2]/div/div/div/a/span[2]")
	WebElement Id;
	
	
	
	public SwiggyprofileChecking(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	public void profileId()
	{
		String Actual=Id.getText();
		Assert.assertEquals(Actual,"Rifa Fathima");
		System.out.println("Id verified");
	}
}
