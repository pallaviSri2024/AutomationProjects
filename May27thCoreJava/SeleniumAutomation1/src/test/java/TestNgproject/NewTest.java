package TestNgproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {
	
	
    
@BeforeSuite
public void A()
{   
     System.out.println("This is BeforeSuite annotation method");
}

@BeforeTest
public void B()
{
	System.out.println("This is BeforeTest annotation method");
    
}

@BeforeClass
public void C()
{
	System.out.println("This is BeforeClass annotation method");
}

@BeforeMethod
public void checkLogin()
{
	System.out.println("This is BeforeMethod annotation method");
}

@Test
public void Method1() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
    Thread.sleep(6000);
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    Thread.sleep(6000);
    driver.getTitle();
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("palrit2018@gmail.com");
    Thread.sleep(6000);
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("ABC123");
    driver.quit();
}

@Test
public void Method2() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
    Thread.sleep(6000);
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.getTitle();
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("selenium webdriver cucumber");
    driver.quit();
}

@Test
public void Method3() throws InterruptedException
{
	WebDriver driver = new FirefoxDriver();
    Thread.sleep(6000);
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(18000, TimeUnit.SECONDS);
    driver.getTitle();
    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("selenium testing");
    driver.quit();
}

@AfterMethod
public void E() {
	System.out.println("This is AfterMethod annotation method");
}

@AfterClass
public void F()
{
    //driver.quit();
    //System.out.println("The close_up process is completed");
}

@AfterTest
public void reportReady()
{
    System.out.println("This is AfterTest annotation method");
}

@AfterSuite
public void cleanUp()
{
     System.out.println("All close up activities completed");
}

}