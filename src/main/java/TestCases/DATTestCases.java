package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectPck.LoginPageObject;

public class DATTestCases extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void loginDAT(String user, String pwd) throws InterruptedException
	{
		driver.get(baseURL);
		logger.info("Url is open successfully");
		LoginPageObject lp=new LoginPageObject(driver);
		lp.setUserName(user);
		logger.info("UserName is set");
		lp.setPassword(pwd);
		logger.info("Password is set");
		lp.clickLogin();
		
		if(alertIsPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login FAiled");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login Passed");
			Thread.sleep(3000);
			lp.clicklogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
	}
	public boolean alertIsPresent()
	{
		try {
			driver.switchTo().alert();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String ExcelFilePath=System.getProperty("user.dir") + "\\LoginData1.xlsx\\";

		int rownum=xl.getRowCount(ExcelFilePath, "Sheet1");
		int colcount=xl.getCellCount(ExcelFilePath, "Sheet1", 1);
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			
			for(int c=0;c<colcount;c++)
			{
				logindata[i-1][c]=xl.getCellData(ExcelFilePath, "Sheet1", i, c);
				
			}
		}
		return logindata;
	}
}
