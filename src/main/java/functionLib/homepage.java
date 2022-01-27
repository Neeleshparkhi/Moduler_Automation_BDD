package functionLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Driver.DriverManager;
import pageObject.homePage;

public class homepage extends DriverManager implements homePage{
	
	public homepage(WebDriver driver)
	{
		super();
	}
	
	//home page logo
	public WebElement homepageLogo()
	{
		return driver.findElement(homepagelogo);
	}

}
