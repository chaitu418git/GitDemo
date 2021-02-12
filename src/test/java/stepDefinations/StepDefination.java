package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
public class StepDefination
{
	@Given("^User is on Landing page$")
	public void user_is_on_Landing_page()
	{
	System.out.println("user is on landing page");	
	}
    
	@When("^User enters username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_enters_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
	
	
	@Then("^User should be landing Page$")
	public void user_should_be_landing_Page()
	{
		System.out.println("on landing pages");
	}
	@And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }
}