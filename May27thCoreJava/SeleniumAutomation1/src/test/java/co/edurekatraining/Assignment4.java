package co.edurekatraining;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import dev.failsafe.internal.util.Assert;


public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: Setup the path for browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\palri\\eclipse\\java-2023-03\\eclipse\\CoreJavaConcepts\\SeleniumAutomation1\\Driver\\chromedriver.exe");
						
		//Step 2: Launch the browser
		WebDriver driver = new ChromeDriver();
						
		//Step 3: Launch the www.rediff.com website
						
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
		//Step 4: CLick on Sign In button
		
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		
		//Step 5: Click on Sign In button of Login page
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div[2]/form/div[1]/div[2]/div[2]/div[2]/div/input[2]")).click();

		//Step 6: Validate the alert and close the alert.
		// Switching to Alert        
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message.    
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message		
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
        
        // Step 7: Launch URL:https://demoqa.com/browser-windows
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/browser-windows");
        //driver.manage().window().maximize();
        
        //Step 8: Click on New Tab, New Window,and New Window Message.
        
        // Open new child window within the main window
        driver.findElement(By.id("tabButton")).click();
        driver.findElement(By.id("windowButton")).click();
              
        String MainWindow = driver.getWindowHandle();
        System.out.println("Main window handle is " + MainWindow);

        // To handle all new opened window
        Set<String> s1 = driver.getWindowHandles();
        System.out.println(driver.getWindowHandles().size());
        System.out.println("Child window handle is" + s1);
        Iterator<String> i1 = s1.iterator();

        // Here we will check if child window has other child windows and when child window
        //is the main window it will come out of loop.
          while (i1.hasNext()) {
              String ChildWindow = i1.next();
              if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                  driver.switchTo().window(ChildWindow);
                  WebElement text1 = driver.findElement(By.id("sampleHeading"));
                  System.out.println("Heading of child window is " + text1.getText());
                  
                 
               }
              
           }
          
      }
}
       
	

	

	


