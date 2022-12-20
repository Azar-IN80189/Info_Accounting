package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Accounting_ChartOfAccount_POJO extends Reusableclass {
	
		public Accounting_ChartOfAccount_POJO() {

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

		@FindBy(xpath = "//a[contains(.,'calculate Accounting')]")
		public WebElement Accountingslide;
		
		@FindBy(xpath="(//input[@type='text'])[19]")
		public WebElement Currencyconverttxt;
		
		@FindBy(xpath="(//input[@type='text'])[19]")
		public WebElement paidto;
		
		@FindBy(xpath = "//a[contains(.,'arrow_rightChart of Accounts')]")
		public WebElement Chartofaccountslide;
		
		@FindBy(xpath = "//button[contains(.,'add Add Account')]")
		public WebElement Addaccountbtn_COA;
		
		@FindBy(xpath = "//input[@formcontrolname='accountCode']")
		public WebElement Accountcodetxt_COA;
		
		@FindBy(xpath = "(//input[@type='text'])[7]")
		public WebElement TaxDD_COA;
		
		@FindBy(xpath = "//input[@formcontrolname='accountName']")
		public WebElement AccountNametxt_COA;
		
		@FindBy(xpath = "(//input[@type='text'])[9]")
		public WebElement AccountTypeDD_COA;
		
		@FindBy(xpath = "//textarea[@formcontrolname='accDescription']")
		public WebElement AccountDescription_COA;
		
		@FindBy(xpath = "//span[@class='mat-checkbox-inner-container']")
		public WebElement Ispaymentchkbox_COA;
		
		@FindBy(xpath = "(//button[contains(text(),' Save')])[2]")
		public WebElement Savebtn_COA;
		
		@FindBy(xpath = "(//button[contains(.,'Cancel')])[2]")
		public WebElement Cancelbtn_COA;
		
		//verify created account shows in Revenue tab
		
		@FindBy(xpath = "(//a[contains(.,'Revenue')])[1]")
		public WebElement RevenueTab_COA;
		
		@FindBy(xpath = "//input[@id='search-box']")
		public WebElement Searchbox_COA;
		
		@FindBy(xpath = "//div[@tabindex='-1'][contains(.,'AutoAccount11')]")
		public WebElement Selecteditrevenge_COA;
		
		@FindBy(xpath = "//div[@tabindex='-1'][contains(.,'AutoAccount22')]")
		public WebElement Selecteditexpenses_COA;
		
		@FindBy(xpath = "//div[@tabindex='-1'][contains(.,'AutoAccount33')]")
		public WebElement Selecteditassert_COA;
		
		@FindBy(xpath = "//div[@tabindex='-1'][contains(.,'AutoAccount44')]")
		public WebElement Selecteditliability_COA;
		
		@FindBy(xpath = "//div[@tabindex='-1'][contains(.,'AutoAccount55')]")
		public WebElement SelecteditEquity_COA;
		
		@FindBy(xpath = "(//input[@type='checkbox'])[1]")
		public WebElement RevenueChkbox_COA;
		
		@FindBy(xpath = "(//input[@type='checkbox'])[1]")
		public WebElement ExpensesChkbox_COA;
		
		@FindBy(xpath = "(//input[@type='checkbox'])[1]")
		public WebElement AssetsChkbox_COA;
		
		@FindBy(xpath = "(//input[@type='checkbox'])[1]")
		public WebElement LiabilitiesChkbox_COA;
		
		@FindBy(xpath = "(//input[@type='checkbox'])[1]")
		public WebElement EquityChkbox_COA;
		
		@FindBy(xpath = "(//button[@type='button'])[8]")
		public WebElement EquityExpandoption_COA;
		
		@FindBy(xpath = "//a[contains(.,'Change Tax Rate')]")
		public WebElement Changetax_COA;
		
		@FindBy(xpath = "(//input[@type='text'])[5]")
		public WebElement Changetaxtype_COA;
		
		@FindBy(xpath = "(//button[contains(.,'Save')])[1]")
		public WebElement Savebtnchangetax_COA;
		
		@FindBy(xpath = "(//a[contains(.,'Archive')])[2]")
		public WebElement Archieveoption_COA;
		
		@FindBy(xpath = "//button[contains(.,'Archive')]")
		public WebElement Archieveoptionselect_COA;
		
		@FindBy(xpath = "(//input[@type='checkbox'])[1]")
		public WebElement ArchieveChkbox_COA;
		
		@FindBy(xpath = "(//button[@type='button'])[8]")
		public WebElement OptionsRevenue_COA;
		
		@FindBy(xpath = "//a[contains(.,'Delete')]")
		public WebElement DeleteRevenue_COA;
		
		@FindBy(xpath = "//button[contains(.,'Delete')]")
		public WebElement DeletebtnRevenue_COA;
		
		@FindBy(xpath = "(//div[@role='gridcell'])[3]")
		public WebElement Selectarevenue_COA;
		
		@FindBy(xpath = "(//a[@role='tab'])[3]")
		public WebElement ExpensesTab_COA;
		
		@FindBy(xpath = "(//a[@role='tab'])[4]")
		public WebElement AssetTab_COA;
		
		@FindBy(xpath = "(//a[@role='tab'])[5]")
		public WebElement LiabilitiesTab_COA;
		
		@FindBy(xpath = "(//a[@role='tab'])[6]")
		public WebElement EquityTab_COA;
		
		@FindBy(xpath = "//a[contains(.,'Archive')]")
		public WebElement ArchieveTab_COA;
		
		@FindBy(xpath = "//a[contains(.,'Restore')]")
		public WebElement Restoreselect_COA;
		
		
		//Add to payment
		
		@FindBy(xpath = "//a[contains(.,'add Add Bank Account')]")
		public WebElement Addbankaccountbtn_COA;
		
		
		
		//Send Statements
		
		@FindBy(xpath = "//button[contains(.,'send Send Statements')]")
		public WebElement SendStatementbtn_COA;
		
		@FindBy(xpath = "(//input[@type='text'])[3]")
		public WebElement StatementTypeDD_COA;
		
		@FindBy(xpath = "//input[@formcontrolname='fromDate']")
		public WebElement FromDate_COA;
		
		@FindBy(xpath = "//input[@formcontrolname='toDate']")
		public WebElement toDate_COA;
		
		@FindBy(xpath = "//button[contains(.,'Search')]")
		public WebElement SearchBtn_COA;
		
		@FindBy(xpath = "//input[@id='search-box']")
		public WebElement Searchboxlist_COA;
		
		@FindBy(xpath = "(//input[@type='checkbox'])[1]")
		public WebElement CheckAllSendStatement__COA;
		
		@FindBy(xpath = "//button[contains(.,'Close')]")
		public WebElement Closebtn__COA;
		
		@FindBy(xpath = "//a[@href='/contacts/contacts']")
		public WebElement ContactMenu_COA;
		
		@FindBy(xpath = "(//span[contains(.,'email')])[1]")
		public WebElement Email_COA;
		
		@FindBy(xpath = "(//form[contains(@novalidate,'novalidate')])[5]")
		public WebElement EmailTouchframe_COA;
		
		@FindBy(xpath = "//input[@formcontrolname='mail']")
		public WebElement EmailEnter_COA;
		
		@FindBy(xpath = "//button[contains(.,'send Send')]")
		public WebElement Sendbtn_COA;
		
		@FindBy(xpath = "//button[contains(.,'printPrint')]")
		public WebElement PrintBtn__COA;
		
		@FindBy(xpath = "(//input[@type='text'])[12]")
		public WebElement ThemeDD__COA;
		
		@FindBy(xpath = "//button[contains(.,'Ok')]")
		public WebElement OkBtn_ThemeDD__COA;
		
		@FindBy(xpath = "(//button[contains(.,'Print')])[2]")
		public WebElement OpenPrintBtn__COA;
		
		@FindBy(xpath = "//button[@class='btn btn-primary btn-normal']")
		public WebElement CancelBtn_PrintPage__COA;
		
		//download buttons scenarios
		
		@FindBy(xpath = "//span[contains(.,'download')]")
		public WebElement Download_COA;
		
		@FindBy(xpath = "(//input[@type='text'])[12]")
		public WebElement ThemeDDa_COA;
		
		@FindBy(xpath = "//button[contains(.,'Ok')]")
		public WebElement Okbtn_COA;
		
		//Import Contact Functionality
		
		@FindBy(xpath = "//button[contains(.,'south_west Import')]")
		public WebElement ImportBtn_COA;
		
		@FindBy(xpath = "//a[contains(.,'Download Template (.xlsx).')]")
		public WebElement ChooseDownloadxlsx_COA;
		
		@FindBy(xpath = "//a[contains(.,'Download Template (.csv).')]")
		public WebElement ChooseDownloadcsv_COA;
		
		@FindBy(xpath = "//input[@id='file']")
		public WebElement Choosefiletoupload_COA;
		
		@FindBy(xpath = "(//button[contains(.,'Next')])[1]")
		public WebElement NextBtn_COA;
		
		@FindBy(xpath = "(//button[contains(.,'Next')])[2]")
		public WebElement MatchFieldNextBtn_COA;
		
		@FindBy(xpath = "(//a[contains(.,'Contact')])[2]")
		public WebElement ContactNavigatelinkbtn_COA;
		
		@FindBy(xpath = "//button[contains(.,'Back to import')]")
		public WebElement BacktoImportBtn_COA;
		
	
}
