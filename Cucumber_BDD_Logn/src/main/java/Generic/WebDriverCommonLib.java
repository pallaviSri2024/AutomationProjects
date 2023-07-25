package Generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib {

	WebDriverCommonLib wlib = new WebDriverCommonLib();

	public static WebDriver driver = Driver.getBrowser();

	/**
	 * This method helps in maximizing the window.
	 */
	public void maximize() {
		driver.manage().window().maximize();
	}

	/**
	 * This wait is used as implicitly wait to wait for page to be fully loaded in
	 * the DOM
	 */
	public void waitForpageToLoad() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.globalWait));
	}

	/**
	 * This explicit wait statement waits for the presence of element located by
	 * provided locator
	 * 
	 * @param by
	 */
	public void waitForWebElementTobeVisible(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.globalWait));

		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	public void verifyTextIsMatching(By by, String expectedText) {
		wlib.waitForWebElementTobeVisible(by);

		WebElement element = driver.findElement(by);
		String actualText = element.getText();
		if (expectedText.equalsIgnoreCase(actualText)) {
			System.out.println("expectedText and actualText both are matching");
		} else {
			System.out.println("expectedText and actualText both are matching");
		}
	}

}
