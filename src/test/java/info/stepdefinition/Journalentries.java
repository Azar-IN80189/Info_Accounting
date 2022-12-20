package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Account_Login_POJO;
import info.pojo.Journalentriespojo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Journalentries extends Reusableclass {

	public static Journalentriespojo j;
	public static Account_Login_POJO a;

	@Given("User needs to Create new journal entry")
	public void user_needs_to_create_new_journal_entry() throws InterruptedException, AWTException {

		j = new Journalentriespojo();
		ScrolldownElement(j.Accounting);
		Explicitwaitvisibility(j.Accounting);
		tomovethecursor(j.Accounting);
		Thread.sleep(1000);
		toClick(j.Accounting);
		Thread.sleep(1000);
		tomovethecursor(j.journalentries);
		toClick(j.journalentries);
		Thread.sleep(1000);

		Explicitwaitvisibility(j.newjournals);
		tomovethecursor(j.newjournals);
		Thread.sleep(1000);
		clickjavascript(j.newjournals);
		Thread.sleep(1000);

		tomovethecursor(j.contact);
		Thread.sleep(1000);
		tofill(j.contact, "Logit");
		Thread.sleep(2000);
		toenter();

		Thread.sleep(2000);
		tomovethecursor(j.Date);
		tofill(j.Date, "15/12/2022");
		Thread.sleep(1000);

		tomovethecursor(j.journalno);
		Thread.sleep(1000);
		tofill(j.journalno, "6578657867");
		Thread.sleep(1000);

		tomovethecursor(j.Narration);
		Thread.sleep(1000);
		tofill(j.Narration, "This is to test Narration");
		Thread.sleep(1000);

		tomovethecursor(j.tax);
		Thread.sleep(1000);
		tofill(j.tax, "Tax Exclusive");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(j.Description_Outer);
		clickjavascript(j.Description_Outer);
		clickjavascript(j.Description_inner);
		tofill(j.Description_inner, "Test Description 1");
		toenter();

		Explicitwaitvisibility(j.Description_Outer_Row2);
		clickjavascript(j.Description_Outer_Row2);
		clickjavascript(j.Description_inner);
		tofill(j.Description_inner, "Test Description 2");
		toenter();

		Explicitwaitvisibility(j.accountgrid_Out);
		clickjavascript(j.accountgrid_Out);
		clickjavascript(j.accountarea);
		Thread.sleep(1000);
		tofill(j.accountarea, "200 - Sales");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(j.debitgrid);
		mouseclick(j.debitgrid);
		Thread.sleep(1000);
		clickjavascript(j.debitarea);
		Thread.sleep(1000);
		tofill(j.debitarea, "435");
		totabkey();

		Thread.sleep(2000);
		Explicitwaitvisibility(j.accountgridtwo);
		mouseclick(j.accountgridtwo);
		Thread.sleep(2000);
		clickjavascript(j.accountarea);
		tofill(j.accountarea, "200 - Sales");
		Thread.sleep(2000);
		toenter();

		/*
		 * Explicitwaitvisibility(j.creditgrid); mouseclick(j.creditgrid);
		 * Thread.sleep(1000); clickjavascript(j.creditarea); Thread.sleep(1000);
		 * tofill(j.creditarea, "345"); totabkey();
		 */

	}

	@When("User needs to Save the new journalentry")
	public void user_needs_to_save_the_new_journalentry() throws InterruptedException {

		j = new Journalentriespojo();

		ScrolldownElement(j.saveasdraft);
		tomovethecursor(j.saveasdraft);
		toClick(j.saveasdraft);

		Explicitwaitvisibility(j.Okbtn_JE);
		clickjavascript(j.Okbtn_JE);

	}

	@When("User needs to verify journalentry is in draft")
	public void user_needs_to_verify_journalentry_is_in_draft() throws InterruptedException {


		j = new Journalentriespojo();

		Scrollupjavascript();

		Explicitwaitvisibility(j.draft);
		mouseclick(j.draft);
		Thread.sleep(2000);
		System.out.println("Journal Entry is presented in Draft");
		mouseclick(j.narrationlink);
		Thread.sleep(2000);

	}

	@When("User needs to move journal entries to post from draft")
	public void user_needs_to_move_journal_entries_to_post_from_draft() throws InterruptedException {

		j = new Journalentriespojo();

		Thread.sleep(2000);
		Scrolldownjavascript();
		Thread.sleep(2000);
		tomovethecursor(j.post);
		toClick(j.post);

		Explicitwaitvisibility(j.Okbtn_JE);
		toClick(j.Okbtn_JE);

	}

	@Given("User needs to verify journal entry is posted or not")
	public void user_needs_to_verify_journal_entry_is_posted_or_not() throws InterruptedException {

		j = new Journalentriespojo();

		Thread.sleep(1000);

		mouseclick(j.posted);
		Thread.sleep(2000);
		mouseclick(j.narrationlink);
		Thread.sleep(1000);
		System.out.println("Journal entry is posted");

	}

	@Given("User needs to edit the posted journal entries")
	public void user_needs_to_edit_the_posted_journal_entries() throws InterruptedException, AWTException {

		j = new Journalentriespojo();

		mouseclick(j.options);
		Thread.sleep(1000);
		tomovethecursor(j.Edit);
		Thread.sleep(1000);
		toClick(j.Edit);
	}

	@Given("User needs to check Tax Inclusive")
	public void user_needs_to_check_tax_inclusive() throws InterruptedException, AWTException {

		j = new Journalentriespojo();

		tomovethecursor(j.tax);
		tofill(j.tax, "Tax Inclusive");
		Thread.sleep(1000);
		toenter();
		Thread.sleep(2000);
		toClick(j.post);
		Thread.sleep(2000);

		Explicitwaitvisibility(j.Okbtn_JE);
		toClick(j.Okbtn_JE);

	}

	@Then("User needs to copy the journal entry")
	public void user_needs_to_copy_the_journal_entry() throws InterruptedException, AWTException {

		j = new Journalentriespojo();

		Thread.sleep(2000);
		tomovethecursor(j.narrationlink);
		toClick(j.narrationlink);
		Thread.sleep(1000);

		mouseclick(j.options);
		Thread.sleep(1000);
		tomovethecursor(j.copy);
		toClick(j.copy);
		Thread.sleep(2000);

		tomovethecursor(j.contact);
		Thread.sleep(1000);
		tofill(j.contact, "Logit");
		Thread.sleep(2000);
		toenter();

		Thread.sleep(2000);
		tomovethecursor(j.Date);
		tofill(j.Date, "15/12/2022");
		Thread.sleep(1000);

		tomovethecursor(j.journalno);
		Thread.sleep(1000);
		tofill(j.journalno, "02046760501");
		Thread.sleep(1000);

	}

	@Then("User needs to check No Tax")
	public void user_needs_to_check_no_tax() throws InterruptedException, AWTException {

		j = new Journalentriespojo();

		tomovethecursor(j.tax);
		Thread.sleep(1000);
		tofill(j.tax, "No Tax");
		Thread.sleep(2000);
		toenter();

		ScrolldownElement(j.post);
		Thread.sleep(1000);
		toClick(j.post);

		Explicitwaitvisibility(j.Okbtn_JE);
		toClick(j.Okbtn_JE);

	}

}
