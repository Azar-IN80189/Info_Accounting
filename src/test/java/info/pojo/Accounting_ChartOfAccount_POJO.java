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
		
		@FindBy(xpath = "(//li[@class='nav-item'])[28]")
		public WebElement RevenueTab_COA;
		
		@FindBy(xpath = "//input[@id='search-box']")
		public WebElement Searchbox_COA;
		
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
		
		@FindBy(xpath = "(//a[@role='tab'])[6]")
		public WebElement ArchieveTab_COA;
		
		
		
		
		//Add to payment
		
		@FindBy(xpath = "//a[contains(.,'add Add Bank Account')]")
		public WebElement Addbankaccountbtn_COA;
		
		
		
		
		
		
		
		
		
}
