package keywordDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Constants;

public class Action_keyword {
	
	public static WebDriver driver;
	
	public void openBrowser()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\palri\\eclipse\\java-2023-03\\eclipse\\FirstTestngProject\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	public void navigate()
	{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(Constants.URL); 
	}
	public void enterEmail()
	{
		driver.findElement(By.xpath("//*[@id=\"eMail\"]")).sendKeys(Constants.username);
	
	}
	public void enterPassword()
	{
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Constants.password);
	}
	public void Login()
	{
	driver.findElement(By.xpath("//*[@id=\"setting-wizard-new\"]/div/div[2]/form[1]/div/div/div/div[3]/button")).click();
	}
	
	public void closeBrowser()
	{
	driver.quit();
	}
}
