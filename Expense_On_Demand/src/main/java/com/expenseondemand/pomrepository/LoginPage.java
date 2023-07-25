package com.expenseondemand.pomrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.expenseondemand.genericUtility.FileUtility;
import com.expenseondemand.genericUtility.WebDriverUtility;

public class LoginPage extends WebDriverUtility{

	WebDriver driver;
	//public WebDriverUtility wdu = new WebDriverUtility();

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id = "loginusername")
	private WebElement eMailEdt;

	@FindBy(id = "loginpassword")
	private WebElement userPasswordEdt;

	@FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	private WebElement loginBtn;

	public WebElement getUserNameEdt() {
		return eMailEdt;

	}

	public WebElement getUserPasswordEdt() {
		return userPasswordEdt;

	}

	public WebElement getLoginBtn() {
		return loginBtn;

	}
	

	public void loginToApp(String url, String username, String password) throws Throwable {

		FileUtility data = new FileUtility();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("login2")).click();
		eMailEdt.sendKeys(username);
		userPasswordEdt.sendKeys(password);
		loginBtn.click();
		driver.findElement(By.xpath("//button[text()=' Close ']")).click();
		
        
	}
	      
}

   