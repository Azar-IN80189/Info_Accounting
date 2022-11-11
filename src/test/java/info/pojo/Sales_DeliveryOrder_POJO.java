package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Sales_DeliveryOrder_POJO extends Reusableclass{

	public Sales_DeliveryOrder_POJO() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//li[@class='nav-item nav-dropdown open'])[1]")
	public WebElement Dropdownexpanded;

	@FindBy(xpath = "(//li[@class='nav-item nav-dropdown'])[1]")
	public WebElement Dropdownclosed;

	@FindBy(xpath = "//a[contains(.,'shopping_cart Sales')]")
	public WebElement Salesslide;

	@FindBy(xpath = "//a[@href='/sales/delivery/deliveriesview']")
	public WebElement Deliveryorderslide;

	@FindBy(xpath = "(//div[contains(@role,'option')])[1]")
	public WebElement Option1select;


	@FindBy(xpath = "//a[@href='/sales/delivery/deliveriesview']")
	public WebElement DeliveryOrderslide;

	@FindBy(xpath = "//button[contains(.,'add  New Delivery Order')]")
	public WebElement DeliveryOrderbtn;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	public WebElement ChooseContactDD;

	@FindBy(xpath = "//input[contains(@name,'d2')]")
	public WebElement Date;

	@FindBy(xpath = "(//input[contains(@type,'text')])[7]")
	public WebElement ReferenceName;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement CurrencyDD;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement Amountsare;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	public WebElement ThemeDD;

	@FindBy(xpath = "(//td[@style='width: 150px; max-width: 150px; text-align: left;'])[1]")
	public WebElement items1table;


	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement items1tabletxt;

	@FindBy(xpath = "//button[contains(.,'addAdd New Lines')]")
	public WebElement Addnewlinesbtn;

	@FindBy(xpath = "//textarea[@id='deliveryInstruction']")
	public WebElement DeliveryInstructionstxt;

	@FindBy(xpath = "//button[contains(.,'Approve')]")
	public WebElement ApproveBtn;

	@FindBy(xpath = "(//button[contains(.,'Save')])[3]")
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

	@FindBy(xpath = "//button[contains(@id,'btnDeliveryAddress')]")
	public WebElement Deliveryaddressbtndd;

	@FindBy(xpath = "//a[contains(.,'+ Add New Address')]")
	public WebElement Addnewaddressddclk;

	@FindBy(xpath = "(//a[@role='tab'])[4]")
	public WebElement Approvedtab;

	@FindBy(xpath = "(//input[@type='checkbox'])[8]")
	public WebElement Approvedtabchkboxall;

	@FindBy(xpath = "(//input[@type='checkbox'])[8]")
	public WebElement packedchkboxall;

	@FindBy(xpath = "(//input[@type='checkbox'])[8]")
	public WebElement Deliveredchkboxall;

	@FindBy(xpath = "(//input[@type='checkbox'])[8]")
	public WebElement Invoicedchkboxall;

	@FindBy(xpath = "//button[contains(.,'Copy to')]")
	public WebElement copytobtnapprovedtab;

	@FindBy(xpath = "(//span[@class='mat-radio-outer-circle'])[1]")
	public WebElement quoteradiobtnapprovedtab;

	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	public WebElement quotechkboxrdbtnapprovedtab;

	@FindBy(xpath = "//button[contains(.,'Create Draft')]")
	public WebElement createdraftbtnapprovedtab;

	@FindBy(xpath = "//button[contains(text(),'Mark as Packed')]")
	public WebElement Markaspackedbtnapprovedtab;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement OkbtnMarkaspackedbtnapprovedtab;

	@FindBy(xpath = "(//input[@type='checkbox'])[7]")
	public WebElement packedchkbox;



	@FindBy(xpath = "(//a[@role='tab'])[5]")
	public WebElement packedtab;


	@FindBy(xpath = "//button[contains(text(),'Mark as Delivered')]")
	public WebElement Markasdeliveredbtn;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement okbtnMarkasdelivered;

	@FindBy(xpath = "//button[contains(text(),'Mark as Invoiced')]")
	public WebElement Markasinvoicedbtn;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement OkbtnMarkasinvoiced;

	@FindBy(xpath = "(//a[@role='tab'])[6]")
	public WebElement Deliveredtab;

	@FindBy(xpath = "//button[contains(text(),'Void')]")
	public WebElement voidbtn;

	@FindBy(xpath = "(//a[@role='tab'])[7]")
	public WebElement returnedtab;


	@FindBy(xpath = "(//a[@role='tab'])[8]")
	public WebElement invoicedtab;

	@FindBy(xpath = "//button[contains(.,'Yes, void it!')]")
	public WebElement Yesvoiditbtn;

	@FindBy(xpath = "(//div[contains(.,'Add Note')])[12]")
	public WebElement Addnoteclick;

	@FindBy(xpath = "//textarea[@id='textarea-notes']")
	public WebElement Notesdescription;

	@FindBy(xpath = "(//button[contains(.,'Save')])[4]")
	public WebElement SaveBtnnotes;

	@FindBy(xpath = "//a[@href='/sales/delivery'][contains(.,'Delivery Order')]")
	public WebElement DeliveryOrderScreen;

	@FindBy(xpath = "//span[contains(.,'send')]")
	public WebElement SendBtn;

	@FindBy(xpath = "//input[@formcontrolname='to']")
	public WebElement Mailto;

	@FindBy(xpath = "//label[contains(@for,'Sendmecopy')]")
	public WebElement Sendmeacopychkbox;

	@FindBy(xpath = "(//span[contains(text(),'send')])[2]")
	public WebElement Sendmailbtn;

	@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
	public WebElement Searchboxtxt;

	@FindBy(xpath = "//button[contains(.,'Search')]")
	public WebElement Searchbtn;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[2]")
	public WebElement Checkallbox;

	@FindBy(xpath = "//button[contains(.,'Clear')]")
	public WebElement Clearbtn;

	@FindBy(xpath = "//input[contains(@id,'doOrderNo')]")
	public WebElement Deliverynumbertxt;


	@FindBy(xpath = "(//a[@role='tab'])[2]")
	public WebElement Drafttab;

	@FindBy(xpath = "(//input[@type='checkbox'])[8]")
	public WebElement Drafttabchkbox;

	@FindBy(xpath = "//button[contains(.,'Submit for approval')]")
	public WebElement submitforapprovalbtn;

	@FindBy(xpath = "//button[contains(.,'clear Delete')]")
	public WebElement Deletebtndraft;

	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement okbtndraft;

	@FindBy(xpath = "(//a[@role='tab'])[3]")
	public WebElement awaitingapprovaltab;

	@FindBy(xpath = "(//span[@class='mat-radio-outer-circle'])[2]")
	public WebElement copytoinvoiceradiobtn;

	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	public WebElement copytoinvoicechkbox;

	@FindBy(xpath = "(//span[@class='mat-radio-outer-circle'])[3]")
	public WebElement copytodeliveryorderradiobtn;

	@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
	public WebElement copytodeliveryorderchkbox;

	@FindBy(xpath = "(//input[@type='checkbox'])[8]")
	public WebElement awaitingapprovaltabchkbox;

	@FindBy(xpath = "//button[contains(.,'Approve')]")
	public WebElement awaitingapprovaltabapprovebtn;

	@FindBy(xpath = "//button[contains(.,'print Print')]")
	public WebElement printbtnapprovedtab;

	@FindBy(xpath = "//button[contains(.,'Close')]")
	public WebElement closeprint;

	@FindBy(xpath = "//span[contains(.,'Delivery Order')]")
	public WebElement verifyprintdeliveryorder;

	@FindBy(xpath = "//button[contains(.,'clear Delete')]")
	public WebElement Deletebtndraftd;

	@FindBy(xpath = "//button[contains(.,'Yes, delete it!')]")
	public WebElement yesdeleteitdraft;
}
