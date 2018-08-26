package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.Link1PO;

public class Test3 extends BaseTest
{
	@Test
	public void testTwitterLink()
	{
		try {
			Link1PO link1po=new Link1PO(driver);
			link1po.myTwitterLink().click();
			String aTitle = driver.getTitle();
			System.out.println(aTitle);
			String eTitle="Twitter. It's what's happening2.";
			Assert.assertEquals(aTitle, eTitle);
			
		} catch (Exception e) 
		{
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
	
}

