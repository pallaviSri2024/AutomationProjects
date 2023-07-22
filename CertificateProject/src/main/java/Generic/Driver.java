package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * 
 * 
 * @author Pallavi Srivastava
 *
 */
public class Driver
{
	public static WebDriver driver;
	
	public static WebDriver getBrowser()
	{
		Constants1.browser.equalsIgnoreCase("chrome"); 
		
		System.setProperty("webdriver.chrome.driver", Constants1.driverpath1);
		
		// Step 2: launch the a light and empty browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
