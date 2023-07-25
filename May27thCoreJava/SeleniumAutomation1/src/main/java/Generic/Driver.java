package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver driver;
	
	public static WebDriver getBrowser() {

		if(Constants.browser.equalsIgnoreCase("chrome")) {
			// Step 1: Setup the path for browser
			System.setProperty("webdriver.chrome.driver", Constants.driverpath);

			// Step 2: launch the a light and empty browser
			driver = new ChromeDriver();

		} else if(Constants.browser.equalsIgnoreCase("firefox")) {
			// Step 1: Setup the path for browser
			// Step 2: launch the a light and empty browser
		}
		else if(Constants.browser.equalsIgnoreCase("Safari")) {
			// Step 1: Setup the path for browser
			// Step 2: launch the a light and empty browser
		}
	
	
	return driver;
	
	}

}
