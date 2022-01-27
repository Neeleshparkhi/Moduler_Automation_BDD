package functionLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Driver.DriverManager;
import pageObject.landingPage;

public class loginpage extends DriverManager implements landingPage{
	
	public loginpage(WebDriver driver)
	{
		super();
	}
	public WebElement Logo()
	{
		return driver.findElement(logo);
	}
	
	public WebElement Name()
	{
		return driver.findElement(name);
	}
	
	public WebElement Pass()
	{
		return driver.findElement(pass);
	}
	
	public WebElement Sigin()
	{
		return driver.findElement(sigin);
	}
	
	//Blank text indication
	public WebElement Blankfield()
	{
		return driver.findElement(blankfield);
	}
	
	public WebElement Loadingicon()
	{
		return driver.findElement(loadingicon);
	}
	
	public WebElement Forgotpassword()
	{
		return driver.findElement(forgotpassword);
	}
	
	public WebElement ForgotpasswordName()
	{
		return driver.findElement(forgotpasswordname);
	}
	
	public WebElement ResetreqBT()
	{
		return driver.findElement(reqresetBT);
	}
	
	public WebElement Emailsent()
	{
		return driver.findElement(emailsent);
	}
	
}
