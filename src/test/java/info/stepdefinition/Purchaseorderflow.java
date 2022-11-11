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
import info.pojo.AccountLoginpojo;
import info.pojo.Purchaseflowpojo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder;

public class Purchaseorderflow extends Reusableclass {

	public static Purchaseflowpojo p;
	public static AccountLoginpojo a;

	@Before("@Login")
	private void login() throws InterruptedException {

		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		driver.getPageSource();
		a = new AccountLoginpojo();

		toClick(a.username);
		tofill(a.username, "azarudeenn@info-tech.co.in");
		toClick(a.password);
		tofill(a.password, "Info@901");
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

	@Given("Give contact details and save the contacts")
	public void give_contact_details_and_save_the_contacts() throws InterruptedException, AWTException {

		/*
		 * p = new Purchaseflowpojo(); implicitwait(); toClick(p.purchase);
		 * toClick(p.purchaseorder);
		 * 
		 * Thread.sleep(2000); tomovethecursor(p.addneworder); Thread.sleep(2000);
		 * implicitwait(); toClick(p.addneworder); toClick(p.supliername);
		 * 
		 * tofill(p.supliername, "aa6"); Thread.sleep(3000); toenter();
		 * Thread.sleep(3000);
		 * 
		 * // ScrolldownElement(p.savearrow);
		 * 
		 * toClick(p.savearrow); Thread.sleep(3000); toClick(p.saveasdraft);
		 * Thread.sleep(1500);
		 * 
		 * toClick(p.ok); Thread.sleep(1000);
		 */

		System.out.println("print");
	}

	@When("the contact is available in draft or not")
	public void the_contact_is_available_in_draft_or_not() throws InterruptedException {

		System.out.println("order is in draft");

		/*
		 * WebElement draft = driver.findElement(By.xpath("//a[text()='Draft ( 3 )']"));
		 * Thread.sleep(2000); toClick(draft);
		 */

	}

	@Given("Give all information in new purchase order")
	public void give_all_information_in_new_purchase_order() throws Exception {

		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		driver.getPageSource();
		a = new AccountLoginpojo();

		toClick(a.username);
		tofill(a.username, "azarudeenn@info-tech.co.in");
		toClick(a.password);
		tofill(a.password, "Info@901");
		toClick(a.submit);
		
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

	@When("The purchase order is displayed in draft list")
	public void the_purchase_order_is_displayed_in_draft_list() throws InterruptedException {

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

	@When("The purchase order is edit and moved to Awaiting approval")
	public void the_purchase_order_is_edit_and_moved_to_awaiting_approval() throws InterruptedException {

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

	@When("The item is approved from awaiting approval stage.")
	public void the_item_is_approved_from_awaiting_approval_stage() throws InterruptedException {

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

	@When("item is able to edit")
	public void item_is_able_to_edit() throws InterruptedException, AWTException {

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

	@When("item is able to delete")
	public void item_is_able_to_delete() throws InterruptedException {

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

	@Given("Give all information in purchase order with tax inclusive")
	public void give_all_information_in_purchase_order_with_tax_inclusive() throws InterruptedException, AWTException {
		
		

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

	@Given("Give all information in purchase order with No tax")
	public void give_all_information_in_purchase_order_with_no_tax() throws InterruptedException, AWTException {

		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		driver.getPageSource();
		a = new AccountLoginpojo();

		toClick(a.username);
		tofill(a.username, "azarudeenn@info-tech.co.in");
		toClick(a.password);
		tofill(a.password, "Info@903");
		toClick(a.submit);
		
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

	@Given("Create new purchase order and approve the order")
	public void create_new_purchase_order_and_approve_the_order() throws InterruptedException, AWTException {
		
		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		driver.getPageSource();
		a = new AccountLoginpojo();

		toClick(a.username);
		tofill(a.username, "azarudeenn@info-tech.co.in");
		toClick(a.password);
		tofill(a.password, "Info@903");
		toClick(a.submit);
		
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
	@When("Update the purchase order")
	public void update_the_purchase_order() throws InterruptedException, AWTException {

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
	
	@Given("Mark purchase order as bill")
	public void mark_purchase_order_as_bill() throws InterruptedException {
		
		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		driver.getPageSource();
		a = new AccountLoginpojo();

		toClick(a.username);
		tofill(a.username, "azarudeenn@info-tech.co.in");
		toClick(a.password);
		tofill(a.password, "Info@903");
		toClick(a.submit);
		
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

	@When("Approve bill purchase order")
	public void approve_bill_purchase_order() throws InterruptedException, AWTException {
		
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

	@When("Unmark purchase order bill")
	public void unmark_purchase_order_bill() throws InterruptedException {
		
		p = new Purchaseflowpojo();
		implicitwait();
		Thread.sleep(1000);

		/*Explicitwaitvisibility(p.purchase);
		tomovethecursor(p.purchase);
		toClick(p.purchase);
		Thread.sleep(1000);
		Explicitwaitvisibility(p.purchaseorder);
		tomovethecursor(p.purchaseorder);
		toClick(p.purchaseorder);
		Thread.sleep(2000);
		tomovethecursor(p.billed);
		toClick(p.billed);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@row-index='0'])[2]")).click();*/
		
		Thread.sleep(1000);
		tomovethecursor(p.option);
		Thread.sleep(1000);
		toClick(p.option);
		Thread.sleep(1000);
		tomovethecursor(p.unmarkedbill);
		Thread.sleep(1000);
		toClick(p.unmarkedbill);
		System.out.println("Bill is unmarked successfully");
		
		
		
		
		
		
		
		
		
		
		
		
	}



	
	
	
}
