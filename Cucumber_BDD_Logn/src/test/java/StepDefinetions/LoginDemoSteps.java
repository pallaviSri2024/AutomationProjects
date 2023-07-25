package StepDefinetions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
	
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
	 System.out.println("Inside step - browser is open ");

	System.setProperty("webdriver.chrome.driver","C:\\Users\\palri\\eclipse\\java-2023-03\\eclipse\\Cucumber_BDD_Logn\\src\\test\\resources\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

	}
	@And("user is on login page")
	public void user_is_on_login_page() {
	 driver.navigate().to("https://example.testproject.io/web/");
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() throws
	InterruptedException {
	 driver.findElement(By.id("name")).sendKeys("Raghav");
	 driver.findElement(By.id("password")).sendKeys("12345");
	Thread.sleep(2000);
	}
	@And("user clicks on login")
	public void user_clicks_on_login() {
	driver.findElement(By.id("login")).click();
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws
	InterruptedException {
	driver.findElement(By.id("logout")).isDisplayed();
	Thread.sleep(2000);
	driver.close();
	driver.quit();
	}

}
