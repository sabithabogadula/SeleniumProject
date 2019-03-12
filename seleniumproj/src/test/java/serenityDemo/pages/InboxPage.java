package serenityDemo.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InboxPage extends PageObject{
	
	
	@FindBy(xpath="//*[text()='List of Pending Tasks']")
	WebElementFacade tasklist;
	
	
	
	public boolean is_task_list_displayed()
	{
		return tasklist.isDisplayed();
	}
	

}
