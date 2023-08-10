package TestCases;

import org.testng.annotations.Test;

import PageObjectPck.LoginPageObject;

public class LoginTest extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
		Thread.sleep(2000);
		logger.info("Url is Open");
		LoginPageObject lp=new LoginPageObject(driver);
		Thread.sleep(2000);
		lp.setUserName(usernameBS);
		Thread.sleep(2000);
		logger.info("UserName is set");
		lp.setPassword(passwordBS);
		Thread.sleep(2000);
		logger.info("Password is set");
		lp.clickLogin();
		Thread.sleep(2000);
		logger.info("Test Case Passed");	
		
	}
	
}
