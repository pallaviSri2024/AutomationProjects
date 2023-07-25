package edureka.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import edureka.pages.RediffLoginPage;
import edureka.pages.RediffHomePage;

public class RediffLoginTest extends TestBase {
	
	@Test
	
	public void init() throws Exception {
		
		RediffLoginPage login = PageFactory.initElements(driver, RediffLoginPage.class);
		login.setEmail("palrit2023");
	
		login.setPassword("Password@123");
		login.clickOnLoginButton();
		
		RediffHomePage homepage = PageFactory.initElements(driver, RediffHomePage.class);
		Thread.sleep(4000);
		homepage.clickOnLogoutLink();
	}

}
