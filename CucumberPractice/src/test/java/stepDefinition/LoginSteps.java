package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	
	@Given("open home page on browser")
	public void open_home_page_on_browser()
	{
		System.out.println("login page");
	}
	
	@When("click on login link and enter username and enter password and click on login button")
	public void click_on_login_link_and_enter_username_and_enter_password_and_click_on_login_button()
	{
		System.out.println("entered login details");
	}
	
	@Then("user is logged in")
	public void user_is_logged_in()
	{
		System.out.println("user logged in");
	}
}
