package info.stepdefinition;



import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Purchase_CreditNotes_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Purchase_CreditNotes extends Reusableclass {
	public static Purchase_CreditNotes_POJO p;


	@Given("User need to navigate to Purchase-CreditNotes slide")
	public void user_need_to_navigate_to_purchase_credit_notes_slide() throws InterruptedException {
		p=new Purchase_CreditNotes_POJO ();

		Explicitwaitvisibility(p.Purchaseslide);
		clickjavascript(p.Purchaseslide);
		Thread.sleep(1000);
		Explicitwaitvisibility(p.CreditNotesslide);
		clickjavascript(p.CreditNotesslide);

	}


	@Then("User need to Add a credit note")
	public void user_need_to_add_a_credit_note() throws AWTException, InterruptedException {
		p=new Purchase_CreditNotes_POJO ();


		Explicitwaitvisibility(p.NewCreditNotesbtn);
		clickjavascript(p.NewCreditNotesbtn);

		Thread.sleep(2000);

		Explicitwaitvisibility(p.Contacttxtbox);
		Toclear(p.Contacttxtbox);
		tofill(p.Contacttxtbox, "Automation");
		toenter();

		Thread.sleep(2000);

		Toclear(p.CreditnoteDatebox);
		tofill(p.CreditnoteDatebox, "10/11/2022");

		Thread.sleep(2000);

		Toclear(p.Referencetxtbox);
		tofill(p.Referencetxtbox, "Info");

		Thread.sleep(2000);

		Toclear(p.CurrencyDD);
		tofill(p.CurrencyDD, "TRY - Turkish Lira");
		Thread.sleep(3000);
		clickjavascript(p.Selectoptioncurrencies);
		toenter();

		Thread.sleep(2000);

		toClick(p.AmountsareDD);
		tofill(p.AmountsareDD, "Tax Exclusive");
		Explicitwaitvisibility(p.Selectoptioncurrencies);
		clickjavascript(p.Selectoptioncurrencies);


		Thread.sleep(2000);

		/*Explicitwaitvisibility(p.PriorityDD);
		toselectbyvisibletext(p.PriorityDD, "Low");

		Thread.sleep(2000);

		Explicitwaitvisibility(p.testtxtbox);
		tofill(p.testtxtbox, "Test1");

		Thread.sleep(2000);

		Explicitwaitvisibility(p.test2txtbox);
		tofill(p.test2txtbox, "Test2");

		Thread.sleep(2000);*/

		/*Explicitwaitvisibility(p.costcentreDD);
		toselectbyvalue(p.costcentreDD, "CA East");*/

		Thread.sleep(2000);

		clickjavascript(p.item1select);
		tofill(p.item1txtenter, "Testitem1");
		toenter();

		Thread.sleep(2000);

		clickjavascript(p.item2select);
		tofill(p.item2txtenter, "Testitem2");
		toenter();

		Thread.sleep(2000);

		Explicitwaitvisibility(p.addnewlinesbtn);
		clickjavascript(p.addnewlinesbtn);


	}
	@And("User need to Save as draft")
	public void user_need_to_save_as_draft() throws InterruptedException {
		p=new Purchase_CreditNotes_POJO ();
		Thread.sleep(2000);
		Explicitwaitvisibility(p.Savebtn);
		ScrolldownElement(p.Savebtn);
		clickjavascript(p.Savebtn);
		Thread.sleep(3000);
		Explicitwaitvisibility(p.Okbtn);
		clickjavascript(p.Okbtn);
	}

@Then("User need to navigate draft tab and click submit for approval")
public void user_need_to_navigate_draft_tab_and_click_submit_for_approval() {
	p=new Purchase_CreditNotes_POJO ();
	Explicitwaitvisibility(p.draftstab);
	clickjavascript(p.draftstab);


	Selectcheckbox(p.draftchkbox);

	Explicitwaitvisibility(p.Submitforapprovalbtndraft);
	clickjavascript(p.Submitforapprovalbtndraft);

	Explicitwaitvisibility(p.okpopupdraft);
	clickjavascript(p.okpopupdraft);

}


@And("User need to navigate awaiting approval and approve the credit notes")
public void user_need_to_navigate_awaiting_approval_and_approve_the_credit_notes() {
	p=new Purchase_CreditNotes_POJO ();
	
	Explicitwaitvisibility(p.Awaitingapprovaltab);
	clickjavascript(p.Awaitingapprovaltab);

	Selectcheckbox(p.Awaitingapprovalchkbox);

	Explicitwaitvisibility(p.ApprovebtnAwaitingapproval);
	clickjavascript(p.ApprovebtnAwaitingapproval);

	Explicitwaitvisibility(p.Okbtnawaitingapproval);
	clickjavascript(p.Okbtnawaitingapproval);

}
@Then("User need to navigate awaiting payment and approve the payment for specific credit notes")
public void user_need_to_navigate_awaiting_payment_and_approve_the_payment_for_specific_credit_notes() throws InterruptedException {
	p=new Purchase_CreditNotes_POJO ();
	
	Explicitwaitvisibility(p.Awaitingpaymenttab);
	clickjavascript(p.Awaitingpaymenttab);

	Explicitwaitvisibility(p.gridcell1awaitingpayment);
	clickjavascript(p.gridcell1awaitingpayment);

	Explicitwaitvisibility(p.Dateawaitingpayment);
	ScrolldownElement(p.Dateawaitingpayment);
	Toclear(p.Dateawaitingpayment);
	tofill(p.Dateawaitingpayment, "10/11/2022");



	Explicitwaitvisibility(p.Paidtoawaitingpayment);
	mouseclick(p.Paidtoawaitingpayment);
	Explicitwaitvisibility(p.Selectpaidtoawaitingpayment);
	clickjavascript(p.Selectpaidtoawaitingpayment);

	Thread.sleep(5000);

	Explicitwaitvisibility(p.Exchangerate);
	Toclear(p.Exchangerate);
	tofill(p.Exchangerate, "2");


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


	@Given("User need to navigate to Purchase-CreditNotes slide scenario")
	public void user_need_to_navigate_to_purchase_credit_notes_slide_scenario() throws InterruptedException {
		p=new Purchase_CreditNotes_POJO ();
		Explicitwaitvisibility(p.NewCreditNotesbtn);
		clickjavascript(p.NewCreditNotesbtn);



	}

	@Then("User need to Add a credit note scenario")
	public void user_need_to_add_a_credit_note_scenario() throws AWTException, InterruptedException {
		p=new Purchase_CreditNotes_POJO ();

		Thread.sleep(2000);

		Explicitwaitvisibility(p.Contacttxtbox);
		Toclear(p.Contacttxtbox);
		tofill(p.Contacttxtbox, "Automation");
		toenter();

		Thread.sleep(2000);

		Toclear(p.CreditnoteDatebox);
		tofill(p.CreditnoteDatebox, "10/11/2022");

		Thread.sleep(2000);

		Toclear(p.Referencetxtbox);
		tofill(p.Referencetxtbox, "Info");

		Thread.sleep(2000);

		Toclear(p.CurrencyDD);
		tofill(p.CurrencyDD, "TRY - Turkish Lira");
		Thread.sleep(3000);
		toenter();

		Thread.sleep(2000);

		toClick(p.AmountsareDD);
		tofill(p.AmountsareDD, "Tax Inclusive");
		Explicitwaitvisibility(p.Selectoptioncurrencies);
		clickjavascript(p.Selectoptioncurrencies);


		Thread.sleep(2000);

		clickjavascript(p.item1select);
		tofill(p.item1txtenter, "Testitem1");
		toenter();

		Thread.sleep(2000);

		clickjavascript(p.item2select);
		tofill(p.item2txtenter, "Testitem2");
		toenter();

		Thread.sleep(2000);

		Explicitwaitvisibility(p.addnewlinesbtn);
		clickjavascript(p.addnewlinesbtn);


	}
	@And("User need to Approve the credit notes")
	public void user_need_to_approve_the_credit_notes() throws InterruptedException {
		p=new Purchase_CreditNotes_POJO ();

		Explicitwaitvisibility(p.Approvebtn);
		ScrolldownElement(p.Approvebtn);
		Thread.sleep(2000);
		clickjavascript(p.Approvebtn);
		Thread.sleep(3000);
		Explicitwaitvisibility(p.Okbtn);
		clickjavascript(p.Okbtn);
		Thread.sleep(3000);
	}
		
	
		
		@Then("User need to navigate awaiting payment and approve the payment for specific credit notes notes scenario-II")
		public void user_need_to_navigate_awaiting_payment_and_approve_the_payment_for_specific_credit_notes_notes_scenario_ii() throws InterruptedException {
			p=new Purchase_CreditNotes_POJO ();
			
			Explicitwaitvisibility(p.CreditNoteslabel);
			clickjavascript(p.CreditNoteslabel);


			Explicitwaitvisibility(p.Awaitingpaymenttab);
			clickjavascript(p.Awaitingpaymenttab);

			Explicitwaitvisibility(p.gridcell1awaitingpayment);
			clickjavascript(p.gridcell1awaitingpayment);

			Explicitwaitvisibility(p.Dateawaitingpayment);
			ScrolldownElement(p.Dateawaitingpayment);
			Toclear(p.Dateawaitingpayment);
			tofill(p.Dateawaitingpayment, "10/11/2022");



			Explicitwaitvisibility(p.Paidtoawaitingpayment);
			mouseclick(p.Paidtoawaitingpayment);
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

	@Given("User need to navigate to Purchase-CreditNotes slide no tax scenario")
	public void user_need_to_navigate_to_purchase_credit_notes_slide_no_tax_scenario() {
		p=new Purchase_CreditNotes_POJO ();
		Explicitwaitvisibility(p.NewCreditNotesbtn);
		clickjavascript(p.NewCreditNotesbtn);

	}

	@Then("User need to Add a credit note no tax scenario")
	public void user_need_to_add_a_credit_note_no_tax_scenario() throws InterruptedException, AWTException {
		p=new Purchase_CreditNotes_POJO ();

		Thread.sleep(2000);

		Explicitwaitvisibility(p.Contacttxtbox);
		Toclear(p.Contacttxtbox);
		tofill(p.Contacttxtbox, "Automation");
		toenter();

		Thread.sleep(2000);

		Toclear(p.CreditnoteDatebox);
		tofill(p.CreditnoteDatebox, "10/11/2022");

		Thread.sleep(2000);

		Toclear(p.Referencetxtbox);
		tofill(p.Referencetxtbox, "Info");

		Thread.sleep(2000);

		Toclear(p.CurrencyDD);
		tofill(p.CurrencyDD, "TRY - Turkish Lira");
		Thread.sleep(3000);
		toenter();

		Thread.sleep(2000);

		toClick(p.AmountsareDD);
		tofill(p.AmountsareDD, "No Tax");
		Explicitwaitvisibility(p.Selectoptioncurrencies);
		clickjavascript(p.Selectoptioncurrencies);


		Thread.sleep(2000);

		clickjavascript(p.item1select);
		tofill(p.item1txtenter, "Testitem1");
		toenter();

		Thread.sleep(2000);

		clickjavascript(p.item2select);
		tofill(p.item2txtenter, "Testitem2");
		toenter();

		Thread.sleep(2000);

		Explicitwaitvisibility(p.addnewlinesbtn);
		clickjavascript(p.addnewlinesbtn);

	}

	@And("User need to Approve the credit notes no tax scenario")
	public void user_need_to_approve_the_credit_notes_no_tax_scenario() throws InterruptedException {

		p=new Purchase_CreditNotes_POJO ();

		Explicitwaitvisibility(p.Approvebtn);
		ScrolldownElement(p.Approvebtn);
		Thread.sleep(2000);
		clickjavascript(p.Approvebtn);
		Thread.sleep(3000);
		Explicitwaitvisibility(p.Okbtn);
		clickjavascript(p.Okbtn);
		Thread.sleep(3000);

	}
	
		@Then("User need to navigate awaiting payment and approve the payment for specific credit notes notes scenario-III")
		public void user_need_to_navigate_awaiting_payment_and_approve_the_payment_for_specific_credit_notes_notes_scenario_iii() throws InterruptedException {

			p=new Purchase_CreditNotes_POJO ();
			
			Explicitwaitvisibility(p.CreditNoteslabel);
			clickjavascript(p.CreditNoteslabel);


			Explicitwaitvisibility(p.Awaitingpaymenttab);
			clickjavascript(p.Awaitingpaymenttab);

			Explicitwaitvisibility(p.gridcell1awaitingpayment);
			clickjavascript(p.gridcell1awaitingpayment);

			Explicitwaitvisibility(p.Dateawaitingpayment);
			ScrolldownElement(p.Dateawaitingpayment);
			Toclear(p.Dateawaitingpayment);
			tofill(p.Dateawaitingpayment, "10/11/2022");


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


		
		
		
		

	}





