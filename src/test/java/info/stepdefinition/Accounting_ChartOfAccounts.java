package info.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;

import info.base.Reusableclass;
import info.pojo.Accounting_ChartOfAccount_POJO;
import info.pojo.Sales_Invoice_POJO;
import info.pojo.Sales_Quotation_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Accounting_ChartOfAccounts extends Reusableclass {
	public static Accounting_ChartOfAccount_POJO coa;
	public static Sales_Invoice_POJO i;
	public static Sales_Quotation_POJO s;
	@Given("User need to navigate to add account in chart of accounts page and enter details like account code,account name ,Tax Id..Etc")
	public void user_need_to_navigate_to_add_account_in_chart_of_accounts_page_and_enter_details_like_account_code_account_name_tax_id_etc() throws InterruptedException, AWTException {

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

		Thread.sleep(2000);

		Selectcheckbox(coa.Ispaymentchkbox_COA);

		Thread.sleep(3000);
		Explicitwaitvisibility(coa.Savebtn_COA);
		clickjavascript(coa.Savebtn_COA);

		Thread.sleep(3000);
	}


	@Given("User need to edit an added account in revenue tab and edit the account name and save the edited account")
	public void user_need_to_edit_an_added_account_in_revenue_tab_and_edit_the_account_name_and_save_the_edited_account() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();

		Thread.sleep(2000);

		Explicitwaitvisibility(coa.RevenueTab_COA);
		clickjavascript(coa.RevenueTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "887553333");

		Explicitwaitvisibility(coa.Selecteditrevenge_COA);
		clickjavascript(coa.Selecteditrevenge_COA);

		Thread.sleep(1000);


		Explicitwaitvisibility(coa.AccountNametxt_COA);
		Toclear(coa.AccountNametxt_COA);
		tofill(coa.AccountNametxt_COA, "AutoAccount12");

		Thread.sleep(3000);
		Explicitwaitvisibility(coa.Savebtn_COA);
		clickjavascript(coa.Savebtn_COA);
	}



	@Given("User need to verify Revenue page account and delete the revenue account")
	public void user_need_to_verify_revenue_page_account_and_delete_the_revenue_account() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();

		Thread.sleep(2000);


		Explicitwaitvisibility(coa.RevenueTab_COA);
		clickjavascript(coa.RevenueTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "887553333");

		Thread.sleep(3000);

		Selectcheckbox(coa.RevenueChkbox_COA);



		Explicitwaitvisibility(coa.OptionsRevenue_COA);
		clickjavascript(coa.OptionsRevenue_COA);

		Explicitwaitvisibility(coa.DeleteRevenue_COA);
		clickjavascript(coa.DeleteRevenue_COA);

		Explicitwaitvisibility(coa.DeletebtnRevenue_COA);
		clickjavascript(coa.DeletebtnRevenue_COA);

	}


	@Given("User need to navigate to add account in chart of accounts page\\/Expenses")
	public void user_need_to_navigate_to_add_account_in_chart_of_accounts_page_expenses() throws InterruptedException, AWTException {
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


	@Given("User need to edit an added account in expenses tab")
	public void user_need_to_edit_an_added_account_in_expenses_tab() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();
		Thread.sleep(2000);

		Explicitwaitvisibility(coa.ExpensesTab_COA);
		clickjavascript(coa.ExpensesTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "8874949");

		Explicitwaitvisibility(coa.Selecteditexpenses_COA);
		clickjavascript(coa.Selecteditexpenses_COA);

		Thread.sleep(1000);


		Explicitwaitvisibility(coa.AccountNametxt_COA);
		Toclear(coa.AccountNametxt_COA);
		tofill(coa.AccountNametxt_COA, "AutoAccount23");

		Thread.sleep(3000);
		Explicitwaitvisibility(coa.Savebtn_COA);
		clickjavascript(coa.Savebtn_COA);

	}


	@Given("User need to verify Expenses page account and delete the expenses account")
	public void user_need_to_verify_expenses_page_account_and_delete_the_expenses_account() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();
		Thread.sleep(2000);

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

	@Given("User need to navigate to add account in chart of accounts page\\/Assets")
	public void user_need_to_navigate_to_add_account_in_chart_of_accounts_page_assets() throws InterruptedException, AWTException {
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

	@Given("User need to edit an added account in Assets tab")
	public void user_need_to_edit_an_added_account_in_assets_tab() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();

		Thread.sleep(2000);

		Explicitwaitvisibility(coa.AssetTab_COA);
		clickjavascript(coa.AssetTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "8875959");

		Explicitwaitvisibility(coa.Selecteditassert_COA);
		clickjavascript(coa.Selecteditassert_COA);

		Thread.sleep(1000);


		Explicitwaitvisibility(coa.AccountNametxt_COA);
		Toclear(coa.AccountNametxt_COA);
		tofill(coa.AccountNametxt_COA, "AutoAccount34");

		Thread.sleep(3000);
		Explicitwaitvisibility(coa.Savebtn_COA);
		clickjavascript(coa.Savebtn_COA);

	}


	@Given("User need to verify Assets page account and delete the asset account")
	public void user_need_to_verify_assets_page_account_and_delete_the_asset_account() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();

		Thread.sleep(2000);

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

	@Given("User need to navigate to add account in chart of accounts page\\/Liability")
	public void user_need_to_navigate_to_add_account_in_chart_of_accounts_page_liability() throws InterruptedException, AWTException {
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

	@Given("User need to edit an added account in Liability tab")
	public void user_need_to_edit_an_added_account_in_liability_tab() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();

		Thread.sleep(2000);

		Explicitwaitvisibility(coa.LiabilitiesTab_COA);
		clickjavascript(coa.LiabilitiesTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "8876969");

		Explicitwaitvisibility(coa.Selecteditliability_COA);
		clickjavascript(coa.Selecteditliability_COA );

		Thread.sleep(1000);


		Explicitwaitvisibility(coa.AccountNametxt_COA);
		Toclear(coa.AccountNametxt_COA);
		tofill(coa.AccountNametxt_COA, "AutoAccount45");

		Thread.sleep(3000);
		Explicitwaitvisibility(coa.Savebtn_COA);
		clickjavascript(coa.Savebtn_COA);

	}


	@Given("User need to verify Liability page account and delete the liability account")
	public void user_need_to_verify_liability_page_account_and_delete_the_liability_account() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();

		Thread.sleep(2000);

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

	@Given("User need to navigate to add account in chart of accounts page\\/Equity")
	public void user_need_to_navigate_to_add_account_in_chart_of_accounts_page_equity() throws InterruptedException, AWTException {
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

			Thread.sleep(2000);

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

	@Given("User need to edit an added account in Equity tab")
	public void user_need_to_edit_an_added_account_in_equity_tab() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();

		Thread.sleep(2000);

		Explicitwaitvisibility(coa.EquityTab_COA);
		clickjavascript(coa.EquityTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "8877979");

		Explicitwaitvisibility(coa.SelecteditEquity_COA);
		clickjavascript(coa.SelecteditEquity_COA);

		Thread.sleep(1000);


		Explicitwaitvisibility(coa.AccountNametxt_COA);
		Toclear(coa.AccountNametxt_COA);
		tofill(coa.AccountNametxt_COA, "AutoAccount55");

		Thread.sleep(3000);
		Explicitwaitvisibility(coa.Savebtn_COA);
		clickjavascript(coa.Savebtn_COA);

	}

	@Given("User need to edit an tax in Equity tab")
	public void user_need_to_edit_an_tax_in_equity_tab() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();

		Thread.sleep(2000);
		Explicitwaitvisibility(coa.EquityTab_COA);
		clickjavascript(coa.EquityTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "8877979");

		Selectcheckbox(coa.EquityChkbox_COA);

		Explicitwaitvisibility(coa.EquityExpandoption_COA);
		clickjavascript(coa.EquityExpandoption_COA);

		Explicitwaitvisibility(coa.Changetax_COA);
		clickjavascript(coa.Changetax_COA);

		Explicitwaitvisibility(coa.Changetaxtype_COA);
		tofill(coa.Changetaxtype_COA,"ES33: Regulation 33 Exempt Supplies (0%)");
		toenter();

		Explicitwaitvisibility(coa.Savebtnchangetax_COA);
		clickjavascript(coa.Savebtnchangetax_COA);


	}

	@Given("User need to move a record to archieve in Equity tab")
	public void user_need_to_move_a_record_to_archieve_in_equity_tab() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();

		Thread.sleep(2000);
		Explicitwaitvisibility(coa.EquityTab_COA);
		clickjavascript(coa.EquityTab_COA);

		Explicitwaitvisibility(coa.Searchbox_COA);
		clickjavascript(coa.Searchbox_COA);
		tofill(coa.Searchbox_COA, "8877979");

		Thread.sleep(1000);

		Selectcheckbox(coa.EquityChkbox_COA);


		Explicitwaitvisibility(coa.EquityExpandoption_COA);
		clickjavascript(coa.EquityExpandoption_COA);

		Explicitwaitvisibility(coa.Archieveoption_COA);
		Thread.sleep(1000);
		clickjavascript(coa.Archieveoption_COA);


		Explicitwaitvisibility(coa.Archieveoptionselect_COA);
		clickjavascript(coa.Archieveoptionselect_COA);

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.ArchieveTab_COA);
		clickjavascript(coa.ArchieveTab_COA);

		Thread.sleep(1000);

		Selectcheckbox(coa.EquityChkbox_COA);


		Explicitwaitvisibility(coa.EquityExpandoption_COA);
		clickjavascript(coa.EquityExpandoption_COA);

		Explicitwaitvisibility(coa.Restoreselect_COA);
		clickjavascript(coa.Restoreselect_COA);


	}


	@Given("User need to verify Equity page account and delete the equity account")
	public void user_need_to_verify_equity_page_account_and_delete_the_equity_account() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();

		Thread.sleep(3000);

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



	@Given("User need to Verify added account through making a complete payment in invoice")
	public void user_need_to_verify_added_account_through_making_a_complete_payment_in_invoice() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();
		i=new Sales_Invoice_POJO();
		ScrollupElement(i.Salesslide);
		Explicitwaitvisibility(i.Salesslide);
		clickjavascript(i.Salesslide);
		Explicitwaitvisibility(i.Invoiceslide);
		clickjavascript(i.Invoiceslide);
		Explicitwaitvisibility(i.awaitingpayment);
		clickjavascript(i.awaitingpayment);
		Thread.sleep(3000);
		Explicitwaitvisibility(i.Firstrowinvoice);
		clickjavascript(i.Firstrowinvoice);

		Thread.sleep(4000);

		/*Explicitwaitvisibility(i.skip);
		clickjavascript(i.skip);*/

		Explicitwaitvisibility(i.datepaid);

		ScrolldownElement(i.datepaid);

		Thread.sleep(1000);
		tomovethecursor(i.datepaid);
		tofill(i.datepaid, "12/12/2022");
		Thread.sleep(1000);

		Explicitwaitvisibility(i.PaidTo);
		clickjavascript(i.PaidTo);
		tofill(i.PaidTo, "asxsad");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(2000);

		Explicitwaitvisibility(i.bankrate);
		Toclear(i.bankrate);
		tofill(i.bankrate, "2");

		Thread.sleep(2000);
		Explicitwaitvisibility(i.cash);
		tomovethecursor(i.cash);
		Thread.sleep(1000);
		tofill(i.cash, "Cash");
		Thread.sleep(2000);
		toenter();


		Explicitwaitvisibility(i.Addrefundbtn);
		clickjavascript(i.Addrefundbtn);

		Explicitwaitvisibility(i.ok);
		clickjavascript(i.ok);


	}

	@Given("User need to navigate to add account scenario2")
	public void user_need_to_navigate_to_add_account_scenario2() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();
		ScrolldownElement(coa.Accountingslide);
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
		tofill(coa.Accountcodetxt_COA, "887377868680");

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.TaxDD_COA);
		tofill(coa.TaxDD_COA, "DS: Deemed Supplies (7%)");
		Thread.sleep(2000);
		toenter();

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.AccountNametxt_COA);
		tofill(coa.AccountNametxt_COA, "AutoAccounttests6666666");

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.AccountTypeDD_COA);
		tofill(coa.AccountTypeDD_COA, "Current Asset");
		Thread.sleep(2000);
		toenter();

		Thread.sleep(1000);

		Explicitwaitvisibility(coa.AccountDescription_COA);
		tofill(coa.AccountDescription_COA, "Test-Description");

		unSelectcheckbox(coa.Ispaymentchkbox_COA);

		Thread.sleep(3000);
		Explicitwaitvisibility(coa.Savebtn_COA);
		clickjavascript(coa.Savebtn_COA);


	}

	/*@Then("User need to Verify added account2")
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
		tofill(s.ExpiryDatetxtbox, "20/11/2022");

		Explicitwaitvisibility(s.accountselectoutframe);
		clickjavascript(s.accountselectoutframe);
		Thread.sleep(2000);
		clickjavascript(s.accountselecttxt);
		tofill(s.accountselecttxt, "AutoAccountnopay");
		Thread.sleep(3000);


		ScrolldownElement(s.ApproveBtn);
		Explicitwaitvisibility(s.ApproveBtn);
		clickjavascript(s.ApproveBtn);
		Thread.sleep(3000);

		Explicitwaitvisibility(i.ok);
		clickjavascript(i.ok);

	}

	 */

	@Given("User need to navigate to send statement page")
	public void user_need_to_navigate_to_send_statement_page() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();
		Explicitwaitvisibility(coa.ContactMenu_COA);
		clickjavascript(coa.ContactMenu_COA);
		Thread.sleep(2000);
		Explicitwaitvisibility(coa.SendStatementbtn_COA);
		clickjavascript(coa.SendStatementbtn_COA);


	}

	@When("User need to select statement type and search for required statement")
	public void user_need_to_select_statement_type_and_search_for_required_statement() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();
		Thread.sleep(2000);
		Explicitwaitvisibility(coa.StatementTypeDD_COA);
		Toclear(coa.StatementTypeDD_COA);
		tofill(coa.StatementTypeDD_COA, "Activity");

		Explicitwaitvisibility(coa.FromDate_COA);
		Toclear(coa.FromDate_COA);
		tofill(coa.FromDate_COA, "12/12/2022");

		Explicitwaitvisibility(coa.toDate_COA);
		Toclear(coa.toDate_COA);
		tofill(coa.toDate_COA, "16/12/2022");

		Explicitwaitvisibility(coa.SearchBtn_COA);
		clickjavascript(coa.SearchBtn_COA);
	}
	@Then("User need to select a record and print the record")
	public void user_need_to_select_a_record_and_print_the_record() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();


		Explicitwaitvisibility(coa.Searchboxlist_COA);
		Toclear(coa.Searchboxlist_COA);
		tofill(coa.Searchboxlist_COA, "Automation");
		Thread.sleep(2000);
		toenter();

		Thread.sleep(3000);
		Selectcheckbox(coa.CheckAllSendStatement__COA);

		Explicitwaitvisibility(coa.PrintBtn__COA);
		clickjavascript(coa.PrintBtn__COA);

		Explicitwaitvisibility(coa.ThemeDD__COA);
		Toclear(coa.ThemeDD__COA);
		tofill(coa.ThemeDD__COA, "Standard Template");
		Thread.sleep(2000);
		clickjavascript(coa.OkBtn_ThemeDD__COA);
		/*
		Thread.sleep(5000);
		Explicitwaitvisibility(coa.OpenPrintBtn__COA);
		clickjavascript(coa.OpenPrintBtn__COA);

		Thread.sleep(5000);
		Explicitwaitvisibility(coa.CancelBtn_PrintPage__COA);
		clickjavascript(coa.CancelBtn_PrintPage__COA);*/

		Thread.sleep(5000);
		Explicitwaitvisibility(coa.Closebtn__COA);
		clickjavascript(coa.Closebtn__COA);

	}

	@Given("User need to navigate to send statement page for email verification")
	public void user_need_to_navigate_to_send_statement_page_for_email_verification() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();
		Explicitwaitvisibility(coa.Email_COA);
		clickjavascript(coa.Email_COA);


	}

	@When("User need to select statement type and search for required statement to verify a email")
	public void user_need_to_select_statement_type_and_search_for_required_statement_to_verify_a_email() throws InterruptedException, AWTException {
		coa = new Accounting_ChartOfAccount_POJO();
		Thread.sleep(2000);
		Explicitwaitvisibility(coa.EmailTouchframe_COA);
		clickjavascript(coa.EmailTouchframe_COA);
		Thread.sleep(1000);
		Explicitwaitvisibility(coa.EmailEnter_COA);
		clickjavascript(coa.EmailEnter_COA);
		Toclear(coa.EmailEnter_COA);
		tofill(coa.EmailEnter_COA, "emailverification@mailinator.com");
		totabkey();

	}

	@Then("User need to select a record and send the record to the particular email")
	public void user_need_to_select_a_record_and_send_the_record_to_the_particular_email() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();

		Thread.sleep(2000);
		ScrolldownElement(coa.Sendbtn_COA);
		Explicitwaitvisibility(coa.Sendbtn_COA);
		clickjavascript(coa.Sendbtn_COA);
	}

	@Given("User need to navigate to send statement page for Dowmload verification")
	public void user_need_to_navigate_to_send_statement_page_for_dowmload_verification() throws InterruptedException {
		coa = new Accounting_ChartOfAccount_POJO();

		Explicitwaitvisibility(coa.Download_COA);
		clickjavascript(coa.Download_COA);
		Thread.sleep(2000);
		Explicitwaitvisibility(coa.ThemeDD__COA);
		Toclear(coa.ThemeDD__COA);
		tofill(coa.ThemeDD__COA, "Standard Template");
		Thread.sleep(2000);
		clickjavascript(coa.OkBtn_ThemeDD__COA);
	}

	//import scenario
	//Export scenario




}
