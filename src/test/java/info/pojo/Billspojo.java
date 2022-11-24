package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import info.base.Reusableclass;

public class Billspojo extends Reusableclass{
	
	public Billspojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/purchase/bills/billsview']")
	public WebElement bills;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'add  New Bill')]")
	public WebElement newbill;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[2]")
	public WebElement from;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'BillDate')]")
	public WebElement billdate;
	
	@FindBy(xpath = "(//input[@placeholder='dd/mm/yyyy'])[2]")
	public WebElement duedate;
	
	@FindBy(xpath = "//input[contains(@id,'PermitNo')]")
	public WebElement permitno;
	
	@FindBy(xpath = "//input[contains(@maxlength,'50')]")
	public WebElement refno;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement currency;
	
	@FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[4]")
	public WebElement amountsare;
	
	@FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[5]")
	public WebElement theme;

	@FindBy(xpath = "(//td[@style='width: 150px; max-width: 150px; text-align: left;'])[1]")
	public WebElement Listitem1;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[11]")
	public WebElement Listitemname1;

	@FindBy(xpath="//button[contains(.,'add  Add New Lines')]")
	public WebElement addnewlines;
	
	@FindBy(xpath="(//td[@style='width: 150px; max-width: 150px; text-align: left;'])[3]")
	public WebElement Listitem2;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement Listitemname2;
	
	@FindBy(xpath="(//td[@style='width: 150px; max-width: 150px; text-align: left;'])[5]")
	public WebElement Listitem3;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	public WebElement Listitemname3;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Split button!')])[4]")
	public WebElement savearrow;
	
	@FindBy(xpath="(//li[@role='menuitem'])[1]")
	public WebElement saveasdraft;

	@FindBy(xpath = "//a[contains(text(),'Save & submit for approval')]")
	public WebElement saveforapproval;
		
	@FindBy(xpath = "//a[@href='#bill_draft']")
	public WebElement billdraft;
	
	@FindBy(xpath = "(//input[@type='text'])[12]")
	public WebElement test;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[13]")
	public WebElement test2;
	
	@FindBy(xpath = "(//input[@aria-autocomplete='list'])[7]")
	public WebElement costcenter;
	
	@FindBy(xpath = "//a[contains(.,'+Save New Contact')]")
	public WebElement savenew;
	
	@FindBy(xpath="//button[text()='OK']")
	public WebElement ok;
	
	@FindBy(xpath = "(//div[contains(@unselectable,'on')])[37]")
	public WebElement draftsitem;
	
	@FindBy(xpath = "//a[contains(text(),'Approval ')]")
	public WebElement awaitingapproval;
	
	@FindBy(xpath="//button[text()='Update']")
	public WebElement update;

	@FindBy(xpath="(//div[@row-index='0'])[2]")
	public WebElement awaitingitem;
	
	@FindBy(xpath="//a[contains(text(),'Payment ')]")
	public WebElement awaitingpayment;
	
	@FindBy(xpath="(//button[@type='button'][contains(.,'Split button!')])[3]")
	public WebElement approvearrow;
	
	@FindBy(xpath="//button[contains(text(),'Approve')]")
	public WebElement approve;
	
	@FindBy(xpath="//input[@id='PayAmount']")
	public WebElement payamount;
	
	@FindBy(xpath="//input[@name='d2']")
	public WebElement datepaid;
	
	@FindBy(xpath="(//input[@type='text'])[19]")
	public WebElement paidfrom;
	
	@FindBy(xpath="(//input[@type='text'])[20]")
	public WebElement paymentmode;
	
	@FindBy(xpath="//button[text()=' Add Payment ']")
	public WebElement addpayment;
	
	@FindBy(xpath="//a[contains(text(),'Paid ')]")
	public WebElement paid;
	
	@FindBy(xpath = "(//button[contains(@type,'button')])[5]")
	public WebElement options;
	
	@FindBy(xpath="//a[contains(text(),'Edit')]")
	public WebElement edit;
	
	@FindBy(xpath="//a[contains(text(),'Void')]")
	public WebElement voiddelete;

	@FindBy(xpath="//button[contains(text(),'Yes')]")
	public WebElement yes;
	
	@FindBy(xpath="//a[contains(text(),'Copy')]")
	public WebElement copy;
	
	@FindBy(xpath="//a[contains(text(),'Add Credit Note')]")
	public WebElement Addcreditnote;

}
