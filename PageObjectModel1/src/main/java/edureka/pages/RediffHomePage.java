package edureka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RediffHomePage {
	
WebDriver driver;
	
	public RediffHomePage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.XPATH, using="/html/body/div[4]/div[1]/div/div[2]/a[2]") WebElement logoutLink;
	
	
	public void clickOnLogoutLink() {
		logoutLink.click();
	}


}
