package co.edurekatraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2a {

	public static void main(String[] args) throws InterruptedException {
	
		// Step 1: Setup the path for browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\palri\\eclipse\\java-2023-03\\eclipse\\CoreJavaConcepts\\SeleniumAutomation1\\Driver\\chromedriver.exe");
						
		//Step 2: Launch the browser
		WebDriver driver = new ChromeDriver();
						
		//Step 3: Launch the www.rediff.com website
						
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[1]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[2]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		

	}

}
