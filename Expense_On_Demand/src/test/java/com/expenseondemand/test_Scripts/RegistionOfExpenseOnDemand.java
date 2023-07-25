package com.expenseondemand.test_Scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class RegistionOfExpenseOnDemand {
	
	WebDriver driver;
	String Username = "Pald";
	String Password ="Pasword123";
	//String email_Id = "sunitamaman@yopmail.com";
	
	
	
	public void doRegistrationOn_EOD() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("signin2")).click();
		driver.findElement(By.id("sign-username")).sendKeys(Username);
		driver.findElement(By.id("sign-password")).sendKeys(Password);
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
        
        // Step 7: Launch URL:https://demoqa.com/browser-windows
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/browser-windows");
        //driver.manage().window().maximize();
		
		
	
		
		
	}
}
