package com.expenseondemand.pomrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home   {
	
	WebDriver driver;
	
	public Home(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver , this);
		
		}
	
	
	@FindBy(id="logout2")
	private WebElement LogoutLink;
	
	public WebElement getLogoutLink() {
		return LogoutLink;
		
	}
	
	
	public void getLogOut() throws InterruptedException {
		LogoutLink.click();
		
		//driver.findElement(By.xpath("//body/app[1]/section[1]/ng-component[1]/div[5]/div[1]/div[3]/span[1]/button[1]")).click();
		
		//driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
		
    		//Thread.sleep(2);

		//driver.findElement(By.xpath("/html/body/app/section/app-nav-menu/div[1]/div[1]/nav/div[2]/ul/li[7]/a/p/span[2]")).click();
		driver.quit();
	}
}
