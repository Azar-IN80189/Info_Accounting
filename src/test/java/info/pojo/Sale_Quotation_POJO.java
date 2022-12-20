package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Sale_Quotation_POJO extends Reusableclass
{
	public Sale_Quotation_POJO() {

		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "(//li[@class='nav-item nav-dropdown open'])[1]")
	public WebElement Dropdownexpanded;

	@FindBy(xpath = "(//li[@class='nav-item nav-dropdown'])[1]")
	public WebElement Dropdownclosed;
	
	@FindBy(xpath = "//a[contains(.,'shopping_cart Sales')]")
	public WebElement Salesslide;

	@FindBy(xpath = "//a[@href='/sales/quotation/quotesview']")
	public WebElement Quotationslide;

	@FindBy(xpath = "(//button[contains(@type,'button')])[4]")
	public WebElement NewQuotationbtn;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	public WebElement Customerselect;

	@FindBy(xpath = "//a[contains(.,'+ Add Title and Summary')]")
	public WebElement Addtitlesummary;

	@FindBy(xpath = "//input[@formcontrolname='QuotationDate']")
	public WebElement QuotationDate;

	@FindBy(xpath = "//input[@formcontrolname='expiryDate']")
	public WebElement ExpiryDate;

	@FindBy(xpath = "//input[@id='reference']")
	public WebElement Referencetxtbox;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement CurrencyDD;

	@FindBy(xpath = "(//input[contains(@type,'text')])[9]")
	public WebElement Amountsare;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	public WebElement ThemeDD;
	
	@FindBy(xpath = "//button[contains(text(),' Accept ')]")
	public WebElement Accept;
	
	@FindBy(xpath = "//button[contains(text(),' Decline ')]")
	public WebElement Decline;

	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	public WebElement Items1;

	@FindBy(xpath = "(//div[@aria-haspopup='listbox'])[6]")
	public WebElement Items1q;

	@FindBy(xpath = "//input[@id='attentionto']")
	public WebElement Attentiontotxt;

	@FindBy(xpath = "//input[@id='contactNumber']")
	public WebElement contactNumbertxt;


	@FindBy(xpath = "/html/body/div/div/div[6]/button[1]")
	public WebElement Okbtnn;

	//html/body/div/div/div[6]/button[1]

	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement Items1text;

	@FindBy(xpath = "(//div[contains(@col-id,'ItemDescription')])[2]")
	public WebElement ItemDescription1;

	@FindBy(xpath = "//button[contains(.,'addAdd New Lines')]")
	public WebElement AddNewlinesbtn;

	@FindBy(xpath = "(//div[contains(@col-id,'Quantity')])[2]")
	public WebElement Quantity1;

	@FindBy(xpath = "//textarea[@id='deliveryInstruction']")
	public WebElement DeliveryInstructions;

	@FindBy(xpath = "//button[contains(.,'Approve')]")
	public WebElement ApproveBtn;

	@FindBy(xpath = "(//button[contains(.,'Save')])[3]")
	public WebElement SaveBtn;



	@FindBy(xpath = "(//div[contains(.,'Add Note')])[12]")
	public WebElement Addnoteclick;

	@FindBy(xpath = "//textarea[@id='textarea-notes']")
	public WebElement Notesdescription;

	@FindBy(xpath = "(//button[contains(.,'Save')])[4]")
	public WebElement SaveBtnnotes;

	@FindBy(xpath = "//a[@href='/sales/quotation'][contains(.,'Quotation')]")
	public WebElement QuotationScreen;

	@FindBy(xpath = "(//button[@class='btn btn-info'])[1]")
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

	@FindBy(xpath = "(//a[@data-toggle='tab'])[2]")
	public WebElement drafttab;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement draftcheckbox;

	@FindBy(xpath = "(//input[@ref='eInput'])[8]")
	public WebElement draftcheckboxdup;


	@FindBy(xpath = "//button[contains(.,'Copy to')]")
	public WebElement draftcopytobtn;



	@FindBy(xpath = "//button[contains(.,'how_to_reg Submit for approval')]")
	public WebElement submitforapprovalbtn;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement okpopupdraft;

	@FindBy(xpath = "(//a[@role='tab'])[3]")
	public WebElement Awaitingapprovaltab;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement Awaitingapprovalchkbox;

	@FindBy(xpath = "//span[contains(.,'done')]")
	public WebElement ApprovebtnAwaitingapproval;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement Okbtnawaitingapproval;

	@FindBy(xpath = "(//a[@role='tab'])[4]")
	public WebElement approvedtab;
	
	@FindBy(xpath = "//button[contains(.,'Mark as invoiced')]")
	public WebElement Markasinvoicedbtn;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement Accepttabchkbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement Accepttabchkbox2;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement Acceptedtab_Okbtn;
	
	@FindBy(xpath = "(//a[@role='tab'])[8]")
	public WebElement Invoicedtab;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[8]")
	public WebElement chkbox_Invoicetab;
	
	@FindBy(xpath = "//button[contains(.,'clearDelete')]")
	public WebElement Deletebtn_Invoicetab;
	
	@FindBy(xpath = "//button[contains(.,'Decline')]")
	public WebElement declineapprovedtab;
	
	@FindBy(xpath = "//button[contains(.,'Accept')]")
	public WebElement approveapprovedtab;

	@FindBy(xpath = "(//a[@role='tab'])[6]")
	public WebElement declinetab;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement okdeclineapprovedtab;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement approvedchkbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[8]")
	public WebElement approvedtaballchkbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[9]")
	public WebElement acceptedchkbox;

	@FindBy(xpath = "//button[contains(.,'clearDelete')]")
	public WebElement deletebtnapprovedtab;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement okdeletebtnapprovedtab;

	@FindBy(xpath = "//button[contains(.,'Accept')]")
	public WebElement Acceptbtnapprovetabs;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement Okbtnapprovetabs;

	@FindBy(xpath = "(//button[@type='button'])[10]")
	public WebElement SendbtnApprovertab;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[3]")
	public WebElement Emailenterapprovertab;
	
	@FindBy(xpath = "(//a[@role='tab'])[7]")
	public WebElement Acceptedtab_Q;
	
	@FindBy(xpath = "(//a[@role='tab'])[6]")
	public WebElement Declinedtab_Q;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement Checkallapproved_tab_Q;

	@FindBy(xpath = "//input[@name='mail']")
	public WebElement mailapprovertab;

	@FindBy(xpath = "//label[contains(.,'Include Attachment')]")
	public WebElement Attachmentchkboxapprovertab;

	@FindBy(xpath = "//label[contains(.,'Send me a copy')]")
	public WebElement Sendcopychkboxapprovertab;

	@FindBy(xpath = "//button[contains(.,'send Send')]")
	public WebElement Sendbtnmailsendapprovertab;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement draftchkbox;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	public WebElement Searchboxtxtapprovertab;


	@FindBy(xpath = "(//div[@col-id='Number'])[2]")
	public WebElement Row1Compare;

	@FindBy(xpath = "(//div[@col-id='Number'])[3]")
	public WebElement Row2Compare;

	@FindBy(xpath = "(//div[@col-id='Number'])[4]")
	public WebElement Row3Compare;

	@FindBy(xpath = "(//a[@role='tab'])[5]")
	public WebElement senttab;

	@FindBy(xpath = "(//button[@type='button'])[11]")
	public WebElement sendbtnsenttab;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[3]")
	public WebElement emailclicksenttab;

	@FindBy(xpath = "//input[@name='mail']")
	public WebElement emailenterclicksenttab;

	@FindBy(xpath = "//label[contains(.,'Include Attachment')]")
	public WebElement attachmentchkbox;

	@FindBy(xpath = "(//button[@class='btn btn-info'])[3]")
	public WebElement sendbtnemailsenttab;



	//copyfromsale_deliveryorder

	@FindBy(xpath = "(//span[@class='mat-radio-outer-circle'])[2]")
	public WebElement copytoinvoiceradiobtn;

	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	public WebElement copytoinvoicechkbox;

	@FindBy(xpath = "(//span[@class='mat-radio-outer-circle'])[3]")
	public WebElement copytodeliveryorderradiobtn;

	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	public WebElement copytodeliveryorderchkbox;


	@FindBy(xpath = "(//span[@class='mat-radio-outer-circle'])[1]")
	public WebElement quoteradiobtnapprovedtab;

	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	public WebElement quotechkboxrdbtnapprovedtab;

	@FindBy(xpath = "//button[contains(.,'Create Draft')]")
	public WebElement createdraftbtnapprovedtab;




}
