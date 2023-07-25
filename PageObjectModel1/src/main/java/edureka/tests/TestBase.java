package edureka.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public static WebDriver driver = null;
	
 @BeforeSuite
 
 public void initialize() {
	 
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\palri\\eclipse\\java-2023-03\\eclipse\\May27thCoreJava\\SeleniumAutomation1\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	 
 }
 
 
 @AfterSuite
 
 public void TearDownTest() {
	 TestBase.driver.quit();
 	}
 }
 

