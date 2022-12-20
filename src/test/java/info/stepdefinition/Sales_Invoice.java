package info.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;

import info.base.Reusableclass;
import info.pojo.Account_Login_POJO;
import info.pojo.Sales_Invoice_POJO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sales_Invoice extends Reusableclass {

	public static Sales_Invoice_POJO i;
	public static Account_Login_POJO a;

	@Given("User needs to navigate to Invoice slide")
	public void user_needs_to_navigate_to_invoice_slide() throws InterruptedException {
		

		/*browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		a = new Account_Login_POJO();

		toClick(a.username);
		tofill(a.username, "azarudeenn@info-tech.co.in");
		toClick(a.password);
		tofill(a.password, "Info@919");
		toClick(a.submit);
		*/
		i = new Sales_Invoice_POJO();

		Thread.sleep(1000);
		Explicitwaitvisibility(i.Salesslide);
		tomovethecursor(i.Salesslide);
		toClick(i.Salesslide);
		Explicitwaitvisibility(i.Invoiceslide);
		tomovethecursor(i.Invoiceslide);
		toClick(i.Invoiceslide);

	}

	@Then("User needs to Approve a Invoice")
	public void user_needs_to_approve_a_invoice() throws AWTException, InterruptedException {

		i = new Sales_Invoice_POJO();

		Thread.sleep(1000);
		tomovethecursor(i.Newinvoicebtn);
		Thread.sleep(1000);
		clickjavascript(i.Newinvoicebtn);

		tofill(i.ChoosecustomerDD, "ft101");
		// tomovethecursor(i.savecontact);
		// Thread.sleep(1000);
		// toClick(i.savecontact);
		toenter();
		Thread.sleep(2000);

		Explicitwaitvisibility(i.InvoiceDate);
		tofill(i.InvoiceDate, "19/12/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);

		tofill(i.DueDate, "30/12/2022");
		totabkey();
		Thread.sleep(1000);

		tofill(i.InvoiceNo, "IN-454600");

		Thread.sleep(1000);
		tofill(i.ReferenceDateInvoice, "Sales");
		Thread.sleep(1000);

		actionssendkeysdelete(i.CurrencyInvoiceDD);
		Thread.sleep(2000);
		tofill(i.CurrencyInvoiceDD, "NGN - Nigerian Naira");
		toenter();

		Thread.sleep(1000);
		actionssendkeysdelete(i.AmountsareDD);
		Thread.sleep(2000);
		tofill(i.AmountsareDD, "Tax Exclusive");
		Thread.sleep(1000);
		toenter();

		tofill(i.ThemeDD, "Letter Head Template");
		toenter();

		Thread.sleep(3000);
		clickjavascript(i.items1table);
		Thread.sleep(1000);

		tofill(i.items1tabletxt, "samsung");
		toenter();
		Thread.sleep(3000);

		Thread.sleep(3000);
		clickjavascript(i.items2table);
		Thread.sleep(1000);

		tofill(i.items1tabletxt, "samsung");
		toenter();
		Thread.sleep(3000);

		ScrolldownElement(i.DeliveryInstructionstxt);
		tofill(i.DeliveryInstructionstxt, "Testdeliveryinstruction");

		ScrolldownElement(i.ApproveBtn);
		toClick(i.ApproveBtn);
		Thread.sleep(5000);
		toenter();
	}

	@Given("User needs to check send invoice scenario")
	public void user_needs_to_check_send_invoice_scenario() throws InterruptedException {

		Thread.sleep(2000);
		Explicitwaitvisibility(i.SendBtn);
		clickjavascript(i.SendBtn);
		Thread.sleep(2000);
		toClick(i.Mailto);
		tofill(i.Mailto, "testemailquotation@mailinator.com");
		Thread.sleep(2000);
		ScrolldownElement(i.Sendmeacopychkbox);
		// toClick(i.Sendmeacopychkbox);
		ScrolldownElement(i.Sendmailbtn);
		clickjavascript(i.Sendmailbtn);
		Thread.sleep(4000);
	}

	@Given("User needs to give new invoice details- To,Date,Invoiceno,etc..")
	public void user_needs_to_give_new_invoice_details_to_date_invoiceno_etc()
			throws InterruptedException, AWTException {
		
		i = new Sales_Invoice_POJO();

		Thread.sleep(1000);
		Explicitwaitvisibility(i.Salesslide);
		tomovethecursor(i.Salesslide);
		toClick(i.Salesslide);
		Explicitwaitvisibility(i.Invoiceslide);
		tomovethecursor(i.Invoiceslide);
		toClick(i.Invoiceslide);

		i = new Sales_Invoice_POJO();

		Explicitwaitvisibility(i.Invoiceoption);
		clickjavascript(i.Invoiceoption);
		Explicitwaitvisibility(i.Newinvoicebtn);
		clickjavascript(i.Newinvoicebtn);
		Explicitwaitvisibility(i.ChoosecustomerDD);
		tofill(i.ChoosecustomerDD, "ft102");
		Explicitwaitvisibility(i.Option1select);
		clickjavascript(i.Option1select);
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(i.InvoiceDate, "16/12/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);
		tofill(i.DueDate, "30/12/2022");
		totabkey();
		Thread.sleep(1000);
		tofill(i.InvoiceNo, "IN-454601");
		tofill(i.ReferenceDateInvoice, "Sales");
		Thread.sleep(1000);
		actionssendkeysdelete(i.CurrencyInvoiceDD);
		Thread.sleep(2000);
		tofill(i.CurrencyInvoiceDD, "SGD - Singapore Dollar");
		toenter();
		Thread.sleep(1000);
		actionssendkeysdelete(i.AmountsareDD);
		Thread.sleep(2000);
		tofill(i.AmountsareDD, "Tax Exclusive");
		Thread.sleep(1000);
		toenter();
		tofill(i.ThemeDD, "Letter Head Template");
		toenter();
		Thread.sleep(3000);
		clickjavascript(i.items1table);
		Thread.sleep(1000);
		tofill(i.items1tabletxt, "Testitem1");
		toenter();
		Thread.sleep(3000);
		// ScrolldownElement(i.DeliveryInstructionstxt);
		// tofill(i.DeliveryInstructionstxt, "Testdeliveryinstruction");
	}

	@Given("User needs to save the new invoice details")
	public void user_needs_to_save_the_new_invoice_details() throws InterruptedException {

		ScrolldownElement(i.savearrow);

		Thread.sleep(1000);
		clickjavascript(i.savearrow);
		Thread.sleep(1000);
		tomovethecursor(i.saveasdraft);
		Thread.sleep(1000);
		toClick(i.saveasdraft);
		Thread.sleep(1000);
		toClick(i.ok);
		
	}

	@Then("User verify invoice in Draft and moved to Awaiting approval")
	public void user_verify_invoice_in_draft_and_moved_to_awaiting_approval()
			throws InterruptedException, AWTException {

		i = new Sales_Invoice_POJO();
		
		driver.navigate().refresh();

		Explicitwaitvisibility(i.draft);
		tomovethecursor(i.draft);
		Thread.sleep(2000);
		toClick(i.draft);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();

		Thread.sleep(2000);
		Explicitwaitvisibility(i.DueDate);
		tomovethecursor(i.DueDate);
		Thread.sleep(1000);
		tofill(i.DueDate, "30/12/2022");
		Thread.sleep(1000);
		toenter();

		/*
		 * ScrolldownElement(i.Addnewlinesbtn); Thread.sleep(1000);
		 * toClick(i.Addnewlinesbtn);
		 */

		/*Thread.sleep(3000);
		Explicitwaitvisibility(i.items2table);
		tomovethecursor(i.items2table);
		clickjavascript(i.items2table);
		Thread.sleep(1000);
		
		Thread.sleep(1000);

		tofill(i.items1tabletxt, "Acc group");
		toenter();
		Thread.sleep(3000);*/

		ScrolldownElement(i.savearrow);

		Thread.sleep(1000);
		clickjavascript(i.savearrow);
		Thread.sleep(1000);
		tomovethecursor(i.Saveandsubmitforapproval);
		Thread.sleep(1000);
		toClick(i.Saveandsubmitforapproval);
		Thread.sleep(1000);
		toClick(i.ok);

	}

	@Then("User Verify invoice in Awaiting approval")
	public void user_verify_invoice_in_awaiting_approval() throws InterruptedException, AWTException {

		i = new Sales_Invoice_POJO();
		Explicitwaitvisibility(i.awaintingapproval);
		toClick(i.awaintingapproval);
		
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();

		Thread.sleep(1000);

		/*Thread.sleep(3000);
		Explicitwaitvisibility(i.items2table);
		clickjavascript(i.items2table);
		Thread.sleep(1000);

		tofill(i.items1tabletxt, "Acc group");
		toenter();
		Thread.sleep(3000);*/

		ScrolldownElement(i.approve);
		Thread.sleep(1000);
		tomovethecursor(i.approve);
		toClick(i.approve);
		Thread.sleep(1000);
		toClick(i.ok);

	}

	@Given("User needs to make a payment for invoice")
	public void user_needs_to_make_a_payment_for_invoice() throws InterruptedException, AWTException {
		i = new Sales_Invoice_POJO();
		/*
		 * browserLaunch(); launchUrl("https://staging.infotech-accounting.com/login");
		 * toMaximize(); a = new AccountLoginpojo();
		 * 
		 * toClick(a.username); tofill(a.username, "azarudeenn@info-tech.co.in");
		 * toClick(a.password); tofill(a.password, "Info@901"); toClick(a.submit);
		 */

		i = new Sales_Invoice_POJO();

		Explicitwaitvisibility(i.Salesslide);

		tomovethecursor(i.Salesslide);
		Thread.sleep(1000);
		clickjavascript(i.Salesslide);
		Thread.sleep(1000);
		tomovethecursor(i.Invoiceslide);
		Thread.sleep(1000);
		clickjavascript(i.Invoiceslide);
		Thread.sleep(1000);

		clickjavascript(i.awaitingpayment);
		Thread.sleep(3000);

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();



		Thread.sleep(2000);

		/*
		 * Explicitwaitvisibility(i.skip); clickjavascript(i.skip);
		 */

		Explicitwaitvisibility(i.datepaid);

		ScrolldownElement(i.datepaid);

		Thread.sleep(1000);
		tomovethecursor(i.datepaid);
		tofill(i.datepaid, "30/12/2022");
		Thread.sleep(1000);

		tomovethecursor(i.PaidTo);
		tofill(i.PaidTo, "testacc");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(2000);
		
		tomovethecursor(i.bankrate);
		tofill(i.bankrate, "10");
		Thread.sleep(2000);

		tomovethecursor(i.cash);
		Thread.sleep(1000);
		tofill(i.cash, "cash");
		Thread.sleep(1000);
		toenter();

		tomovethecursor(i.addpayment);
		Thread.sleep(1000);
		toClick(i.addpayment);

		Thread.sleep(1000);
		toClick(i.ok);
	}

	@Given("User needs to Edit the approved invoice")
	public void user_needs_to_edit_the_approved_invoice() throws InterruptedException, AWTException {

		i = new Sales_Invoice_POJO();

		Explicitwaitvisibility(i.invoice);
		tomovethecursor(i.invoice);
		toClick(i.invoice);
		Thread.sleep(2000);
		tomovethecursor(i.awaitingpayment);
		toClick(i.awaitingpayment);

		driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();

		Explicitwaitvisibility(i.options);
		tomovethecursor(i.options);
		toClick(i.options);

		Thread.sleep(2000);
		Explicitwaitvisibility(i.edit);
		tomovethecursor(i.edit);
		toClick(i.edit);

		Explicitwaitvisibility(i.items3table);
		toClick(i.items3table);
		Explicitwaitvisibility(i.items1tabletxt);
		tofill(i.items1tabletxt, "samsung");
		toenter();

		ScrolldownElement(i.update);

		Thread.sleep(1000);

		toClick(i.update);

		toClick(i.ok);

	}

	@Given("User needs to copy the approved invoice")
	public void user_needs_to_copy_the_approved_invoice() throws InterruptedException {

		i = new Sales_Invoice_POJO();

		/*
		 * Explicitwaitvisibility(i.invoice);
		 * 
		 * tomovethecursor(i.invoice); toClick(i.invoice); Thread.sleep(2000);
		 * tomovethecursor(i.awaitingpayment); toClick(i.awaitingpayment);
		 * 
		 * driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();
		 * 
		 * 
		 */
		Thread.sleep(2000);
		Explicitwaitvisibility(i.options);
		clickjavascript(i.options);

		Thread.sleep(2000);

		Explicitwaitvisibility(i.copy);
		tomovethecursor(i.copy);
		Thread.sleep(1000);
		clickjavascript(i.copy);
		
		Thread.sleep(1000);
		Explicitwaitvisibility(i.quoteradiobutton);
		clickjavascript(i.quoteradiobutton);

		Thread.sleep(2000);
		Explicitwaitvisibility(i.createdraft);
		clickjavascript(i.createdraft);
		Thread.sleep(1000);

		Explicitwaitvisibility(i.duedatecredit);
		tomovethecursor(i.duedatecredit);
		Thread.sleep(2000);
		tofill(i.duedatecredit, "20/12/2022");

		Scrolldownjavascript();
		Thread.sleep(1000);
		Explicitwaitvisibility(i.approvecredit);
		tomovethecursor(i.approvecredit);
		toClick(i.approvecredit);
		Thread.sleep(1000);
		tomovethecursor(i.ok);
		toClick(i.ok);

	}
	
	@Given("User needs to give new invoice details for tax inclusive")
	public void user_needs_to_give_new_invoice_details_for_tax_inclusive() throws InterruptedException, AWTException {

		i = new Sales_Invoice_POJO();

		Thread.sleep(1000);
		Explicitwaitvisibility(i.Salesslide);
		tomovethecursor(i.Salesslide);
		toClick(i.Salesslide);
		Explicitwaitvisibility(i.Invoiceslide);
		tomovethecursor(i.Invoiceslide);
		toClick(i.Invoiceslide);

		Thread.sleep(1000);
		Explicitwaitvisibility(i.Newinvoicebtn);
		tomovethecursor(i.Newinvoicebtn);
		Thread.sleep(1000);
		clickjavascript(i.Newinvoicebtn);

		Explicitwaitvisibility(i.ChoosecustomerDD);
		tofill(i.ChoosecustomerDD, "ft104");
		Thread.sleep(1000);
		// tomovethecursor(i.savecontact);
		// Thread.sleep(1000);
		// toClick(i.savecontact);
		toenter();

		Explicitwaitvisibility(i.InvoiceDate);
		tofill(i.InvoiceDate, "19/12/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);

		tofill(i.DueDate, "30/12/2022");
		totabkey();
		Thread.sleep(1000);

		tofill(i.InvoiceNo, "IN-454602");

		Thread.sleep(1000);
		tofill(i.ReferenceDateInvoice, "Sales");
		Thread.sleep(1000);

		actionssendkeysdelete(i.CurrencyInvoiceDD);
		Thread.sleep(2000);
		tofill(i.CurrencyInvoiceDD, "NGN - Nigerian Naira");
		toenter();

		Thread.sleep(1000);
		actionssendkeysdelete(i.AmountsareDD);
		Thread.sleep(2000);
		tofill(i.AmountsareDD, "Tax Inclusive");
		Thread.sleep(1000);
		toenter();

		tofill(i.ThemeDD, "Letter Head Template");
		toenter();

		Thread.sleep(3000);
		clickjavascript(i.items1table);
		Thread.sleep(1000);

		tofill(i.items1tabletxt, "samsung");
		toenter();
		Thread.sleep(3000);

		Thread.sleep(3000);
		clickjavascript(i.items2table);
		Thread.sleep(1000);

		tofill(i.items1tabletxt, "samsung");
		toenter();
		Thread.sleep(3000);

		ScrolldownElement(i.DeliveryInstructionstxt);
		tofill(i.DeliveryInstructionstxt, "Testdeliveryinstruction");

		ScrolldownElement(i.ApproveBtn);
		toClick(i.ApproveBtn);
		Thread.sleep(2000);
		toClick(i.ok);

	}
	
	@Given("user needs to void the approved invoice")
	public void user_needs_to_void_the_approved_invoice() throws InterruptedException {
		
		i = new Sales_Invoice_POJO();
	
		Thread.sleep(2000);
		Explicitwaitvisibility(i.options);
		clickjavascript(i.options);

		Thread.sleep(2000);

		Explicitwaitvisibility(i.delete);
		tomovethecursor(i.delete);
		Thread.sleep(1000);
		clickjavascript(i.delete);
		Thread.sleep(1000);
		tomovethecursor(i.yes);
		toClick(i.yes);
		Thread.sleep(1000);
		tomovethecursor(i.ok);
		toClick(i.ok);
		
	}

	@Given("User needs to give new invoice details for No Tax")
	public void user_needs_to_give_new_invoice_details_for_no_tax() throws InterruptedException, AWTException {

		i = new Sales_Invoice_POJO();

		Explicitwaitvisibility(i.Salesslide);
		tomovethecursor(i.Salesslide);
		toClick(i.Salesslide);
		clickjavascript(i.Salesslide);;
		Explicitwaitvisibility(i.Invoiceslide);
		tomovethecursor(i.Invoiceslide);
		toClick(i.Invoiceslide);

		Thread.sleep(1000);
		tomovethecursor(i.Newinvoicebtn);
		Thread.sleep(1000);
		clickjavascript(i.Newinvoicebtn);

		Explicitwaitvisibility(i.ChoosecustomerDD);
		tofill(i.ChoosecustomerDD, "ft104");
		Thread.sleep(1000);
		// tomovethecursor(i.savecontact);
		// Thread.sleep(1000);
		// toClick(i.savecontact);
		toenter();
		Thread.sleep(2000);

		Explicitwaitvisibility(i.InvoiceDate);
		tofill(i.InvoiceDate, "19/12/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);

		tofill(i.DueDate, "30/12/2022");
		totabkey();
		Thread.sleep(1000);

		tofill(i.InvoiceNo, "IN-454604");

		Thread.sleep(1000);
		tofill(i.ReferenceDateInvoice, "Sales");
		Thread.sleep(1000);

		actionssendkeysdelete(i.CurrencyInvoiceDD);
		Thread.sleep(2000);
		tofill(i.CurrencyInvoiceDD, "NGN - Nigerian Naira");
		toenter();

		Thread.sleep(1000);
		actionssendkeysdelete(i.AmountsareDD);
		Thread.sleep(2000);
		tofill(i.AmountsareDD, "No Tax");
		Thread.sleep(1000);
		toenter();

		tofill(i.ThemeDD, "Letter Head Template");
		toenter();

		Thread.sleep(3000);
		clickjavascript(i.items1table);
		Thread.sleep(1000);

		tofill(i.items1tabletxt, "samsung");
		toenter();
		Thread.sleep(3000);

		Thread.sleep(3000);
		clickjavascript(i.items2table);
		Thread.sleep(1000);

		tofill(i.items1tabletxt, "samsung");
		toenter();
		Thread.sleep(3000);

		ScrolldownElement(i.DeliveryInstructionstxt);
		tofill(i.DeliveryInstructionstxt, "Testdeliveryinstruction");

		ScrolldownElement(i.ApproveBtn);
		toClick(i.ApproveBtn);
		toClick(i.ok);

	}
	
	@Given("User needs to add credit note for invoice")
	public void user_needs_to_add_credit_note_for_invoice() throws InterruptedException {
		
		i = new Sales_Invoice_POJO();
		
		Thread.sleep(2000);
		Explicitwaitvisibility(i.options);
		clickjavascript(i.options);

		Thread.sleep(2000);
		
		Explicitwaitvisibility(i.addcreditnote);
		tomovethecursor(i.addcreditnote);
		Thread.sleep(1000);
		clickjavascript(i.addcreditnote);
		Thread.sleep(1000);
		
		Scrolldownjavascript();
		
		tomovethecursor(i.approve);
		Thread.sleep(1000);
		toClick(i.approve);
	}

}
