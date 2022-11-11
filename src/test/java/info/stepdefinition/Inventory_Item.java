package info.stepdefinition;



import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Forgot_Password_POJO;
import info.pojo.Inventory_Item_POJO;
import info.pojo.Purchase_order_POJO;
import info.pojo.UserCreation_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Inventory_Item extends Reusableclass {
	public static Purchase_order_POJO w;
	public static UserCreation_POJO u;
	public static Forgot_Password_POJO f;
	public static Inventory_Item_POJO i;
	@Given("User need to navigate to Item slide")
	public void user_need_to_navigate_to_item_slide() throws AWTException {
		i=new Inventory_Item_POJO();
		Explicitwaitvisibility(i.Inventoryslide);
		highLightElement(i.Inventoryslide);
		toClick(i.Inventoryslide);
		
		Explicitwaitvisibility(i.Itemslide);
		highLightElement(i.Itemslide);
		clickjavascript(i.Itemslide);



	}

	@And("User need to Add an item")
	public void user_need_to_add_an_item() throws AWTException, InterruptedException {
		i=new Inventory_Item_POJO();

		Explicitwaitvisibility(i.Additembtn);
		highLightElement(i.Additembtn);
		toClick(i.Additembtn);

		Explicitwaitvisibility(i.Itemcodesku);
		highLightElement(i.Itemcodesku);
		tofill(i.Itemcodesku, "883812232");

		highLightElement(i.Itemname);
		tofill(i.Itemname, "DemoItem");
		
		highLightElement(i.ProductCategoryDD);
		clickjavascript(i.ProductCategoryDD);
		tofill(i.ProductCategoryDD, "testing");
		toenter();

		highLightElement(i.UnitofmeasurementDD);
		clickjavascript(i.UnitofmeasurementDD);
		tofill(i.UnitofmeasurementDD, "box");
/*
		highLightElement(i.Testtxt);
		clickjavascript(i.Testtxt);
		tofill(i.Testtxt, "name");
		toenter();*/

		//clickjavascript(i.Ipurchasechkbox);

		clickjavascript(i.costpricetxtbox);
		tofill(i.costpricetxtbox, "1322");
		Thread.sleep(1000);
		toenter();
		
		clickjavascript(i.Purchaseaccounttxtdd);
		tofill(i.Purchaseaccounttxtdd, "310 - Cost of Goods Sold");
		Thread.sleep(1000);
		toenter();
		
		clickjavascript(i.TaxrateDDtxtdd);
		tofill(i.TaxrateDDtxtdd, "DS: Deemed Supplies (7%)");
		Thread.sleep(1000);
		toenter();
		
		clickjavascript(i.PurchaseDescriptiontxt);
		tofill(i.PurchaseDescriptiontxt, "Test Description");
		toenter();
		//Selectcheckbox(i.Isellchkbox);

		clickjavascript(i.SellingPrice);
		tofill(i.SellingPrice, "230");
		toenter();
		
		clickjavascript(i.SalesAccounttxtDD);
		tofill(i.SalesAccounttxtDD, "200 - Sales");
		Thread.sleep(1000);
		toenter();
		
		clickjavascript(i.TaxRateSellingtxtDD);
		tofill(i.TaxRateSellingtxtDD, "DS: Deemed Supplies (7%)");
		Thread.sleep(1000);
		toenter();
		
		clickjavascript(i.SalesDescription);
		tofill(i.SalesDescription, "Test sale description");
		Thread.sleep(1000);
		toenter();

		
		ScrolldownElement(i.Savebtn);
		highLightElement(i.Savebtn);
		clickjavascript(i.Savebtn);

	

	}

	@And("User need to delete an item")
	public void user_need_to_delete_an_item() throws InterruptedException, AWTException {
		i=new Inventory_Item_POJO();
		
		highLightElement(i.Searchitems);
		tofill(i.Searchitems, "883812232");

		Thread.sleep(3000);

		highLightElement(i.CheckallboxItems);
		clickjavascript(i.CheckallboxItems);

		highLightElement(i.Deletebtn);
		toClick(i.Deletebtn);

		toenter();
	
	}

	@Then("User need to add an service item")
	public void user_need_to_add_an_service_item() throws AWTException, InterruptedException {
		i=new Inventory_Item_POJO();
	
			Thread.sleep(2000);

			Explicitwaitvisibility(i.Additembtn);
			highLightElement(i.Additembtn);
			clickjavascript(i.Additembtn);

			Explicitwaitvisibility(i.ServiceTab);
			highLightElement(i.ServiceTab);
			toClick(i.ServiceTab);


			Explicitwaitvisibility(i.Itemcodesku);
			highLightElement(i.Itemcodesku);
			tofill(i.Itemcodesku, "889928331");

			highLightElement(i.Itemname);
			tofill(i.Itemname, "DemoService");

			highLightElement(i.ProductCategoryDD);
			clickjavascript(i.ProductCategoryDD);
			tofill(i.ProductCategoryDD, "testing");
			toenter();

			highLightElement(i.UnitofmeasurementDD);
			clickjavascript(i.UnitofmeasurementDD);
			tofill(i.UnitofmeasurementDD, "box");

			/*highLightElement(i.Testtxt);
			clickjavascript(i.Testtxt);
			tofill(i.Testtxt, "100");
			toenter();
*/
			//clickjavascript(i.Ipurchasechkbox);

			highLightElement(i.costpricetxtbox);
			clickjavascript(i.costpricetxtbox);
			tofill(i.costpricetxtbox, "1322");
			toenter();
			
			highLightElement(i.Purchaseaccounttxtdd);
			clickjavascript(i.Purchaseaccounttxtdd);
			tofill(i.Purchaseaccounttxtdd, "310 - Cost of Goods Sold");
			toenter();
			
			highLightElement(i.TaxrateDDtxtdd);
			clickjavascript(i.TaxrateDDtxtdd);
			tofill(i.TaxrateDDtxtdd, "DS: Deemed Supplies (7%)");
			toenter();
			highLightElement(i.PurchaseDescriptiontxt);
			clickjavascript(i.PurchaseDescriptiontxt);
			highLightElement(i.PurchaseDescriptiontxt);
			tofill(i.PurchaseDescriptiontxt, "Test Description");
			toenter();
			//Selectcheckbox(i.Isellchkbox);

			highLightElement(i.SellingPrice);
			clickjavascript(i.SellingPrice);
			tofill(i.SellingPrice, "230");
			toenter();
			
			highLightElement(i.SalesAccounttxtDD);
			clickjavascript(i.SalesAccounttxtDD);
			tofill(i.SalesAccounttxtDD, "200 - Sales");
			toenter();
			
			highLightElement(i.TaxRateSellingtxtDD);
			clickjavascript(i.TaxRateSellingtxtDD);
			tofill(i.TaxRateSellingtxtDD, "DS: Deemed Supplies (7%)");
			toenter();
			
			highLightElement(i.SalesDescription);
			clickjavascript(i.SalesDescription);
			tofill(i.SalesDescription, "Test sale description");
			toenter();
		
			ScrolldownElement(i.Savebtn);
			highLightElement(i.Savebtn);
			clickjavascript(i.Savebtn);

		
		}

	@And("User need to delete an service item")
	public void user_need_to_delete_an_service_item() throws InterruptedException, AWTException {
		i=new Inventory_Item_POJO();
		
		i.Searchitems.clear();
		highLightElement(i.Searchitems);
		tofill(i.Searchitems, "889928331");

		Thread.sleep(3000);
		
		highLightElement(i.CheckallboxItems);
		clickjavascript(i.CheckallboxItems);

		highLightElement(i.Deletebtn);
		toClick(i.Deletebtn);

		toenter();
		Explicitwaitvisibility(i.Searchitems);
		actionssendkeysdelete(i.Searchitems);
	}

	@And("User need to add an product group")
	public void user_need_to_add_an_product_group() throws InterruptedException, AWTException {
		
		i=new Inventory_Item_POJO();

			Thread.sleep(2000);
			implicitwait();
			Explicitwaitvisibility(i.Additembtn);
			highLightElement(i.Additembtn);
			toClick(i.Additembtn);

			Explicitwaitvisibility(i.ProductGrouptab);
			highLightElement(i.ProductGrouptab);
			toClick(i.ProductGrouptab);


			Explicitwaitvisibility(i.ItemcodePG);

			highLightElement(i.ItemcodePG);
			tofill(i.ItemcodePG, "998283833");

			highLightElement(i.ItemNamePG);
			tofill(i.ItemNamePG, "DemoService");

			Explicitwaitvisibility(i.DescriptionProductGroup);
			highLightElement(i.DescriptionProductGroup);
			clickjavascript(i.DescriptionProductGroup);
			tofill(i.DescriptionProductGroup, "Test Product group");




			Explicitwaitvisibility(i.items1click);
			highLightElement(i.items1click);
			clickjavascript(i.items1click);
			tofill(i.items1ProductGroupenter, "Testitem1");
			Thread.sleep(2000);
			toenter();

			Explicitwaitvisibility(i.QuantityProductGroupclick);
			highLightElement(i.QuantityProductGroupclick);
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
			/*Explicitwaitvisibility(i.secondrowclose);
			highLightElement(i.secondrowclose);
			clickjavascript(i.secondrowclose);*/
			
			Explicitwaitvisibility(i.Item2product);
			highLightElement(i.Item2product);
			clickjavascript(i.Item2product);
			tofill(i.Item2producttypetxt, "Testitem2");
			Thread.sleep(2000);
			toenter();
			
			
			ScrolldownElement(i.Addlinesbtn);
			Explicitwaitvisibility(i.Addlinesbtn);
			highLightElement(i.Addlinesbtn);
			clickjavascript(i.Addlinesbtn);
		

		
			
			ScrolldownElement(i.SavebtnPG);
			highLightElement(i.SavebtnPG);
			clickjavascript(i.SavebtnPG);

		
		}
	@And("User need to delete an product group item")
	public void user_need_to_delete_an_product_group_item() throws InterruptedException, AWTException {
		i=new Inventory_Item_POJO();
		
		i.Searchitems.clear();
		highLightElement(i.Searchitems);
		tofill(i.Searchitems, "998283833");

		Thread.sleep(3000);

		highLightElement(i.CheckallboxItems);
		clickjavascript(i.CheckallboxItems);

		highLightElement(i.Deletebtn);
		toClick(i.Deletebtn);

		toenter();
	
	}

	

	@And("User need to Manage an item")
	public void user_need_to_manage_an_item() throws InterruptedException {
		i=new Inventory_Item_POJO();
		
			Explicitwait(i.ManageCategorybtn);
			highLightElement(i.ManageCategorybtn);
			clickjavascript(i.ManageCategorybtn);
			Thread.sleep(2000);
			highLightElement(i.Categorynametxtbox);
			tofill(i.Categorynametxtbox, "test9333");
			highLightElement(i.AddcategoryBtn);
			clickjavascript(i.AddcategoryBtn);
			highLightElement(i.Cancelbtn);
			toClick(i.Cancelbtn);
			actionssendkeysdelete(i.Searchitems);
		}
	

	@Then("User need to Manage a unit type")
	public void user_need_to_manage_a_unit_type() throws InterruptedException, AWTException {
		i=new Inventory_Item_POJO();

		Thread.sleep(4000);
		highLightElement(i.manageUnitTypebtn);
		Explicitwait(i.manageUnitTypebtn);
		clickjavascript(i.manageUnitTypebtn);
		Thread.sleep(2000);
		highLightElement(i.manageUnitTypename);
		tofill(i.manageUnitTypename, "test944");
		
	
		Selectcheckbox(i.Activechkbox);
		
		//highLightElement(i.Defaultchkbox);
		Selectcheckbox(i.Defaultchkbox);
		Thread.sleep(1000);
		highLightElement(i.SavebtnManageunittype);
		clickjavascript(i.SavebtnManageunittype);
		Thread.sleep(3000);
		totabkey();
		totabkey();
		totabkey();
		toenter();
		Thread.sleep(2000);
		highLightElement(i.Searchitems);
		clickjavascript(i.Searchitems);
		actionssendkeysdelete(i.Searchitems);

	}



	@Then("User need to verify the All Headers on the Items page")
	public void user_need_to_verify_the_all_headers_on_the_items_page() throws InterruptedException {
		i=new Inventory_Item_POJO();
	
			ScrollupElement(i.AllTabheader);
			highLightElement(i.AllTabheader);
			toClick(i.AllTabheader);
			highLightElement(i.SalesTab);
			clickjavascript(i.SalesTab);
			highLightElement(i.PurchasesTab);
			clickjavascript(i.PurchasesTab);
			Thread.sleep(3000);
			highLightElement(i.Inactivetab);
			clickjavascript(i.Inactivetab);
			Thread.sleep(4000);
			
		
	}



}
