package info.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import info.base.Reusableclass;
import info.pojo.Account_Login_POJO;
import info.pojo.Purchase_CreditNotes_POJO;
import info.pojo.Sale_Quotation_POJO;
import info.pojo.UserCreation_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sale_Quotation extends Reusableclass {

	public static Sale_Quotation_POJO s;
	public static Purchase_CreditNotes_POJO p;
	public static UserCreation_POJO u;
	public static Account_Login_POJO a;
	@Given("User need to navigate to Quotation slide")
	public void user_need_to_navigate_to_quotation_slide() throws InterruptedException {
		s=new Sale_Quotation_POJO();
		

			Explicitwaitvisibility(s.Salesslide);
			clickjavascript(s.Salesslide);
			Explicitwaitvisibility(s.Quotationslide);
			clickjavascript(s.Quotationslide);
		}
	

	



	@Given("User need to create and Approve a Quotation by entering details like Customer contact,Date,Expiry date..Etc")
	public void user_need_to_create_and_approve_a_quotation_by_entering_details_like_customer_contact_date_expiry_date_etc() throws AWTException, InterruptedException, IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Thread.sleep(4000);
		Explicitwaitvisibility(s.NewQuotationbtn);
		clickjavascript(s.NewQuotationbtn);

		Explicitwait(s.Customerselect);
		clickjavascript(s.Customerselect);
		Thread.sleep(1000);
		tofill(s.Customerselect, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(s.QuotationDate, "16/12/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);
		tofill(s.ExpiryDate, "27/12/2022");
		totabkey();
		Thread.sleep(1000);
		tofill(s.Referencetxtbox, "Sales");
		Thread.sleep(1000);
		actionssendkeysdelete(s.CurrencyDD);
		tofill(s.CurrencyDD, "SGD - Singapore Dollar");
		toenter();
		tofill(s.Amountsare, "Tax Exclusive");
		toenter();
		tofill(s.ThemeDD, "Letter Head Template");
		toenter();
		Thread.sleep(4000);

		Explicitwaitvisibility(s.Items1);
		clickjavascript(s.Items1);
		Thread.sleep(1000);
		tofill(s.Items1text, "Testitem1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.Attentiontotxt);
		tofill(s.Attentiontotxt, "testattention");
		Thread.sleep(1000);
		tofill(s.contactNumbertxt, "1234567890");
		ScrolldownElement(s.DeliveryInstructions);
		tofill(s.DeliveryInstructions, "Testdeliveryinstruction");
		ScrolldownElement(s.ApproveBtn);
		toClick(s.ApproveBtn);
		Thread.sleep(3000);
		Explicitwaitvisibility(s.Okbtnn);
		clickjavascript(s.Okbtnn);


		u=new UserCreation_POJO();




	}
	@Then("User need to send the quotation to client")
	public void user_need_to_send_the_quotation_to_client() throws InterruptedException, IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Thread.sleep(1000);
		Explicitwaitvisibility(s.SendBtn);
		toClick(s.SendBtn);
		Thread.sleep(4000);
		Explicitwaitvisibility(s.Mailto);
		tofill(s.Mailto, "testemailquotation@mailinator.com");
		Thread.sleep(1000);
		//toClick(s.Sendmeacopychkbox);
		ScrolldownElement(s.Sendmailbtn);
		clickjavascript(s.Sendmailbtn);

	}
	@And("User need to check whether the quotation is recieved in client mail address")
	public void user_need_to_check_whether_the_quotation_is_recieved_in_client_mail_address() throws IOException, InterruptedException, AWTException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		a = new Account_Login_POJO();

		Thread.sleep(4000);
		driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
		highLightElement(u.SearchMailinator);
		Toclear(u.SearchMailinator);
		tofill(u.SearchMailinator, "testemailquotation");
		Thread.sleep(6000);
		toenter();

		Explicitwaitvisibility(u.Displayemail);
		Thread.sleep(2000);
		Explicitwaitvisibility(u.mailinatorvisiblemailquotation);
		clickjavascript(u.mailinatorvisiblemailquotation);
		Pageloadtimeout();
		Scrolldownjavascript();
		Pageloadtimeout();
		Scrolldownjavascript();
		driver.switchTo().frame(u.framestxtbody);
		Explicitwaitvisibility(u.mailinatorresetpassquotation);
		ScrolldownElement(u.mailinatorresetpassquotation);
		clickjavascript(u.mailinatorresetpassquotation);

	}
	@And("User need to accept the quotation and navigate back to info accounting home screen")
	public void user_need_to_accept_the_quotation_and_navigate_back_to_info_accounting_home_screen() throws InterruptedException {
		s=new Sale_Quotation_POJO();

		try {
			Thread.sleep(3000);
			tohandlewindows();
			Explicitwaitvisibility(s.Accept);
			clickjavascript(s.Accept);
			Thread.sleep(2000);
			Explicitwaitvisibility(s.Okbtnapprovetabs);
			clickjavascript(s.Okbtnapprovetabs);
		} catch (Exception e) {

			System.out.println("Approve button not found");
		}
		driver.navigate().to("https://staging.infotech-accounting.com/login");
		driver.switchTo().defaultContent();
	}


	@And("User need to mark the quotation invoice as invoiced")
	public void user_need_to_mark_the_quotation_invoice_as_invoiced() throws InterruptedException {
		s=new Sale_Quotation_POJO();

		if (s.Quotationslide.isDisplayed()) {
			Thread.sleep(1000);
			Explicitwaitvisibility(s.Quotationslide);
			clickjavascript(s.Quotationslide);
		} else {
			Explicitwaitvisibility(s.Salesslide);
			clickjavascript(s.Salesslide);
			Explicitwaitvisibility(s.Quotationslide);
			clickjavascript(s.Quotationslide);
		}

		Explicitwaitvisibility(s.Acceptedtab_Q);
		clickjavascript(s.Acceptedtab_Q);
		Thread.sleep(3000);

		clickjavascript(s.Accepttabchkbox2);
		System.out.println("check not done normal click implemented");


		Explicitwaitvisibility(s.Markasinvoicedbtn);
		clickjavascript(s.Markasinvoicedbtn);

		Explicitwaitvisibility(s.Acceptedtab_Okbtn);
		clickjavascript(s.Acceptedtab_Okbtn);

		Thread.sleep(3000);

		Explicitwaitvisibility(s.Invoicedtab);
		clickjavascript(s.Invoicedtab);



	}



	@Given("User need to Save a Quotation as draft")
	public void user_need_to_save_a_quotation_as_draft() throws InterruptedException, AWTException, IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();

		if (s.Quotationslide.isDisplayed()) {
			Thread.sleep(1000);
			Explicitwaitvisibility(s.Quotationslide);
			clickjavascript(s.Quotationslide);
		} else {
			Explicitwaitvisibility(s.Salesslide);
			clickjavascript(s.Salesslide);
			Explicitwaitvisibility(s.Quotationslide);
			clickjavascript(s.Quotationslide);
		}
		Thread.sleep(4000);
		Explicitwaitvisibility(s.NewQuotationbtn);
		toClick(s.NewQuotationbtn);


		Explicitwaitvisibility(s.Customerselect);
		clickjavascript(s.Customerselect);
		Thread.sleep(1000);
		tofill(s.Customerselect, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);
		Toclear(s.QuotationDate);
		tofill(s.QuotationDate, "16/12/2022");
		Thread.sleep(1000);
		Toclear(s.ExpiryDate);
		Thread.sleep(2000);
		tofill(s.ExpiryDate, "27/12/2022");
		totabkey();
		Thread.sleep(1000);
		Toclear(s.Referencetxtbox);
		tofill(s.Referencetxtbox, "Sales");
		Thread.sleep(1000);
		Toclear(s.CurrencyDD);
		tofill(s.CurrencyDD, "SGD - Singapore Dollar");
		Thread.sleep(2000);
		toenter();
		Toclear(s.Amountsare);
		tofill(s.Amountsare, "Tax Exclusive");
		Thread.sleep(2000);
		toenter();
		Toclear(s.ThemeDD);
		tofill(s.ThemeDD, "Letter Head Template");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(4000);
		Explicitwaitvisibility(s.Items1);
		clickjavascript(s.Items1);
		Thread.sleep(2000);
		Explicitwaitvisibility(s.Items1);
		clickjavascript(s.Items1);
		Explicitwaitvisibility(s.Items1text);
		tofill(s.Items1text, "Testitem1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.Attentiontotxt);
		tofill(s.Attentiontotxt, "testattention");
		Thread.sleep(1000);
		tofill(s.contactNumbertxt, "1234567890");
		Thread.sleep(1000);
		ScrolldownElement(s.DeliveryInstructions);
		tofill(s.DeliveryInstructions, "Testdeliveryinstruction");
		ScrolldownElement(s.SaveBtn);
		toClick(s.SaveBtn);
		Thread.sleep(4000);
		toenter();
		Thread.sleep(1000);
		Explicitwaitvisibility(s.Searchboxtxt);
		Thread.sleep(1000);
		tofill(s.Searchboxtxt, "Sales");
		Thread.sleep(1000);
		toClick(s.Searchbtn);
		Thread.sleep(1000);
		clickjavascript(s.Checkallbox);

	}

	@Then("User need to navigate draft tab and click submit for approval-Quotation page")
	public void user_need_to_navigate_draft_tab_and_click_submit_for_approval_quotation_page() throws IOException, InterruptedException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();

		Explicitwaitvisibility(p.draftstab);
		clickjavascript(p.draftstab);
		Thread.sleep(3000);

		Selectcheckbox(s.draftchkbox);


		Explicitwaitvisibility(p.Submitforapprovalbtndraft);
		clickjavascript(p.Submitforapprovalbtndraft);

		Explicitwaitvisibility(p.okpopupdraft);
		clickjavascript(p.okpopupdraft);

	}

	@Then("User need to navigate awaiting approval and approve the credit notes-Quotation page")
	public void user_need_to_navigate_awaiting_approval_and_approve_the_credit_notes_quotation_page() throws InterruptedException, IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Explicitwaitvisibility(s.Awaitingapprovaltab);
		clickjavascript(s.Awaitingapprovaltab);

		Thread.sleep(3000);
		Selectcheckbox(s.Awaitingapprovalchkbox);

		Thread.sleep(2000);

		Explicitwaitvisibility(s.ApprovebtnAwaitingapproval);
		clickjavascript(s.ApprovebtnAwaitingapproval);

		Thread.sleep(2000);

		Explicitwaitvisibility(s.Okbtnawaitingapproval);
		clickjavascript(s.Okbtnawaitingapproval);
	}
	@Then("User need to navigate send quotation page and send the quotation to client")
	public void user_need_to_navigate_send_quotation_page_and_send_the_quotation_to_client() throws InterruptedException, IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Explicitwaitvisibility(s.approvedtab);
		clickjavascript(s.approvedtab);

		Thread.sleep(3000);
		Selectcheckbox(s.approvedchkbox);

		Explicitwaitvisibility(s.SendbtnApprovertab);
		clickjavascript(s.SendbtnApprovertab);

		Explicitwaitvisibility(s.Emailenterapprovertab);
		clickjavascript(s.Emailenterapprovertab);

		Thread.sleep(2000);

		Explicitwaitvisibility(s.mailapprovertab);
		tofill(s.mailapprovertab, "infoaccoutingautomation@mailinator.com");

		Thread.sleep(2000);

		ScrolldownElement(s.Attachmentchkboxapprovertab);
		Selectcheckbox(s.Attachmentchkboxapprovertab);

		Thread.sleep(2000);


		unSelectcheckbox(s.Sendmeacopychkbox);

		Explicitwaitvisibility(s.Sendbtnmailsendapprovertab);
		clickjavascript(s.Sendbtnmailsendapprovertab);
		;

		Thread.sleep(2000);

	}
	@Given("User need to navigate to Quotation scenario")
	public void user_need_to_navigate_to_quotation_scenario() throws IOException, InterruptedException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Explicitwaitvisibility(s.QuotationScreen);
		clickjavascript(s.QuotationScreen);
		torefresh();
		Thread.sleep(4000);
		Explicitwait(s.NewQuotationbtn);
		toClick(s.NewQuotationbtn);
	}

	@Then("User need to Approve a Quotation scenario")
	public void user_need_to_approve_a_quotation_scenario() throws InterruptedException, AWTException, IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Explicitwait(s.Customerselect);
		clickjavascript(s.Customerselect);
		Thread.sleep(1000);
		tofill(s.Customerselect, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);
		Toclear(s.QuotationDate);
		tofill(s.QuotationDate, "16/12/2022");
		Thread.sleep(1000);
		Toclear(s.ExpiryDate);
		Thread.sleep(2000);
		tofill(s.ExpiryDate, "27/12/2022");
		totabkey();
		Thread.sleep(1000);
		Toclear(s.Referencetxtbox);
		tofill(s.Referencetxtbox, "Sales");
		Thread.sleep(1000);
		Toclear(s.CurrencyDD);
		tofill(s.CurrencyDD, "SGD - Singapore Dollar");
		Thread.sleep(2000);
		toenter();
		Toclear(s.Amountsare);
		tofill(s.Amountsare, "Tax Exclusive");
		Thread.sleep(2000);
		toenter();
		tofill(s.ThemeDD, "Letter Head Template");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(2000);
		Explicitwaitvisibility(s.Items1);
		clickjavascript(s.Items1);
		Thread.sleep(2000);
		tofill(s.Items1text, "Testitem1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.Attentiontotxt);
		tofill(s.Attentiontotxt, "testattention");
		Thread.sleep(1000);
		tofill(s.contactNumbertxt, "1234567890");
		Thread.sleep(1000);
		ScrolldownElement(s.DeliveryInstructions);
		tofill(s.DeliveryInstructions, "Testdeliveryinstruction");
		ScrolldownElement(s.SaveBtn);
		toClick(s.SaveBtn);
		Thread.sleep(4000);
		toenter();
		Thread.sleep(1000);

	}

	@And("User need to copy as quote")
	public void user_need_to_copy_as_quote() throws IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Explicitwaitvisibility(s.drafttab);
		clickjavascript(s.drafttab);
		Selectcheckbox(s.draftcheckbox);
		Explicitwaitvisibility(s.draftcopytobtn);
		clickjavascript(s.draftcopytobtn);
		Explicitwaitvisibility(s.quoteradiobtnapprovedtab);
		clickjavascript(s.quoteradiobtnapprovedtab);
		Explicitwaitvisibility(s.quotechkboxrdbtnapprovedtab);
		Selectcheckbox(s.quotechkboxrdbtnapprovedtab);
		Explicitwaitvisibility(s.createdraftbtnapprovedtab);
		clickjavascript(s.createdraftbtnapprovedtab);


	}

	@And("User need to copy as invoice")
	public void user_need_to_copy_as_invoice() throws IOException, InterruptedException {

		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();

		Thread.sleep(5000);
		Explicitwaitvisibility(s.drafttab);
		clickjavascript(s.drafttab);

		Selectcheckbox(s.draftcheckbox);
		
		Explicitwaitvisibility(s.draftcopytobtn);
		clickjavascript(s.draftcopytobtn);
		Explicitwaitvisibility(s.copytoinvoiceradiobtn);
		clickjavascript(s.copytoinvoiceradiobtn);
		Selectcheckbox(s.copytoinvoicechkbox);
		Explicitwaitvisibility(s.createdraftbtnapprovedtab);
		clickjavascript(s.createdraftbtnapprovedtab);

	}

	@And("User need to copy as Deliveryorder")
	public void user_need_to_copy_as_deliveryorder() throws IOException, InterruptedException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Thread.sleep(5000);

		Explicitwaitvisibility(s.drafttab);
		clickjavascript(s.drafttab);

		Selectcheckbox(s.draftcheckbox);
		Explicitwaitvisibility(s.draftcopytobtn);
		clickjavascript(s.draftcopytobtn);
		Explicitwaitvisibility(s.copytodeliveryorderradiobtn);
		clickjavascript(s.copytodeliveryorderradiobtn);
		Explicitwaitvisibility(s.copytodeliveryorderchkbox);
		Selectcheckbox(s.copytodeliveryorderchkbox);
		Explicitwaitvisibility(s.createdraftbtnapprovedtab);
		clickjavascript(s.createdraftbtnapprovedtab);

		Thread.sleep(2000);
	}

	@Given("User need to navigate to Quotation screen")
	public void user_need_to_navigate_to_quotation_screen() throws IOException, InterruptedException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		/*Explicitwaitvisibility(s.QuotationScreen);
		clickjavascript(s.QuotationScreen);
		torefresh();*/
		Thread.sleep(4000);
		Explicitwait(s.NewQuotationbtn);
		toClick(s.NewQuotationbtn);

	}


	@Then("User need to create a approved quotation")
	public void user_need_to_create_a_approved_quotation() throws InterruptedException, AWTException, IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Explicitwait(s.Customerselect);
		clickjavascript(s.Customerselect);
		Thread.sleep(1000);
		tofill(s.Customerselect, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);
		Toclear(s.QuotationDate);
		tofill(s.QuotationDate, "16/12/2022");
		Thread.sleep(1000);
		Toclear(s.ExpiryDate);
		Thread.sleep(2000);
		tofill(s.ExpiryDate, "27/12/2022");
		totabkey();
		Thread.sleep(1000);
		Toclear(s.Referencetxtbox);
		tofill(s.Referencetxtbox, "Sales");
		Thread.sleep(1000);
		Toclear(s.CurrencyDD);
		tofill(s.CurrencyDD, "SGD - Singapore Dollar");
		Thread.sleep(2000);
		toenter();
		Toclear(s.Amountsare);
		tofill(s.Amountsare, "Tax Exclusive");
		Thread.sleep(2000);
		toenter();
		Toclear(s.ThemeDD);
		tofill(s.ThemeDD, "Letter Head Template");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(4000);
		Explicitwaitvisibility(s.Items1);
		clickjavascript(s.Items1);
		Thread.sleep(2000);
		tofill(s.Items1text, "Testitem1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.Attentiontotxt);
		tofill(s.Attentiontotxt, "testattention");
		Thread.sleep(1000);
		tofill(s.contactNumbertxt, "1234567890");
		Thread.sleep(1000);
		ScrolldownElement(s.DeliveryInstructions);
		tofill(s.DeliveryInstructions, "Testdeliveryinstruction");
		ScrolldownElement(s.ApproveBtn);
		toClick(s.ApproveBtn);
		Thread.sleep(4000);
		toenter();
		Thread.sleep(1000);

	}
	@And("User need to Decline the quotation manually")
	public void user_need_to_decline_the_quotation_manually() throws IOException, InterruptedException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Explicitwaitvisibility(s.QuotationScreen);
		clickjavascript(s.QuotationScreen);
		Thread.sleep(2000);
		Explicitwaitvisibility(s.approvedtab);
		clickjavascript(s.approvedtab);

		Thread.sleep(2000);
		Selectcheckbox(s.approvedchkbox);

		Explicitwaitvisibility(s.declineapprovedtab);
		clickjavascript(s.declineapprovedtab);
		Explicitwaitvisibility(s.okdeclineapprovedtab);
		clickjavascript(s.okdeclineapprovedtab);
		Explicitwaitvisibility(s.declinetab);
		clickjavascript(s.declinetab);


	}

	@Given("User need to navigate to Quotation screen\\/Accept_Scenario")
	public void user_need_to_navigate_to_quotation_screen_accept_scenario() throws InterruptedException, IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		/*Explicitwaitvisibility(s.QuotationScreen);
		clickjavascript(s.QuotationScreen);
		torefresh();*/
		Explicitwait(s.NewQuotationbtn);
		toClick(s.NewQuotationbtn);

	}

	@Then("User need to create a approved quotation\\/Accept_Scenario")
	public void user_need_to_create_a_approved_quotation_accept_scenario() throws InterruptedException, AWTException, IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Explicitwait(s.Customerselect);
		clickjavascript(s.Customerselect);
		Thread.sleep(1000);
		tofill(s.Customerselect, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);
		Toclear(s.QuotationDate);
		tofill(s.QuotationDate, "16/12/2022");
		Thread.sleep(1000);
		Toclear(s.ExpiryDate);
		Thread.sleep(2000);
		tofill(s.ExpiryDate, "27/12/2022");
		totabkey();
		Thread.sleep(1000);
		Toclear(s.Referencetxtbox);
		tofill(s.Referencetxtbox, "Sales");
		Thread.sleep(1000);
		Toclear(s.CurrencyDD);
		tofill(s.CurrencyDD, "SGD - Singapore Dollar");
		Thread.sleep(2000);
		toenter();
		Toclear(s.Amountsare);
		tofill(s.Amountsare, "Tax Exclusive");
		Thread.sleep(2000);
		toenter();
		Toclear(s.ThemeDD);
		tofill(s.ThemeDD, "Letter Head Template");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(4000);
		Explicitwaitvisibility(s.Items1);
		clickjavascript(s.Items1);
		Thread.sleep(2000);
		tofill(s.Items1text, "Testitem1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.Attentiontotxt);
		tofill(s.Attentiontotxt, "testattention");
		Thread.sleep(1000);
		tofill(s.contactNumbertxt, "1234567890");
		Thread.sleep(1000);
		ScrolldownElement(s.DeliveryInstructions);
		tofill(s.DeliveryInstructions, "Testdeliveryinstruction");
		ScrolldownElement(s.ApproveBtn);
		toClick(s.ApproveBtn);
		Thread.sleep(4000);
		toenter();
		Thread.sleep(1000);

	}

	@Then("User need to approve the quotation manually\\/Accept_Scenario")
	public void user_need_to_approve_the_quotation_manually_accept_scenario() throws IOException, InterruptedException {

		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Explicitwaitvisibility(s.QuotationScreen);
		clickjavascript(s.QuotationScreen);
		Thread.sleep(2000);
		Explicitwaitvisibility(s.approvedtab);
		clickjavascript(s.approvedtab);
		
		
		Thread.sleep(3000);
		Selectcheckbox(s.approvedtaballchkbox);
		System.out.println("check not done normal click implemented");

		Thread.sleep(2000);

		Explicitwaitvisibility(s.approveapprovedtab);
		clickjavascript(s.approveapprovedtab);

		Explicitwaitvisibility(s.okdeclineapprovedtab);
		clickjavascript(s.okdeclineapprovedtab);
		Thread.sleep(3000);
		Explicitwaitvisibility(s.Acceptedtab_Q);
		clickjavascript(s.Acceptedtab_Q);
		//verify whether the quotation is declined

	}






}



