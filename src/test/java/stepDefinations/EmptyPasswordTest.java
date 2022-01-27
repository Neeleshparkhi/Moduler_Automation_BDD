package stepDefinations;

import java.io.IOException;

import org.junit.Assert;

import Driver.DriverManager;
import functionLib.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmptyPasswordTest extends DriverManager{
	
	public loginpage lp;
	
	@Given("Navigate to Login page {string}")
	public void navigate_to_Login_page(String string) throws IOException {
		 DriverManager.getdriver().get(string);
		  lp = new loginpage(driver);
	}

	@Given("Enter username {string}")
	public void enter_username(String string) {
	   lp.Name().sendKeys(string);
	}

	@When("Keep password filed is empty")
	public void keep_password_filed_is_empty() {
	    System.out.println("Password field is empty");
	}

	@Then("Click on SignIn button")
	public void click_on_signIn_button() {
	   lp.Sigin().click();
	}

	@Then("This field is required at password")
	public void this_field_is_required_at_password() {
		Assert.assertTrue(lp.Blankfield().isDisplayed());
		driver.close();
	}


}
