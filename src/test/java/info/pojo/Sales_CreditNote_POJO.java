package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Sales_CreditNote_POJO extends Reusableclass {

	public Sales_CreditNote_POJO() {

		PageFactory.initElements(driver, this);

	}
	
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
