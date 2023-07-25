package co.edureka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoqa.com/login");

		//First test case for valid login
		//Finding the web elements and passing the values
		driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
		driver.findElement(By.id("password")).sendKeys("Password@123");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(5000);

		//Capture the page heading and print on console
		System.out.println("The page heading is --- " +driver.findElement(By.xpath("//div[@class=\"main-header\"]")).getText());
		
		//Logout from the session
		driver.findElement(By.id("submit")).click();
		
		
		//Second test case for invalid login credentials
		driver.findElement(By.id("userName")).sendKeys("abdc");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("login")).click();
		
		String expectedURL = "https://www.demoqa.com/login";
		String actualURL = driver.getCurrentUrl();
		
		if(actualURL.equalsIgnoreCase(expectedURL))
			System.out.println("Test passed !!!!");
		else
			System.out.println("Test failed");
		
		//Closing browser session
		driver.quit();

	
		

	}

}
