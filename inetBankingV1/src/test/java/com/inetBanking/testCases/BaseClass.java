package com.inetBanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.PropertyConfigurator;
import freemarker.log.Logger;

public class BaseClass {
	
	public String baseURL="https://demo.guru99.com/v4/index.php";
	public String username="mngr513684";
	public String password="sadAmab";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		//to get the project directory use getProperty("user.dir)" followed by rest of the path
		System.setProperty("Webdriver.chrome.driver", System.getProperty("user,dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		Logger logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
