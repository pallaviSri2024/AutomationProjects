package pageobjectReproLib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import Generic.ExcelLib;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import java.sql.Timestamp;
/**
 * 
 * 
 * 
 * @author Pallavi Srivastava
 *
 */

public class SignupLogin {
	
static String expectedErrorMessage = "The password that you've entered is incorrect. Forgotten password?";
	
	@FindBy(id = "sign-username")
	private WebElement supusername;

	@FindBy(id = "sign-password")
	private WebElement suppasswordEdit;

	@FindBy(className ="btn-primary")
	private WebElement SignupBtn;

	@FindBy(id = "loginusername")
	private WebElement sinusername;

	@FindBy(id = "loginpassword")
	private WebElement sinpasswordEdit;

	@FindBy(className ="btn-primary")
	private WebElement SigninBtn;
	

	public void Homepage1(WebDriver driver) throws Throwable
	{
		driver.get(Generic.Constants1.url);		
	}
	
	public void NavigatetoSignup(WebDriver driver) throws Throwable
	{
		driver.findElement(By.id("signin2")).click();
	}
	
	public void SignuptoApp(WebDriver driver) throws Throwable
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username")));
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		supusername.click();
		supusername.sendKeys(ExcelLib.getExcelData("Sheet1", 1, 3)+timestamp.getTime());
		suppasswordEdit.click();
		suppasswordEdit.sendKeys(ExcelLib.getExcelData("Sheet1", 1, 4));
		driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
		driver.findElement(By.id("login2")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));
		
		sinusername.click();
		sinusername.sendKeys(ExcelLib.getExcelData("Sheet1", 1, 3));
		sinpasswordEdit.click();
		sinpasswordEdit.sendKeys(ExcelLib.getExcelData("Sheet1", 1, 4));
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	}

}
	