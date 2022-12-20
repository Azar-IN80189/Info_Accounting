package info.stepdefinition;

import info.base.Reusableclass;
import info.pojo.Account_Login_POJO;
import info.pojo.Chartof_Accounts_POJO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Add_Bank_Account extends Reusableclass {

	public static Account_Login_POJO a;
	public static Chartof_Accounts_POJO c;

	@Given("User needs to navigate to Chart of account and click add bank account")
	public void user_needs_to_navigate_to_chart_of_account_and_click_add_bank_account() throws InterruptedException {

		a = new Account_Login_POJO();
		c = new Chartof_Accounts_POJO();

		if (c.chartofaccounts.isDisplayed()) {
			Explicitwaitvisibility(c.chartofaccounts);
			clickjavascript(c.chartofaccounts);
			Thread.sleep(1000);
		} else {
			Explicitwaitvisibility(c.Accounting);
			Thread.sleep(1000);
			clickjavascript(c.Accounting);
			Thread.sleep(2000);
			Explicitwaitvisibility(c.chartofaccounts);
			clickjavascript(c.chartofaccounts);
			Thread.sleep(1000);
		}

	}

	@Then("User needs to click add bank account and navigate to banking page and verify whether the page navigated correctly")
	public void user_needs_to_click_add_bank_account_and_navigate_to_banking_page_and_verify_whether_the_page_navigated_correctly() throws InterruptedException {

		c = new Chartof_Accounts_POJO();
		
		Explicitwaitvisibility(c.Addbankaccount);
		tomovethecursor(c.Addbankaccount);
		Thread.sleep(1000);
		clickjavascript(c.Addbankaccount);
		Thread.sleep(2000);
		Explicitwaitvisibility(c.selectbankone);
		tofill(c.selectbankone, "Indian Bank (Foreig");
		Thread.sleep(1000);
		Explicitwaitvisibility(c.bankname);
		tomovethecursor(c.bankname);
		Thread.sleep(2000);
		clickjavascript(c.bankname);
		Thread.sleep(1000);

		String title = "https://staging.infotech-accounting.com/bankaccounts/manualaddbankaccount";

		System.out.println("Chartof account add bank account istitle is:" + title);

		Thread.sleep(3000);
		tomovethecursor(c.Banking);
		Thread.sleep(1000);
		clickjavascript(c.Banking);
		Thread.sleep(3000);
		tomovethecursor(c.Bankingaccounts);
		Thread.sleep(1000);
		toClick(c.Bankingaccounts);
		Thread.sleep(2000);

		tomovethecursor(c.addbankaccountbanking);
		Thread.sleep(2000);
		toClick(c.addbankaccountbanking);

		Thread.sleep(2000);
		tofill(c.selectbanktwo, "Indian Bank (Foreig");
		Thread.sleep(1000);

		tomovethecursor(c.banknameinbanking);
		Thread.sleep(1000);
		toClick(c.banknameinbanking);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Currenturl:"+currentUrl);

		if (title.equals(currentUrl)) {

			Thread.sleep(1000);

			System.out.println("current Url is:" + currentUrl);

			boolean present = c.acnameaccounting.equals(c.acnamebankingtwo);
			System.out.println("Both WebElement is same:" + present);
			System.out.println("Both pages are sames");

		} else {
			System.out.println("Both pages are not same");
		}
	}}

