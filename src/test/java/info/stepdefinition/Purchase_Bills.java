package info.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import info.base.Reusableclass;
import info.pojo.Account_Login_POJO;
import info.pojo.Billspojo;
import info.pojo.Purchaseflowpojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Purchase_Bills extends Reusableclass {

	public static Purchaseflowpojo p;
	public static Account_Login_POJO a;
	public static Billspojo b;

	@Given("User needs to give new Bill details- Contact,Date,Currency etc")
	public void user_needs_to_give_new_bill_details_contact_date_currency_etc()
			throws InterruptedException, AWTException {


		p = new Purchaseflowpojo();
		b = new Billspojo();

		Explicitwaitvisibility(p.purchase);
		tomovethecursor(p.purchase);
		toClick(p.purchase);
		Thread.sleep(2000);
		Explicitwaitvisibility(b.bills);
		tomovethecursor(b.bills);
		toClick(b.bills);
		Thread.sleep(1000);
		Explicitwaitvisibility(b.newbill);
		tomovethecursor(b.newbill);
		toClick(b.newbill);
		tomovethecursor(b.from);
		Thread.sleep(1000);
		tofill(b.from, "ft102");
		/*
		 * tomovethecursor(b.savenew); Thread.sleep(1000); toClick(b.savenew);
		 */
		Thread.sleep(2000);
		toenter();
		Thread.sleep(1000);

		tomovethecursor(b.duedate);
		tofill(b.duedate, "27/11/2022");
		toenter();
		Thread.sleep(1000);
		tomovethecursor(b.permitno);
		tofill(b.permitno, "876567");
		tomovethecursor(b.refno);
		tofill(b.refno, "5678");
		Thread.sleep(1000);
		tomovethecursor(b.currency);
		tofill(b.currency, "SGD - Singapore Dollar");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		tomovethecursor(b.amountsare);
		toClick(b.amountsare);
		Thread.sleep(2000);
		b.amountsare.clear();
		tofill(b.amountsare, "Tax Exclusive");
		toenter();
		Thread.sleep(1000);
		totabkey();

		/*
		 * tomovethecursor(b.test); tofill(b.test, "Testing");
		 * 
		 * tomovethecursor(b.test2); tofill(b.test2, "Testingone");
		 * 
		 * tomovethecursor(b.costcenter); tofill(b.costcenter, "CA East"); toenter();
		 */

		Explicitwaitvisibility(b.Listitem1);
		tomovethecursor(b.Listitem1);
		toClick(b.Listitem1);
		Thread.sleep(3000);
		tofill(b.Listitemname1, "Testitem1");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);
		/*
		 * tomovethecursor(b.addnewlines); toClick(b.addnewlines); Thread.sleep(2000);
		 */

		tomovethecursor(b.Listitem2);
		toClick(b.Listitem2);
		Thread.sleep(3000);
		tofill(b.Listitemname2, "Testitem2");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

		Scrolldownjavascript();
		Thread.sleep(1000);
		Explicitwaitvisibility(b.savearrow);
		toClick(b.savearrow);
		Thread.sleep(2000);

		Explicitwaitvisibility(b.saveasdraft);
		tomovethecursor(b.saveasdraft);
		Thread.sleep(1000);
		toClick(b.saveasdraft);
		Thread.sleep(1000);

		Explicitwaitvisibility(b.ok);
		toClick(b.ok);
	}

	@When("User needs to check the Bill is in draft and move to waiting for approval")
	public void user_needs_to_check_the_bill_is_in_draft_and_move_to_waiting_for_approval()
			throws InterruptedException, AWTException {

		Explicitwaitvisibility(b.billdraft);
		tomovethecursor(b.billdraft);
		Thread.sleep(1000);
		toClick(b.billdraft);
		Thread.sleep(2000);
		toClick(b.draftsitem);

		Explicitwaitvisibility(b.Listitem3);
		tomovethecursor(b.Listitem3);
		toClick(b.Listitem3);
		Thread.sleep(3000);
		tofill(b.Listitemname3, "Acc group");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

		ScrolldownElement(b.savearrow);
		Explicitwaitvisibility(b.savearrow);
		tomovethecursor(b.savearrow);
		Thread.sleep(1000);
		toClick(b.savearrow);
		Thread.sleep(1000);

		tomovethecursor(b.saveforapproval);
		Thread.sleep(1000);
		toClick(b.saveforapproval);
		Thread.sleep(1000);

		toClick(b.ok);

	}

	@When("User needs to verify the Bill is in Awaiting approval")
	public void user_needs_to_verify_the_bill_is_in_awaiting_approval() throws InterruptedException {

		Explicitwaitvisibility(b.awaitingapproval);
		tomovethecursor(b.awaitingapproval);
		Thread.sleep(1000);
		toClick(b.awaitingapproval);

		Thread.sleep(1000);
		Explicitwaitvisibility(b.awaitingitem);
		tomovethecursor(b.awaitingitem);
		Thread.sleep(1000);
		toClick(b.awaitingitem);

		Scrolldownjavascript();
		Thread.sleep(1000);
		Explicitwaitvisibility(b.approvearrow);
		tomovethecursor(b.approvearrow);
		toClick(b.approvearrow);
		Thread.sleep(2000);
	}

	@When("User needs to Approve the bill")
	public void user_needs_to_approve_the_bill() throws InterruptedException {

		Explicitwaitvisibility(b.approve);
		tomovethecursor(b.approve);
		Thread.sleep(1000);
		toClick(b.approve);

		Thread.sleep(1000);
		Explicitwaitvisibility(b.ok);
		toClick(b.ok);

	}

	@When("User needs to Make the payment for bills")
	public void user_needs_to_make_the_payment_for_bills() throws InterruptedException, AWTException {

		Scrolldownjavascript();

		Thread.sleep(1000);

		Explicitwaitvisibility(b.payamount);
		tomovethecursor(b.payamount);
		b.payamount.clear();
		tofill(b.payamount, "256.50");

		Thread.sleep(1000);
		Explicitwaitvisibility(b.datepaid);
		b.datepaid.clear();
		Thread.sleep(1000);
		tofill(b.datepaid, "30/10/2022");
		toenter();

		Thread.sleep(1000);
		Explicitwaitvisibility(b.paidfrom);
		b.paidfrom.clear();
		Thread.sleep(1000);
		tofill(b.paidfrom, "testacc");
		toenter();

		Thread.sleep(1000);
		Explicitwaitvisibility(b.paymentmode);
		b.paymentmode.clear();
		Thread.sleep(1000);
		tofill(b.paymentmode, "cash");
		toenter();

		Thread.sleep(1000);
		Explicitwaitvisibility(b.addpayment);
		tomovethecursor(b.addpayment);
		Thread.sleep(1000);
		toClick(b.addpayment);

		Thread.sleep(1000);
		Explicitwaitvisibility(b.ok);
		toClick(b.ok);

		Thread.sleep(1000);
		Explicitwaitvisibility(b.paid);
		tomovethecursor(b.paid);
		Thread.sleep(1000);
		toClick(b.paid);
		System.out.println("Amount is paid for bill");

	}

	@When("User needs to Update the Bill")
	public void user_needs_to_update_the_bill() throws InterruptedException, AWTException {

		p = new Purchaseflowpojo();
		b = new Billspojo();
		Explicitwaitvisibility(p.purchase);
		tomovethecursor(p.purchase);
		toClick(p.purchase);
		Thread.sleep(2000);
		Explicitwaitvisibility(b.bills);
		tomovethecursor(b.bills);
		toClick(b.bills);
		Thread.sleep(1000);
		Explicitwaitvisibility(b.newbill);
		tomovethecursor(b.newbill);
		toClick(b.newbill);
		tomovethecursor(b.from);
		Thread.sleep(1000);
		tofill(b.from, "ft102");
		/*
		 * tomovethecursor(b.savenew); Thread.sleep(1000); toClick(b.savenew);
		 */
		Thread.sleep(2000);
		toenter();
		Thread.sleep(1000);

		tomovethecursor(b.duedate);
		tofill(b.duedate, "27/11/2022");
		toenter();
		Thread.sleep(1000);
		tomovethecursor(b.permitno);
		tofill(b.permitno, "987987");
		tomovethecursor(b.refno);
		tofill(b.refno, "56780");
		Thread.sleep(1000);
		tomovethecursor(b.currency);
		tofill(b.currency, "SGD - Singapore Dollar");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		tomovethecursor(b.amountsare);
		clickjavascript(b.amountsare);
		Thread.sleep(2000);
		b.amountsare.clear();
		tofill(b.amountsare, "Tax Exclusive");
		toenter();
		Thread.sleep(1000);
		totabkey();

		/*
		 * tomovethecursor(b.test); tofill(b.test, "Testing");
		 * 
		 * tomovethecursor(b.test2); tofill(b.test2, "Testingone");
		 * 
		 * tomovethecursor(b.costcenter); tofill(b.costcenter, "CA East"); toenter();
		 */

		Explicitwaitvisibility(b.Listitem1);
		tomovethecursor(b.Listitem1);
		toClick(b.Listitem1);
		Thread.sleep(3000);
		tofill(b.Listitemname1, "Testitem1");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);
		/*
		 * tomovethecursor(b.addnewlines); toClick(b.addnewlines); Thread.sleep(2000);
		 */
		/*
		 * tomovethecursor(b.Listitem2); toClick(b.Listitem2); Thread.sleep(3000);
		 * tofill(b.Listitemname2, "Testitem2"); Thread.sleep(1000); toenter();
		 * Thread.sleep(1000);
		 */
		Scrolldownjavascript();
		Thread.sleep(1000);
		Explicitwaitvisibility(b.savearrow);
		toClick(b.savearrow);
		Thread.sleep(2000);

		Explicitwaitvisibility(b.saveasdraft);
		tomovethecursor(b.saveasdraft);
		Thread.sleep(1000);
		toClick(b.saveasdraft);
		Thread.sleep(1000);

		Explicitwaitvisibility(b.ok);
		toClick(b.ok);

	}

	@Given("User needs to create new bill order for Tax inclusive")
	public void user_needs_to_create_new_bill_order_for_tax_inclusive() throws InterruptedException, AWTException {

		p = new Purchaseflowpojo();
		b = new Billspojo();
		implicitwait();

		/*
		 * tomovethecursor(p.purchase); toClick(p.purchase);
		 */
		Explicitwaitvisibility(b.newbill);
		tomovethecursor(b.newbill);
		toClick(b.newbill);
		tomovethecursor(b.from);
		Thread.sleep(1000);
		tofill(b.from, "ft102");
		/*
		 * tomovethecursor(b.savenew); Thread.sleep(1000); toClick(b.savenew);
		 */
		Thread.sleep(2000);
		toenter();
		Thread.sleep(1000);

		Explicitwaitvisibility(b.duedate);
		tomovethecursor(b.duedate);
		tofill(b.duedate, "27/11/2022");
		toenter();
		Thread.sleep(1000);
		Explicitwaitvisibility(b.permitno);
		tomovethecursor(b.permitno);
		tofill(b.permitno, "1234");
		Explicitwaitvisibility(b.refno);
		tomovethecursor(b.refno);
		tofill(b.refno, "5678");
		Thread.sleep(1000);
		Explicitwaitvisibility(b.currency);
		tomovethecursor(b.currency);
		tofill(b.currency, "SGD - Singapore Dollar");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		tomovethecursor(b.amountsare);
		toClick(b.amountsare);
		Thread.sleep(2000);
		b.amountsare.clear();
		tofill(b.amountsare, "Tax Inclusive");
		toenter();
		Thread.sleep(1000);
		totabkey();

		/*
		 * tomovethecursor(b.test); tofill(b.test, "Testing");
		 * 
		 * tomovethecursor(b.test2); tofill(b.test2, "Testingone");
		 * 
		 * tomovethecursor(b.costcenter); tofill(b.costcenter, "CA East"); toenter();
		 */

		Explicitwaitvisibility(b.Listitem1);
		tomovethecursor(b.Listitem1);
		toClick(b.Listitem1);
		Thread.sleep(3000);
		tofill(b.Listitemname1, "Testitem1");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);
		/*
		 * tomovethecursor(b.addnewlines); toClick(b.addnewlines); Thread.sleep(2000);
		 */

		Explicitwaitvisibility(b.Listitem2);
		tomovethecursor(b.Listitem2);
		toClick(b.Listitem2);
		Thread.sleep(3000);
		tofill(b.Listitemname2, "Testitem2");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

	}

	@When("verify bill is approved or not")
	public void verify_bill_is_approved_or_not() throws InterruptedException {

		Scrolldownjavascript();
		Thread.sleep(1000);
		Explicitwaitvisibility(b.approvearrow);
		tomovethecursor(b.approvearrow);
		toClick(b.approvearrow);
		Thread.sleep(2000);

		Explicitwaitvisibility(b.approve);
		tomovethecursor(b.approve);
		Thread.sleep(1000);
		toClick(b.approve);

		Thread.sleep(1000);
		Explicitwaitvisibility(b.ok);
		toClick(b.ok);
	}

	@Given("User needs to create new bill order for No Tax")
	public void user_needs_to_create_new_bill_order_for_no_tax() throws InterruptedException, AWTException {

		p = new Purchaseflowpojo();
		b = new Billspojo();
		implicitwait();

		/*
		 * tomovethecursor(p.purchase); toClick(p.purchase);
		 */
		Thread.sleep(1000);
		tomovethecursor(b.newbill);
		toClick(b.newbill);
		tomovethecursor(b.from);
		Thread.sleep(1000);
		tofill(b.from, "ft102");
		/*
		 * tomovethecursor(b.savenew); Thread.sleep(1000); toClick(b.savenew);
		 */
		Thread.sleep(2000);
		toenter();
		Thread.sleep(1000);

		Explicitwaitvisibility(b.duedate);
		tomovethecursor(b.duedate);
		tofill(b.duedate, "27/11/2022");
		toenter();
		Thread.sleep(1000);
		Explicitwaitvisibility(b.permitno);
		tomovethecursor(b.permitno);
		tofill(b.permitno, "1234");
		Explicitwaitvisibility(b.refno);
		tomovethecursor(b.refno);
		tofill(b.refno, "5678");
		Thread.sleep(1000);
		Explicitwaitvisibility(b.currency);
		tomovethecursor(b.currency);
		tofill(b.currency, "SGD - Singapore Dollar");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Explicitwaitvisibility(b.amountsare);
		tomovethecursor(b.amountsare);
		toClick(b.amountsare);
		Thread.sleep(2000);
		b.amountsare.clear();
		tofill(b.amountsare, "No Tax");
		toenter();
		Thread.sleep(1000);
		totabkey();

		/*
		 * tomovethecursor(b.test); tofill(b.test, "Testing");
		 * 
		 * tomovethecursor(b.test2); tofill(b.test2, "Testingone");
		 * 
		 * tomovethecursor(b.costcenter); tofill(b.costcenter, "CA East"); toenter();
		 */

		Explicitwaitvisibility(b.Listitem1);
		tomovethecursor(b.Listitem1);
		toClick(b.Listitem1);
		Thread.sleep(3000);
		tofill(b.Listitemname1, "Testitem1");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);
		/*
		 * tomovethecursor(b.addnewlines); toClick(b.addnewlines); Thread.sleep(2000);
		 */

		Explicitwaitvisibility(b.Listitem2);
		tomovethecursor(b.Listitem2);
		toClick(b.Listitem2);
		Thread.sleep(3000);
		tofill(b.Listitemname2, "Testitem2");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

	}

	@When("verify No tax bill is approved or not")
	public void verify_no_tax_bill_is_approved_or_not() throws InterruptedException {

		Scrolldownjavascript();
		Thread.sleep(1000);
		Explicitwaitvisibility(b.approvearrow);
		tomovethecursor(b.approvearrow);
		toClick(b.approvearrow);
		Thread.sleep(2000);

		Explicitwaitvisibility(b.approve);
		tomovethecursor(b.approve);
		Thread.sleep(1000);
		toClick(b.approve);

		Thread.sleep(1000);
		Explicitwaitvisibility(b.ok);
		toClick(b.ok);
	}

	@Given("User needs to Create new Bill and approve it")
	public void user_needs_to_create_new_bill_and_approve_it() throws InterruptedException, AWTException {

		p = new Purchaseflowpojo();
		b = new Billspojo();

		Explicitwaitvisibility(p.purchase);
		tomovethecursor(p.purchase);
		clickjavascript(p.purchase);
		Thread.sleep(2000);
		Explicitwaitvisibility(b.bills);
		tomovethecursor(b.bills);
		toClick(b.bills);
		Thread.sleep(1000);

		Explicitwaitvisibility(b.newbill);
		tomovethecursor(b.newbill);
		toClick(b.newbill);

		tomovethecursor(b.from);
		Thread.sleep(1000);
		tofill(b.from, "ft102");
		toenter();
		Thread.sleep(3000);

		tofill(b.duedate, "27/11/2022");
		toenter();
		Thread.sleep(2000);

		tomovethecursor(b.permitno);
		tofill(b.permitno, "876567");
		tomovethecursor(b.refno);
		tofill(b.refno, "5678");
		Thread.sleep(1000);
		tomovethecursor(b.currency);
		tofill(b.currency, "SGD - Singapore Dollar");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		tomovethecursor(b.amountsare);
		toClick(b.amountsare);
		Thread.sleep(2000);
		b.amountsare.clear();
		tofill(b.amountsare, "Tax Exclusive");
		toenter();
		Thread.sleep(1000);
		totabkey();

		Explicitwaitvisibility(b.Listitem1);
		tomovethecursor(b.Listitem1);
		toClick(b.Listitem1);
		Thread.sleep(3000);
		tofill(b.Listitemname1, "Testitem1");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

		tomovethecursor(b.Listitem2);
		clickjavascript(b.Listitem2);
		toClick(b.Listitem2);
		Thread.sleep(3000);
		tofill(b.Listitemname2, "Testitem2");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

		Scrolldownjavascript();
		Thread.sleep(1000);
		Explicitwaitvisibility(b.approvearrow);
		tomovethecursor(b.approvearrow);
		toClick(b.approvearrow);
		Thread.sleep(2000);

		Explicitwaitvisibility(b.approve);
		tomovethecursor(b.approve);
		Thread.sleep(1000);
		toClick(b.approve);

		Thread.sleep(1000);
		Explicitwaitvisibility(b.ok);
		tomovethecursor(b.ok);
		toClick(b.ok);

	}

	@Then("User needs to edit the approved bill")
	public void user_needs_to_edit_the_approved_bill() throws InterruptedException {

		p = new Purchaseflowpojo();
		b = new Billspojo();

		/*
		 * tomovethecursor(b.awaitingapproval); Thread.sleep(1000);
		 * toClick(b.awaitingapproval);
		 * 
		 * Thread.sleep(1000); tomovethecursor(b.draftsitem); Thread.sleep(1000);
		 * toClick(b.draftsitem);
		 */

		tomovethecursor(b.options);
		Thread.sleep(1000);
		toClick(b.options);

		tomovethecursor(b.edit);
		Thread.sleep(1000);
		toClick(b.edit);

		Thread.sleep(2000);

		Scrolldownjavascript();

		tomovethecursor(b.update);
		Thread.sleep(1000);
		toClick(b.update);

		Thread.sleep(1000);
		Explicitwaitvisibility(b.ok);
		toClick(b.ok);

	}

	@Then("User needs to void the approved bill")
	public void user_needs_to_void_the_approved_bill() throws InterruptedException {

		b = new Billspojo();

		tomovethecursor(b.options);
		Thread.sleep(1000);
		toClick(b.options);

		tomovethecursor(b.voiddelete);
		Thread.sleep(1000);
		toClick(b.voiddelete);

		Thread.sleep(2000);

		Scrolldownjavascript();

		Thread.sleep(1000);
		Explicitwaitvisibility(b.yes);
		toClick(b.yes);

		Thread.sleep(1000);
		Explicitwaitvisibility(b.ok);
		toClick(b.ok);

	}

	@Given("User needs to copy the bill")
	public void user_needs_to_copy_the_bill() throws InterruptedException {

		p = new Purchaseflowpojo();
		b = new Billspojo();

		Explicitwaitvisibility(p.purchase);
		tomovethecursor(p.purchase);
		clickjavascript(p.purchase);
		Thread.sleep(2000);
		Explicitwaitvisibility(b.bills);
		tomovethecursor(b.bills);
		toClick(b.bills);
		Thread.sleep(1000);

		Explicitwaitvisibility(b.awaitingpayment);
		tomovethecursor(b.awaitingpayment);
		Thread.sleep(1000);
		toClick(b.awaitingpayment);

		Thread.sleep(1000);
		tomovethecursor(b.draftsitem);
		Thread.sleep(1000);
		toClick(b.draftsitem);

		tomovethecursor(b.options);
		toClick(b.options);
		Thread.sleep(1000);

		tomovethecursor(b.copy);
		toClick(b.copy);

	}

	@Then("User needs to approve the copied bill")
	public void user_needs_to_approve_the_copied_bill() throws InterruptedException {

		b = new Billspojo();

		Scrolldownjavascript();
		Thread.sleep(1000);
		tomovethecursor(b.approve);
		toClick(b.approve);
		Thread.sleep(2000);
		tomovethecursor(b.ok);
		toClick(b.ok);

	}

	@Then("User needs to add credit note for approved bill")
	public void user_needs_to_add_credit_note_for_approved_bill() throws InterruptedException {

		b = new Billspojo();

		tomovethecursor(b.options);
		toClick(b.options);
		Thread.sleep(1000);

		tomovethecursor(b.Addcreditnote);
		Thread.sleep(1000);
		toClick(b.Addcreditnote);

		Scrolldownjavascript();
		Thread.sleep(1000);
		tomovethecursor(b.approve);
		clickjavascript(b.approve);
		Thread.sleep(2000);
		tomovethecursor(b.ok);
		toClick(b.ok);

	}

}
