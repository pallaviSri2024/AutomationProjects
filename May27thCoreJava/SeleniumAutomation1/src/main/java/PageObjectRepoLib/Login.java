package PageObjectRepoLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Generic.Constants;
import Generic.Driver;
import Generic.ExcelLib;
import Generic.WebDriverCommonLib;


public class Login {

	//WebDriverCommonLib webLib = new WebDriverCommonLib();
	WebDriver driver = Driver.getBrowser();
	
	static String expectedErrorMessage = "The password that you've entered is incorrect. Forgotten password?";

	@FindBy(id = "email")
	private WebElement usernameEdit;

	@FindBy(id = "pass")
	private WebElement passwordEdit;

	@FindBy(name = "login")
	private WebElement LoginBtn;

	@FindBy(xpath = "//div[@id='loginform']//div[@class='_9ay7']")
	private WebElement actualtext;

	@FindBy(xpath = "//img[@alt= 'Facebook']")
	private WebElement FacobookLogo;

	public void loginToApp(WebDriver driver) throws Exception {
		driver.get(Constants.url);
		//webLib.maximize();
		usernameEdit.click();
		usernameEdit.sendKeys(ExcelLib.getExcelData("Sheet1", 1, 3));
		passwordEdit.click();
		passwordEdit.sendKeys(ExcelLib.getExcelData("Sheet1", 1, 4));
		LoginBtn.click();
	}

	public void forgottenPassword(String email) {
		
		// Code - logic------
	}

	public void createNewAccount() {

	}

	public void createNewPage() {

	}
	
	public void verifyErrorMessage() {
		//System.out.println(actualtext.getText());
		
		if(expectedErrorMessage.equalsIgnoreCase(actualtext.getText()))
		{
			System.out.println("Error Messages are matching");
		} else {
			System.out.println("Error Messages are not matching");
		}
	}

}
