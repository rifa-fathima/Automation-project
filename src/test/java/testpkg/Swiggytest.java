package testpkg;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.SwiggyAddAddress;
import pagepkg.SwiggyLocation;
import pagepkg.SwiggyLogin;
import pagepkg.SwiggyProfile;
import pagepkg.Swiggyorders;
import pagepkg.Swiggypayment;
import pagepkg.SwiggyprofileChecking;
import pagepkg.Swiggysignout;
import utilities.Excelutils;


public class Swiggytest extends Baseclass {

	
	@Test(priority=0)
	public void swiggylogin() throws InterruptedException 
	{
		SwiggyLogin ob=new SwiggyLogin(driver);
		ob.login();
		ob.loginform("9895909117");
		ob.log();
		
		Thread.sleep(15000);
		
		ob.verify();
		
		
	}
	@Test(priority=1)
	public void swiggyprof()
	{
		SwiggyProfile ob= new SwiggyProfile(driver);
		
		ob.pro();
		ob.edit();
		ob.cng();
		ob.emailchange("rifapathu007@gmail.com");
		
	}
	
	@Test(priority=2)
	
	public void swiggyid() 
	{
		SwiggyprofileChecking ob=new SwiggyprofileChecking(driver);
		
		ob.profileId();
	}
	
	@Test(priority=3)
	public void addlocation()
	{
	        SwiggyLocation ob=new SwiggyLocation(driver);
		
		ob.location();
	         
	        
	}
	
	
	@Test(priority=4)
	public void orders() throws InterruptedException
	{
		
		Swiggyorders ob = new Swiggyorders(driver);
				
		JavascriptExecutor js = (JavascriptExecutor) driver;
	                
	        
	         ob.offer();

		Thread.sleep(5000);	
		
		ob.search("Al Khaleej Kuzhimandhi");
	      
		Thread.sleep(2000);
		
		ob.foodclick();
		
		Thread.sleep(3000);
		
		 js.executeScript("window.scrollBy(0,300)");
	      
		 Thread.sleep(3000);
		 ob.add();
		 
		
		 Thread.sleep(5000);
		 ob.addtoitems();
		 Thread.sleep(5000);
		  ob.cart();
	}
	
	@Test(priority=5)
	
	public void Address() throws InterruptedException
	{
		SwiggyAddAddress ob= new SwiggyAddAddress(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String xl ="C:\\Users\\HP\\Desktop\\RIFA SOFTWARE TESTING\\Swiggyaddress.xlsx";
		String sheet="sheet1";
		int rowCount= Excelutils.getRowCount(xl, sheet);
		for(int i=1;i<=rowCount;i++)
		{
			
			
			String building=Excelutils.getCellValue(xl, sheet, i, 0);
			System.out.println("building= " + building);
			
			String ar= Excelutils.getCellValue(xl, sheet, i, 1);
			System.out.println("area= " + ar);
			
			String landmark=Excelutils.getCellValue(xl, sheet, i, 2);
			System.out.println("landmark= " + landmark);
			
		
			
		
			ob.addaddress(building, ar, landmark);
			
			Thread.sleep(3000);
			
			js.executeScript("window.scrollBy(0,400)");
			
			Thread.sleep(3000);
			
			ob.savebtn();
			
		}
	}
	@Test(priority=6)
	
	public void pymnt() throws InterruptedException, IOException
	{
		Swiggypayment ob = new Swiggypayment(driver);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		ob.payment();
		Thread.sleep(3000);
		
		
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
		ob.cash();
		
		driver.navigate().back();
		
		Thread.sleep(6000);
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File ("E://swiggy.png"));
		
		
	}
	@Test(priority=7)
	
	public void signout() throws InterruptedException
	{
		Swiggysignout ob=new Swiggysignout(driver); 
		
		Thread.sleep(3000);
		
		ob.logout();
	}
	
}
