package PageObjectPck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver ldriver;
	public LoginPageObject(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement submit;
	
	@FindBy(xpath="//a[normalize-space()='Log out']")
	WebElement lnklogout;

	
	public void setUserName(String user)
	{
		username.sendKeys(user);
	}
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickLogin()
	{
		submit.click();
	}
	public void clicklogout()
	{
		lnklogout.click();
	}
}
