package info.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.By;
import info.base.Reusableclass;
import info.pojo.AccountLoginpojo;
import info.pojo.Sales_Invoice_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sales_Invoice extends Reusableclass {

	public static Sales_Invoice_POJO i;
	public static AccountLoginpojo a;

	@Given("User need to navigate to Invoice slide")
	public void user_need_to_navigate_to_invoice_slide() throws InterruptedException {

		/*browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		a = new AccountLoginpojo();

		toClick(a.username);
		tofill(a.username, "azarudeenn@info-tech.co.in");
		toClick(a.password);
		tofill(a.password, "Info@900");
		toClick(a.submit);*/

		i = new Sales_Invoice_POJO();

		Thread.sleep(1000);
		Explicitwaitvisibility(i.Salesslide);
		tomovethecursor(i.Salesslide);
		toClick(i.Salesslide);
		Explicitwaitvisibility(i.Invoiceslide);
		tomovethecursor(i.Invoiceslide);
		toClick(i.Invoiceslide);

	}

	@Then("User need to Approve a Invoice")
	public void user_need_to_approve_a_invoice() throws AWTException, InterruptedException {

		i = new Sales_Invoice_POJO();

		Thread.sleep(1000);
		tomovethecursor(i.Newinvoicebtn);
		Thread.sleep(1000);
		clickjavascript(i.Newinvoicebtn);

		Explicitwaitvisibility(i.ChoosecustomerDD);
		tofill(i.ChoosecustomerDD, "Automation");
		Thread.sleep(1000);
		// tomovethecursor(i.savecontact);
		// Thread.sleep(1000);
		// toClick(i.savecontact);
		toenter();
		Thread.sleep(2000);

		Explicitwaitvisibility(i.InvoiceDate);
		tofill(i.InvoiceDate, "19/09/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);

		tofill(i.DueDate, "30/11/2022");
		totabkey();
		Thread.sleep(1000);

		tofill(i.InvoiceNo, "Invoice0532366767");

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

		Thread.sleep(5000);
		Explicitwaitvisibility(i.SendBtn);
		clickjavascript(i.SendBtn);
		Thread.sleep(1000);
		Explicitwaitvisibility(i.Mailto);
		Thread.sleep(1000);
		tofill(i.Mailto, "testemailquotation@mailinator.com");
		Thread.sleep(2000);
		ScrolldownElement(i.Sendmeacopychkbox);
		// toClick(i.Sendmeacopychkbox);
		ScrolldownElement(i.Sendmailbtn);
		clickjavascript(i.Sendmailbtn);
		Thread.sleep(4000);
	}

	@And("User need to Save a Invoice")
	public void user_need_to_save_a_invoice() throws InterruptedException, AWTException {

		i = new Sales_Invoice_POJO();

		Explicitwaitvisibility(i.Invoiceoption);
		clickjavascript(i.Invoiceoption);
		Explicitwaitvisibility(i.Newinvoicebtn);
		clickjavascript(i.Newinvoicebtn);
		Explicitwaitvisibility(i.ChoosecustomerDD);
		tofill(i.ChoosecustomerDD, "Automation");
		Explicitwaitvisibility(i.Option1select);
		clickjavascript(i.Option1select);
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(i.InvoiceDate, "10/11/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);
		tofill(i.DueDate, "30/11/2022");
		totabkey();
		Thread.sleep(1000);
		tofill(i.InvoiceNo, "Invoice053236643111");
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

		Explicitwaitvisibility(i.draft);
		tomovethecursor(i.draft);
		Thread.sleep(1000);
		toClick(i.draft);

		driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();

		Thread.sleep(1000);

		/*
		 * ScrolldownElement(i.Addnewlinesbtn); Thread.sleep(1000);
		 * toClick(i.Addnewlinesbtn);
		 */

		Thread.sleep(3000);
		Explicitwaitvisibility(i.items2table);
		clickjavascript(i.items2table);
		Thread.sleep(1000);

		tofill(i.items1tabletxt, "Acc group");
		toenter();
		Thread.sleep(3000);

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

		Explicitwaitvisibility(i.firstinvoice);
		clickjavascript(i.firstinvoice);

		Thread.sleep(3000);
		Explicitwaitvisibility(i.items2table);
		clickjavascript(i.items2table);
		Thread.sleep(1000);

		tofill(i.items1tabletxt, "Acc group");
		toenter();
		Thread.sleep(3000);

		Thread.sleep(1000);

		ScrolldownElement(i.approve);

		tomovethecursor(i.approve);
		toClick(i.approve);

	}

	@Then("User make a payment for invoice")
	public void user_make_a_payment_for_invoice() throws InterruptedException, AWTException {
		i = new Sales_Invoice_POJO();
		/*	browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		a = new AccountLoginpojo();

		toClick(a.username);
		tofill(a.username, "azarudeenn@info-tech.co.in");
		toClick(a.password);
		tofill(a.password, "Info@901");
		toClick(a.submit);*/

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

		clickjavascript(i.firstinvoice);

		Thread.sleep(2000);

		/*Explicitwaitvisibility(i.skip);
		clickjavascript(i.skip);*/

		Explicitwaitvisibility(i.datepaid);

		ScrolldownElement(i.datepaid);

		Thread.sleep(1000);
		tomovethecursor(i.datepaid);
		tofill(i.datepaid, "30/11/2022");
		Thread.sleep(1000);

		tomovethecursor(i.PaidTo);
		tofill(i.PaidTo, "testacc");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

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

	@Then("User Edit to new invoice")
	public void user_Edit_to_new_invoice() throws InterruptedException, AWTException {

		i = new Sales_Invoice_POJO();

		Explicitwaitvisibility(i.invoice);

		tomovethecursor(i.invoice);
		toClick(i.invoice);
		Thread.sleep(2000);
		tomovethecursor(i.awaitingpayment);
		toClick(i.awaitingpayment);

		driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();

		tomovethecursor(i.options);
		toClick(i.options);

		Thread.sleep(2000);
		tomovethecursor(i.edit);
		toClick(i.edit);

		toClick(i.items3table);
		tofill(i.items1tabletxt, "samsung");
		toenter();

		ScrolldownElement(i.update);

		Thread.sleep(1000);

		toClick(i.update);

		toClick(i.ok);

	}

	@Given("User copy to new invoice")
	public void user_copy_to_new_invoice() throws InterruptedException {

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

		clickjavascript(i.quoteradiobutton);

		Thread.sleep(2000);
		Explicitwaitvisibility(i.createdraft);
		clickjavascript(i.createdraft);
		toClick(i.createdraft);

		Explicitwaitvisibility(i.expirydate);
		tofill(i.expirydate, "20/11/2022");

		Scrolldownjavascript();
		Thread.sleep(1000);
		tomovethecursor(i.approve);
		toClick(i.approve);
		Thread.sleep(1000);
		toClick(i.ok);

	}

	@Given("Tax inclusive scenario")
	public void tax_inclusive_scenario() throws InterruptedException, AWTException {

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
		tofill(i.ChoosecustomerDD, "Automation");
		Thread.sleep(1000);
		// tomovethecursor(i.savecontact);
		// Thread.sleep(1000);
		// toClick(i.savecontact);
		toenter();

		Explicitwaitvisibility(i.InvoiceDate);
		tofill(i.InvoiceDate, "19/09/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);

		tofill(i.DueDate, "30/11/2022");
		totabkey();
		Thread.sleep(1000);

		tofill(i.InvoiceNo, "Invoice053236623444");

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

	@Given("No Tax scenario")
	public void no_tax_scenario() throws InterruptedException, AWTException {

		i = new Sales_Invoice_POJO();

		Explicitwaitvisibility(i.Salesslide);
		tomovethecursor(i.Salesslide);
		toClick(i.Salesslide);
		Explicitwaitvisibility(i.Invoiceslide);
		tomovethecursor(i.Invoiceslide);
		toClick(i.Invoiceslide);

		Thread.sleep(1000);
		tomovethecursor(i.Newinvoicebtn);
		Thread.sleep(1000);
		clickjavascript(i.Newinvoicebtn);

		Explicitwaitvisibility(i.ChoosecustomerDD);
		tofill(i.ChoosecustomerDD, "Automation");
		Thread.sleep(1000);
		// tomovethecursor(i.savecontact);
		// Thread.sleep(1000);
		// toClick(i.savecontact);
		toenter();
		Thread.sleep(2000);

		Explicitwaitvisibility(i.InvoiceDate);
		tofill(i.InvoiceDate, "19/09/2022");
		Thread.sleep(1000);
		totabkey();
		Delete();
		Thread.sleep(2000);

		tofill(i.DueDate, "30/11/2022");
		totabkey();
		Thread.sleep(1000);

		tofill(i.InvoiceNo, "Invoice053231232112");

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
		Thread.sleep(2000);
		toClick(i.ok);

	}

}
