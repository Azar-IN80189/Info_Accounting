package info.stepdefinition;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import info.base.Reusableclass;
import info.pojo.Account_Login_POJO;
import info.pojo.Purchaseflowpojo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;

public class Purchase_Order_Flow extends Reusableclass {

	public static Purchaseflowpojo p;
	public static Account_Login_POJO a;

	@Before("@Login")
	private void login() throws InterruptedException {

		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		a = new Account_Login_POJO();

		toClick(a.username);
		tofill(a.username, "azarudeenn@info-tech.co.in");
		toClick(a.password);
		tofill(a.password, "Info@906");
		toClick(a.submit);

		/*
		 * toClick(a.username); tofill(a.username, "pachiyappanr@info-tech.co.in");
		 * toClick(a.password); tofill(a.password, "Test@2022"); toClick(a.submit);
		 */
		String title = "https://staging.infotech-accounting.com/dashboard";
		Thread.sleep(3000);
		if (title.equals(driver.getCurrentUrl())) {

			Thread.sleep(2000);

			System.out.println(title);
			System.out.println("Normal user is logged in");

		} else {

			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			System.out.println("Popup Section Entered");
			WebElement User = driver.findElement(
					By.xpath("//body/app-dashboard[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/select[1]"));
			Select dduser = new Select(User);
			dduser.selectByIndex(1);
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

		}

	}

	@Given("User needs to give new purchase order details-Contactname,Date,Orderno,etc")
	public void user_needs_to_give_new_purchase_order_details_contactname_date_orderno_etc() throws InterruptedException, AWTException {

		
		p = new Purchaseflowpojo();
		implicitwait();
		Thread.sleep(1000);
		Explicitwaitvisibility(p.purchase);
		tomovethecursor(p.purchase);
		toClick(p.purchase);
		Thread.sleep(1000);
		Explicitwaitvisibility(p.purchaseorder);
		tomovethecursor(p.purchaseorder);
		toClick(p.purchaseorder);

		/*
		 * tomovethecursor(p.purchase); toClick(p.purchase); Thread.sleep(1000);
		 * tomovethecursor(p.purchaseorder); toClick(p.purchaseorder);
		 */

		Thread.sleep(1000);
		tomovethecursor(p.addneworder);
		Thread.sleep(1000);
		implicitwait();
		toClick(p.addneworder);

		toClick(p.supliername);
		tofill(p.supliername, "Neweleven");
		Thread.sleep(1500);
		toenter();
		/*
		 * tomovethecursor(p.savenewcontact); toClick(p.savenewcontact);
		 */
		Thread.sleep(2000);

		tofill(p.Date, "03/11/2022");
		Thread.sleep(1500);
		toenter();
		Thread.sleep(1000);

		tofill(p.Deliverydate, "27/11/2022");
		Thread.sleep(1000);

		tofill(p.currency, "USD");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

		toClick(p.amount);
		Thread.sleep(1000);
		actionssendkeysdelete(p.amount);
		Thread.sleep(1000);
		tofill(p.amount, "Tax Exclusive");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

		// toClick(p.theme);
		// Thread.sleep(1000);
		// actionssendkeysdelete(p.theme);
		// Thread.sleep(1000);
		// tofill(p.theme, "Standard Template");
		// Thread.sleep(1000);
		// toenter();
		// Thread.sleep(1000);

		Explicitwaitvisibility(p.Listitem1);
		tomovethecursor(p.Listitem1);
		toClick(p.Listitem1);
		Thread.sleep(3000);
		tofill(p.Listitemname1, "Testitem1");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);

