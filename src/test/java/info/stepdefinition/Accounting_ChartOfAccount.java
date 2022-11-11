package info.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;

import info.base.Reusableclass;
import info.pojo.Accounting_ChartOfAccount_POJO;
import info.pojo.Sales_Invoice_POJO;
import info.pojo.Sales_Quotation_POJO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Accounting_ChartOfAccount extends Reusableclass {
	public static Accounting_ChartOfAccount_POJO coa;
	public static Sales_Invoice_POJO i;
	public static Sales_Quotation_POJO s;
	@Given("User need to navigate to add account scenario")
	public void user_need_to_navigate_to_add_account_scenario() throws InterruptedException, AWTException {

		coa = new Accounting_ChartOfAccount_POJO();

		Explicitwaitvisibility(coa.Accountingslide);
		clickjavascript(coa.Accountingslide);

		Thread.sleep(2000);

		Explicitwaitvisibility(coa.Chartofaccountslide);
		clickjavascript(coa.Chartofaccountslide);

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.Addaccountbtn_COA);
		clickjavascript(coa.Addaccountbtn_COA);

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.Accountcodetxt_COA);
		tofill(coa.Accountcodetxt_COA, "887553333");

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.TaxDD_COA);
		tofill(coa.TaxDD_COA, "DS: Deemed Supplies (7%)");
		Thread.sleep(2000);
		toenter();

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.AccountNametxt_COA);
		tofill(coa.AccountNametxt_COA, "AutoAccount11");

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.AccountTypeDD_COA);
		tofill(coa.AccountTypeDD_COA, "Revenue");
		Thread.sleep(2000);
		toenter();

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.AccountDescription_COA);
		tofill(coa.AccountDescription_COA, "TestDescription");

		Thread.sleep(1000);

		Selectcheckbox(coa.Ispaymentchkbox_COA);

		Thread.sleep(3000);
		Explicitwaitvisibility(coa.Savebtn_COA);
		clickjavascript(coa.Savebtn_COA);

		Thread.sleep(3000);
	}


	@Given("User need to verify Revenue page account")
	public void user_need_to_verify_revenue_page_account() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();


		Explicitwaitvisibility(coa.RevenueTab_COA);
		clickjavascript(coa.RevenueTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "887553333");

		Thread.sleep(2000);

		Selectcheckbox(coa.RevenueChkbox_COA);



		Explicitwaitvisibility(coa.OptionsRevenue_COA);
		clickjavascript(coa.OptionsRevenue_COA);

		Explicitwaitvisibility(coa.DeleteRevenue_COA);
		clickjavascript(coa.DeleteRevenue_COA);

		Explicitwaitvisibility(coa.DeletebtnRevenue_COA);
		clickjavascript(coa.DeletebtnRevenue_COA);

	}

	@Given("User need to navigate to add account scenario\\/Expenses")
	public void user_need_to_navigate_to_add_account_scenario_expenses() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();

		boolean dropdownPresent = driver.findElement(By.xpath("//a[contains(.,'arrow_rightChart of Accounts')]")).isDisplayed();

		if(dropdownPresent==true)
		{
			
			System.out.println("Dropdown is appearing");
			Thread.sleep(2000);

			Explicitwaitvisibility(coa.Chartofaccountslide);
			clickjavascript(coa.Chartofaccountslide);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Addaccountbtn_COA);
			clickjavascript(coa.Addaccountbtn_COA);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Accountcodetxt_COA);
			tofill(coa.Accountcodetxt_COA, "8874949");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.TaxDD_COA);
			tofill(coa.TaxDD_COA, "DS: Deemed Supplies (7%)");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountNametxt_COA);
			tofill(coa.AccountNametxt_COA, "AutoAccount22");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountTypeDD_COA);
			tofill(coa.AccountTypeDD_COA, "Expense");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountDescription_COA);
			tofill(coa.AccountDescription_COA, "TestDescription");

			Thread.sleep(1000);

			Selectcheckbox(coa.Ispaymentchkbox_COA);

			Explicitwaitvisibility(coa.Savebtn_COA);
			clickjavascript(coa.Savebtn_COA);
		}
		else{
			System.out.println("Dropdown is not appearing");
			Explicitwaitvisibility(coa.Accountingslide);
			clickjavascript(coa.Accountingslide);
			System.out.println("Dropdown is appearing");
			Thread.sleep(2000);

			Explicitwaitvisibility(coa.Chartofaccountslide);
			clickjavascript(coa.Chartofaccountslide);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Addaccountbtn_COA);
			clickjavascript(coa.Addaccountbtn_COA);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Accountcodetxt_COA);
			tofill(coa.Accountcodetxt_COA, "8874949");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.TaxDD_COA);
			tofill(coa.TaxDD_COA, "DS: Deemed Supplies (7%)");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountNametxt_COA);
			tofill(coa.AccountNametxt_COA, "AutoAccount22");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountTypeDD_COA);
			tofill(coa.AccountTypeDD_COA, "Expense");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountDescription_COA);
			tofill(coa.AccountDescription_COA, "TestDescription");

			Thread.sleep(1000);

			Selectcheckbox(coa.Ispaymentchkbox_COA);

			Explicitwaitvisibility(coa.Savebtn_COA);
			clickjavascript(coa.Savebtn_COA);
		}


	
	}

	@Given("User need to verify Expenses page account")
	public void user_need_to_verify_expenses_page_account() {
		coa = new Accounting_ChartOfAccount_POJO();


		Explicitwaitvisibility(coa.ExpensesTab_COA);
		clickjavascript(coa.ExpensesTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "8874949");

		Selectcheckbox(coa.ExpensesChkbox_COA);

		Explicitwaitvisibility(coa.OptionsRevenue_COA);
		clickjavascript(coa.OptionsRevenue_COA);

		Explicitwaitvisibility(coa.DeleteRevenue_COA);
		clickjavascript(coa.DeleteRevenue_COA);

		Explicitwaitvisibility(coa.DeletebtnRevenue_COA);
		clickjavascript(coa.DeletebtnRevenue_COA);
	}

	@Given("User need to navigate to add account scenario\\/Assets")
	public void user_need_to_navigate_to_add_account_scenario_assets() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();

		boolean dropdownPresent = driver.findElement(By.xpath("//a[contains(.,'arrow_rightChart of Accounts')]")).isDisplayed();

		if(dropdownPresent==true)
		{
			
			System.out.println("Dropdown is appearing");
			Thread.sleep(2000);

			Explicitwaitvisibility(coa.Chartofaccountslide);
			clickjavascript(coa.Chartofaccountslide);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Addaccountbtn_COA);
			clickjavascript(coa.Addaccountbtn_COA);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Accountcodetxt_COA);
			tofill(coa.Accountcodetxt_COA, "8875959");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.TaxDD_COA);
			tofill(coa.TaxDD_COA, "DS: Deemed Supplies (7%)");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountNametxt_COA);
			tofill(coa.AccountNametxt_COA, "AutoAccount33");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountTypeDD_COA);
			tofill(coa.AccountTypeDD_COA, "Current Asset");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountDescription_COA);
			tofill(coa.AccountDescription_COA, "TestDescription");

			Thread.sleep(1000);

			Selectcheckbox(coa.Ispaymentchkbox_COA);

			Explicitwaitvisibility(coa.Savebtn_COA);
			clickjavascript(coa.Savebtn_COA);
		}
		else{
			System.out.println("Dropdown is not appearing");
			Explicitwaitvisibility(coa.Accountingslide);
			clickjavascript(coa.Accountingslide);
			System.out.println("Dropdown is appearing");
			Thread.sleep(2000);

			Explicitwaitvisibility(coa.Chartofaccountslide);
			clickjavascript(coa.Chartofaccountslide);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Addaccountbtn_COA);
			clickjavascript(coa.Addaccountbtn_COA);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Accountcodetxt_COA);
			tofill(coa.Accountcodetxt_COA, "8875959");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.TaxDD_COA);
			tofill(coa.TaxDD_COA, "DS: Deemed Supplies (7%)");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountNametxt_COA);
			tofill(coa.AccountNametxt_COA, "AutoAccount33");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountTypeDD_COA);
			tofill(coa.AccountTypeDD_COA, "Current Asset");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountDescription_COA);
			tofill(coa.AccountDescription_COA, "TestDescription");

			Thread.sleep(1000);

			Selectcheckbox(coa.Ispaymentchkbox_COA);

			Explicitwaitvisibility(coa.Savebtn_COA);
			clickjavascript(coa.Savebtn_COA);
		}
	}

	@Given("User need to verify Assets page account")
	public void user_need_to_verify_assets_page_account() {
		coa = new Accounting_ChartOfAccount_POJO();

		Explicitwaitvisibility(coa.AssetTab_COA);
		clickjavascript(coa.AssetTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "8875959");

		Selectcheckbox(coa.AssetsChkbox_COA);

		Explicitwaitvisibility(coa.OptionsRevenue_COA);
		clickjavascript(coa.OptionsRevenue_COA);

		Explicitwaitvisibility(coa.DeleteRevenue_COA);
		clickjavascript(coa.DeleteRevenue_COA);

		Explicitwaitvisibility(coa.DeletebtnRevenue_COA);
		clickjavascript(coa.DeletebtnRevenue_COA);
	}

	@Given("User need to navigate to add account scenario\\/Liability")
	public void user_need_to_navigate_to_add_account_scenario_liability() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();

		boolean dropdownPresent = driver.findElement(By.xpath("//a[contains(.,'arrow_rightChart of Accounts')]")).isDisplayed();

		if(dropdownPresent==true)
		{
			
			System.out.println("Dropdown is appearing");
			Thread.sleep(2000);

			Explicitwaitvisibility(coa.Chartofaccountslide);
			clickjavascript(coa.Chartofaccountslide);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Addaccountbtn_COA);
			clickjavascript(coa.Addaccountbtn_COA);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Accountcodetxt_COA);
			tofill(coa.Accountcodetxt_COA, "8876969");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.TaxDD_COA);
			tofill(coa.TaxDD_COA, "DS: Deemed Supplies (7%)");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountNametxt_COA);
			tofill(coa.AccountNametxt_COA, "AutoAccount44");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountTypeDD_COA);
			tofill(coa.AccountTypeDD_COA, "Current Liability");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountDescription_COA);
			tofill(coa.AccountDescription_COA, "TestDescription");

			Thread.sleep(1000);

			Selectcheckbox(coa.Ispaymentchkbox_COA);

			Explicitwaitvisibility(coa.Savebtn_COA);
			clickjavascript(coa.Savebtn_COA);
		}
		else{
			System.out.println("Dropdown is not appearing");
			Explicitwaitvisibility(coa.Accountingslide);
			clickjavascript(coa.Accountingslide);
			System.out.println("Dropdown is appearing");
			Thread.sleep(2000);

			Explicitwaitvisibility(coa.Chartofaccountslide);
			clickjavascript(coa.Chartofaccountslide);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Addaccountbtn_COA);
			clickjavascript(coa.Addaccountbtn_COA);

			Thread.sleep(1000);


			Explicitwaitvisibility(coa.Accountcodetxt_COA);
			tofill(coa.Accountcodetxt_COA, "8876969");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.TaxDD_COA);
			tofill(coa.TaxDD_COA, "DS: Deemed Supplies (7%)");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountNametxt_COA);
			tofill(coa.AccountNametxt_COA, "AutoAccount44");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountTypeDD_COA);
			tofill(coa.AccountTypeDD_COA, "Current Liability");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountDescription_COA);
			tofill(coa.AccountDescription_COA, "TestDescription");

			Thread.sleep(1000);

			Selectcheckbox(coa.Ispaymentchkbox_COA);

			Explicitwaitvisibility(coa.Savebtn_COA);
			clickjavascript(coa.Savebtn_COA);
		}
	}

	@Given("User need to verify Liability page account")
	public void user_need_to_verify_liability_page_account() {
		coa = new Accounting_ChartOfAccount_POJO();
		
		Explicitwaitvisibility(coa.LiabilitiesTab_COA);
		clickjavascript(coa.LiabilitiesTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "8876969");

		Selectcheckbox(coa.LiabilitiesChkbox_COA);

		Explicitwaitvisibility(coa.OptionsRevenue_COA);
		clickjavascript(coa.OptionsRevenue_COA);

		Explicitwaitvisibility(coa.DeleteRevenue_COA);
		clickjavascript(coa.DeleteRevenue_COA);

		Explicitwaitvisibility(coa.DeletebtnRevenue_COA);
		clickjavascript(coa.DeletebtnRevenue_COA);
	}

	@Given("User need to navigate to add account scenario\\/Equity")
	public void user_need_to_navigate_to_add_account_scenario_equity() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();
		boolean dropdownPresent = driver.findElement(By.xpath("//a[contains(.,'arrow_rightChart of Accounts')]")).isDisplayed();

		if(dropdownPresent==true)
		{
			
			System.out.println("Dropdown is appearing");
			Thread.sleep(2000);

			Explicitwaitvisibility(coa.Chartofaccountslide);
			clickjavascript(coa.Chartofaccountslide);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Addaccountbtn_COA);
			clickjavascript(coa.Addaccountbtn_COA);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Accountcodetxt_COA);
			tofill(coa.Accountcodetxt_COA, "8877979");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.TaxDD_COA);
			tofill(coa.TaxDD_COA, "DS: Deemed Supplies (7%)");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountNametxt_COA);
			tofill(coa.AccountNametxt_COA, "AutoAccount55");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountTypeDD_COA);
			tofill(coa.AccountTypeDD_COA, "Equity");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountDescription_COA);
			tofill(coa.AccountDescription_COA, "TestDescription");

			Thread.sleep(1000);

			Selectcheckbox(coa.Ispaymentchkbox_COA);

			Explicitwaitvisibility(coa.Savebtn_COA);
			clickjavascript(coa.Savebtn_COA);
		}
		else{
			System.out.println("Dropdown is not appearing");
			Explicitwaitvisibility(coa.Accountingslide);
			clickjavascript(coa.Accountingslide);
			System.out.println("Dropdown is appearing");
			Thread.sleep(2000);

			Explicitwaitvisibility(coa.Chartofaccountslide);
			clickjavascript(coa.Chartofaccountslide);

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.Addaccountbtn_COA);
			clickjavascript(coa.Addaccountbtn_COA);

			Thread.sleep(1000);


			Explicitwaitvisibility(coa.Accountcodetxt_COA);
			tofill(coa.Accountcodetxt_COA, "8877979");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.TaxDD_COA);
			tofill(coa.TaxDD_COA, "DS: Deemed Supplies (7%)");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountNametxt_COA);
			tofill(coa.AccountNametxt_COA, "AutoAccount55");

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountTypeDD_COA);
			tofill(coa.AccountTypeDD_COA, "Equity");
			Thread.sleep(2000);
			toenter();

			Thread.sleep(1000);

			Explicitwaitvisibility(coa.AccountDescription_COA);
			tofill(coa.AccountDescription_COA, "TestDescription");

			Thread.sleep(1000);

			Selectcheckbox(coa.Ispaymentchkbox_COA);

			Explicitwaitvisibility(coa.Savebtn_COA);
			clickjavascript(coa.Savebtn_COA);
		}
	}

	@Given("User need to verify Equity page account")
	public void user_need_to_verify_equity_page_account() {
		coa = new Accounting_ChartOfAccount_POJO();
		
		Explicitwaitvisibility(coa.EquityTab_COA);
		clickjavascript(coa.EquityTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "8877979");

		Selectcheckbox(coa.EquityChkbox_COA);

		Explicitwaitvisibility(coa.OptionsRevenue_COA);
		clickjavascript(coa.OptionsRevenue_COA);

		Explicitwaitvisibility(coa.DeleteRevenue_COA);
		clickjavascript(coa.DeleteRevenue_COA);

		Explicitwaitvisibility(coa.DeletebtnRevenue_COA);
		clickjavascript(coa.DeletebtnRevenue_COA);
	}



	@Then("User need to Verify added account")
	public void user_need_to_verify_added_account() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();
		i=new Sales_Invoice_POJO();

		Explicitwaitvisibility(i.Salesslide);
		clickjavascript(i.Salesslide);
		Explicitwaitvisibility(i.Invoiceslide);
		clickjavascript(i.Invoiceslide);
		Explicitwaitvisibility(i.awaitingpayment);
		clickjavascript(i.awaitingpayment);
		Explicitwaitvisibility(i.Firstrowinvoice);
		clickjavascript(i.Firstrowinvoice);

		Thread.sleep(2000);

		/*Explicitwaitvisibility(i.skip);
		clickjavascript(i.skip);*/

		Explicitwaitvisibility(i.datepaid);

		ScrolldownElement(i.datepaid);

		Thread.sleep(1000);
		tomovethecursor(i.datepaid);
		tofill(i.datepaid, "10/11/2022");
		Thread.sleep(1000);

		clickjavascript(i.PaidTo);
		tofill(i.PaidTo, "AutoAccount11");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(2000);
		/*
		tomovethecursor(coa.paidto);
		tofill(coa.paidto, "AutoAccount1");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

		 */

		/*Explicitwaitvisibility(i.bankrate);
		Toclear(i.bankrate);
		tofill(i.bankrate, "2");*/

		Thread.sleep(2000);
		tomovethecursor(i.cash);
		Thread.sleep(1000);
		tofill(i.cash, "Cash");
		Thread.sleep(2000);
		toenter();


		Thread.sleep(2000);
		Explicitwaitvisibility(i.Addrefundbtn);
		clickjavascript(i.Addrefundbtn);

		Explicitwaitvisibility(i.ok);
		clickjavascript(i.ok);
		
		/*Thread.sleep(2000);
		Explicitwaitvisibility(i.ok);
		clickjavascript(i.ok);*/
	}

	@Given("User need to navigate to add account scenario2")
	public void user_need_to_navigate_to_add_account_scenario2() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();

		Explicitwaitvisibility(coa.Accountingslide);
		clickjavascript(coa.Accountingslide);

		Thread.sleep(2000);

		Explicitwaitvisibility(coa.Chartofaccountslide);
		clickjavascript(coa.Chartofaccountslide);

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.Addaccountbtn_COA);
		clickjavascript(coa.Addaccountbtn_COA);

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.Accountcodetxt_COA);
		tofill(coa.Accountcodetxt_COA, "8873789939");

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.TaxDD_COA);
		tofill(coa.TaxDD_COA, "DS: Deemed Supplies (7%)");
		Thread.sleep(2000);
		toenter();

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.AccountNametxt_COA);
		tofill(coa.AccountNametxt_COA, "AutoAccount2");

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.AccountTypeDD_COA);
		tofill(coa.AccountTypeDD_COA, "Current Asset");
		Thread.sleep(2000);
		toenter();

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.AccountDescription_COA);
		tofill(coa.AccountDescription_COA, "TestDescription");

		unSelectcheckbox(coa.Ispaymentchkbox_COA);

		Thread.sleep(3000);
		Explicitwaitvisibility(coa.Savebtn_COA);
		clickjavascript(coa.Savebtn_COA);

	}

	@Then("User need to Verify added account2")
	public void user_need_to_verify_added_account2() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();
		s=new Sales_Quotation_POJO();

		i=new Sales_Invoice_POJO();
		Explicitwaitvisibility(s.Salesslide);
		clickjavascript(s.Salesslide);
		Explicitwaitvisibility(s.Quotationslide);
		clickjavascript(s.Quotationslide);
		Thread.sleep(4000);


		Explicitwaitvisibility(s.drafttab);
		clickjavascript(s.drafttab);
		Explicitwaitvisibility(s.SearchboxQuotation);
		clickjavascript(s.SearchboxQuotation);
		tofill(s.SearchboxQuotation, "Automation");
		clickjavascript(s.Searchbutton);

		Thread.sleep(3000);

		Explicitwaitvisibility(s.Selectaquotation);
		clickjavascript(s.Selectaquotation);

		Thread.sleep(3000);

		Explicitwaitvisibility(s.ExpiryDatetxtbox);
		tofill(s.ExpiryDatetxtbox, "08/11/2022");

		Explicitwaitvisibility(s.accountselectoutframe);
		clickjavascript(s.accountselectoutframe);
		Thread.sleep(2000);
		clickjavascript(s.accountselecttxt);
		tofill(s.accountselecttxt, "AutoAccount2");
		Thread.sleep(3000);


		ScrolldownElement(s.ApproveBtn);
		Explicitwaitvisibility(s.ApproveBtn);
		clickjavascript(s.ApproveBtn);
		Thread.sleep(3000);

		Explicitwaitvisibility(i.ok);
		clickjavascript(i.ok);

	}

	@Given("User need to navigate to add bank account")
	public void user_need_to_navigate_to_add_bank_account() {


	}

	@Then("User need to Verify added bank account")
	public void user_need_to_verify_added_bank_account() {


	}




	@Given("User need to navigate to Import page")
	public void user_need_to_navigate_to_import_page() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();

	}

	@Then("User need to Upload the file and import a account")
	public void user_need_to_upload_the_file_and_import_a_account() {
		coa = new Accounting_ChartOfAccount_POJO();

	}





}
