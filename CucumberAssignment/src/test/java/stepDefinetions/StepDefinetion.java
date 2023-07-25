package stepDefinetions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Generic.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectRepoLib.Login;

public class StepDefinetion {
	public static WebDriver driver = Driver.getBrowser();

	@Given("User launches the applcation")
	public void user_launches_the_applcation() {
		System.out.println("User launches the applcation");
	}
	@When("Use logs in to the application")
	public void use_logs_in_to_the_application() throws Throwable {
		Login login = PageFactory.initElements(driver, Login.class);
		login.loginToApp(driver);
	}
	@Then("verify that the user is on the landing page")
	public void verify_that_the_user_is_on_the_landing_page() {
		Login login = PageFactory.initElements(driver, Login.class);
		login.verifyErrorMessage();
	}

	

}