package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class Link1PO extends BasePage
{
	public Link1PO(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(id="a1")
	private WebElement myGoogleLink;
	public WebElement myGoogleLink()
	{
		return myGoogleLink;
	}
	
	@FindBy(id="a2")
	private WebElement myFacebookLink;
	public WebElement myFacebookLink()
	{
		return myFacebookLink;
	}
	@FindBy(id="a3")
	private WebElement myTwitterLink;
	public WebElement myTwitterLink()
	{
		return myTwitterLink;
	}
	@FindBy(id="a4")
	private WebElement myInstaLink;
	public WebElement myInstaLink()
	{
		return myInstaLink;
	}
	
	

}
