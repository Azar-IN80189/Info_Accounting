package info.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import info.base.Reusableclass;
import info.pojo.AccountLoginpojo;
import info.pojo.Billspojo;
import info.pojo.Purchaseflowpojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Purchase_Bills extends Reusableclass {

	public static Purchaseflowpojo p;
	public static AccountLoginpojo a;
	public static Billspojo b;

	@Given("New Bill order list")
	public void new_bill_order_list() throws InterruptedException, AWTException {

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
		tofill(b.from, "snap");
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
		tofill(b.permitno, "1234");
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

	@When("Verify order is in Draft")
	public void verify_order_is_in_draft() throws InterruptedException, AWTException {

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

		Explicitwaitvisibility(b.saveforapproval);
		tomovethecursor(b.saveforapproval);
		Thread.sleep(1000);
		toClick(b.saveforapproval);
		Thread.sleep(1000);

		toClick(b.ok);

	}

	@When("Bill is moved to awaiting payment and approve the bill")
	public void bill_is_moved_to_awaiting_payment_and_approve_the_bill() throws InterruptedException {

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

		Explicitwaitvisibility(b.approve);
		tomovethecursor(b.approve);
		Thread.sleep(1000);
		toClick(b.approve);

		Thread.sleep(1000);
		Explicitwaitvisibility(b.ok);
		toClick(b.ok);

	}
	
	@When("Make the bill payment")
	public void make_the_bill_payment() throws InterruptedException, AWTException {

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
	
	@When("update the bill")
	public void update_the_bill() throws InterruptedException, AWTException {
		
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
		tofill(b.from, "sales");
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
		tofill(b.permitno, "01234");
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
/*
		tomovethecursor(b.Listitem2);
		toClick(b.Listitem2);
		Thread.sleep(3000);
		tofill(b.Listitemname2, "Testitem2");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);
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

	@Given("New bill order for Tax inclusive")
	public void new_bill_order_for_tax_inclusive() throws InterruptedException, AWTException {

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
		tofill(b.from, "snap");
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

	@Given("New bill order for No Tax")
	public void new_bill_order_for_no_tax() throws InterruptedException, AWTException {

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
		tofill(b.from, "snap");
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
}
