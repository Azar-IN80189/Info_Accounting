package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Sales_CreditNote_POJO extends Reusableclass {

	public Sales_CreditNote_POJO() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//li[@class='nav-item nav-dropdown open'])[1]")
	public WebElement Dropdownexpanded;

	@FindBy(xpath = "(//li[@class='nav-item nav-dropdown'])[1]")
	public WebElement Dropdownclosed;

	@FindBy(xpath = "//a[contains(.,'shopping_cart Sales')]")
	public WebElement Salesslide;

	@FindBy(xpath = "(//a[contains(.,'arrow_rightCredit Notes')])[2]")
	public WebElement CreditNoteslide;

	@FindBy(xpath = "//button[contains(.,'add  New Credit Notes')]")
	public WebElement NewcreditNotesbtn;

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

	@FindBy(xpath = "(//input[contains(@type,'text')])[11]")
	public WebElement items1tabletxt;

	@FindBy(xpath = "(//button[contains(.,'Add New Lines')])[1]")
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

	@FindBy(xpath = "(//a[contains(.,'Credit Notes')])[3]")
	public WebElement creditnotemenu;

	@FindBy(xpath = "//button[contains(.,'OK')]")
	public WebElement Okbtn;

	@FindBy(xpath = "(//input[@type='checkbox'])[9]")
	public WebElement awaitingchkboxall;

	@FindBy(xpath = "(//a[@role='tab'])[4]")
	public WebElement Awaitingpaymenttab;

	@FindBy(xpath = "(//button[@type='button'])[6]")
	public WebElement sendbtnawaitingpayment;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[3]")
	public WebElement emailfield1;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[4]")
	public WebElement emailfield2;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[5]")
	public WebElement emailfield3;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[6]")
	public WebElement emailfield4;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[7]")
	public WebElement emailfield5;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[8]")
	public WebElement emailfield6;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[9]")
	public WebElement emailfield7;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[10]")
	public WebElement emailfield8;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[11]")
	public WebElement emailfield9;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[12]")
	public WebElement emailfield10;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[13]")
	public WebElement emailfield11;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[14]")
	public WebElement emailfield12;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[15]")
	public WebElement emailfield13;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[16]")
	public WebElement emailfield14;

	@FindBy(xpath = "(//form[@novalidate='novalidate'])[17]")
	public WebElement emailfield15;

	@FindBy(xpath = "//input[@name='mail']")
	public WebElement emailentertxt;

	@FindBy(xpath = "(//button[contains(.,'send Send')])[2]")
	public WebElement Sendbtnemailmultiple;
}
