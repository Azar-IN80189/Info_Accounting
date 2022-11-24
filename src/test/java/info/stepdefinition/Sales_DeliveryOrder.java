package info.stepdefinition;

import java.awt.AWTException;

import org.testng.asserts.SoftAssert;

import info.base.Reusableclass;

import info.pojo.Sales_DeliveryOrder_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sales_DeliveryOrder extends Reusableclass{
	public static Sales_DeliveryOrder_POJO s;
	public static SoftAssert softAssert = new SoftAssert();
	@Given("User need to navigate to Delivery order page")
	public void user_need_to_navigate_to_delivery_order_page() {
		s=new Sales_DeliveryOrder_POJO();
		Explicitwaitvisibility(s.Salesslide);
		clickjavascript(s.Salesslide);
		Explicitwaitvisibility(s.Deliveryorderslide);
		clickjavascript(s.Deliveryorderslide);
	}

	@Then("User need to Approve a Delivery order")
	public void user_need_to_approve_a_delivery_order() throws AWTException, InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Explicitwaitvisibility(s.DeliveryOrderbtn);
		clickjavascript(s.DeliveryOrderbtn);
		Explicitwaitvisibility(s.ChooseContactDD);
		tofill(s.ChooseContactDD, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);
		//totabkey();
		//Delete();
		//Explicitwaitvisibility(s.Deliverynumbertxt);
		//tofill(s.Deliverynumbertxt, "21211233");
		//Thread.sleep(1000);
		//totabkey();
		//Delete();
		tofill(s.Date, "17/11/2022");
		Thread.sleep(2000);
		Explicitwaitvisibility(s.ReferenceName);
		tofill(s.ReferenceName, "Sales");
		Thread.sleep(1000);
		Explicitwaitvisibility(s.CurrencyDD);
		Toclear(s.CurrencyDD);
		tofill(s.CurrencyDD, "Letter Head Template");
		toenter();
		Thread.sleep(3000);
		Explicitwaitvisibility(s.items1table);
		clickjavascript(s.items1table);
		Thread.sleep(1000);
		Explicitwaitvisibility(s.items1tabletxt);
		Thread.sleep(1000);
		tofill(s.items1tabletxt, "Testitem1");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.ApproveBtn);
		Explicitwaitvisibility(s.ApproveBtn);
		clickjavascript(s.ApproveBtn);
		Thread.sleep(5000);
		toenter();
		
	}
	
	@Then("User need to send approved delivery order")
	public void user_need_to_send_approved_delivery_order() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(1000);
		Explicitwaitvisibility(s.SendBtn);
		clickjavascript(s.SendBtn);
		Thread.sleep(1000);
		Explicitwaitvisibility(s.Mailto);
		Thread.sleep(4000);
		Pageloadtimeout();
		tofill(s.Mailto, "testemailquotation@mailinator.com");
		Thread.sleep(4000);
		ScrolldownElement(s.Sendmeacopychkbox);
		unSelectcheckbox(s.Sendmeacopychkbox);
		ScrolldownElement(s.Sendmailbtn);
		clickjavascript(s.Sendmailbtn);
		Thread.sleep(5000);
	}

	@Then("User need to copy as quote in delivery order page")
	public void user_need_to_copy_as_quote_in_delivery_order_page() {

		s=new Sales_DeliveryOrder_POJO();

		ScrollupElement(s.DeliveryOrderScreen);
		Explicitwaitvisibility(s.DeliveryOrderScreen);
		clickjavascript(s.DeliveryOrderScreen);

		Explicitwaitvisibility(s.Approvedtab);
		clickjavascript(s.Approvedtab);
		Selectcheckbox(s.Approvedtabchkboxall);
		Explicitwaitvisibility(s.copytobtnapprovedtab);
		clickjavascript(s.copytobtnapprovedtab);
		Explicitwaitvisibility(s.quoteradiobtnapprovedtab);
		clickjavascript(s.quoteradiobtnapprovedtab);
		Explicitwaitvisibility(s.quotechkboxrdbtnapprovedtab);
		Selectcheckbox(s.quotechkboxrdbtnapprovedtab);
		Explicitwaitvisibility(s.createdraftbtnapprovedtab);
		Selectcheckbox(s.createdraftbtnapprovedtab);

	}
	@Then("User need to mark as packed in delivery order page")
	public void user_need_to_mark_as_packed_in_delivery_order_page() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);

		Selectcheckbox(s.Approvedtabchkboxall);
		Explicitwaitvisibility(s.Markaspackedbtnapprovedtab);
		clickjavascript(s.Markaspackedbtnapprovedtab);
		Explicitwaitvisibility(s.OkbtnMarkaspackedbtnapprovedtab);
		clickjavascript(s.OkbtnMarkaspackedbtnapprovedtab);
	}
	@Then("User need to mark as delivered in delivery order page")
	public void user_need_to_mark_as_delivered_in_delivery_order_page() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);
		Explicitwaitvisibility(s.packedtab);
		clickjavascript(s.packedtab);
		Selectcheckbox(s.packedchkboxall);
		Explicitwaitvisibility(s.Markasdeliveredbtn);
		clickjavascript(s.Markasdeliveredbtn);
		Explicitwaitvisibility(s.okbtnMarkasdelivered);
		clickjavascript(s.okbtnMarkasdelivered);
	}
	@Then("User need to mark as Invoiced")
	public void user_need_to_mark_as_invoiced() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);
		Explicitwaitvisibility(s.Deliveredtab);
		clickjavascript(s.Deliveredtab);
		Selectcheckbox(s.Deliveredchkboxall);
		Explicitwaitvisibility(s.Markasinvoicedbtn);
		clickjavascript(s.Markasinvoicedbtn);
		Explicitwaitvisibility(s.OkbtnMarkasinvoiced);
		clickjavascript(s.OkbtnMarkasinvoiced);
	}
	@Then("User need to void the delivery order")
	public void user_need_to_void_the_delivery_order() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();

		Thread.sleep(2000);
		Explicitwaitvisibility(s.invoicedtab);
		clickjavascript(s.invoicedtab);
		Selectcheckbox(s.Invoicedchkboxall);
		Explicitwaitvisibility(s.voidbtn);
		clickjavascript(s.voidbtn);
		Explicitwaitvisibility(s.Yesvoiditbtn);
		clickjavascript(s.Yesvoiditbtn);
	}




	@And("User need to Save a Delivery order")
	public void user_need_to_save_a_delivery_order() throws InterruptedException, AWTException {

		s=new Sales_DeliveryOrder_POJO();

		Explicitwaitvisibility(s.DeliveryOrderbtn);
		clickjavascript(s.DeliveryOrderbtn);
		Explicitwaitvisibility(s.ChooseContactDD);
		tofill(s.ChooseContactDD, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);

		Explicitwaitvisibility(s.Date);
		tofill(s.Date, "17/11/2022");
		Thread.sleep(2000);
		Explicitwaitvisibility(s.ReferenceName);
		tofill(s.ReferenceName, "Sales");
		Thread.sleep(1000);
		Toclear(s.CurrencyDD);
		Explicitwaitvisibility(s.CurrencyDD);
		tofill(s.CurrencyDD, "Letter Head Template");
		toenter();
		Thread.sleep(3000);
		Explicitwaitvisibility(s.items1table);
		clickjavascript(s.items1table);
		Thread.sleep(1000);
		Explicitwaitvisibility(s.items1tabletxt);
		tofill(s.items1tabletxt, "Testitem1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.SaveBtn);
		Explicitwaitvisibility(s.SaveBtn);
		toClick(s.SaveBtn);
		Thread.sleep(5000);
		toenter();
		Thread.sleep(5000);
		/*Explicitwaitvisibility(s.Searchboxtxt);
		clickjavascript(s.Searchboxtxt);
		Explicitwaitvisibility(s.Searchbtn);
		clickjavascript(s.Searchbtn);*/
	}
	@Then("User need to navigate draft tab and click submit for approval-Delivery order page")
	public void user_need_to_navigate_draft_tab_and_click_submit_for_approval_delivery_order_page() {
		s=new Sales_DeliveryOrder_POJO();

		Explicitwaitvisibility(s.Drafttab);
		clickjavascript(s.Drafttab);
		Selectcheckbox(s.Drafttabchkbox);
		Explicitwaitvisibility(s.submitforapprovalbtn);
		clickjavascript(s.submitforapprovalbtn);
		Explicitwaitvisibility(s.okbtndraft);
		clickjavascript(s.okbtndraft);
	}
	@Then("User need to navigate awaiting approval tab and approve the delivery order")
	public void user_need_to_navigate_awaiting_approval_tab_and_approve_the_delivery_order() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);

		Explicitwaitvisibility(s.awaitingapprovaltab);
		clickjavascript(s.awaitingapprovaltab);
		Selectcheckbox(s.awaitingapprovaltabchkbox);
		Explicitwaitvisibility(s.awaitingapprovaltabapprovebtn);
		clickjavascript(s.awaitingapprovaltabapprovebtn);
		Explicitwaitvisibility(s.okbtndraft);
		clickjavascript(s.okbtndraft);

	
	}

	@Then("User need to copy as quote-In Delivery order scenario-II")
	public void user_need_to_copy_as_quote_in_delivery_order_scenario_ii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);


		Explicitwaitvisibility(s.Approvedtab);
		clickjavascript(s.Approvedtab);
		Selectcheckbox(s.Approvedtabchkboxall);
		Explicitwaitvisibility(s.copytobtnapprovedtab);
		clickjavascript(s.copytobtnapprovedtab);
		Explicitwaitvisibility(s.quoteradiobtnapprovedtab);
		clickjavascript(s.quoteradiobtnapprovedtab);
		Explicitwaitvisibility(s.quotechkboxrdbtnapprovedtab);
		Selectcheckbox(s.quotechkboxrdbtnapprovedtab);
		Explicitwaitvisibility(s.createdraftbtnapprovedtab);
		clickjavascript(s.createdraftbtnapprovedtab);

	}
	
	@Then("User need to mark as packed scenario-II")
	public void user_need_to_mark_as_packed_scenario_ii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);

		Selectcheckbox(s.Approvedtabchkboxall);
		Explicitwaitvisibility(s.Markaspackedbtnapprovedtab);
		clickjavascript(s.Markaspackedbtnapprovedtab);
		Explicitwaitvisibility(s.OkbtnMarkaspackedbtnapprovedtab);
		clickjavascript(s.OkbtnMarkaspackedbtnapprovedtab);
	}
	@Then("User need to mark as delivered scenario-II")
	public void user_need_to_mark_as_delivered_scenario_ii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);
		Explicitwaitvisibility(s.packedtab);
		clickjavascript(s.packedtab);
		Selectcheckbox(s.packedchkboxall);
		Explicitwaitvisibility(s.Markasdeliveredbtn);
		clickjavascript(s.Markasdeliveredbtn);
		Explicitwaitvisibility(s.okbtnMarkasdelivered);
		clickjavascript(s.okbtnMarkasdelivered);
	}
	@Then("User need to mark as Invoiced scenario-II")
	public void user_need_to_mark_as_invoiced_scenario_ii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);
		Explicitwaitvisibility(s.Deliveredtab);
		clickjavascript(s.Deliveredtab);
		Selectcheckbox(s.Deliveredchkboxall);
		Explicitwaitvisibility(s.Markasinvoicedbtn);
		clickjavascript(s.Markasinvoicedbtn);
		Explicitwaitvisibility(s.OkbtnMarkasinvoiced);
		clickjavascript(s.OkbtnMarkasinvoiced);
	}
	@Then("User need to void the delivery order scenario-II")
	public void user_need_to_void_the_delivery_order_scenario_ii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);
		Explicitwaitvisibility(s.invoicedtab);
		clickjavascript(s.invoicedtab);
		Selectcheckbox(s.Invoicedchkboxall);
		Explicitwaitvisibility(s.voidbtn);
		clickjavascript(s.voidbtn);
		Explicitwaitvisibility(s.Yesvoiditbtn);
		clickjavascript(s.Yesvoiditbtn);
		
	}





	@Given("User need to navigate to Multiple Delivery order scenario")
	public void user_need_to_navigate_to_multiple_delivery_order_scenario() throws InterruptedException, AWTException {
		s=new Sales_DeliveryOrder_POJO();
		Explicitwaitvisibility(s.Salesslide);
		clickjavascript(s.Salesslide);
		Explicitwaitvisibility(s.Deliveryorderslide);
		clickjavascript(s.Deliveryorderslide);
		Explicitwaitvisibility(s.DeliveryOrderbtn);
		clickjavascript(s.DeliveryOrderbtn);
	

	}

	@Then("User need to Approve a Multiple Delivery order")
	public void user_need_to_approve_a_multiple_delivery_order() throws InterruptedException, AWTException {
		s=new Sales_DeliveryOrder_POJO();
		Explicitwaitvisibility(s.ChooseContactDD);
		tofill(s.ChooseContactDD, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);

		Explicitwaitvisibility(s.Date);
		tofill(s.Date, "17/11/2022");
		Thread.sleep(2000);
		Explicitwaitvisibility(s.ReferenceName);
		tofill(s.ReferenceName, "Sales");
		Thread.sleep(1000);
		Toclear(s.CurrencyDD);
		Explicitwaitvisibility(s.CurrencyDD);
		tofill(s.CurrencyDD, "Letter Head Template");
		toenter();
		Thread.sleep(3000);
		Explicitwaitvisibility(s.items1table);
		clickjavascript(s.items1table);
		Thread.sleep(1000);
		Explicitwaitvisibility(s.items1tabletxt);
		tofill(s.items1tabletxt, "Testitem1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.SaveBtn);
		Explicitwaitvisibility(s.SaveBtn);
		toClick(s.SaveBtn);
		Thread.sleep(5000);
		toenter();
		Thread.sleep(5000);
		
		Explicitwaitvisibility(s.DeliveryOrderbtn);
		clickjavascript(s.DeliveryOrderbtn);
		Explicitwaitvisibility(s.ChooseContactDD);
		tofill(s.ChooseContactDD, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);

		Explicitwaitvisibility(s.Date);
		tofill(s.Date, "17/11/2022");
		Thread.sleep(2000);
		Explicitwaitvisibility(s.ReferenceName);
		tofill(s.ReferenceName, "Sales");
		Thread.sleep(1000);
		Toclear(s.CurrencyDD);
		Explicitwaitvisibility(s.CurrencyDD);
		tofill(s.CurrencyDD, "Letter Head Template");
		toenter();
		Thread.sleep(3000);
		Explicitwaitvisibility(s.items1table);
		clickjavascript(s.items1table);
		Thread.sleep(1000);
		Explicitwaitvisibility(s.items1tabletxt);
		tofill(s.items1tabletxt, "Testitem1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.SaveBtn);
		Explicitwaitvisibility(s.SaveBtn);
		toClick(s.SaveBtn);
		Thread.sleep(5000);
		toenter();
		Thread.sleep(5000);

	}
	
	@Then("User need to navigate draft tab and click submit for approval-Delivery order page scenario-II")
	public void user_need_to_navigate_draft_tab_and_click_submit_for_approval_delivery_order_page_scenario_ii() {
		s=new Sales_DeliveryOrder_POJO();
		Explicitwaitvisibility(s.Drafttab);
		clickjavascript(s.Drafttab);
		Selectcheckbox(s.Drafttabchkbox);
		Explicitwaitvisibility(s.submitforapprovalbtn);
		clickjavascript(s.submitforapprovalbtn);
		Explicitwaitvisibility(s.okbtndraft);
		clickjavascript(s.okbtndraft);
	
	}

	@Then("User need to navigate awaiting approval tab and approve the delivery order scenario-II")
	public void user_need_to_navigate_awaiting_approval_tab_and_approve_the_delivery_order_scenario_ii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);

		Explicitwaitvisibility(s.awaitingapprovaltab);
		clickjavascript(s.awaitingapprovaltab);
		Selectcheckbox(s.awaitingapprovaltabchkbox);
		Explicitwaitvisibility(s.awaitingapprovaltabapprovebtn);
		clickjavascript(s.awaitingapprovaltabapprovebtn);
		Explicitwaitvisibility(s.okbtndraft);
		clickjavascript(s.okbtndraft);
	}
	@Then("User need to verify print button")
	public void user_need_to_verify_print_button() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();

		Thread.sleep(2000);


		Explicitwaitvisibility(s.Approvedtab);
		clickjavascript(s.Approvedtab);
		Selectcheckbox(s.Approvedtabchkboxall);

		Explicitwaitvisibility(s.printbtnapprovedtab);
		clickjavascript(s.printbtnapprovedtab);
		highLightElement(s.verifyprintdeliveryorder);
		softAssert.assertEquals(s.verifyprintdeliveryorder, s.verifyprintdeliveryorder);
		softAssert.assertAll();
		Explicitwaitvisibility(s.closeprint);
		clickjavascript(s.closeprint);
	}
	@Then("User need to copy as quote-In Delivery order scenario-III")
	public void user_need_to_copy_as_quote_in_delivery_order_scenario_iii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(3000);

		Selectcheckbox(s.Approvedtabchkboxall);
		Explicitwaitvisibility(s.copytobtnapprovedtab);
		clickjavascript(s.copytobtnapprovedtab);
		Explicitwaitvisibility(s.quoteradiobtnapprovedtab);
		clickjavascript(s.quoteradiobtnapprovedtab);
		Explicitwaitvisibility(s.quotechkboxrdbtnapprovedtab);
		Selectcheckbox(s.quotechkboxrdbtnapprovedtab);
		Explicitwaitvisibility(s.createdraftbtnapprovedtab);
		clickjavascript(s.createdraftbtnapprovedtab);
	
	}
	@Then("User need to copy as Invoice-In Delivery order scenario-III")
	public void user_need_to_copy_as_invoice_in_delivery_order_scenario_iii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);

		Selectcheckbox(s.Approvedtabchkboxall);
		Explicitwaitvisibility(s.copytobtnapprovedtab);
		clickjavascript(s.copytobtnapprovedtab);
		Explicitwaitvisibility(s.copytoinvoiceradiobtn);
		clickjavascript(s.copytoinvoiceradiobtn);
		Explicitwaitvisibility(s.copytoinvoicechkbox);
		Selectcheckbox(s.copytoinvoicechkbox);
		Explicitwaitvisibility(s.createdraftbtnapprovedtab);
		clickjavascript(s.createdraftbtnapprovedtab);
	}

	@Then("User need to copy as Deliveryorder-In Delivery order scenario-III")
	public void user_need_to_copy_as_deliveryorder_in_delivery_order_scenario_iii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();

		Thread.sleep(2000);


		Selectcheckbox(s.Approvedtabchkboxall);
		Explicitwaitvisibility(s.copytobtnapprovedtab);
		clickjavascript(s.copytobtnapprovedtab);
		Explicitwaitvisibility(s.copytodeliveryorderradiobtn);
		clickjavascript(s.copytodeliveryorderradiobtn);
		Explicitwaitvisibility(s.copytodeliveryorderchkbox);
		Selectcheckbox(s.copytodeliveryorderchkbox);
		Explicitwaitvisibility(s.createdraftbtnapprovedtab);
		clickjavascript(s.createdraftbtnapprovedtab);
		
	}

	@Then("User need to mark as packed scenario-III")
	public void user_need_to_mark_as_packed_scenario_iii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();

		Thread.sleep(2000);

		Selectcheckbox(s.Approvedtabchkboxall);
		Explicitwaitvisibility(s.Markaspackedbtnapprovedtab);
		clickjavascript(s.Markaspackedbtnapprovedtab);
		Explicitwaitvisibility(s.OkbtnMarkaspackedbtnapprovedtab);
		clickjavascript(s.OkbtnMarkaspackedbtnapprovedtab);

	}
	@Then("User need to mark as delivered scenario-III")
	public void user_need_to_mark_as_delivered_scenario_iii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);
		Explicitwaitvisibility(s.packedtab);
		clickjavascript(s.packedtab);
		Selectcheckbox(s.packedchkboxall);
		Explicitwaitvisibility(s.Markasdeliveredbtn);
		clickjavascript(s.Markasdeliveredbtn);
		Explicitwaitvisibility(s.okbtnMarkasdelivered);
		clickjavascript(s.okbtnMarkasdelivered);
	}
	@Then("User need to mark as Invoiced scenario-III")
	public void user_need_to_mark_as_invoiced_scenario_iii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);
		Explicitwaitvisibility(s.Deliveredtab);
		clickjavascript(s.Deliveredtab);
		Selectcheckbox(s.Deliveredchkboxall);
		Explicitwaitvisibility(s.Markasinvoicedbtn);
		clickjavascript(s.Markasinvoicedbtn);
		Explicitwaitvisibility(s.OkbtnMarkasinvoiced);
		clickjavascript(s.OkbtnMarkasinvoiced);
	}
	@Then("User need to void the delivery order scenario-III")
	public void user_need_to_void_the_delivery_order_scenario_iii() throws InterruptedException {
		s=new Sales_DeliveryOrder_POJO();
		Thread.sleep(2000);
		Explicitwaitvisibility(s.invoicedtab);
		clickjavascript(s.invoicedtab);
		Selectcheckbox(s.Invoicedchkboxall);
		Explicitwaitvisibility(s.voidbtn);
		clickjavascript(s.voidbtn);
		Explicitwaitvisibility(s.Yesvoiditbtn);
		clickjavascript(s.Yesvoiditbtn);
	}



	
	
	
	
	@And("User need to Save a Multiple Delivery order")
	public void user_need_to_save_a_multiple_delivery_order() throws InterruptedException, AWTException {
		s=new Sales_DeliveryOrder_POJO();
		//scenario-1
		Explicitwaitvisibility(s.Salesslide);
		clickjavascript(s.Salesslide);
		Explicitwaitvisibility(s.Deliveryorderslide);
		clickjavascript(s.Deliveryorderslide);
		Explicitwaitvisibility(s.DeliveryOrderbtn);
		clickjavascript(s.DeliveryOrderbtn);
		Explicitwaitvisibility(s.ChooseContactDD);
		tofill(s.ChooseContactDD, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);

		Explicitwaitvisibility(s.Date);
		tofill(s.Date, "17/11/2022");
		Thread.sleep(2000);
		Explicitwaitvisibility(s.ReferenceName);
		tofill(s.ReferenceName, "Sales");
		Thread.sleep(1000);
		Toclear(s.CurrencyDD);
		Explicitwaitvisibility(s.CurrencyDD);
		tofill(s.CurrencyDD, "Letter Head Template");
		toenter();
		Thread.sleep(3000);
		Explicitwaitvisibility(s.items1table);
		clickjavascript(s.items1table);
		Thread.sleep(1000);
		Explicitwaitvisibility(s.items1tabletxt);
		tofill(s.items1tabletxt, "Testitem1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.SaveBtn);
		Explicitwaitvisibility(s.SaveBtn);
		toClick(s.SaveBtn);
		Thread.sleep(5000);
		toenter();
		Thread.sleep(5000);
	//scenario-2
		s=new Sales_DeliveryOrder_POJO();
		Explicitwaitvisibility(s.DeliveryOrderbtn);
		clickjavascript(s.DeliveryOrderbtn);
		Explicitwaitvisibility(s.ChooseContactDD);
		tofill(s.ChooseContactDD, "Automation");
		Explicitwaitvisibility(s.Option1select);
		clickjavascript(s.Option1select);
		Thread.sleep(1000);

		Explicitwaitvisibility(s.Date);
		tofill(s.Date, "17/11/2022");
		Thread.sleep(2000);
		Explicitwaitvisibility(s.ReferenceName);
		tofill(s.ReferenceName, "Sales");
		Thread.sleep(1000);
		Toclear(s.CurrencyDD);
		Explicitwaitvisibility(s.CurrencyDD);
		tofill(s.CurrencyDD, "Letter Head Template");
		toenter();
		Thread.sleep(3000);
		Explicitwaitvisibility(s.items1table);
		clickjavascript(s.items1table);
		Thread.sleep(1000);
		Explicitwaitvisibility(s.items1tabletxt);
		tofill(s.items1tabletxt, "Testitem1");
		toenter();
		Thread.sleep(3000);
		ScrolldownElement(s.SaveBtn);
		Explicitwaitvisibility(s.SaveBtn);
		toClick(s.SaveBtn);
		Thread.sleep(5000);
		toenter();
		Thread.sleep(5000);

	}

	@Then("User need to delete Multiple Delivery order")
	public void user_need_to_delete_multiple_delivery_order() throws InterruptedException, AWTException {
	

		s=new Sales_DeliveryOrder_POJO();
		Explicitwaitvisibility(s.Drafttab);
		clickjavascript(s.Drafttab);
		Selectcheckbox(s.Drafttabchkbox);
		Explicitwaitvisibility(s.Deletebtndraftd);
		clickjavascript(s.Deletebtndraftd);
		Explicitwaitvisibility(s.yesdeleteitdraft);
		clickjavascript(s.yesdeleteitdraft);
		
		//driver.quit();
		
	}
















}
