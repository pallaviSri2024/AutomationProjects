package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	public static WebDriver driver;
	
	public static WebDriver getBrowser() {

		Constants.browser.equalsIgnoreCase("chrome"); 
			
			System.setProperty("webdriver.chrome.driver", Constants.driverpath);

			// Step 2: launch the a light and empty browser
			driver = new ChromeDriver();

		return driver;
	
	
	}

}
