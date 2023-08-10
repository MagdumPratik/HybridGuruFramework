package TestCases;

import java.io.IOException;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;


import PageObjectPck.AddNewCustomerPage;
import PageObjectPck.LoginPageObject;

public class AddNewCustomerTest extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		
		LoginPageObject lp=new LoginPageObject(driver);
		driver.get(baseURL);
		logger.info("URL is open");
		lp.setUserName(usernameBS);
		logger.info("UserName is Set");
		lp.setPassword(passwordBS);
		logger.info("Password is Set");
		lp.clickLogin();	
		
		Thread.sleep(3000);
		
		AddNewCustomerPage addcust=new AddNewCustomerPage(driver);
		addcust.clickAddNewCustomer();
		addcust.custName("Pratik");
		addcust.custGender("male");
		addcust.custDOB("10", "12", "1998");
		Thread.sleep(4000);
		addcust.custAddress("INDIA");
		addcust.custCity("KOLHAPUR");
		addcust.custState("MAHARASHTRA");
		addcust.custPinCode("416230");
		addcust.cutMobNum("7768975647");
		

		String email=randomString()+"@gmail.com";
		addcust.custEmailId(email);
		addcust.custPassword("abcd");
		logger.info("All DAta Inserted");
		addcust.sutSubmit();
		Thread.sleep(4000);
		
		logger.info("Validation Started....");
		boolean res=driver.getPageSource().contains("Customer Registered");
				if(res==true)
				{
					Assert.assertTrue(true);
					logger.info("Test Case Pass");
				}
				else
				{
					captureScreenshot(driver,"LoginTest");
					Assert.assertTrue(false);
					logger.info("Test Case Fail");
				}
	}
	public static String randomString()
	{
		String generateString=RandomStringUtils.randomAlphabetic(4);
		return generateString;
	}
}
