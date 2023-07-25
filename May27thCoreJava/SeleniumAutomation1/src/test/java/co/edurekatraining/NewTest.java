package co.edurekatraining;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.testng.asserts.SoftAssert;


public class NewTest {
	
	//String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\java selenium\\chromedriver.exe";
    WebDriver driver; 
    String expected = null;
    String actual = null;
	private String actualRersult;
	private String expectedResult;

   
  @BeforeMethod
 
	  public void beforeMethod() throws InterruptedException {
          System.out.println("launching Chrome browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          Thread.sleep(2000);
          driver = new ChromeDriver();
         
          driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();
      }
  
  @Test
  
  	public void methodOne() throws InterruptedException {
	  
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertAll();
	  WebElement Username = driver.findElement(By.name("email"));
	  Username.sendKeys("palrit2019@gmail.com");
	  Thread.sleep(2000);
	  //WebElement Password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	  //String ExpectedText = “abc”;
	  //Assert.assertEquals(ExpectedText, Password.getText());
	  //System.out.println(“Password text is a expected – Assert passed”);
	  
	  WebElement Password = driver.findElement(By.name("pass"));
	  Assert.assertEquals(true, Username.isEnabled()); 
	  System.out.println("Login button is enabled- Assert Passed");
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