		tomovethecursor(p.listitem2);
		toClick(p.listitem2);
		Thread.sleep(3000);
		tofill(p.Listitemname2, "Testitem2");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);

		Scrolldownjavascript();
		mouseclick(p.savearrow);
		Thread.sleep(3000);

		tomovethecursor(p.saveasdraft);
		toClick(p.saveasdraft);
		Thread.sleep(1000);

		toClick(p.ok);

	}

	@When("User needs to save the details and verify its available in draft or not")
	public void user_needs_to_save_the_details_and_verify_its_available_in_draft_or_not() throws InterruptedException {

		p = new Purchaseflowpojo();
		Thread.sleep(1000);
		tomovethecursor(p.draft);
		toClick(p.draft);

		WebElement Tableorderno = driver.findElement(By.xpath("(//div[@row-index='0'])[2]"));
		String orderno = Tableorderno.getText();
		System.out.println("Purchase order number is:-" + orderno);
		Thread.sleep(1000);
		boolean displayed = Tableorderno.isDisplayed();
		System.out.println(displayed);
		Thread.sleep(1000);

	}

	@When("User needs to approve the purchase order and edit and moved to Awaiting approval")
	public void user_needs_to_approve_the_purchase_order_and_edit_and_moved_to_awaiting_approval() throws InterruptedException {

		p = new Purchaseflowpojo();
		driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();
		Thread.sleep(1000);
		Scrolldownjavascript();
		Thread.sleep(1500);
		toClick(p.savearrow);
		Thread.sleep(3000);
		Explicitwaitvisibility(p.saveforapproval);
		tomovethecursor(p.saveforapproval);
		toClick(p.saveforapproval);
		Thread.sleep(1000);
		toClick(p.ok);

		/*
		 * WebElement Tableorderno =
		 * driver.findElement(By.xpath("(//div[@row-index='0'])[2]")); String orderno =
		 * Tableorderno.getText(); System.out.println("Purchase order number is:-" +
		 * orderno); Thread.sleep(1000); boolean displayed = Tableorderno.isDisplayed();
		 * System.out.println(displayed); Thread.sleep(1000);
		 * System.out.println("Item is moved to awaitingapproval "); Thread.sleep(1000);
		 */

	}

	@When("User needs to approve the item from awaiting approval stage.")
	public void user_needs_to_approve_the_item_from_awaiting_approval_stage() throws InterruptedException {

		p = new Purchaseflowpojo();
		Thread.sleep(2000);
		tomovethecursor(p.awaitingapproval);
		toClick(p.awaitingapproval);
		driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();
		Thread.sleep(1000);
		Scrolldownjavascript();
		Thread.sleep(1500);
		toClick(p.approvearrow);
		Thread.sleep(2000);
		Explicitwaitvisibility(p.approve);
		tomovethecursor(p.approve);
		Thread.sleep(1000);
		toClick(p.approve);
		Thread.sleep(1000);
		toClick(p.ok);
		System.out.println("Item is approved");

	}

	@When("User needs to edit the approved item")
	public void user_needs_to_edit_the_approved_item() throws InterruptedException, AWTException {

		p = new Purchaseflowpojo();
		tomovethecursor(p.option);
		Thread.sleep(2000);
		toClick(p.option);
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		a.moveToElement(p.edit);
		p.edit.click();
		Thread.sleep(2000);
		p.addnewlines.click();
		Thread.sleep(1000);
		Explicitwaitvisibility(p.listitem2);
		tomovethecursor(p.listitem2);
		toClick(p.listitem2);
		Thread.sleep(3000);
		tofill(p.Listitemname2, "Testitem2");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);
		Scrolldownjavascript();
		Thread.sleep(1000);
		toClick(p.update);
		Thread.sleep(2000);
		toClick(p.ok);

	}

	@When("User needs to delete the approved item")
	public void user_needs_to_delete_the_approved_item() throws InterruptedException {

		p = new Purchaseflowpojo();
		tomovethecursor(p.option);
		Thread.sleep(2000);
		toClick(p.option);
		Thread.sleep(1000);
		tomovethecursor(p.delete);
		Thread.sleep(2000);
		toClick(p.delete);
		Thread.sleep(2000);
		toClick(p.yes);
		Thread.sleep(1000);
		tomovethecursor(p.deleteok);
		toClick(p.deleteok);

	}

	@Given("User needs to give new purchase order details in purchase order with tax inclusive")
	public void user_needs_to_give_new_purchase_order_details_in_purchase_order_with_tax_inclusive() throws InterruptedException, AWTException {
		
		

		p = new Purchaseflowpojo();
		implicitwait();

		/*
		 * Explicitwaitvisibility(p.purchase); Thread.sleep(1000);
		 * tomovethecursor(p.purchase); toClick(p.purchase);
		 */
		Thread.sleep(1000);
		Explicitwaitvisibility(p.purchaseorder);
		tomovethecursor(p.purchaseorder);
		toClick(p.purchaseorder);

		Thread.sleep(1000);
		tomovethecursor(p.addneworder);
		Thread.sleep(1000);
		implicitwait();
		toClick(p.addneworder);

		toClick(p.supliername);
		tofill(p.supliername, "Neweleven");
		Thread.sleep(1500);
		toenter();
		/*
		 * tomovethecursor(p.savenewcontact); toClick(p.savenewcontact);
		 * Thread.sleep(2000);
		 */

		tofill(p.Date, "03/11/2022");
		Thread.sleep(1500);
		toenter();
		Thread.sleep(1000);

		tofill(p.Deliverydate, "27/11/2022");
		Thread.sleep(1000);

		tofill(p.currency, "USD");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

		toClick(p.amount);
		Thread.sleep(1000);
		actionssendkeysdelete(p.amount);
		Thread.sleep(1000);
		tofill(p.amount, "Tax Inclusive");
		Thread.sleep(1000);
		toenter();

		Explicitwaitvisibility(p.Listitem1);
		tomovethecursor(p.Listitem1);
		toClick(p.Listitem1);
		Thread.sleep(3000);
		tofill(p.Listitemname1, "Testitem1");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);

		tomovethecursor(p.listitem2);
		toClick(p.listitem2);
		Thread.sleep(3000);
		tofill(p.Listitemname2, "Testitem2");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);

		Scrolldownjavascript();
		mouseclick(p.approvearrow);
		Thread.sleep(3000);

		tomovethecursor(p.approve);
		toClick(p.approve);
		Thread.sleep(1000);

		toClick(p.ok);

	}

	@When("Check purchase order amount with tax")
	public void check_purchase_order_amount_with_tax() {

		System.out.println("verify the amount");

	}

	@Given("User needs to give new purchase order details in purchase order with No tax")
	public void user_needs_to_give_new_purchase_order_details_in_purchase_order_with_no_tax() throws InterruptedException, AWTException {

		a = new Account_Login_POJO();

		p = new Purchaseflowpojo();
		implicitwait();

		Explicitwaitvisibility(p.purchase);
		Thread.sleep(1000);
		tomovethecursor(p.purchase);
		toClick(p.purchase);
		Thread.sleep(1000);
		Explicitwaitvisibility(p.purchaseorder);
		tomovethecursor(p.purchaseorder);
		toClick(p.purchaseorder);

		Thread.sleep(1000);
		tomovethecursor(p.addneworder);
		Thread.sleep(1000);
		implicitwait();
		toClick(p.addneworder);

		toClick(p.supliername);
		tofill(p.supliername, "Neweleven");
		Thread.sleep(1500);
		toenter();
		/*
		 * tomovethecursor(p.savenewcontact); toClick(p.savenewcontact);
		 * Thread.sleep(2000);
		 */

		tofill(p.Date, "03/11/2022");
		Thread.sleep(1500);
		toenter();
		Thread.sleep(1000);

		tofill(p.Deliverydate, "27/11/2022");
		Thread.sleep(1000);

		tofill(p.currency, "USD");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

		toClick(p.amount);
		Thread.sleep(1000);
		actionssendkeysdelete(p.amount);
		Thread.sleep(1000);
		tofill(p.amount, "No Tax");
		Thread.sleep(1000);
		toenter();

		Explicitwaitvisibility(p.Listitem1);
		tomovethecursor(p.Listitem1);
		toClick(p.Listitem1);
		Thread.sleep(3000);
		tofill(p.Listitemname1, "Testitem1");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);

		tomovethecursor(p.listitem2);
		clickjavascript(p.listitem2);
		Thread.sleep(3000);
		tofill(p.Listitemname2, "Testitem2");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);

		Scrolldownjavascript();
		mouseclick(p.approvearrow);
		Thread.sleep(3000);

		tomovethecursor(p.approve);
		toClick(p.approve);
		Thread.sleep(1000);

		toClick(p.ok);
	}

	@When("Check purchase order amount with No tax")
	public void check_purchase_order_amount_with_no_tax() {

		System.out.println("verify the amount");
	}

	@Given("User needs to create new purchase order and approve the order")
	public void user_needs_to_create_new_purchase_order_and_approve_the_order()  throws InterruptedException, AWTException {
	
		
		p = new Purchaseflowpojo();
		implicitwait();

		Explicitwaitvisibility(p.purchase);
		Thread.sleep(1000);
		tomovethecursor(p.purchase);
		toClick(p.purchase);
		Thread.sleep(1000);
		Explicitwaitvisibility(p.purchaseorder);
		tomovethecursor(p.purchaseorder);
		toClick(p.purchaseorder);
		

		/*
		 * tomovethecursor(p.purchase); toClick(p.purchase); Thread.sleep(1000);
		 * tomovethecursor(p.purchaseorder); toClick(p.purchaseorder);
		 */

		Thread.sleep(1000);
		Explicitwaitvisibility(p.addneworder);
		tomovethecursor(p.addneworder);
		Thread.sleep(1000);
		implicitwait();
		toClick(p.addneworder);

		toClick(p.supliername);
		tofill(p.supliername, "Neweleven");
		Thread.sleep(1500);
		toenter();
		/*
		 * tomovethecursor(p.savenewcontact); toClick(p.savenewcontact);
		 */
		Thread.sleep(2000);

		tofill(p.Date, "03/11/2022");
		Thread.sleep(1500);
		toenter();
		Thread.sleep(1000);

		tofill(p.Deliverydate, "27/11/2022");
		Thread.sleep(1000);

		tofill(p.currency, "USD");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

		toClick(p.amount);
		Thread.sleep(1000);
		actionssendkeysdelete(p.amount);
		Thread.sleep(1000);
		tofill(p.amount, "Tax Exclusive");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(1000);

		Explicitwaitvisibility(p.Listitem1);
		tomovethecursor(p.Listitem1);
		toClick(p.Listitem1);
		Thread.sleep(3000);
		tofill(p.Listitemname1, "Testitem1");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);

		tomovethecursor(p.listitem2);
		toClick(p.listitem2);
		Thread.sleep(3000);
		tofill(p.Listitemname2, "Testitem2");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);

		Scrolldownjavascript();
		mouseclick(p.savearrow);
		Thread.sleep(3000);

		tomovethecursor(p.saveforapproval);
		Thread.sleep(1000);
		toClick(p.saveforapproval);
		Thread.sleep(1000);

		toClick(p.ok);
		
	}
	@When("User needs to update the purchase order")
	public void user_needs_to_update_the_purchase_order()  throws InterruptedException, AWTException {

		p = new Purchaseflowpojo();
		Thread.sleep(2000);
		tomovethecursor(p.awaitingapproval);
		toClick(p.awaitingapproval);
		driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();
		Thread.sleep(1000);
		
		tomovethecursor(p.listitem3);
		toClick(p.listitem3);
		Thread.sleep(3000);
		tofill(p.Listitemname3, "Testitem2");
		Thread.sleep(2000);
		toenter();
		Thread.sleep(3000);
		
		Scrolldownjavascript();
		Thread.sleep(1500);
		
		toClick(p.update);
		Thread.sleep(2000);
		
		toClick(p.ok);
		
	}
	
	@Given("User needs to mark purchase order as bill")
	public void user_needs_to_mark_purchase_order_as_bill() throws InterruptedException {
		
	
		
		p = new Purchaseflowpojo();
		implicitwait();

		Explicitwaitvisibility(p.purchase);
		Thread.sleep(1000);
		tomovethecursor(p.purchase);
		toClick(p.purchase);
		Thread.sleep(1000);
		Explicitwaitvisibility(p.purchaseorder);
		tomovethecursor(p.purchaseorder);
		toClick(p.purchaseorder);
		
		Thread.sleep(2000);
		tomovethecursor(p.awaitingapproval);
		clickjavascript(p.awaitingapproval);
		driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();
		Thread.sleep(1000);
		Scrolldownjavascript();
		Thread.sleep(1500);
		toClick(p.approvearrow);
		Thread.sleep(2000);
		tomovethecursor(p.approve);
		Thread.sleep(1000);
		toClick(p.approve);
		Thread.sleep(1000);
		toClick(p.ok);
		System.out.println("Item is approved");
		
	}

	@When("User needs to approve bill purchase order")
	public void user_needs_to_approve_bill_purchase_order() throws InterruptedException, AWTException {
		
		p = new Purchaseflowpojo();
		tomovethecursor(p.option);
		Thread.sleep(2000);
		toClick(p.option);
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		a.moveToElement(p.markasbilled).perform();
		Thread.sleep(1000);
		toClick(p.markasbilled);
		Thread.sleep(1000);
		toClick(p.billchkbox);
		Thread.sleep(1000);
		toClick(p.ok );
		Thread.sleep(1000);
		Toclear(p.duedate);
		Thread.sleep(1000);
		tofill(p.duedate, "27/11/2022");
		toenter();
		Thread.sleep(1000);
		Scrolldownjavascript();	
		Thread.sleep(1000);
		tomovethecursor(p.approve);
		Thread.sleep(1000);
		toClick(p.approve);
		
	}	

}
