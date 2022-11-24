package info.stepdefinition;

import info.base.Reusableclass;
import info.pojo.Account_Login_POJO;
import info.pojo.Chartof_Accounts_POJO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Add_Cash_Account extends Reusableclass {

	public static Account_Login_POJO a;
	public static Chartof_Accounts_POJO c;

	@Given("User needs to navigate to chart of accounts screen and click add cash account")
	public void user_needs_to_navigate_to_chart_of_accounts_screen_and_click_add_cash_account()  throws InterruptedException {

		

		c = new Chartof_Accounts_POJO();

		Explicitwaitvisibility(c.Accounting);
		tomovethecursor(c.Accounting);
		Thread.sleep(1000);
		toClick(c.Accounting);
		Thread.sleep(2000);
		tomovethecursor(c.chartofaccounts);
		Thread.sleep(1000);
		toClick(c.chartofaccounts);
		Thread.sleep(1000);
		Explicitwaitvisibility(c.addcashaccountaccount);
		tomovethecursor(c.addcashaccountaccount);
		Thread.sleep(2000);
		toClick(c.addcashaccountaccount);
		Thread.sleep(3000);

	}

	@Then("User needs to click Add Cash account and navigate to banking page and verify whether the page navigated correctly")
	public void user_needs_to_click_add_cash_account_and_navigate_to_banking_page_and_verify_whether_the_page_navigated_correctly() throws InterruptedException {

		c = new Chartof_Accounts_POJO();

		String title = "https://staging.infotech-accounting.com/bankaccounts/cashinhandaccount";
		System.out.println("Chart of account add cash account page is:" + title);
		
		boolean acname = c.accountnamechart.isDisplayed();
		
		System.out.println("Accountnamechart is:" + acname);
		
		Thread.sleep(3000);
		tomovethecursor(c.Banking);
		Thread.sleep(1000);
		clickjavascript(c.Banking);
		Thread.sleep(3000);
		tomovethecursor(c.Bankingaccounts);
		Thread.sleep(1000);
		toClick(c.Bankingaccounts);
		Thread.sleep(2000);
		tomovethecursor(c.Addcashaccountbank);
		Thread.sleep(1000);
		toClick(c.addcashaccountaccount);

		String currentUrl = driver.getCurrentUrl();

		if (title.equals(currentUrl)) {

			Thread.sleep(1000);
			
			System.out.println("Current URL is:"+ currentUrl);
			
			boolean present = c.accountnamechart.equals(c.accountnamebanking);
			
			System.out.println("Both Webpage element is same:" + present);

		} else {

			System.out.println("Both pages are not same");
		}
		
		System.out.println("Both Addcash account page is same");
		
	}

}