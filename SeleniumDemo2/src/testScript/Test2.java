package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.Link1PO;

public class Test2 extends BaseTest
{
	@Test
	public void testFacebookLink()
	{
		try {
			Link1PO link1po=new Link1PO(driver);
			link1po.myFacebookLink().click();
			String aTitle = driver.getTitle();
			System.out.println(aTitle);
			String eTitle="Facebook – log in or sign up1";
          Assert.assertEquals(aTitle, eTitle);
			
		} catch (Exception e) 
		{
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
	
}

