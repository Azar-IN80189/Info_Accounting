package info.stepdefinition;
import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import info.base.Reusableclass;
import info.pojo.Account_Login_POJO;
import info.pojo.Purchase_CreditNotes_POJO;
import info.pojo.Sales_CreditNote_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sale_CreditNote extends Reusableclass {
	
	public static Sales_CreditNote_POJO c;
	public static Purchase_CreditNotes_POJO p;
	public static Account_Login_POJO a;
	
	@Given("User need to navigate to Credit Note slide")
	public void user_need_to_navigate_to_credit_note_slide() {
		/*
		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		
		a = new AccountLoginpojo();

		toClick(a.username);
		tofill(a.username, "azarudeenn@info-tech.co.in");
		toClick(a.password);
		tofill(a.password, "Info@900");
		toClick(a.submit);
	*/
		c=new Sales_CreditNote_POJO();
		Explicitwaitvisibility(c.Salesslide);
		clickjavascript(c.Salesslide);
		clickjavascript(c.CreditNoteslide);
		
	}

	@Then("User need to Approve a Credit Note")
	public void user_need_to_approve_a_credit_note() throws InterruptedException, AWTException {
		
		p=new Purchase_CreditNotes_POJO();
		c=new Sales_CreditNote_POJO();
		Explicitwaitvisibility(c.NewcreditNotesbtn);
		clickjavascript(c.NewcreditNotesbtn);
		Explicitwaitvisibility(c.ChooseContactDD);
		tofill(c.ChooseContactDD, "Automation");
		Explicitwaitvisibility(c.Option1select);
		clickjavascript(c.Option1select);
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(c.Date, "27/10/2022");
		Thread.sleep(2000);
		tofill(c.ReferenceName, "Sales");
		Thread.sleep(1000);
		Explicitwaitvisibility(c.CurrencyDD);
		Toclear(c.CurrencyDD);
		tofill(c.CurrencyDD, "SGD - Singapore Dollar");
		toenter();
		Thread.sleep(1000);
		Explicitwaitvisibility(c.Amountsare);
		tofill(c.Amountsare, "Tax Exclusive");
		toenter();
		Thread.sleep(1000);
		Explicitwaitvisibility(c.ThemeDD);
		tofill(c.ThemeDD, "Letter Head Template");
		toenter();
		Thread.sleep(3000);
		Explicitwaitvisibility(c.items1table);
		clickjavascript(c.items1table);
		Thread.sleep(1000);
		Explicitwaitvisibility(c.items1tabletxt);
		tofill(c.items1tabletxt, "ProductGroup");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);
		Explicitwaitvisibility(c.ApproveBtn);
		ScrolldownElement(c.ApproveBtn);
		toClick(c.ApproveBtn);
		Thread.sleep(5000);
		toenter();
		Thread.sleep(1000);
		Explicitwaitvisibility(c.SendBtn);
		toClick(c.SendBtn);
		Thread.sleep(6000);
		Explicitwaitvisibility(c.Mailto);
		tofill(c.Mailto, "testemailquotation@mailinator.com");
		Thread.sleep(3000);
		unSelectcheckbox(c.Sendmeacopychkbox);
		ScrolldownElement(c.Sendmailbtn);
		clickjavascript(c.Sendmailbtn);
		Thread.sleep(3000);
		Explicitwaitvisibility(c.creditnotemenu);
		clickjavascript(c.creditnotemenu);

	}

	@Then("User need to Save a Credit Note")
	public void user_need_to_save_a_credit_note() throws AWTException, InterruptedException {
	
		p=new Purchase_CreditNotes_POJO();
		c=new Sales_CreditNote_POJO();
		Explicitwaitvisibility(c.NewcreditNotesbtn);
		clickjavascript(c.NewcreditNotesbtn);
		Explicitwaitvisibility(c.ChooseContactDD);
		tofill(c.ChooseContactDD, "Automation");
		Explicitwaitvisibility(c.Option1select);
		clickjavascript(c.Option1select);
		Thread.sleep(1000);
		totabkey();
		Delete();
		tofill(c.Date, "27/10/2022");
		Thread.sleep(2000);
		tofill(c.ReferenceName, "Sales");
		Thread.sleep(1000);
		Explicitwaitvisibility(c.CurrencyDD);
		Toclear(c.CurrencyDD);
		tofill(c.CurrencyDD, "SGD - Singapore Dollar");
		toenter();
		Thread.sleep(1000);
		Explicitwaitvisibility(c.Amountsare);
		tofill(c.Amountsare, "Tax Exclusive");
		toenter();
		Thread.sleep(1000);
		Explicitwaitvisibility(c.ThemeDD);
		tofill(c.ThemeDD, "Letter Head Template");
		toenter();
		Thread.sleep(3000);
		Explicitwaitvisibility(c.items1table);
		clickjavascript(c.items1table);
		Thread.sleep(1000);
		Explicitwaitvisibility(c.items1tabletxt);
		tofill(c.items1tabletxt, "ProductGroup");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);
		Explicitwaitvisibility(c.SaveBtn);
		ScrolldownElement(c.SaveBtn);
		toClick(c.SaveBtn);
		Thread.sleep(5000);
		toenter();
		Thread.sleep(5000);
		/*Explicitwaitvisibility(c.Searchboxtxt);
		tofill(c.Searchboxtxt, "Sales");
		clickjavascript(c.Searchbtn);
		Thread.sleep(5000);
		clickjavascript(c.Clearbtn);
		Thread.sleep(2000);
		//driver.quit();
*/	}

	@Given("User need to navigate to Sales-Credit Notes slide scenario")
	public void user_need_to_navigate_to_sales_credit_notes_slide_scenario() throws InterruptedException {
		
		p=new Purchase_CreditNotes_POJO();
		c=new Sales_CreditNote_POJO();
		Explicitwaitvisibility(c.creditnotemenu);
		clickjavascript(c.creditnotemenu);
		Thread.sleep(2000);
		Explicitwaitvisibility(p.NewCreditNotesbtn);
		clickjavascript(p.NewCreditNotesbtn);

	}

	@Then("User need to Add a Sales-Credit note scenario")
	public void user_need_to_add_a_sales_credit_note_scenario() throws AWTException, InterruptedException {
		
		p=new Purchase_CreditNotes_POJO ();
		c=new Sales_CreditNote_POJO();
		Thread.sleep(2000);

		Explicitwaitvisibility(p.Contacttxtbox);
		Toclear(p.Contacttxtbox);
		tofill(p.Contacttxtbox, "Automation");
		toenter();

		Thread.sleep(2000);

		Toclear(p.CreditnoteDatebox);
		tofill(p.CreditnoteDatebox, "27/10/2022");

		Thread.sleep(2000);

		Toclear(c.ReferenceName);
		tofill(c.ReferenceName, "Info");

		Thread.sleep(2000);

		Toclear(c.CurrencyDD);
		tofill(c.CurrencyDD, "TRY - Turkish Lira");
		Thread.sleep(3000);
		toenter();

		Thread.sleep(2000);

		toClick(c.Amountsare);
		tofill(c.Amountsare, "Tax Inclusive");
		Explicitwaitvisibility(p.Selectoptioncurrencies);
		clickjavascript(p.Selectoptioncurrencies);


		Thread.sleep(2000);

		clickjavascript(c.items1table);
		tofill(c.items1tabletxt, "Testitem1");
		toenter();

		/*Thread.sleep(2000);

		clickjavascript(p.item2select);
		tofill(p.item2txtenter, "Testitem2");
		toenter();*/

		Thread.sleep(2000);
		ScrolldownElement(c.Addnewlinesbtn);
		Explicitwaitvisibility(c.Addnewlinesbtn);
		clickjavascript(c.Addnewlinesbtn);


	}
	@And("User need to Approve the Sales-Credit notes")
	public void user_need_to_approve_the_sales_credit_notes() throws InterruptedException {
		p=new Purchase_CreditNotes_POJO ();
		c=new Sales_CreditNote_POJO();

		ScrolldownElement(c.ApproveBtn);
		Explicitwaitvisibility(c.ApproveBtn);
		ScrolldownElement(c.ApproveBtn);
		Thread.sleep(2000);
		clickjavascript(c.ApproveBtn);
		Thread.sleep(3000);
		Explicitwaitvisibility(c.Okbtn);
		clickjavascript(c.Okbtn);
		Thread.sleep(3000);

		Explicitwaitvisibility(c.creditnotemenu);
		clickjavascript(c.creditnotemenu);


		Explicitwaitvisibility(p.Awaitingpaymenttab);
		clickjavascript(p.Awaitingpaymenttab);

		Explicitwaitvisibility(p.gridcell1awaitingpayment);
		clickjavascript(p.gridcell1awaitingpayment);

		Explicitwaitvisibility(p.Dateawaitingpayment);
		ScrolldownElement(p.Dateawaitingpayment);
		Toclear(p.Dateawaitingpayment);
		tofill(p.Dateawaitingpayment, "27/10/2022");

		Thread.sleep(2000);
		Explicitwaitvisibility(p.Paidtoawaitingpayment);
		mouseclick(p.Paidtoawaitingpayment);
		Thread.sleep(1000);
		Explicitwaitvisibility(p.Selectpaidtoawaitingpayment);
		clickjavascript(p.Selectpaidtoawaitingpayment);

		Thread.sleep(5000);

		Explicitwaitvisibility(p.Exchangerate);
		Toclear(p.Exchangerate);
		tofill(p.Exchangerate, "2");

		Thread.sleep(5000);

		Explicitwaitvisibility(p.paymentmodeawaitingpayment);
		Toclear(p.paymentmodeawaitingpayment);
		clickjavascript(p.paymentmodeawaitingpayment);


		Explicitwaitvisibility(p.referencetxtawaitingpayment);
		Toclear(p.referencetxtawaitingpayment);
		tofill(p.referencetxtawaitingpayment, "testcreditnote");

		Explicitwaitvisibility(p.Addrefundbtnawaitingpayment);
		clickjavascript(p.Addrefundbtnawaitingpayment);

		Thread.sleep(3000);
		Explicitwaitvisibility(p.Okbtn);
		clickjavascript(p.Okbtn);

	}

	@Given("User need to navigate to Sales-Credit slide no tax scenario")
	public void user_need_to_navigate_to_sales_credit_slide_no_tax_scenario() {
		
		p=new Purchase_CreditNotes_POJO ();
		c=new Sales_CreditNote_POJO();
		Explicitwaitvisibility(p.NewCreditNotesbtn);
		clickjavascript(p.NewCreditNotesbtn);

	}

	@Then("User need to Add a Sales-Credit note no tax scenario")
	public void user_need_to_add_a_sales_credit_note_no_tax_scenario() throws InterruptedException, AWTException {
		p=new Purchase_CreditNotes_POJO ();
		c=new Sales_CreditNote_POJO();
		Thread.sleep(2000);

		Explicitwaitvisibility(p.Contacttxtbox);
		Toclear(p.Contacttxtbox);
		tofill(p.Contacttxtbox, "Automation");
		toenter();

		Thread.sleep(2000);

		Toclear(p.CreditnoteDatebox);
		tofill(p.CreditnoteDatebox, "27/10/2022");

		Thread.sleep(2000);

		Toclear(c.ReferenceName);
		tofill(c.ReferenceName, "Info");

		Thread.sleep(2000);

		Toclear(c.CurrencyDD);
		tofill(c.CurrencyDD, "TRY - Turkish Lira");
		Thread.sleep(3000);
		toenter();

		Thread.sleep(2000);

		toClick(c.Amountsare);
		tofill(c.Amountsare, "No Tax");
		Explicitwaitvisibility(p.Selectoptioncurrencies);
		clickjavascript(p.Selectoptioncurrencies);


		Thread.sleep(2000);

		clickjavascript(c.items1table);
		tofill(c.items1tabletxt, "Testitem1");
		toenter();

		/*Thread.sleep(2000);

		clickjavascript(p.item2select);
		tofill(p.item2txtenter, "Testitem2");
		toenter();*/

		Thread.sleep(2000);

		Explicitwaitvisibility(c.Addnewlinesbtn);
		clickjavascript(c.Addnewlinesbtn);

	}
	@And("User need to Approve the Sales-Credit notes no tax scenario")
	public void user_need_to_approve_the_sales_credit_notes_no_tax_scenario() throws InterruptedException, AWTException {

		p=new Purchase_CreditNotes_POJO ();
		c=new Sales_CreditNote_POJO();

		Explicitwaitvisibility(c.ApproveBtn);
		ScrolldownElement(c.ApproveBtn);
		Thread.sleep(2000);
		clickjavascript(c.ApproveBtn);
		Thread.sleep(3000);
		Explicitwaitvisibility(p.Okbtn);
		clickjavascript(p.Okbtn);
		Thread.sleep(3000);


		Explicitwaitvisibility(p.CreditNoteslabel);
		clickjavascript(p.CreditNoteslabel);


		Explicitwaitvisibility(p.Awaitingpaymenttab);
		clickjavascript(p.Awaitingpaymenttab);

		Explicitwaitvisibility(p.gridcell1awaitingpayment);
		clickjavascript(p.gridcell1awaitingpayment);

		Explicitwaitvisibility(p.Dateawaitingpayment);
		ScrolldownElement(p.Dateawaitingpayment);
		Toclear(p.Dateawaitingpayment);
		tofill(p.Dateawaitingpayment, "27/10/2022");


		Thread.sleep(2000);
		Explicitwaitvisibility(p.Paidtoawaitingpayment);
		mouseclick(p.Paidtoawaitingpayment);
		Thread.sleep(1000);
		Explicitwaitvisibility(p.Selectpaidtoawaitingpayment);
		clickjavascript(p.Selectpaidtoawaitingpayment);

		Thread.sleep(5000);

		Explicitwaitvisibility(p.Exchangerate);
		Toclear(p.Exchangerate);
		tofill(p.Exchangerate, "2");

		Thread.sleep(5000);

		Explicitwaitvisibility(p.paymentmodeawaitingpayment);
		Toclear(p.paymentmodeawaitingpayment);
		clickjavascript(p.paymentmodeawaitingpayment);


		Explicitwaitvisibility(p.referencetxtawaitingpayment);
		Toclear(p.referencetxtawaitingpayment);
		tofill(p.referencetxtawaitingpayment, "testcreditnote");

		Explicitwaitvisibility(p.Addrefundbtnawaitingpayment);
		clickjavascript(p.Addrefundbtnawaitingpayment);

		Thread.sleep(3000);
		Explicitwaitvisibility(p.Okbtn);
		clickjavascript(p.Okbtn);

		Thread.sleep(3000);

		/*	Explicitwaitvisibility(c.Awaitingpaymenttab);
		clickjavascript(c.Awaitingpaymenttab);*/
		Thread.sleep(3000);

		//Explicitwaitvisibility(c.awaitingchkboxall);
		Selectcheckbox(c.awaitingchkboxall);

		Thread.sleep(2000);
		ScrolldownElement(c.sendbtnawaitingpayment);
		Explicitwaitvisibility(c.sendbtnawaitingpayment);
		clickjavascript(c.sendbtnawaitingpayment);

		Thread.sleep(4000);

		Explicitwaitvisibility(c.emailfield1);
		clickjavascript(c.emailfield1);
		tofill(c.emailentertxt, "testcreditnotes@mailinator.com");
		toenter();
	/*	if (c.emailfield2.isDisplayed()) {
			ScrolldownElement(c.emailfield2);
			Explicitwaitvisibility(c.emailfield2);
			clickjavascript(c.emailfield2);
			tofill(c.emailentertxt, "testcreditnotes@mailinator.com");
		} else {
			System.out.println("Email row 2 not present");
		}
		if (c.emailfield3.isDisplayed()) {
			ScrolldownElement(c.emailfield3);
			Explicitwaitvisibility(c.emailfield3);
			clickjavascript(c.emailfield3);
			tofill(c.emailentertxt, "testcreditnotes@mailinator.com");
		} else {
			System.out.println("Email row 3 not present");
		}
		
		if (c.emailfield4.isDisplayed()) {
			ScrolldownElement(c.emailfield4);
			Explicitwaitvisibility(c.emailfield4);
			clickjavascript(c.emailfield4);
			tofill(c.emailentertxt, "testcreditnotes@mailinator.com");
		} else  {
			System.out.println("Email row 4 not present");
		}
*/
		Thread.sleep(4000);
		ScrolldownElement(c.Sendbtnemailmultiple);
		Explicitwaitvisibility(c.Sendbtnemailmultiple);
		clickjavascript(c.Sendbtnemailmultiple);

		Thread.sleep(5000);
		
	

	}





}
