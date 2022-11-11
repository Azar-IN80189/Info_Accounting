package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Sales_Quotation_POJO extends Reusableclass
{
	public Sales_Quotation_POJO() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[contains(.,'shopping_cart Sales')]")
	public WebElement Salesslide;
	
	@FindBy(xpath = "//a[contains(.,'arrow_rightQuotation')]")
	public WebElement Quotationslide;
	
	@FindBy(xpath = "(//a[@data-toggle='tab'])[2]")
	public WebElement drafttab;
	
	
	
	@FindBy(xpath = "//input[contains(@placeholder,'Type to filter the Quote Number,Reference,Supplier or Amount')]")
	public WebElement SearchboxQuotation;
	
	@FindBy(xpath = "//button[contains(.,'Search')]")
	public WebElement Searchbutton;
	
	@FindBy(xpath = "(//div[@col-id='Number'])[2]")
	public WebElement Selectaquotation;
	
	@FindBy(xpath = "//input[@formcontrolname='expiryDate']")
	public WebElement ExpiryDatetxtbox;
	
	
	
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
	
	@FindBy(xpath = "(//td[@style='width: 150px; max-width: 150px; text-align: left;'])[1]")
	public WebElement Items1;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement Items1q;
	
	@FindBy(xpath = "/html/body/div/div/div[6]/button[1]")
	public WebElement Okbtnn;
	
	//html/body/div/div/div[6]/button[1]
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement Items1text;
	
	@FindBy(xpath = "(//td[@class='ng-star-inserted'])[8]")
	public WebElement accountselectoutframe;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement accountselecttxt;
	
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
	
	
	
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
	public WebElement SaveBtn;
	
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
	
	
	@FindBy(xpath = "(//div[contains(@role,'option')])[1]")
	public WebElement Option1select;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
