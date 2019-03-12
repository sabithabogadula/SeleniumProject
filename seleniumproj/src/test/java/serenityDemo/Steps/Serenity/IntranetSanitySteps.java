package serenityDemo.Steps.Serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import net.thucydides.core.annotations.Step;
import serenityDemo.pages.HomePage;
import serenityDemo.pages.InboxPage;
import serenityDemo.pages.LoginPage;

public class IntranetSanitySteps {
	
	LoginPage loginpage;
	HomePage homepage;
	InboxPage inboxpage;
	
	
	@Step
	public void openLoginPage()
	{
		loginpage.open();
		assertThat("Login Page not Opened or login button not found, hence failed the step", loginpage.is_login_page_open(), is(true));
	}
	
	@Step
	public void login_to_application(String uname,String pwd)
	{
		loginpage.Login(uname, pwd);
	}
	
	@Step
	public void verify_logout_button_displayed()
	{
		assertThat("Logout not enabled hence failed",loginpage.is_logout_link_enabled(),is(true));
	}
	
	@Step
	public void navigate_to_menu_item(String menu)
	{
		homepage.navigate_to_menu(menu);
	}
	
	@Step
	public void verify_task_list_displayed()
	{
		assertThat("Task list not displayed",inboxpage.is_task_list_displayed(),is(true));
	}
}
