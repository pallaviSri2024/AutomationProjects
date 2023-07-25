package WebDriverAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverAPI {

	public static void main(String[] args) {
		// Step 1: Setup the path for browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\palri\\eclipse\\java-2023-03\\eclipse\\May27thCoreJava\\SeleniumAutomation1\\Driver\\chromedriver.exe");
		
		//Step 2: Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Step 3: Open google url
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
	}

}
