package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class organizationpojo extends Reusableclass {
	
	public organizationpojo() {

		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()=' Organization']")
	public WebElement organaization;
	
	@FindBy(xpath="//a[text()='Details ']")
	public WebElement details;
	
	@FindBy(xpath="//input[@formcontrolname='displayName']")
	public WebElement displayname;
	
	@FindBy(xpath = "//input[contains(@autocomplete,'a01cc421e6d4')]")
	public WebElement company;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'legalName')]")
	public WebElement legalname;
	
	@FindBy(xpath = "(//div[contains(@class,'col-sm-6')])[2]")
	public WebElement lineofbusiness;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	public WebElement lineinput;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'registrationNo')]")
	public WebElement regno;
	
	@FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[1]")
	public WebElement organaizationtype;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[8]")
	public WebElement attention;
	
	@FindBy(xpath = "(//textarea[contains(@rows,'3')])[2]")
	public WebElement postaladd;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[9]")
	public WebElement city;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[9]")
	public WebElement state;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[11]")
	public WebElement zipcode;
	
	@FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[3]")
	public WebElement country;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[18]")
	public WebElement telephone1;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[20]")
	public WebElement telephone2;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[22]")
	public WebElement mblphone;
	
	@FindBy(xpath = "(//input[@type='text'])[24]")
	public WebElement DDIno;
	
	@FindBy(xpath = "(//input[@type='text'])[25]")
	public WebElement website;
	
	@FindBy(xpath = "(//input[@type='text'])[26]")
	public WebElement fbid;
	
	@FindBy(xpath = "(//input[@type='text'])[27]")
	public WebElement emailid;
	
	@FindBy(xpath = "(//input[@type='text'])[28]")
	public WebElement watsapp;
	
	@FindBy(xpath = "(//input[@type='text'])[30]")
	public WebElement skype;
	
	@FindBy(xpath = "(//input[@type='text'])[31]")
	public WebElement twitter;
	
	@FindBy(xpath = "//label[contains(@for,'chkphysical')]")
	public WebElement chkbox;
	
	@FindBy(xpath = "//label[@for='chkphysical'][contains(.,'Same as postal address')]")
	public WebElement Physicaladdress;
	
	@FindBy(xpath = "//button[contains(.,'Save')]")
	public WebElement save;
	
	
	
	
	
	

}
