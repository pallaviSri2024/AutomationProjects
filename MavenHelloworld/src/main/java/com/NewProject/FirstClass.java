package com.NewProject;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty( 
	            "webdriver.chrome.driver", 
	            "C:\\Users\\PallaviSrivastava\\eclipse-workspace\\MavenHelloworld\\Driver\\chromedriver.exe"); 
	  
	        ChromeDriver driver = new ChromeDriver(); 
	  
	        // Maximize the browser 
	        // using maximize() method 
	        driver.manage().window().maximize(); 
	  
	        // Launching website 
	        driver.get("https://www.google.com/"); 
	       // driver.wait(1000000);
	        driver.quit();
	        System.out.println("This is my Maven project");
	        
	}

}
