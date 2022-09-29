package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Forgot_Password_POJO extends Reusableclass
{
	public Forgot_Password_POJO() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//span[contains(.,'settings')]")
	public WebElement Settingsiconlink;
	
	@FindBy(xpath = "//a[contains(.,'supervised_user_circleUser & Roles')]")
	public WebElement Userroles;
	
	@FindBy(xpath = "//a[@href='/users/currentusers']")
	public WebElement Currentrole;
	
	@FindBy(xpath = "//div[@class='t-link'][contains(.,'Forgot password?')]")
	public WebElement forgotpasswordlink;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Enter Email Address or Mobile Number')]")
	public WebElement Emailenterforgot;
	
	@FindBy(xpath = "//button[contains(.,'Send Reset Link')]")
	public WebElement Sendresetlink;
	
	@FindBy(xpath = "//span[contains(.,'logout')]")
	public WebElement logoutbtn;
	
	
}