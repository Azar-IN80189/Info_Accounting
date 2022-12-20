package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Sales_Invoice_POJO extends Reusableclass {
	
	public Sales_Invoice_POJO() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[contains(.,'shopping_cart Sales')]")
	public WebElement Salesslide;
	
	@FindBy(xpath = "//a[@href='/sales/invoice/invoiceview']")
	public WebElement Invoiceslide;
	
	@FindBy(xpath = "(//button[contains(@type,'button')])[4]")
	public WebElement Newinvoicebtn;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	public WebElement ChoosecustomerDD;
	
	@FindBy(xpath="//a[contains(.,'+Save New Contact')]")
	public WebElement savecontact;
	
	@FindBy(xpath = "//input[@id='dpInvoiceDate']")//id changed
	public WebElement InvoiceDate;
	
	@FindBy(xpath = "//input[@id='dpInvoiceDueDate']")//id changed
	public WebElement DueDate;
	
	@FindBy(xpath = "//input[@id='reference']")
	public WebElement ReferenceDateInvoice;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[8]")
	public WebElement CurrencyInvoiceDD;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[9]")
	public WebElement AmountsareDD;
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
	public WebElement ThemeDD;
	
	@FindBy(xpath = "//td[@id='td-p0-c1']")
	public WebElement items1table;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[11]")
	public WebElement items1tabletxt;
	
	@FindBy(xpath = "//td[@id='td-p1-c1']")
	public WebElement items2table;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[11]")
	public WebElement items2tabletxt;
	
	@FindBy(xpath = "//td[@id='td-p2-c1']")
	public WebElement items3table;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[11]")
	public WebElement items3tabletxt;
	
	@FindBy(xpath = "//button[@id='btnAddNewLine']")
	public WebElement Addnewlinesbtn;
	
	@FindBy(xpath = "//textarea[@id='deliveryInstruction']")
	public WebElement DeliveryInstructionstxt;
	
	@FindBy(xpath = "//button[@id='btnApprove-1']")//id changed
	public WebElement ApproveBtn;
	
	@FindBy(xpath="(//span[contains(text(),'Split button!')])[4]")
	public WebElement savearrow;
	
	@FindBy(xpath="//a[@id='btnDraft-2']")//id changed
	public WebElement saveasdraft;
	
	@FindBy(xpath = "//button[@id='btnDraft-1']")//id changed
	public WebElement SaveBtn;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Add Payment')]")
	public WebElement Addrefundbtn;

	@FindBy(xpath = "//a[@href='#org-details_draft']")
	public WebElement draft;
	
	@FindBy(xpath = "(//button[contains(.,'Split button!')])[2]")
	public WebElement Approvesplitarrow;
	
	@FindBy(xpath = "//a[@id='btnApproveAndAddAnother']")//id changed
	public WebElement Approveandaddanother;
	
	@FindBy(xpath = "//a[@id='btnApproveAndPrint']")//id changed
	public WebElement Approveandprint;
	
	@FindBy(xpath = "(//button[contains(.,'Split button!')])[3]")
	public WebElement Savesplitarrow;
	
	@FindBy(xpath = "//a[contains(.,'Save continue editing')]")
	public WebElement Saveandcontinueediting;
	
	@FindBy(xpath = "//a[@id='btnSubmitForApproval']")//id changed
	public WebElement Saveandsubmitforapproval;
	
	@FindBy(xpath = "//a[contains(.,'Save & add another')]")
	public WebElement Saveandaddanother;
	
	@FindBy(xpath = "//input[@name='InvOrder']")
	public WebElement InvoiceNo;
	
	@FindBy(xpath = "(//div[contains(.,'Add Note')])[12]")
	public WebElement Addnoteclick;
	
	@FindBy(xpath = "//textarea[@id='textarea-notes']")
	public WebElement Notesdescription;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[4]")
	public WebElement SaveBtnnotes;
	
	@FindBy(xpath = "//a[@href='/sales/quotation'][contains(.,'Quotation')]")
	public WebElement QuotationScreen;
	
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
	
	@FindBy(xpath = "(//a[contains(.,'Invoice')])[3]")
	public WebElement Invoiceoption;
	
	@FindBy(xpath = "(//div[contains(@role,'option')])[1]")
	public WebElement Option1select;
	
	@FindBy(xpath="(//a[contains(text(),'Awaiting ')])[1]")
	public WebElement awaintingapproval;
	
	@FindBy(xpath="//button[text()=' Approve ']")
	public WebElement approve;
	
	@FindBy(xpath="//input[@id='PayAmount']")
	public WebElement amountpaid;
	
	@FindBy(xpath="(//input[contains(@name,'d2')])[1]")
	public WebElement datepaid;
	
	@FindBy(xpath="(//input[@type='text'])[19]")
	public WebElement PaidTo;
	
	@FindBy(xpath="(//input[@aria-autocomplete='list'])[10]")
	public WebElement cash;
	
	@FindBy(xpath="//button[contains(text(),' Add Payment ')]")
	public WebElement addpayment;
	
	@FindBy(xpath="//a[contains(text(),'Awaiting Payment ')]")
	public WebElement awaitingpayment;
	
	@FindBy(xpath="//button[text()=' Options ']")
	public WebElement options;
	
	@FindBy(xpath="//a[text()='Copy']")
	public WebElement copy;
	
	@FindBy(xpath="//a[text()='Edit']")
	public WebElement edit;
	
	@FindBy(xpath="//a[text()='Add Credit Note']")
	public WebElement addcreditnote;
	
	@FindBy(xpath="//a[text()='Invoice']")
	public WebElement invoice;
	
	@FindBy(xpath="(//span[contains(@class,'mat-radio-outer-circle')])[1]")
	public WebElement quoteradiobutton;
	
	@FindBy(xpath="//button[text()='Create Draft']")
	public WebElement createdraft;
	
	@FindBy(xpath="//input[@name='d3']")
	public WebElement expirydate;
	
	@FindBy(xpath="//button[text()='Update']")
	public WebElement update;
	
	@FindBy(xpath="(//div[@row-index='0'])[2]")
	public WebElement firstinvoice;
	
	@FindBy(xpath="//button[text()='Skip']")
	public WebElement skip;
	
	@FindBy(xpath = "(//a[@class='t-link edit'])[2]")
	public WebElement Firstrowinvoice;
	
	@FindBy(xpath="//a[contains(text(),'Void')]")
	public WebElement delete;
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	public WebElement yes;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	public WebElement ok;
	
	@FindBy(xpath="(//button[contains(@type,'button')])[9]")
	public WebElement addnewlines;

	@FindBy(xpath = "//input[contains(@id,'BankExRate')]")
	public WebElement bankrate;
	
	@FindBy(xpath="//button[@id='btnApprove-1']")
	public WebElement approvecredit;
	
	@FindBy(xpath="//input[@id='dpExpiryDate']")
	public WebElement duedatecredit;
}
