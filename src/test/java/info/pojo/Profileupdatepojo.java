package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Profileupdatepojo extends Reusableclass{
	
	public Profileupdatepojo() {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//input[contains(@formcontrolname,'firstName')]")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@formcontrolname='lastName']")
	public WebElement lastname;
	
	@FindBy(xpath="//input[@formcontrolname='location']")
	public WebElement location;
	
	@FindBy(xpath="//input[@formcontrolname='dateOfBirth']")
	public WebElement dob;
	
	@FindBy(xpath = "(//div[contains(.,'Select')])[15]")
	public WebElement code;
	
	@FindBy(xpath="//input[@formcontrolname='mobileNo']")
	public WebElement mblno;
	
	@FindBy(xpath="//input[@formcontrolname='emailID']")
	public WebElement mailid;
	
	@FindBy(xpath="//input[@formcontrolname='website']")
	public WebElement website;
	
	@FindBy(xpath = "//textarea[contains(@formcontrolname,'briefBiography')]")
	public WebElement bio;
	
	@FindBy(xpath="//img[contains(@alt,'User Name')]")
	public WebElement profile;
	
	@FindBy(xpath = "//a[contains(.,'Manage my Account')]")
	public WebElement managemyacc;
	
	@FindBy(xpath="//a[contains(.,'Logout')]")
	public WebElement profilelogout;
	
	@FindBy(xpath="//span[text()='logout']")
	public WebElement headerlogout;
	
	@FindBy(xpath="(//button[contains(.,'Save')])[1]")
	public WebElement save;
	
	@FindBy(xpath="(//button[text()=' Cancel '])[2]")
	public WebElement cancelin;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Change Password')]")
	public WebElement chngpwd;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	public WebElement crntpwd;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	public WebElement Newpwd;
	
	@FindBy(xpath = "(//input[@type='password'])[3]")
	public WebElement cnfrmpwd;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
	public WebElement savenewpwd;
	
	
	
	
	
	
	
	
	
	

}
