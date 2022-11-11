package info.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;

import info.base.Reusableclass;
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
	@Given("User need to navigate to Quotation slide")
	public void user_need_to_navigate_to_quotation_slide() {
		s=new Sale_Quotation_POJO();
		Explicitwaitvisibility(s.Salesslide);
		toClick(s.Salesslide);
		clickjavascript(s.Quotationslide);

	}


	@Then ("User need to Approve a Quotation")
	public void user_need_to_approve_a_quotation() throws AWTException, InterruptedException, IOException {
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
		tofill(s.QuotationDate, "10/11/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);
		tofill(s.ExpiryDate, "27/11/2022");
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
		Thread.sleep(1000);
		Explicitwaitvisibility(s.SendBtn);
		toClick(s.SendBtn);
		Thread.sleep(4000);

		/*	
		if (s.Okbtnn.isDisplayed()) {
			Explicitwaitvisibility(s.Okbtnn);
			clickjavascript(s.Okbtnn);
		} else {
			System.out.println("Popup is not visible");
		}
		 */

		Thread.sleep(1000);
		Explicitwaitvisibility(s.Mailto);
		tofill(s.Mailto, "testemailquotation@mailinator.com");
		Thread.sleep(1000);
		//toClick(s.Sendmeacopychkbox);
		ScrolldownElement(s.Sendmailbtn);
		clickjavascript(s.Sendmailbtn);
		/*
		u=new UserCreation_POJO();

		driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
		highLightElement(u.SearchMailinator);
		tofill(u.SearchMailinator, "testemailquotation");
		toenter();

		Explicitwaitvisibility(u.Displayemail);
		Thread.sleep(2000);
		clickjavascript(u.mailinatorvisiblemailquotation);
		Pageloadtimeout();
		Scrolldownjavascript();
		Pageloadtimeout();
		Scrolldownjavascript();
		//driver.switchTo().frame(u.frames);
		ScrolldownElement(u.mailinatorresetpassquotation);
		toClick(u.mailinatorresetpassquotation);*/

		///Due to application error script stopped here- mail quotation



		Explicitwaitvisibility(s.QuotationScreen);
		clickjavascript(s.QuotationScreen);



	}

	@And("User need to Save a Quotation")
	public void user_need_to_save_a_quotation() throws InterruptedException, AWTException, IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Thread.sleep(4000);
		Explicitwait(s.NewQuotationbtn);
		toClick(s.NewQuotationbtn);


		Explicitwait(s.Customerselect);
		clickjavascript(s.Customerselect);
		Thread.sleep(1000);
		tofill(s.Customerselect, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(s.QuotationDate, "10/11/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);
		tofill(s.ExpiryDate, "27/11/2022");
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
		Explicitwaitvisibility(s.Searchboxtxt);
		Thread.sleep(1000);
		tofill(s.Searchboxtxt, "Sales");
		Thread.sleep(1000);
		toClick(s.Searchbtn);
		Thread.sleep(1000);
		clickjavascript(s.Checkallbox);
		
	}
	
	@Then("User need to navigate draft tab and click submit for approval-Quotation page")
	public void user_need_to_navigate_draft_tab_and_click_submit_for_approval_quotation_page() throws IOException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Explicitwaitvisibility(p.draftstab);
		clickjavascript(p.draftstab);


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

		Thread.sleep(2000);

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

		Thread.sleep(2000);
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
		totabkey();
		Delete();
		tofill(s.QuotationDate, "10/11/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);
		tofill(s.ExpiryDate, "27/11/2022");
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
		Thread.sleep(2000);

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
		Thread.sleep(2000);


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

	@Given("User need to navigate to Quotation scenario2")
	public void user_need_to_navigate_to_quotation_scenario2() throws IOException, InterruptedException {
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


	@Then("User need to Decline a Quotation scenario")
	public void user_need_to_decline_a_quotation_scenario() throws InterruptedException, AWTException, IOException {
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
		totabkey();
		Delete();
		tofill(s.QuotationDate, "10/11/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);
		tofill(s.ExpiryDate, "27/11/2022");
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
	@And("User need to Decline manually")
	public void user_need_to_decline_manually() throws IOException, InterruptedException {
		s=new Sale_Quotation_POJO();
		p=new Purchase_CreditNotes_POJO ();
		u=new UserCreation_POJO();
		Explicitwaitvisibility(s.QuotationScreen);
		clickjavascript(s.QuotationScreen);
		Thread.sleep(2000);
		Explicitwaitvisibility(s.approvedtab);
		clickjavascript(s.approvedtab);
		Selectcheckbox(s.approvedchkbox);
		Explicitwaitvisibility(s.declineapprovedtab);
		clickjavascript(s.declineapprovedtab);
		Explicitwaitvisibility(s.okdeclineapprovedtab);
		clickjavascript(s.okdeclineapprovedtab);
		Explicitwaitvisibility(s.declinetab);
		clickjavascript(s.declinetab);
		//verify whether the quotation is declined
	/*	Thread.sleep(2000);
		Explicitwaitvisibility(s.drafttab);
		clickjavascript(s.drafttab);
		Thread.sleep(2000);
		Explicitwaitvisibility(s.draftcheckbox);
		Selectcheckbox(s.draftcheckbox);
		Explicitwaitvisibility(s.deletebtnapprovedtab);
		clickjavascript(s.deletebtnapprovedtab);
		Explicitwaitvisibility(s.okdeletebtnapprovedtab);
		clickjavascript(s.okdeletebtnapprovedtab);
		Thread.sleep(2000);*/
		
	}





}



