package WebDriverAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverAPI {

	public static void main(String[] args) {
		// Step 1: Set up the path for browser
		
		System.setProperty("webdriver.chrome.driver", "..\\May27thAutomation\\Drivers\\chromedriver.exe");
		
		//Step2: Launch the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

	}

}
