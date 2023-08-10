package PageObjectPck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	
	WebDriver ldriver;
	public AddNewCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement linkAddNewCustomer;
	
	@FindBy(name="name")
	WebElement textCustomerName;
	
	@FindBy(name="rad1")
	WebElement rGender;
	
	@FindBy(name="dob")
	WebElement txtDOB;
	
	@FindBy(name="addr")
	WebElement txtAddress;
	
	@FindBy(name="city")
	WebElement txtCityName;
	
	@FindBy(name="state")
	WebElement txtstate;
	
	@FindBy(name="pinno")
	WebElement txtPinCodeNumber;
	
	@FindBy(name="telephoneno")
	WebElement txtMobileNumber;
	
	@FindBy(name="emailid")
	WebElement textEmailID;
	
	@FindBy(name="password")
	WebElement textPassword;
	
	@FindBy(name="sub")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer()
	{
		linkAddNewCustomer.click();
	}
	
	public void custName(String cname) {
		textCustomerName.sendKeys(cname);
	}
	public void custGender(String cgender) {
		rGender.click();
	}
	public  void custDOB(String mm, String dd, String yy)
	{
		txtDOB.sendKeys(mm);
		txtDOB.sendKeys(dd);
		txtDOB.sendKeys(yy);
	}
	public void custAddress(String address) {
		txtAddress.sendKeys(address);
	}
	public void custCity(String city) {
		txtCityName.sendKeys(city);
	}
	public void custState(String state) {
		txtstate.sendKeys(state);
	}
	public void custPinCode(String pin) {
		txtPinCodeNumber.sendKeys(String.valueOf(pin));
	}
	public void cutMobNum(String mob) {
		txtMobileNumber.sendKeys(mob);
	}
	public void custEmailId(String email) {
		textEmailID.sendKeys(email);
	}
	public void custPassword(String pass) {
		textPassword.sendKeys(pass);
	}
	public void sutSubmit() {
		btnSubmit.click();
	}

}
