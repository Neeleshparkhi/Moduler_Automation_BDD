package stepDefinations;



import java.io.IOException;

import org.junit.Assert;

import Driver.DriverManager;
import functionLib.homepage;
import functionLib.loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageTest extends DriverManager{
	
	public loginpage lp;
	public homepage hp;
	
	  @Given("^Navigate to the Landing page \"([^\"]*)\"$")
	    public void navigate_to_the_landing_page_something(String strArg1) throws IOException  {
		  
		  DriverManager.getdriver().get(strArg1);
		  lp = new loginpage(driver);
		  //Assert.assertTrue(lp.Logo().isDisplayed());
	    }
	  
	 
	    @When("^User id \"([^\"]*)\" and Password \"([^\"]*)\" is entering and click on Signin Button$")
	    public void user_id_something_and_password_something_is_entering_and_click_on_signin_button(String strArg1, String strArg2)  {
	        lp.Name().sendKeys(strArg1);
	        lp.Pass().sendKeys(strArg2);
	        lp.Sigin().click();
	    }
	    
	    @And("^Click on Login button$")
	    public void click_on_login_button() {
		  lp.Sigin().click();
		  System.out.println("No login button");
	    }

	    @Then("^Home page should be visible$")
	    public void home_page_should_be_visible()  {
	    	
	     hp = new homepage(driver);
	     //Validation
	     Assert.assertTrue(hp.homepageLogo().isDisplayed());
	     driver.close();
	     
	    }

	  

}
