package serenityDemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject{
	
	@FindBy(xpath="//a[text()='Inbox                   ']")
	WebElementFacade inboxmenu;
	
	
	WebDriver driver;
	
	public void navigate_to_menu(String menu)
	{
		driver =getDriver();
		
		Actions action = new Actions(driver);
		
		if(inboxmenu.isDisplayed())
		{
			//action.moveToElement(inboxmenu).click().build().perform();
			inboxmenu.click();
		}
	}
	

}
