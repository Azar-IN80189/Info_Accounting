package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Contacts_POJO extends Reusableclass{

	public Contacts_POJO() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='/contacts/contacts']")
	public WebElement ContactMenu;

	@FindBy(xpath = "//button[contains(.,'add  Add Customer/Supplier')]")
	public WebElement AddCustomersupplierbtn;

	@FindBy(xpath = "//input[@formcontrolname='contactName']")
	public WebElement contactName;

	@FindBy(xpath = "//input[@formcontrolname='companyName']")
	public WebElement companyName;

	@FindBy(xpath = "//input[@formcontrolname='accountNumber']")
	public WebElement accountNumber;

	//primary person details entering

	@FindBy(xpath = "//input[@formcontrolname='firstName']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@formcontrolname='lastName']")
	public WebElement lastName;

	@FindBy(xpath = "//input[@formcontrolname='email']")
	public WebElement email;

	@FindBy(xpath = "//input[@formcontrolname='phoneNo']")
	public WebElement phoneNo;

	//phone number details

	@FindBy(xpath = "//input[@formcontrolname='phoneCountryCode']")
	public WebElement Countrycode;

	@FindBy(xpath = "//input[@formcontrolname='phoneAreaCode']")
	public WebElement Areacode;

	@FindBy(xpath = "//input[@formcontrolname='phone']")
	public WebElement Phonenumber;

	//mobile number details

	@FindBy(xpath = "//input[@formcontrolname='mobileCountryCode']")
	public WebElement mobileCountryCode;

	@FindBy(xpath = "//input[@formcontrolname='mobileAreaCode']")
	public WebElement mobileAreaCode;

	@FindBy(xpath = "//input[@formcontrolname='mobile']")
	public WebElement mobilenumber;

	//direct number details

	@FindBy(xpath = "//input[@formcontrolname='directDialCountryCode']")
	public WebElement directDialCountryCode;

	@FindBy(xpath = "//input[@formcontrolname='directDialAreaCode']")
	public WebElement directDialAreaCode;

	@FindBy(xpath = "//input[@formcontrolname='directDial']")
	public WebElement directDial;

	//fax details

	@FindBy(xpath = "//input[@formcontrolname='faxCountryCode']")
	public WebElement faxCountryCode;

	@FindBy(xpath = "//input[@formcontrolname='faxAreaCode']")
	public WebElement faxAreaCode;

	@FindBy(xpath = "//input[@formcontrolname='fax']")
	public WebElement fax;

	//other social enters

	@FindBy(xpath = "//input[@formcontrolname='skype']")
	public WebElement skypetxt;

	@FindBy(xpath = "//input[@formcontrolname='website']")
	public WebElement websitetxt;

	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	public WebElement Contactgroup;

	@FindBy(xpath = "//span[contains(.,'Customer')]")
	public WebElement Customerselect;

	@FindBy(xpath = "//span[contains(.,'Supplier')]")
	public WebElement Supplierselect;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[1]")
	public WebElement Savebtn;
	
	@FindBy(xpath = "(//button[contains(.,'Cancel')])[1]")
	public WebElement Cancelbtn;
	
	@FindBy(xpath = "(//button[contains(.,'Next')])[1]")
	public WebElement Nextbtn;
	
	//Address Details tab
	
	@FindBy(xpath = "//a[contains(.,'Address Details')]")
	public WebElement AddressDetailstab;
	
	@FindBy(xpath = "//input[@formcontrolname='postalAddrAttention']")
	public WebElement postalAddrAttention;
	
	@FindBy(xpath = "//textarea[@formcontrolname='postalAddress']")
	public WebElement postalAddress;
	
	@FindBy(xpath = "//input[@formcontrolname='postalCity']")
	public WebElement postalCity;
	
	@FindBy(xpath = "//input[@formcontrolname='postalState']")
	public WebElement postalState;
	
	@FindBy(xpath = "//input[@formcontrolname='postalZipCode']")
	public WebElement postalZipCode;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[2]")
	public WebElement countrydd;
	
	@FindBy(xpath = "//label[contains(.,'Same as postal address')]")
	public WebElement Sameaspostaladdresschkbox;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
	public WebElement SavebtnAddressDetails;
	
	@FindBy(xpath = "(//button[contains(.,'Next')])[2]")
	public WebElement Nextbtn2;
	
	//Financial Details tab
	
	@FindBy(xpath = "//a[contains(.,'Financial Details')]")
	public WebElement FinancialDetailstab;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[4]")
	public WebElement SalesSettingDD;
	
	@FindBy(xpath = "//input[@formcontrolname='busRegNumber']")
	public WebElement RegNumbertxt;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[5]")
	public WebElement SalesAccountDD;
	
	@FindBy(xpath = "//input[@formcontrolname='peppoID']")
	public WebElement peppoID;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[6]")
	public WebElement PurchaseSettingDD;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[7]")
	public WebElement PurchaseAccountDD;
	
	@FindBy(xpath = "//input[@formcontrolname='crdLimitAmount']")
	public WebElement crdLimitAmounttxt;
	
	@FindBy(xpath = "//input[@formcontrolname='taxIDNumber']")
	public WebElement TaxIDtxt;
	
	@FindBy(xpath = "//label[@for='chkcrdLimitBlock']")
	public WebElement CardLimitChkbox;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[8]")
	public WebElement DefaultSalestaxDD	;
	
	@FindBy(xpath = "//input[@formcontrolname='salesDiscount']")
	public WebElement SalesDiscount;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[9]")
	public WebElement DefaultpurchasetaxDD;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[10]")
	public WebElement CurrencyDD;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[11]")
	public WebElement PurchaseThemeDD;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[12]")
	public WebElement PaymentModeDD;
	
	@FindBy(xpath = "//input[@formcontrolname='billsDueDateDays']")
	public WebElement BillDueDateNum;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[13]")
	public WebElement BillDueDateDD;
	
	@FindBy(xpath = "//input[@formcontrolname='invoiceDueDateDays']")
	public WebElement invoiceDueDateDaysNum;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[14]")
	public WebElement invoiceDueDateDaysDD;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[15]")
	public WebElement InvoiceTheme;
	
	@FindBy(xpath = "//button[contains(.,'Terms & Condition')]")
	public WebElement Termsandconditionbox;
	
	@FindBy(xpath = "//a[contains(.,'+ Add New Terms & Condition')]")
	public WebElement AddNewTermsCondition;
	
	@FindBy(xpath = "//input[@formcontrolname='TermsTitle']")
	public WebElement TitleEnter;
	
	@FindBy(xpath = "/html/body/app-dashboard/div[1]/div/main/div/app-newcontact/div/div/div/div/div/form/div[2]/div/div[3]/div[1]/div[2]/app-contact-terms-condition/app-add-contact-tc/div/div/form/div/div[2]/div[2]/quill-editor/div[2]/div[1]/div")
	public WebElement EnterDescriptionTerms;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[3]")
	public WebElement SavebtnTerms;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[4]")
	public WebElement SavebtnFinancialDetails;
	
	//search //verify //Delete
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[1]")
	public WebElement SearchboxContacts;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement Selectallchkbox;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-out-info')]")
	public WebElement MoreOptionscontact;
	
	@FindBy(xpath = "//a[contains(.,'Archive')]")
	public WebElement Archiveselect;
	
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	public WebElement Deleteselect;
	
	@FindBy(xpath = "//button[contains(.,'Archive')]")
	public WebElement OkArchive;
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public WebElement OkDelete;
	
	@FindBy(xpath = "//a[contains(.,'Restore')]")
	public WebElement Restoreselect;
	
	//All-Tab sections
	
	@FindBy(xpath = "(//a[@role='tab'])[1]")
	public WebElement Alltab;
	
	@FindBy(xpath = "(//a[@role='tab'])[2]")
	public WebElement Customertab;
	
	@FindBy(xpath = "(//a[@role='tab'])[3]")
	public WebElement Suppliertab;
	
	@FindBy(xpath = "(//a[@role='tab'])[4]")
	public WebElement Archievetab;
	
	//Manage contact group
	
	
	@FindBy(xpath = "//button[contains(.,'add  Manage Contact Groups')]")
	public WebElement AddManagecontactgroup;
	
	@FindBy(xpath = "//input[@formcontrolname='ContactGroupName']")
	public WebElement Addcontactgroupname;
	
	@FindBy(xpath = "//button[contains(.,'add  Add Group')]")
	public WebElement Addgroupbtn;
	
	@FindBy(xpath = "(//a[@class='t-link edit'])[13]")
	public WebElement Contactgroupedit;
	
	@FindBy(xpath = "(//div[@role='gridcell'])[55]")
	public WebElement Contactgroupeditdelete;
	
	@FindBy(xpath = "(//div[contains(.,'x')])[27]")
	public WebElement DeletetriggerContactgroupedit;
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public WebElement OkDeletetriggerContactgroupedit;
	
	//Manage contact group
	
	@FindBy(xpath = "//button[contains(.,'add  Manage Contact Groups')]")
	public WebElement ManagecontactgroupBtn_COA;
	
	@FindBy(xpath = "//input[@formcontrolname='ContactGroupName']")
	public WebElement ContactGroupNametxt_COA;
	
	@FindBy(xpath = "//button[contains(.,'add  Add Group')]")
	public WebElement AddGroupBtn_COA;
	
	@FindBy(xpath = "(//div[@role='gridcell'])[55]")
	public WebElement Editclickgroupname_COA;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement Edittypeclick_COA;
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public WebElement DeleteBtnOk_COA;
	
	@FindBy(xpath = "(//button[contains(.,'Cancel')])[1]")
	public WebElement CancelBtn_COA;
	
	@FindBy(xpath = "(//div[@class='text-center'])[3]")
	public WebElement DeletexBtnpop_COA;
	
	//POP-UP
	@FindBy(xpath = "//button[contains(.,'X')]")
	public WebElement PopupClose_COA;
}
