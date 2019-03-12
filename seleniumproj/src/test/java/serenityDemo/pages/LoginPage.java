package serenityDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://testintraweb01.erp2.lta.gov.sg/intranet/saml/login/")
public class LoginPage extends PageObject{
	
	@FindBy(name="user")
	private WebElementFacade username;
	
	@FindBy(name="pass")
	WebElementFacade password;
	
	@FindBy(xpath="//button[contains(@type,'submit')]")
	WebElementFacade loginbutton;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElementFacade logoutbutton;
	
	
	WebDriver driver;
	
	
	public boolean is_login_page_open()
	{
		if(loginbutton.isDisplayed())
		{
			return true;
		}
		else
		{return false;}
	}
	
	public void Login(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.type(pwd);
		loginbutton.click();
	}
	
	public boolean is_logout_link_enabled()
	{
		return logoutbutton.isCurrentlyEnabled();
	}

}
