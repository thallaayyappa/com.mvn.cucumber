package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() 
	{
	    System.out.println("TA on login page");
	   
	}

	@When("user enters usrname and passwod")
	public void user_enters_usrname_and_passwod() {
	System.out.println("TA user enteing username and pwd");
	    
	}

	@And ("clicks on login")
	public void clicks_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user sending the details by clicking submite");
	    
	}

	@Then("user is navigated to dashboard")
	public void user_is_navigated_to_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is dashboard");
	    
	}

}
