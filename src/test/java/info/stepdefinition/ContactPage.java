package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Contacts_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ContactPage extends Reusableclass {
	public static Contacts_POJO ct;
	@Given("User need to navigate to add an contact for customer in contact page")
	public void user_need_to_navigate_to_add_an_contact_for_customer_in_contact_page() throws InterruptedException, AWTException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.ContactMenu);
		clickjavascript(ct.ContactMenu);
		Thread.sleep(2000);
		Explicitwaitvisibility(ct.AddCustomersupplierbtn);
		clickjavascript(ct.AddCustomersupplierbtn);

	}

	@Then("Enter details like ContactName,CompanyName,AccountNumber..Etc in Contact details section")
	public void enter_details_like_contact_name_company_name_account_number_etc_in_contact_details_section() {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.contactName);
		Toclear(ct.contactName);
		tofill(ct.contactName, "autocustomer11");

		Explicitwaitvisibility(ct.companyName);
		Toclear(ct.companyName);
		tofill(ct.companyName, "testcompany");

		Explicitwaitvisibility(ct.accountNumber);
		Toclear(ct.accountNumber);
		tofill(ct.accountNumber, "453454354243");


		Explicitwaitvisibility(ct.firstName);
		Toclear(ct.firstName);
		tofill(ct.firstName, "automation");

		Explicitwaitvisibility(ct.lastName);
		Toclear(ct.lastName);
		tofill(ct.lastName, "testing");

		Explicitwaitvisibility(ct.email);
		Toclear(ct.email);
		tofill(ct.email, "emailcontact@mailinator.com");

		Explicitwaitvisibility(ct.phoneNo);
		Toclear(ct.phoneNo);
		tofill(ct.phoneNo, "67564367");

		Explicitwaitvisibility(ct.Countrycode);
		Toclear(ct.Countrycode);
		tofill(ct.Countrycode, "+91");

		Explicitwaitvisibility(ct.Areacode);
		Toclear(ct.Areacode);
		tofill(ct.Areacode, "44");

		Explicitwaitvisibility(ct.Phonenumber);
		Toclear(ct.Phonenumber);
		tofill(ct.Phonenumber, "89999554561");

		Explicitwaitvisibility(ct.mobileCountryCode);
		Toclear(ct.mobileCountryCode);
		tofill(ct.mobileCountryCode, "+91");

		Explicitwaitvisibility(ct.mobileAreaCode);
		Toclear(ct.mobileAreaCode);
		tofill(ct.mobileAreaCode, "44");

		Explicitwaitvisibility(ct.mobilenumber);
		Toclear(ct.mobilenumber);
		tofill(ct.mobilenumber, "7878373888");

		Explicitwaitvisibility(ct.directDialCountryCode);
		Toclear(ct.directDialCountryCode);
		tofill(ct.directDialCountryCode, "044");

		Explicitwaitvisibility(ct.directDialAreaCode);
		Toclear(ct.directDialAreaCode);
		tofill(ct.directDialAreaCode, "044");

		Explicitwaitvisibility(ct.directDial);
		Toclear(ct.directDial);
		tofill(ct.directDial, "54345434");

		Explicitwaitvisibility(ct.faxCountryCode);
		Toclear(ct.faxCountryCode);
		tofill(ct.faxCountryCode, "044");

		Explicitwaitvisibility(ct.faxAreaCode);
		Toclear(ct.faxAreaCode);
		tofill(ct.faxAreaCode, "044");

		Explicitwaitvisibility(ct.fax);
		Toclear(ct.fax);
		tofill(ct.fax, "54345434");

		Explicitwaitvisibility(ct.skypetxt);
		Toclear(ct.skypetxt);
		tofill(ct.skypetxt, "skypetest");

		Explicitwaitvisibility(ct.websitetxt);
		Toclear(ct.websitetxt);
		tofill(ct.websitetxt, "infoaccounting.com");

		Explicitwaitvisibility(ct.Contactgroup);
		Toclear(ct.Contactgroup);
		tofill(ct.Contactgroup, "Customer");

		Explicitwaitvisibility(ct.Customerselect);
		clickjavascript(ct.Customerselect);

		Explicitwaitvisibility(ct.Nextbtn);
		clickjavascript(ct.Nextbtn);
	}
	@Then("Navigate to Address tab and enter details like Attention,PostalAddress,City..Etc")
	public void navigate_to_address_tab_and_enter_details_like_attention_postal_address_city_etc() throws InterruptedException, AWTException {
		ct = new Contacts_POJO();

		Scrollupjavascript();

		Explicitwaitvisibility(ct.AddressDetailstab);
		clickjavascript(ct.AddressDetailstab);


		Explicitwaitvisibility(ct.postalAddrAttention);
		tofill(ct.postalAddrAttention, "Test Attention");

		Explicitwaitvisibility(ct.postalAddress);
		tofill(ct.postalAddress, "No.52B, Test Address");

		Explicitwaitvisibility(ct.postalCity);
		tofill(ct.postalCity, "Chennai");

		Explicitwaitvisibility(ct.postalState);
		tofill(ct.postalState, "Chennai");

		Explicitwaitvisibility(ct.postalZipCode);
		tofill(ct.postalZipCode, "602024");

		Explicitwaitvisibility(ct.countrydd);
		clickjavascript(ct.countrydd);
		tofill(ct.countrydd, "India");
		Thread.sleep(2000);
		toenter();


		Scrollupjavascript();

		Selectcheckbox(ct.Sameaspostaladdresschkbox);

		ScrolldownElement(ct.SavebtnAddressDetails);

		Explicitwaitvisibility(ct.Nextbtn2);
		clickjavascript(ct.Nextbtn2);

	}
	@And("Navigate to Financial tab and enter details like Sales Setting,Sales Account..Etc")
	public void navigate_to_financial_tab_and_enter_details_like_sales_setting_sales_account_etc() throws InterruptedException, AWTException {
		ct = new Contacts_POJO();

		Explicitwaitvisibility(ct.SalesSettingDD);
		clickjavascript(ct.SalesSettingDD);
		tofill(ct.SalesSettingDD, "Tax Exclusive");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.RegNumbertxt);
		clickjavascript(ct.RegNumbertxt);
		tofill(ct.RegNumbertxt, "80562");

		Explicitwaitvisibility(ct.SalesAccountDD);
		clickjavascript(ct.SalesAccountDD);
		tofill(ct.SalesAccountDD, "200 - Sales");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.PurchaseSettingDD);
		clickjavascript(ct.PurchaseSettingDD);
		tofill(ct.PurchaseSettingDD, "Tax Exclusive");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.PurchaseAccountDD);
		clickjavascript(ct.PurchaseAccountDD);
		tofill(ct.PurchaseAccountDD, "400 - Advertising");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.peppoID);
		clickjavascript(ct.peppoID);
		tofill(ct.peppoID, "80563");

		Explicitwaitvisibility(ct.crdLimitAmounttxt);
		clickjavascript(ct.crdLimitAmounttxt);
		tofill(ct.crdLimitAmounttxt, "80500000000678");

		Selectcheckbox(ct.CardLimitChkbox);

		Explicitwaitvisibility(ct.SalesDiscount);
		clickjavascript(ct.SalesDiscount);
		tofill(ct.SalesDiscount, "10");

		Explicitwaitvisibility(ct.BillDueDateNum);
		clickjavascript(ct.BillDueDateNum);
		tofill(ct.BillDueDateNum, "100");

		Explicitwaitvisibility(ct.BillDueDateDD);
		clickjavascript(ct.BillDueDateDD);
		tofill(ct.BillDueDateDD, "day(s) after the bill date");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.invoiceDueDateDaysNum);
		clickjavascript(ct.invoiceDueDateDaysNum);
		tofill(ct.invoiceDueDateDaysNum, "100");

		Explicitwaitvisibility(ct.invoiceDueDateDaysDD);
		clickjavascript(ct.invoiceDueDateDaysDD);
		tofill(ct.invoiceDueDateDaysDD, "day(s) after the invoice date");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.InvoiceTheme);
		clickjavascript(ct.InvoiceTheme);
		tofill(ct.InvoiceTheme, "Standard Template");
		Thread.sleep(2000);
		toenter();




		Explicitwaitvisibility(ct.TaxIDtxt);
		clickjavascript(ct.TaxIDtxt);
		tofill(ct.TaxIDtxt, "TAX1111");
		Thread.sleep(2000);

		Explicitwaitvisibility(ct.DefaultSalestaxDD);
		clickjavascript(ct.DefaultSalestaxDD);
		tofill(ct.DefaultSalestaxDD, "ZR: Zero-Rated Supplies (0%)");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.DefaultpurchasetaxDD);
		clickjavascript(ct.DefaultpurchasetaxDD);
		tofill(ct.DefaultpurchasetaxDD, "BL: Disallowed Expenses (7%)");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.CurrencyDD);
		clickjavascript(ct.CurrencyDD);
		tofill(ct.CurrencyDD, "SGD - Singapore Dollar");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.PurchaseThemeDD);
		clickjavascript(ct.PurchaseThemeDD);
		tofill(ct.PurchaseThemeDD, "Standard Template");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.PaymentModeDD);
		clickjavascript(ct.PaymentModeDD);
		tofill(ct.PaymentModeDD, "Cash");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.Termsandconditionbox);
		clickjavascript(ct.Termsandconditionbox);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.AddNewTermsCondition);
		clickjavascript(ct.AddNewTermsCondition);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.TitleEnter);
		clickjavascript(ct.TitleEnter);
		tofill(ct.TitleEnter, "Test title");
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.EnterDescriptionTerms);
		clickjavascript(ct.EnterDescriptionTerms);
		tofill(ct.EnterDescriptionTerms, "Test description");
		clickjavascript(ct.SavebtnTerms);

	}

	@Given("User need to navigate customer tab")
	public void user_need_to_navigate_customer_tab() throws InterruptedException, AWTException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.ContactMenu);
		clickjavascript(ct.ContactMenu);
		Thread.sleep(2000);
	
		
	}

	@And("Search for the specific record and select the  customer contact")
	public void search_for_the_specific_record_and_select_the_customer_contact() throws InterruptedException, AWTException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.SearchboxContacts);
		clickjavascript(ct.SearchboxContacts);
		tofill(ct.SearchboxContacts, "autotesting");
		Thread.sleep(1000);
		toenter();	
	}

	@Given("User need to navigate selected  customer contact and click archieve and restore the archieved contact")
	public void user_need_to_navigate_selected_customer_contact_and_click_archieve_and_restore_the_archieved_contact() throws InterruptedException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.MoreOptionscontact);
		clickjavascript(ct.MoreOptionscontact);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.Archiveselect);
		clickjavascript(ct.Archiveselect);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.OkArchive);
		clickjavascript(ct.OkArchive);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.MoreOptionscontact);
		clickjavascript(ct.MoreOptionscontact);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.Restoreselect);
		clickjavascript(ct.Restoreselect);
		
	}


	@Given("User need to Delete the selected customer contact")
	public void user_need_to_delete_the_selected_customer_contact() throws InterruptedException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.MoreOptionscontact);
		clickjavascript(ct.MoreOptionscontact);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.Deleteselect);
		clickjavascript(ct.Deleteselect);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.OkDelete);
		clickjavascript(ct.OkDelete);
	}



	@Given("User need to navigate to add an contact for supplier in contact page")
	public void user_need_to_navigate_to_add_an_contact_for_supplier_in_contact_page() throws InterruptedException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.ContactMenu);
		clickjavascript(ct.ContactMenu);
		Thread.sleep(2000);
		Explicitwaitvisibility(ct.AddCustomersupplierbtn);
		clickjavascript(ct.AddCustomersupplierbtn);

	
	}

	@Then("Enter details like ContactName,CompanyName,AccountNumber..Etc in Contact details section for supplier")
	public void enter_details_like_contact_name_company_name_account_number_etc_in_contact_details_section_for_supplier() {
		ct = new Contacts_POJO();
		
		Explicitwaitvisibility(ct.contactName);
		Toclear(ct.contactName);
		tofill(ct.contactName, "autosupplier22");

		Explicitwaitvisibility(ct.companyName);
		Toclear(ct.companyName);
		tofill(ct.companyName, "testcompany");

		Explicitwaitvisibility(ct.accountNumber);
		Toclear(ct.accountNumber);
		tofill(ct.accountNumber, "453454354243");


		Explicitwaitvisibility(ct.firstName);
		Toclear(ct.firstName);
		tofill(ct.firstName, "automation");

		Explicitwaitvisibility(ct.lastName);
		Toclear(ct.lastName);
		tofill(ct.lastName, "testing");

		Explicitwaitvisibility(ct.email);
		Toclear(ct.email);
		tofill(ct.email, "emailcontact@mailinator.com");

		Explicitwaitvisibility(ct.phoneNo);
		Toclear(ct.phoneNo);
		tofill(ct.phoneNo, "67564367");

		Explicitwaitvisibility(ct.Countrycode);
		Toclear(ct.Countrycode);
		tofill(ct.Countrycode, "+91");

		Explicitwaitvisibility(ct.Areacode);
		Toclear(ct.Areacode);
		tofill(ct.Areacode, "44");

		Explicitwaitvisibility(ct.Phonenumber);
		Toclear(ct.Phonenumber);
		tofill(ct.Phonenumber, "89999554561");

		Explicitwaitvisibility(ct.mobileCountryCode);
		Toclear(ct.mobileCountryCode);
		tofill(ct.mobileCountryCode, "+91");

		Explicitwaitvisibility(ct.mobileAreaCode);
		Toclear(ct.mobileAreaCode);
		tofill(ct.mobileAreaCode, "44");

		Explicitwaitvisibility(ct.mobilenumber);
		Toclear(ct.mobilenumber);
		tofill(ct.mobilenumber, "7878373888");

		Explicitwaitvisibility(ct.directDialCountryCode);
		Toclear(ct.directDialCountryCode);
		tofill(ct.directDialCountryCode, "044");

		Explicitwaitvisibility(ct.directDialAreaCode);
		Toclear(ct.directDialAreaCode);
		tofill(ct.directDialAreaCode, "044");

		Explicitwaitvisibility(ct.directDial);
		Toclear(ct.directDial);
		tofill(ct.directDial, "54345434");

		Explicitwaitvisibility(ct.faxCountryCode);
		Toclear(ct.faxCountryCode);
		tofill(ct.faxCountryCode, "044");

		Explicitwaitvisibility(ct.faxAreaCode);
		Toclear(ct.faxAreaCode);
		tofill(ct.faxAreaCode, "044");

		Explicitwaitvisibility(ct.fax);
		Toclear(ct.fax);
		tofill(ct.fax, "54345434");

		Explicitwaitvisibility(ct.skypetxt);
		Toclear(ct.skypetxt);
		tofill(ct.skypetxt, "skypetest");

		Explicitwaitvisibility(ct.websitetxt);
		Toclear(ct.websitetxt);
		tofill(ct.websitetxt, "infoaccounting.com");

		Explicitwaitvisibility(ct.Contactgroup);
		Toclear(ct.Contactgroup);
		tofill(ct.Contactgroup, "Supplier");

		Explicitwaitvisibility(ct.Supplierselect);
		clickjavascript(ct.Supplierselect);

		Explicitwaitvisibility(ct.Nextbtn);
		clickjavascript(ct.Nextbtn);
	}


	@And("Navigate to Address tab and enter details like Attention,PostalAddress,City..Etc for supplier")
	public void navigate_to_address_tab_and_enter_details_like_attention_postal_address_city_etc_for_supplier() throws InterruptedException, AWTException {
		ct = new Contacts_POJO();

		Scrollupjavascript();

		Explicitwaitvisibility(ct.AddressDetailstab);
		clickjavascript(ct.AddressDetailstab);


		Explicitwaitvisibility(ct.postalAddrAttention);
		tofill(ct.postalAddrAttention, "Test Attention");

		Explicitwaitvisibility(ct.postalAddress);
		tofill(ct.postalAddress, "No.52B, Test Address");

		Explicitwaitvisibility(ct.postalCity);
		tofill(ct.postalCity, "Chennai");

		Explicitwaitvisibility(ct.postalState);
		tofill(ct.postalState, "Chennai");

		Explicitwaitvisibility(ct.postalZipCode);
		tofill(ct.postalZipCode, "602024");

		Explicitwaitvisibility(ct.countrydd);
		clickjavascript(ct.countrydd);
		tofill(ct.countrydd, "India");
		Thread.sleep(2000);
		toenter();


		Scrollupjavascript();

		Selectcheckbox(ct.Sameaspostaladdresschkbox);

		ScrolldownElement(ct.SavebtnAddressDetails);

		Explicitwaitvisibility(ct.Nextbtn2);
		clickjavascript(ct.Nextbtn2);


	}

	@And("Navigate to Financial tab and enter details like Sales Setting,Sales Account..Etc for supplier")
	public void navigate_to_financial_tab_and_enter_details_like_sales_setting_sales_account_etc_for_supplier() throws InterruptedException, AWTException {
		ct = new Contacts_POJO();

		Explicitwaitvisibility(ct.SalesSettingDD);
		clickjavascript(ct.SalesSettingDD);
		tofill(ct.SalesSettingDD, "Tax Exclusive");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.RegNumbertxt);
		clickjavascript(ct.RegNumbertxt);
		tofill(ct.RegNumbertxt, "80562");

		Explicitwaitvisibility(ct.SalesAccountDD);
		clickjavascript(ct.SalesAccountDD);
		tofill(ct.SalesAccountDD, "200 - Sales");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.PurchaseSettingDD);
		clickjavascript(ct.PurchaseSettingDD);
		tofill(ct.PurchaseSettingDD, "Tax Exclusive");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.PurchaseAccountDD);
		clickjavascript(ct.PurchaseAccountDD);
		tofill(ct.PurchaseAccountDD, "400 - Advertising");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.peppoID);
		clickjavascript(ct.peppoID);
		tofill(ct.peppoID, "80563");

		Explicitwaitvisibility(ct.crdLimitAmounttxt);
		clickjavascript(ct.crdLimitAmounttxt);
		tofill(ct.crdLimitAmounttxt, "80500000000678");

		Selectcheckbox(ct.CardLimitChkbox);

		Explicitwaitvisibility(ct.SalesDiscount);
		clickjavascript(ct.SalesDiscount);
		tofill(ct.SalesDiscount, "10");

		Explicitwaitvisibility(ct.BillDueDateNum);
		clickjavascript(ct.BillDueDateNum);
		tofill(ct.BillDueDateNum, "100");

		Explicitwaitvisibility(ct.BillDueDateDD);
		clickjavascript(ct.BillDueDateDD);
		tofill(ct.BillDueDateDD, "day(s) after the bill date");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.invoiceDueDateDaysNum);
		clickjavascript(ct.invoiceDueDateDaysNum);
		tofill(ct.invoiceDueDateDaysNum, "100");

		Explicitwaitvisibility(ct.invoiceDueDateDaysDD);
		clickjavascript(ct.invoiceDueDateDaysDD);
		tofill(ct.invoiceDueDateDaysDD, "day(s) after the invoice date");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.InvoiceTheme);
		clickjavascript(ct.InvoiceTheme);
		tofill(ct.InvoiceTheme, "Standard Template");
		Thread.sleep(2000);
		toenter();




		Explicitwaitvisibility(ct.TaxIDtxt);
		clickjavascript(ct.TaxIDtxt);
		tofill(ct.TaxIDtxt, "TAX1111");
		Thread.sleep(2000);

		Explicitwaitvisibility(ct.DefaultSalestaxDD);
		clickjavascript(ct.DefaultSalestaxDD);
		tofill(ct.DefaultSalestaxDD, "ZR: Zero-Rated Supplies (0%)");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.DefaultpurchasetaxDD);
		clickjavascript(ct.DefaultpurchasetaxDD);
		tofill(ct.DefaultpurchasetaxDD, "BL: Disallowed Expenses (7%)");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.CurrencyDD);
		clickjavascript(ct.CurrencyDD);
		tofill(ct.CurrencyDD, "SGD - Singapore Dollar");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.PurchaseThemeDD);
		clickjavascript(ct.PurchaseThemeDD);
		tofill(ct.PurchaseThemeDD, "Standard Template");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.PaymentModeDD);
		clickjavascript(ct.PaymentModeDD);
		tofill(ct.PaymentModeDD, "Cash");
		Thread.sleep(2000);
		toenter();

		Explicitwaitvisibility(ct.Termsandconditionbox);
		clickjavascript(ct.Termsandconditionbox);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.AddNewTermsCondition);
		clickjavascript(ct.AddNewTermsCondition);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.TitleEnter);
		clickjavascript(ct.TitleEnter);
		tofill(ct.TitleEnter, "Test title");
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.EnterDescriptionTerms);
		clickjavascript(ct.EnterDescriptionTerms);
		tofill(ct.EnterDescriptionTerms, "Test description");
		clickjavascript(ct.SavebtnTerms);


	}
	@Given("User need to navigate Supplier tab")
	public void user_need_to_navigate_supplier_tab() throws InterruptedException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.ContactMenu);
		clickjavascript(ct.ContactMenu);
		Thread.sleep(2000);
	
	}

	@And("Search for the specific record and select the  Supplier contact")
	public void search_for_the_specific_record_and_select_the_supplier_contact() throws InterruptedException, AWTException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.SearchboxContacts);
		clickjavascript(ct.SearchboxContacts);
		tofill(ct.SearchboxContacts, "autosupplier22");
		Thread.sleep(1000);
		toenter();
	
	}


	@Given("User need to navigate selected  Supplier contact and click archieve and restore the archieved contact")
	public void user_need_to_navigate_selected_supplier_contact_and_click_archieve_and_restore_the_archieved_contact() throws InterruptedException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.MoreOptionscontact);
		clickjavascript(ct.MoreOptionscontact);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.Archiveselect);
		clickjavascript(ct.Archiveselect);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.OkArchive);
		clickjavascript(ct.OkArchive);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.MoreOptionscontact);
		clickjavascript(ct.MoreOptionscontact);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.Restoreselect);
		clickjavascript(ct.Restoreselect);
	
	}
	
	@Given("User need to Delete the selected Supplier contact")
	public void user_need_to_delete_the_selected_supplier_contact() throws InterruptedException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.MoreOptionscontact);
		clickjavascript(ct.MoreOptionscontact);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.Deleteselect);
		clickjavascript(ct.Deleteselect);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.OkDelete);
		clickjavascript(ct.OkDelete);
	
	}

	@Given("User need to navigate to Manage Contact group page")
	public void user_need_to_navigate_to_manage_contact_group_page() throws InterruptedException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.PopupClose_COA);
		clickjavascript(ct.PopupClose_COA);
		Thread.sleep(2000);
		Explicitwaitvisibility(ct.ContactMenu);
		clickjavascript(ct.ContactMenu);
		Thread.sleep(2000);
		Explicitwaitvisibility(ct.ManagecontactgroupBtn_COA);
		clickjavascript(ct.ManagecontactgroupBtn_COA);
	
	}
	@And("User need to create a new contact group by entering Groupname")
	public void user_need_to_create_a_new_contact_group_by_entering_groupname() throws AWTException, InterruptedException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.ContactGroupNametxt_COA);
		tofill(ct.ContactGroupNametxt_COA, "TestGroup");
		Thread.sleep(2000);
		Explicitwaitvisibility(ct.AddGroupBtn_COA);
		clickjavascript(ct.AddGroupBtn_COA);
		
		
		
		
	}

	@Given("User need to Edit a new contact group by changing Groupname")
	public void user_need_to_edit_a_new_contact_group_by_changing_groupname() throws AWTException, InterruptedException {
		ct = new Contacts_POJO();

		Explicitwaitvisibility(ct.Editclickgroupname_COA);
		clickjavascript(ct.Editclickgroupname_COA);
		Explicitwaitvisibility(ct.Edittypeclick_COA);
		clickjavascript(ct.Edittypeclick_COA);
		actionssendkeysdelete(ct.Edittypeclick_COA);
		Thread.sleep(2000);
		tofill(ct.Edittypeclick_COA, "TestData");
		Thread.sleep(2000);
		toenter();

			}

	@Given("User need to delete a new contact group")
	public void user_need_to_delete_a_new_contact_group() throws InterruptedException {
		ct = new Contacts_POJO();

		Thread.sleep(3000);
		Explicitwaitvisibility(ct.DeletexBtnpop_COA);
		clickjavascript(ct.DeletexBtnpop_COA);
		Thread.sleep(1000);
		Explicitwaitvisibility(ct.DeleteBtnOk_COA);
		clickjavascript(ct.DeleteBtnOk_COA);
		Thread.sleep(2000);
		Explicitwaitvisibility(ct.CancelBtn_COA);
		clickjavascript(ct.CancelBtn_COA);

	}


	
	@Given("User need to navigate Manage contact group section")
	public void user_need_to_navigate_manage_contact_group_section() throws InterruptedException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.ContactMenu);
		clickjavascript(ct.ContactMenu);
		Thread.sleep(1000);
		
	}


/*	@Then("User need to create a contact group")
	public void user_need_to_create_a_contact_group() throws AWTException {
		ct = new Contacts_POJO();
		Explicitwaitvisibility(ct.AddManagecontactgroup);
		clickjavascript(ct.AddManagecontactgroup);
		
		
		Explicitwaitvisibility(ct.Addcontactgroupname);
		tofill(ct.Addcontactgroupname, "testgroup");
		clickjavascript(ct.Addgroupbtn);
		
		
		Explicitwaitvisibility(ct.Addgroupbtn);
		clickjavascript(ct.Addgroupbtn);
		
		Explicitwaitvisibility(ct.Contactgroupedit);
		clickjavascript(ct.Contactgroupedit);
		Toclear(ct.Contactgroupeditdelete);
		tofill(ct.Contactgroupeditdelete, "test2");
		toenter();
	
		
		Explicitwaitvisibility(ct.DeletetriggerContactgroupedit);
		clickjavascript(ct.DeletetriggerContactgroupedit);
		
		Explicitwaitvisibility(ct.OkDeletetriggerContactgroupedit);
		clickjavascript(ct.OkDeletetriggerContactgroupedit);
		
	}
*/


}
