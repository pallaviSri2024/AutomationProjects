package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generic.Driver;
import pageobjectRepoLib.Login;

public class HomePage {

	public static WebDriver driver = null;

	@Test
	public void createUserTest() throws Throwable {
		
		driver = Driver.getBrowser();
		
		Login login = PageFactory.initElements(driver, Login.class);
		
		login.loginToApp(driver);
		login.verifyErrorMessage();
		
	}
}