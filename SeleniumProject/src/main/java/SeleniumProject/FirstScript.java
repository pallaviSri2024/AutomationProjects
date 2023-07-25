package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\palri\\eclipse\\java-2023-03\\eclipse\\SeleniumProject\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://selenium.dev");
		System.out.println(driver.getTitle());
		driver.quit();
	

	}

}
