package testpkg;



import org.testng.annotations.Test;

import basepkg.Crossbase;

public class Swiggycrossbrowsertest extends Crossbase {

	

	@Test
	public void test()
	{
		driver.get("https://www.swiggy.com");
	}

		}


