package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Purchase_order_POJO;
import info.pojo.Tax_Rate_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Org_Tax_Rate extends Reusableclass {
	public static Tax_Rate_POJO t;
	public static Purchase_order_POJO w;

	

	@Given("User need to navigate tax rates section")
	public void user_need_to_navigate_tax_rates_section() throws InterruptedException, AWTException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();
	
			/*Explicitwaitvisibility(t.Organizationslide);
			highLightElement(t.Organizationslide);
			toClick(t.Organizationslide);*/
			Thread.sleep(1000);
			Explicitwaitvisibility(t.Taxrateslide);
			highLightElement(t.Taxrateslide);
			toClick(t.Taxrateslide);
	
		
		Explicitwaitvisibility(t.Newtaxratebtn);
		highLightElement(t.Newtaxratebtn);
		clickjavascript(t.Newtaxratebtn);


	}

	@And("User need to create a new tax rate")
	public void user_need_to_create_a_new_tax_rate() throws InterruptedException, AWTException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();

		Thread.sleep(2000);
		
		highLightElement(t.TaxRateDisplayName);
		tofill(t.TaxRateDisplayName, "hbcbcsbcb");
		highLightElement(t.TaxCode);
		tofill(t.TaxCode,"7792308883");
		Thread.sleep(2000);
		highLightElement(t.BoxNumberDD);
		tofill(t.BoxNumberDD, "1, 6 - Standard-Rated Supplies");
		toenter();
		Explicitwaitvisibility(t.PurchaseTaxChkbox);
		highLightElement(t.PurchaseTaxChkbox);
		toClick(t.PurchaseTaxChkbox);
		highLightElement(t.SalesTaxChkbox);
		toClick(t.SalesTaxChkbox);
		highLightElement(t.Componentname);
		tofill(t.Componentname, "metals");
		actionssendkeysdelete(t.Componentpercentage);
		highLightElement(t.Componentpercentage);
		tofill(t.Componentpercentage, "18");
		
		highLightElement(t.Addcomponentbtn);
		toClick(t.Addcomponentbtn);
		highLightElement(t.compoundradiobtn);
		toClick(t.compoundradiobtn);
		Thread.sleep(2000);
		Explicitwaitvisibility(t.Removecomponentxbtn);
		highLightElement(t.Removecomponentxbtn);
		toClick(t.Removecomponentxbtn);
		highLightElement(t.Yesremovebtn);
		toClick(t.Yesremovebtn);
		Thread.sleep(3000);
		highLightElement(t.Savebtn);
		toClick(t.Savebtn);
	}


	@Given("User need to edit the tax rate and save the edited tax rate")
	public void user_need_to_edit_the_tax_rate_and_save_the_edited_tax_rate() throws InterruptedException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();
		Explicitwaitvisibility(t.Searchboxtax);
		highLightElement(t.Searchboxtax);
		tofill(t.Searchboxtax, "hbcbcsbcb");
		
		Explicitwaitvisibility(t.Edittax);
		highLightElement(t.Edittax);
		toClick(t.Edittax);
		highLightElement(t.Componentname);
		highLightElement(t.Componentname);
		toClick(t.Componentname);
		tofill(t.Componentname, "component");
		Thread.sleep(2000);
		highLightElement(t.Savebtn);
		toClick(t.Savebtn);
	}


	@Given("User need to Delete the tax rate which is newly created")
	public void user_need_to_delete_the_tax_rate_which_is_newly_created() throws InterruptedException, AWTException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();
		
		Selectcheckbox(t.Checkboxtax);
		Thread.sleep(2000);
		highLightElement(t.Deletebtn);
		toClick(t.Deletebtn);
		Thread.sleep(5000);
		highLightElement(t.okbtn);
		clickjavascript(t.okbtn);
		Thread.sleep(2000);


	}
}
