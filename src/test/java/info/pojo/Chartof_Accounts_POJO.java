package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Chartof_Accounts_POJO extends Reusableclass{
	
	public Chartof_Accounts_POJO() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[contains(.,'calculate Accounting')]")
	public WebElement Accounting;
	
	@FindBy(xpath="//a[text()='Chart of Accounts ']")
	public WebElement chartofaccounts;
	
	@FindBy(xpath="//a[text()=' Add Cash Account ']")
	public WebElement addcashaccountaccount;

	@FindBy(xpath="//a[text()=' Banking']")
	public WebElement Banking;
	
	@FindBy(xpath="//a[contains(text(),'Banking Accounts ')]")
	public WebElement Bankingaccounts;
	
	@FindBy(xpath="//a[contains(text(),' Add Cash Account ')]")
	public WebElement Addcashaccountbank;
	
	@FindBy(xpath="//input[@formcontrolname='accountName']")
	public WebElement accountnamechart;
	
	@FindBy(xpath="(//input[contains(@type,'text')])[3]")
	public WebElement accountnamebanking;
	
	@FindBy(xpath="//a[contains(.,'add Add Bank Account')]")
	public WebElement Addbankaccount;
	
	@FindBy(xpath="//input[contains(@aria-autocomplete,'list')]")
	public WebElement selectbankone;
	
	@FindBy(xpath="//span[contains(text(),'Indian Bank (Foreign Bank) [Singapore] ')]")
	public WebElement bankname;
	
	@FindBy(xpath="(//input[contains(@type,'text')])[3]")
	public WebElement acnameaccounting;
	
	@FindBy(xpath="//a[contains(.,'add Add Bank Account')]")
	public WebElement addbankaccountbanking;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search your bank...')]")
	public WebElement selectbanktwo;
	
	@FindBy(xpath="//span[contains(text(),'Indian Bank (Foreign Bank) [Singapore] ')]")
	public WebElement banknameinbanking;
	
	@FindBy(xpath="(//input[contains(@type,'text')])[3]")
	public WebElement acnamebankingtwo;
	
	
	
	


}
