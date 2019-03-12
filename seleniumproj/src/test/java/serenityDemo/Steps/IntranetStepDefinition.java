package serenityDemo.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenityDemo.Steps.Serenity.IntranetSanitySteps;


public class IntranetStepDefinition {
	
	 @Steps
	 IntranetSanitySteps sanity;
	
	
	@Given("the user login to the application with username '(.*)' and password '(.*)'")
	public void theUserLoginToTheApplication(String uname, String pwd)
	{
		sanity.openLoginPage();
		sanity.login_to_application(uname, pwd);
		sanity.verify_logout_button_displayed();
	}
	@When("the user traverse to '(.*)' menu")
	public void theUserTraverseToInboxMenu(String menu)
	{
		sanity.navigate_to_menu_item(menu);
	}
	@Then("verify list of pending tasks are displayed")
	public void verifyListOfPendingTasksAreDisplayed()
	{
		sanity.verify_task_list_displayed();
	}
}
