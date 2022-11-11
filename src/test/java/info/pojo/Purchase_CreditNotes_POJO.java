package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Purchase_CreditNotes_POJO extends Reusableclass {

	public Purchase_CreditNotes_POJO() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//li[@class='nav-item nav-dropdown open'])[1]")
	public WebElement Dropdownexpanded;

	@FindBy(xpath = "(//li[@class='nav-item nav-dropdown'])[1]")
	public WebElement Dropdownclosed;
	
	@FindBy(xpath = "//a[contains(.,'shopping_bag Purchase')]")
	public WebElement Purchaseslide;


	@FindBy(xpath = "//a[@href='/purchase/creditnotes/creditnotes']")
	public WebElement CreditNotesslide;

	@FindBy(xpath = "//button[contains(.,'add  New Credit Notes')]")
	public WebElement NewCreditNotesbtn;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	public WebElement Contacttxtbox;

	@FindBy(xpath = "//input[@formcontrolname='CreditnotesDate']")
	public WebElement CreditnoteDatebox;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	public WebElement Referencetxtbox;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement CurrencyDD;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement AmountsareDD;

	@FindBy(xpath = "(//td[@style='width: 150px; max-width: 150px; text-align: left;'])[1]")
	public WebElement item1select;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement item1txtenter;


	@FindBy(xpath = "(//td[@style='width: 150px; max-width: 150px; text-align: left;'])[3]")
	public WebElement item2select;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement item2txtenter;

	@FindBy(xpath = "//button[contains(.,'add  Add New Lines')]")
	public WebElement addnewlinesbtn;

	@FindBy(xpath = "(//button[@type='button'])[39]")
	public WebElement Savebtn;

	@FindBy(xpath = "//button[contains(.,'Approve')]")
	public WebElement Approvebtn;

	@FindBy(xpath = "(//i[@class='fa fa-trash'])[3]")
	public WebElement thirdrowtrash;

	@FindBy(xpath = "(//button[contains(.,'Cancel')])[6]")
	public WebElement cancelbtn;

	@FindBy(xpath = "//div[@role='option']")
	public WebElement Selectoptioncurrencies;

	@FindBy(xpath = "//button[contains(.,'OK')]")
	public WebElement Okbtn;

	@FindBy(xpath = "(//a[@role='tab'])[2]")
	public WebElement draftstab;

	@FindBy(xpath = "(//a[@role='tab'])[3]")
	public WebElement Awaitingapprovaltab;

	@FindBy(xpath = "(//a[@role='tab'])[4]")
	public WebElement Awaitingpaymenttab;

	@FindBy(xpath = "(//a[@role='tab'])[5]")
	public WebElement Paidtab;

	@FindBy(xpath = "(//input[@type='checkbox'])[7]")
	public WebElement draftchkbox;

	@FindBy(xpath = "//button[contains(.,'done Approve')]")
	public WebElement Approvebtndraft;

	@FindBy(xpath = "//span[contains(.,'clear')]")
	public WebElement Deletebtndraft;

	@FindBy(xpath = "//button[contains(.,'how_to_reg Submit for approval')]")
	public WebElement Submitforapprovalbtndraft;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement okpopupdraft;

	@FindBy(xpath = "(//input[@type='checkbox'])[7]")
	public WebElement Awaitingapprovalchkbox;

	@FindBy(xpath = "//button[contains(.,'done Approve')]")
	public WebElement ApprovebtnAwaitingapproval;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement Okbtnawaitingapproval;

	@FindBy(xpath = "(//div[@role='gridcell'])[1]")
	public WebElement gridcell1awaitingpayment;

	@FindBy(xpath = "//input[@placeholder='dd-mm-yyyy']")
	public WebElement Dateawaitingpayment;

	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[8]")
	public WebElement Paidtoawaitingpayment;

	@FindBy(xpath = "(//div[@role='option'])[1]")
	public WebElement Selectpaidtoawaitingpayment;

	@FindBy(xpath = "(//a[contains(.,'Credit Notes')])[3]")
	public WebElement CreditNoteslabel;

	@FindBy(xpath = "//input[@id='BankExRate']")
	public WebElement Exchangerate;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement PriorityDD;

	@FindBy(xpath = "(//input[contains(@name,'formItem.id')])[2]")
	public WebElement test2txtbox;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	public WebElement costcentreDD;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	public WebElement testtxtbox;

	@FindBy(xpath = "(//input[@type='text'])[20]")
	public WebElement paymentmodeawaitingpayment;

	@FindBy(xpath = "(//div[@class='d-flex justify-content-between ng-star-inserted'])[1]")
	public WebElement paymentmodeselectawaitingpayment;

	@FindBy(xpath = "(//input[@type='text'])[21]")
	public WebElement referencetxtawaitingpayment;

	@FindBy(xpath = "//button[contains(.,'Add Refund')]")
	public WebElement Addrefundbtnawaitingpayment;

	@FindBy(xpath = "//button[contains(.,'OK')]")
	public WebElement okpopupafterrefundawaitingpayment;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	public WebElement ChooseContactDD;

	@FindBy(xpath = "//input[contains(@name,'d2')]")
	public WebElement Date;

	@FindBy(xpath = "(//input[contains(@type,'text')])[7]")
	public WebElement ReferenceName;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement CurrencyDD1;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement Amountsare;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	public WebElement ThemeDD;

	@FindBy(xpath = "(//td[@style='width: 150px; max-width: 150px; text-align: left;'])[1]")
	public WebElement items1table;

	@FindBy(xpath = "(//input[contains(@type,'text')])[11]")
	public WebElement items1tabletxt;

	@FindBy(xpath = "//button[contains(.,'addAdd New Lines')]")
	public WebElement Addnewlinesbtn;

	@FindBy(xpath = "//textarea[@id='deliveryInstruction']")
	public WebElement DeliveryInstructionstxt;

	@FindBy(xpath = "//button[contains(.,'Approve')]")
	public WebElement ApproveBtn;

	@FindBy(xpath = "(//button[@type='button'][contains(.,'Save')])[3]")
	public WebElement SaveBtn;

	@FindBy(xpath = "(//button[contains(.,'Split button!')])[2]")
	public WebElement Approvesplitarrow;

	@FindBy(xpath = "//a[contains(.,'Approve & Add Another')]")
	public WebElement Approveandaddanother;

	@FindBy(xpath = "//a[contains(.,'Approve & print')]")
	public WebElement Approveandprint;

	@FindBy(xpath = "(//button[contains(.,'Split button!')])[3]")
	public WebElement Savesplitarrow;

	@FindBy(xpath = "//a[contains(.,'Save continue editing')]")
	public WebElement Saveandcontinueediting;

	@FindBy(xpath = "//a[contains(.,'Save & submit for approval')]")
	public WebElement Saveandsubmitforapproval;

	@FindBy(xpath = "//a[contains(.,'Save & add another')]")
	public WebElement Saveandaddanother;



	@FindBy(xpath = "(//div[contains(.,'Add Note')])[12]")
	public WebElement Addnoteclick;

	@FindBy(xpath = "//textarea[@id='textarea-notes']")
	public WebElement Notesdescription;

	@FindBy(xpath = "(//button[contains(.,'Save')])[4]")
	public WebElement SaveBtnnotes;

	@FindBy(xpath = "//a[@href='/sales/creditnotes'][contains(.,'Credit Notes')]")
	public WebElement CreditNoteScreen;

	@FindBy(xpath = "//span[contains(.,'send')]")
	public WebElement SendBtn;

	@FindBy(xpath = "//input[@formcontrolname='to']")
	public WebElement Mailto;

	@FindBy(xpath = "//label[contains(@for,'Sendmecopy')]")
	public WebElement Sendmeacopychkbox;

	@FindBy(xpath = "//button[contains(.,'send Send')]")
	public WebElement Sendmailbtn;

	@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
	public WebElement Searchboxtxt;

	@FindBy(xpath = "//button[contains(.,'Search')]")
	public WebElement Searchbtn;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[2]")
	public WebElement Checkallbox;

	@FindBy(xpath = "//button[contains(.,'Clear')]")
	public WebElement Clearbtn;

	@FindBy(xpath = "(//div[contains(@role,'option')])[1]")
	public WebElement Option1select;











}
