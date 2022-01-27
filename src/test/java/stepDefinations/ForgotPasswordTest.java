package stepDefinations;

import java.io.IOException;

import org.junit.Assert;

import Driver.DriverManager;
import functionLib.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPasswordTest extends DriverManager{
	
	loginpage lp;
	

	@Given("Navigate to Landing_page {string}")
	public void navigate_to_landing_page(String string) throws IOException {
		  DriverManager.getdriver().get(string);
		  lp = new loginpage(driver);
		  //Assert.assertTrue(lp.Logo().isDisplayed()); 
		  
		}
   

	@And("^User click on forgot password$")
    public void user_click_on_forgot_password() throws Throwable {
       lp.Forgotpassword().click();
    }
	
	@When("^user provide the username \"([^\"]*)\"$")
	public void user_provide_the_username_something(String strArg1) throws Throwable {
	  lp.ForgotpasswordName().sendKeys(strArg1);
	}
    
    @And("^click on Request a reset button$")
    public void click_on_request_a_reset_button() throws Throwable {
        lp.ResetreqBT().click();
    }

    @Then("^Email should send to user emailid$")
    public void email_should_send_to_user_emailid() throws Throwable {
       Assert.assertTrue(lp.Emailsent().isDisplayed());
       driver.quit();
    }

}
