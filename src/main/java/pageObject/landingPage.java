package pageObject;

import org.openqa.selenium.By;

public interface landingPage {

	By logo = By.xpath("//*[@class='big-logo-icon']");
	
	By name = By.id("username-inp");
	
	By pass = By.id("password-inp");
	
	By sigin = By.id("signInSubmitButton");
	
	By blankfield = By.xpath("//*[contains(text(),' This field is required ')]");
	
	By loadingicon = By.xpath("//*[@class='spinner']/svg");
	
	By forgotpassword = By.id("forgotPasswordHref");
	
	By forgotpasswordname = By.id("usernameInput");
	
	By reqresetBT = By.id("signInSubmitButton");
	
	By emailsent = By.xpath("//*[contains(text(),'Email sent')]");
}
