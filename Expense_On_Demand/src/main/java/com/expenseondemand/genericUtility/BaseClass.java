package com.expenseondemand.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.expenseondemand.pomrepository.Home;
import com.expenseondemand.pomrepository.LoginPage;

/**
 * 
 * @author Pallavi Srivastava
 * 
 */
public class BaseClass {

	public static WebDriver sDriver;
	public WebDriver driver = null;

	//public ExcelUtility exls = new ExcelUtility();
	public FileUtility data = new FileUtility();

	//public WebDriverUtility wdu = new WebDriverUtility();

	//public JavaUtility j = new JavaUtility();
	LoginPage lp = new LoginPage(driver);

//@Parameters("browser")
	@BeforeClass()
	public void launchBrowser() throws Throwable {

		String browser = data.getPropertyFromKeyValue("browser");

		if (browser.equals("chrome")) {

			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {

			driver = new FirefoxDriver();

		}
		//wdu.WaitForPageToLoad(driver);
		driver.manage().window().maximize();
	}

	@BeforeMethod()
	public void loginApp() throws Throwable {
		String username = data.getPropertyFromKeyValue("username");
		String password = data.getPropertyFromKeyValue("password");
		String url = data.getPropertyFromKeyValue("url");

		sDriver = driver;
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(url, username, password);
	}
	
	@AfterMethod()
	public void logout() throws InterruptedException {

	}

}
