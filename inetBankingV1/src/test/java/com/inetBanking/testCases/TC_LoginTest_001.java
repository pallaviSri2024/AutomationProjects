package com.inetBanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetBanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() {
		
		driver.get(baseURL);
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
			logger.info("Login is passed");
		}
		else {
			Assert.assertTrue(false);
			logger.info("Login is failed");
		}
		
	}
}
