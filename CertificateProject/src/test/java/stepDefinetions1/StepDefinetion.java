package stepDefinetions1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Generic.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectReproLib.SignupLogin;

/**
 * 
 * 
 * 
 * @author Pallavi Srivastava
 *
 */

public class StepDefinetion {
	public static WebDriver driver = Driver.getBrowser();
	
	@Given("User is on landing page")
	public void user_is_on_landing_page() throws Throwable {
		SignupLogin landpage = PageFactory.initElements(driver, SignupLogin.class);
		landpage.Homepage1(driver);
	}
	@When("User clicks on Signup button")
	public void user_clicks_on_signup_button() throws Throwable {
		SignupLogin Signup = PageFactory.initElements(driver, SignupLogin.class);
		Signup.NavigatetoSignup(driver);
	}
	@When("User enters username")
	public void user_enters_username() throws Throwable {
		SignupLogin uname = PageFactory.initElements(driver, SignupLogin.class);
		uname.SignuptoApp(driver);
	}
	@When("User enters password")
	public void user_enters_password() throws Throwable {
		SignupLogin pword = PageFactory.initElements(driver, SignupLogin.class);
		pword.SignuptoApp(driver);
	}
	@When("User click Signup button")
	public void user_click_signup_button() throws Throwable {
		SignupLogin subutton = PageFactory.initElements(driver, SignupLogin.class);
		subutton.SignuptoApp(driver);
	}
	@Then("user is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("User is navigated to Home page");
	}
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws Throwable {
		SignupLogin login = PageFactory.initElements(driver, SignupLogin.class);
		login.SignuptoApp(driver);
	}
	
	@When("User clicks on Log in button")
	public void user_clicks_on_log_in_button() throws Throwable {
		SignupLogin login = PageFactory.initElements(driver, SignupLogin.class);
		login.SignuptoApp(driver);
	}
	
	@Then("user is navigated to Welcome page")
	public void user_is_navigated_to_welcome_page() {
		System.out.println("user is navigated to Welcome page");
	}
}
