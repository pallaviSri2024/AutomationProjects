package edureka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RediffLoginPage {
	
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.XPATH, using="//input[@id='login1']") WebElement emailTextBox;
	@FindBy(how=How.XPATH, using="//input[@id='password']") WebElement passwordTextBox;
	@FindBy(how=How.XPATH, using="//input[@type='submit'][@value='Sign in']") WebElement signinButton;
	
	public void setEmail(String strEmail) {
		emailTextBox.sendKeys(strEmail);
	}
		
	public void setPassword(String strPassword) {
		passwordTextBox.sendKeys(strPassword);
	}
	
	public void clickOnLoginButton() {
		signinButton.click();
	}

}
