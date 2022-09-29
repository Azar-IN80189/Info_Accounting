package info.stepdefinition;



import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Forgot_Password_POJO;
import info.pojo.Inventory_Items_POJO;
import info.pojo.Purchase_order_POJO;
import info.pojo.UserCreation_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Inventory_Items extends Reusableclass {
	public static Purchase_order_POJO w;
	public static UserCreation_POJO u;
	public static Forgot_Password_POJO f;
	public static Inventory_Items_POJO i;
	@Given("User need to navigate to Item slide")
	public void user_need_to_navigate_to_item_slide() throws AWTException {
		i=new Inventory_Items_POJO();
		toClick(i.Inventoryslide);
		
		clickjavascript(i.Itemslide);



	}

	@And("User need to Add an item")
	public void user_need_to_add_an_item() throws AWTException, InterruptedException {
		i=new Inventory_Items_POJO();

		Explicitwait(i.Additembtn);

		toClick(i.Additembtn);

		Explicitwait(i.Itemcodesku);

		tofill(i.Itemcodesku, "883812232");

		tofill(i.Itemname, "DemoItem");

		clickjavascript(i.ProductCategoryDD);
		tofill(i.ProductCategoryDD, "DASS");
		toenter();

		clickjavascript(i.UnitofmeasurementDD);
		tofill(i.UnitofmeasurementDD, "box");

		clickjavascript(i.Testtxt);
		tofill(i.Testtxt, "name");
		toenter();

		//clickjavascript(i.Ipurchasechkbox);

		clickjavascript(i.costpricetxtbox);
		tofill(i.costpricetxtbox, "1322");
		toenter();
		clickjavascript(i.PurchaseaccountDD);
		tofill(i.PurchaseaccountDD, "101 - Test Acc 101");
		toenter();
		clickjavascript(i.TaxrateDD);
		tofill(i.TaxrateDD, "00989: Testing Malaysia changes (14%)");
		toenter();
		clickjavascript(i.PurchaseDescriptiontxt);
		tofill(i.PurchaseDescriptiontxt, "Test Description");
		toenter();
		//Selectcheckbox(i.Isellchkbox);

		clickjavascript(i.SellingPrice);
		tofill(i.SellingPrice, "23");
		toenter();
		clickjavascript(i.SalesAccountDD);
		tofill(i.SalesAccountDD, "200 - Sales");
		toenter();
		clickjavascript(i.TaxRateSellingDD);
		tofill(i.TaxRateSellingDD, "00989: Testing Malaysia changes (14%)");
		toenter();
		clickjavascript(i.SalesDescription);
		tofill(i.SalesDescription, "Test sale description");
		toenter();

		ScrolldownElement(i.Savebtn);
		clickjavascript(i.Savebtn);


		tofill(i.Searchitems, "883812232");

		Thread.sleep(3000);

		clickjavascript(i.CheckallboxItems);

		toClick(i.Deletebtn);

		toenter();

	}



	@Then("User need to add an service item")
	public void user_need_to_add_an_service_item() throws AWTException, InterruptedException {

	
			Thread.sleep(2000);

			Explicitwait(i.Additembtn);

			clickjavascript(i.Additembtn);

			Explicitwait(i.ServiceTab);

			toClick(i.ServiceTab);


			Explicitwait(i.Itemcodesku);

			tofill(i.Itemcodesku, "889928331");

			tofill(i.Itemname, "DemoService");

			clickjavascript(i.ProductCategoryDD);
			tofill(i.ProductCategoryDD, "DASS");
			toenter();

			clickjavascript(i.UnitofmeasurementDD);
			tofill(i.UnitofmeasurementDD, "box");

			clickjavascript(i.Testtxt);
			tofill(i.Testtxt, "100");
			toenter();

			//clickjavascript(i.Ipurchasechkbox);

			clickjavascript(i.costpricetxtbox);
			tofill(i.costpricetxtbox, "1322");
			toenter();
			clickjavascript(i.PurchaseaccountDD);
			tofill(i.PurchaseaccountDD, "101 - Test Acc 101");
			toenter();
			clickjavascript(i.TaxrateDD);
			tofill(i.TaxrateDD, "00989: Testing Malaysia changes (14%)");
			toenter();
			clickjavascript(i.PurchaseDescriptiontxt);
			tofill(i.PurchaseDescriptiontxt, "Test Description");
			toenter();
			//Selectcheckbox(i.Isellchkbox);

			clickjavascript(i.SellingPrice);
			tofill(i.SellingPrice, "23");
			toenter();
			clickjavascript(i.SalesAccountDD);
			tofill(i.SalesAccountDD, "200 - Sales");
			toenter();
			clickjavascript(i.TaxRateSellingDD);
			tofill(i.TaxRateSellingDD, "00989: Testing Malaysia changes (14%)");
			toenter();
			clickjavascript(i.SalesDescription);
			tofill(i.SalesDescription, "Test sale description");
			toenter();




		

		
		
			ScrolldownElement(i.Savebtn);
			clickjavascript(i.Savebtn);

			i.Searchitems.clear();
			tofill(i.Searchitems, "889928331");

			Thread.sleep(3000);

			clickjavascript(i.CheckallboxItems);

			toClick(i.Deletebtn);

			toenter();
			Explicitwaitvisibility(i.Searchitems);
			actionssendkeysdelete(i.Searchitems);
		}

	

	@And("User need to add an product group")
	public void user_need_to_add_an_product_group() throws InterruptedException, AWTException {
		
			

			Thread.sleep(2000);
			implicitwait();
			Explicitwait(i.Additembtn);

			toClick(i.Additembtn);

			Explicitwait(i.ProductGrouptab);

			toClick(i.ProductGrouptab);


			Explicitwait(i.ItemcodePG);

			tofill(i.ItemcodePG, "998283833");

			tofill(i.ItemNamePG, "DemoService");

			Explicitwaitvisibility(i.DescriptionProductGroup);
			clickjavascript(i.DescriptionProductGroup);
			tofill(i.DescriptionProductGroup, "Test Product group");




			Explicitwaitvisibility(i.items1click);
			clickjavascript(i.items1click);
			tofill(i.items1ProductGroupenter, "cups");
			Thread.sleep(2000);
			toenter();

			Explicitwaitvisibility(i.QuantityProductGroupclick);
			clickjavascript(i.QuantityProductGroupclick);
			tofill(i.items1ProductGroupenter, "1");
			Thread.sleep(2000);
			toenter();

			/*	Explicitwaitvisibility(i.PurchaseUnitPricePG);
			clickjavascript(i.PurchaseUnitPricePG);
			tofill(i.items1ProductGroupenter, "100");
			Thread.sleep(2000);
			totabkey();

			Explicitwaitvisibility(i.SellingUnitPricePG);
			clickjavascript(i.SellingUnitPricePG);
			tofill(i.items1ProductGroupenter, "200");
			Thread.sleep(2000);
			totabkey();
			 */
			Explicitwaitvisibility(i.secondrowclose);
			clickjavascript(i.secondrowclose);
			ScrolldownElement(i.Addlinesbtn);
			Explicitwaitvisibility(i.Addlinesbtn);
			clickjavascript(i.Addlinesbtn);
		

		
			
			ScrolldownElement(i.SavebtnPG);
			clickjavascript(i.SavebtnPG);

			i.Searchitems.clear();
			tofill(i.Searchitems, "998283833");

			Thread.sleep(3000);

			clickjavascript(i.CheckallboxItems);

			toClick(i.Deletebtn);

			toenter();
		}

	

	@And("User need to Manage an item")
	public void user_need_to_manage_an_item() throws InterruptedException {
		i=new Inventory_Items_POJO();
		
			Explicitwait(i.ManageCategorybtn);
			clickjavascript(i.ManageCategorybtn);
			Thread.sleep(2000);
			tofill(i.Categorynametxtbox, "sdsdsdsdsqqe");
			clickjavascript(i.AddcategoryBtn);
			toClick(i.Cancelbtn);
			actionssendkeysdelete(i.Searchitems);
		}
	

	@Then("User need to Manage a unit type")
	public void user_need_to_manage_a_unit_type() throws InterruptedException, AWTException {
		i=new Inventory_Items_POJO();

		Thread.sleep(4000);
		Explicitwait(i.ManageUnitType);
		clickjavascript(i.ManageUnitType);
		Thread.sleep(2000);
		tofill(i.UnitTypename, "erererereqq");
		clickjavascript(i.Activechkbox);
		clickjavascript(i.Defaultchkbox);
		Thread.sleep(1000);
		clickjavascript(i.SavebtnManageunittype);
		Thread.sleep(3000);
		totabkey();
		totabkey();
		totabkey();
		toenter();
		Thread.sleep(2000);
		clickjavascript(i.Searchitems);
		actionssendkeysdelete(i.Searchitems);

	}



	@Then("User need to verify the headers")
	public void user_need_to_verify_the_headers() throws InterruptedException {
		i=new Inventory_Items_POJO();
	
			ScrollupElement(i.AllTabheader);
			toClick(i.AllTabheader);
			clickjavascript(i.SalesTab);
			clickjavascript(i.PurchasesTab);
			Thread.sleep(3000);
			clickjavascript(i.Inactivetab);
			Thread.sleep(4000);
			
		
	}


















}
