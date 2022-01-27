package stepDefinations;

import java.io.IOException;

import org.junit.Assert;

import Driver.DriverManager;
import functionLib.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmptyUsernameTest extends DriverManager{
	
	loginpage lp;
	
	@Given("Navigate to login page {string}")
	public void navigate_to_login_page(String string) throws IOException {
		 DriverManager.getdriver().get(string);
		  lp = new loginpage(driver);
	}
	
	@Given("Keep username field empty")
	public void keep_username_field_empty() {
	   System.out.println("Username field is empty");
	}

	@When("Enter password {string}")
	public void enter_password(String string) {
	    lp.Pass().sendKeys(string);
	}

	@Then("Click on Signin button")
	public void click_on_signin_button() {
	   lp.Sigin().click();
	}

	@Then("This field is required at username")
	public void this_field_is_required_at_password() {
		Assert.assertTrue(lp.Blankfield().isDisplayed());
		driver.close();
	}


}
