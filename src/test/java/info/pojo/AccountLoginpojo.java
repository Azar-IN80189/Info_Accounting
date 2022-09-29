package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;
	
public class AccountLoginpojo extends Reusableclass{
	
	public AccountLoginpojo()
	
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Email Address / Mobile Number']")
	public WebElement username;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/div/div/div/div[2]/div/div/form/div[2]/input")
	public WebElement password;
	
	@FindBy(xpath="//button[text()='LOGIN']")
	public WebElement submit;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/app-sidebar/app-sidebar-nav-custom/ul/li[1]/a")
	public WebElement organization;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/app-sidebar/app-sidebar-nav-custom/ul/li[1]/ul/li[1]/a")
	public WebElement Details;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/app-sidebar/div/div/div[2]")
	public WebElement admin;
	
	@FindBy(xpath="//a[text()='Manage my Account']")
	public WebElement manageacc;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[2]/div[1]/div/div/input")
	public WebElement firstname;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[2]/div[4]/div/div/input")
	public WebElement location;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[2]/div[6]/div/div/textarea")
	public WebElement Biography;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[2]/div[2]/div/div/input")
	public WebElement lastname;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[2]/div[5]/div/div/input")
	public WebElement Birthdate;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[4]/div[1]/div/div[1]/ngx-select/div/input")
	public WebElement cntrymbl;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[4]/div[1]/div/div[2]/input")
	public WebElement mblnum;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[4]/div[2]/div/div/input")
	public WebElement mailid;
	
	@FindBy(xpath="//button[text()=' Change Password ']")
	public WebElement chngpwd;
	
	@FindBy(xpath="(//button[text()=' Save '])[1]")
	public WebElement save;
	
	@FindBy(xpath="(//button[text()=' Cancel '])[1]")
	public WebElement cancel;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[2]/div/form/div/div[2]/div/div[1]/div[1]/div/input")
	public WebElement currentpwd;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[2]/div/form/div/div[2]/div/div[1]/div[2]/div/input")
	public WebElement newpwd;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[2]/div/form/div/div[2]/div/div[1]/div[3]/div/input")
	public WebElement confirmpwd;
	
	@FindBy(xpath="(//button[text()=' Save '])[2]")
	public WebElement saveforchangepwd;

	@FindBy(xpath="(//button[text()=' Cancel '])[2]")
	public WebElement cancelchangepwd;
	
	// Support Login Locators
	
	@FindBy(xpath = "//select[contains(@class,'form-control ng-pristine ng-valid ng-touched')]")
	public WebElement selectbox;
	
	@FindBy(xpath="//option[text()=' Normal User ']")
	public WebElement selectone;
	
	@FindBy(xpath="//button[text()=' Login ']")
	public WebElement Loginsupport;
	
	@FindBy(xpath="//div[text()='Forgot password?']")
	public WebElement Forgetpwd;
	
	@FindBy(xpath="//button[text()=' Change Password ']")
	public WebElement Changepwd;
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement Cngpwdaddressmail;
	
	@FindBy(xpath="//button[text()=' Send Reset Link ']")
	public WebElement Resetlink;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	public WebElement currentpwdone;
	
	@FindBy(xpath="//label[text()=' New Password ']")
	public WebElement newpwdone;
	
	@FindBy(xpath="(//input[@type='password'])[3]")
	public WebElement cnfrmpwd;
	
	@FindBy(xpath="(//button[text()=' Save '])[2]")
	public WebElement savein;
	
	@FindBy(xpath="(//button[text()=' Cancel '])[2]")
	public WebElement cancelin;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/app-sidebar/div")
	public WebElement profile;
	
	@FindBy(xpath = "//a[contains(.,'Manage my Account')]")
	public WebElement managemyacc;
	
	@FindBy(xpath="//a[contains(.,'Logout')]")
	public WebElement profilelogout;
	
	@FindBy(xpath = "(//span[contains(@class,'material-icons-outlined')])[9]")
	public WebElement headerlogout;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
