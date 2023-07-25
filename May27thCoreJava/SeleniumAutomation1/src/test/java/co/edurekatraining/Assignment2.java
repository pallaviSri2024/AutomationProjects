package co.edurekatraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Setup the path for browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\palri\\eclipse\\java-2023-03\\eclipse\\CoreJavaConcepts\\SeleniumAutomation1\\Driver\\chromedriver.exe");
				
		//Step 2: Launch the browser
		WebDriver driver = new ChromeDriver();
				
		//Step 3: Launch the www.rediff.com website
				
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
				
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		//Inspect the “Money” element by class locator
		driver.findElement(By.className("moneyicon")).click();
		Thread.sleep(200);
		
		driver.navigate().back();
		
		//Inspect the “Money” element by xpath locator
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[2]")).click();
		Thread.sleep(200);
		driver.navigate().back();
		
		//Inspect the “Money” element by css locator locator
		driver.findElement(By.cssSelector("body  > div.logobar > div > div.cell.topicons > a.moneyicon.relative") ).click();
		Thread.sleep(200);
		driver.navigate().back();
		
		//Inspect all the text boxes- Inspect with name locator
		driver.findElement(By.name("sub_email_in_top")).isSelected();
		Thread.sleep(200);
				
		driver.findElement(By.id("sub_email_in_top")).isSelected();
		
		//Inspect the Rediffmail.com, enterprise email, videos, business email, shopping, 
		//sign in,and create an account
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();
		Thread.sleep(200);
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[3]")).click();
		Thread.sleep(200);
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[4]")).click();
		Thread.sleep(200);
		driver.navigate().back();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[5]")).click();
		Thread.sleep(200);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@id=\"red_container_main\"]/div[54]/p")).click();
		System.out.println("Completed Assignment2 part1");
		
	}

}
