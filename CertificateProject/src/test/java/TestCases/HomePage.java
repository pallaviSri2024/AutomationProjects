package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Generic.Driver;
import pageobjectReproLib.SignupLogin;
/**
 * 
 * 
 * 
 * @author Pallavi Srivastava
 *
 */
public class HomePage {

	public static WebDriver driver = null;

	@Test
	public void createUserTest() throws Throwable {
		
		driver = Driver.getBrowser();
		
		SignupLogin login = PageFactory.initElements(driver, SignupLogin.class);
		
		login.Homepage1(driver);
		login.NavigatetoSignup(driver);
		login.SignuptoApp(driver);
				
	}
}