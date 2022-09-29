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
	
	@FindBy(xpath = "//button[contains(.,'add  New Invoice')]")
	public WebElement Newinvoicebtn;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	public WebElement ChoosecustomerDD;
	
	@FindBy(xpath = "//input[@formcontrolname='InvoiceDate']")
	public WebElement InvoiceDate;
	
	@FindBy(xpath = "//input[@formcontrolname='InvoiceDueDate']")
	public WebElement DueDate;
	
	@FindBy(xpath = "//input[@id='reference']")
	public WebElement ReferenceDateInvoice;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[8]")
	public WebElement CurrencyInvoiceDD;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[9]")
	public WebElement AmountsareDD;
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
	public WebElement ThemeDD;
	
	@FindBy(xpath = "(//div[contains(@col-id,'InvItemID')])[2]")
	public WebElement items1table;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[11]")
	public WebElement items1tabletxt;
	
	@FindBy(xpath = "//button[contains(.,'addAdd New Lines')]")
	public WebElement Addnewlinesbtn;
	
	@FindBy(xpath = "//textarea[@id='deliveryInstruction']")
	public WebElement DeliveryInstructionstxt;
	
	@FindBy(xpath = "//button[contains(.,'Approve')]")
	public WebElement ApproveBtn;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
