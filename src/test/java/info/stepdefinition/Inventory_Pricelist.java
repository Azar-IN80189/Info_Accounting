package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Inventory_PriceList_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Inventory_Pricelist extends Reusableclass{

	public static Inventory_PriceList_POJO n;

	@Given("User need to navigate to Pricelist slide")
	public void user_need_to_navigate_to_pricelist_slide() {
		n=new Inventory_PriceList_POJO();
		Explicitwaitvisibility(n.PriceListslide);
		clickjavascript(n.PriceListslide);



	}


	@Then("User need to Add an Price List")
	public void user_need_to_add_an_price_list() throws InterruptedException, AWTException {
		n=new Inventory_PriceList_POJO();
	
			Explicitwaitvisibility(n.AddPriceListbtn);
			toClick(n.AddPriceListbtn);
			Thread.sleep(3000);
			tofill(n.PriceListName, "Newprice");
			mouseOver(n.TypeDD);
			mouseclick(n.TypeDD);
			clickjavascript(n.FirstselectTypeDD);
			tofill(n.EffectiveFrom, "29/09/2022");
			tofill(n.EffectiveTo, "30/09/2022");
			Thread.sleep(3000);
			toClick(n.Items1table);
			tofill(n.Items1tabletype, "samsung");
			toenter();
			Thread.sleep(3000);
			toClick(n.Quantity1table);
			tofill(n.Quantity1table, "1");
			Thread.sleep(3000);
			totabkey();
			Thread.sleep(1000);
			tofill(n.Unit1Price, "100");
			Thread.sleep(1000);
			totabkey();
			clickjavascript(n.AddNewLinesbtn);
			Thread.sleep(3000);
			toClick(n.Savebtn);
			Thread.sleep(1000);
			Explicitwaitvisibility(n.Searchboxmain);
			tofill(n.Searchboxmain, "Newprice");
			Thread.sleep(2000);
			Explicitwaitvisibility(n.Select1edit);
			clickjavascript(n.Select1edit);
			Explicitwaitvisibility(n.Editbtn);
			clickjavascript(n.Editbtn);
			Thread.sleep(2000);
			Explicitwaitvisibility(n.Quantityedit);
			actionssendkeysdelete(n.Quantityedit);
			Thread.sleep(2000);
			tofill(n.Quantityfill, "200");
			Thread.sleep(2000);
			clickjavascript(n.Savebtn);
		}


	

	@And("User need to Delete the price List")
	public void user_need_to_delete_the_price_list() throws InterruptedException {
		n=new Inventory_PriceList_POJO();
		
			Thread.sleep(1000);
			Explicitwaitvisibility(n.Searchboxmain);
			n.Searchboxmain.clear();
			tofill(n.Searchboxmain, "Newprice");
			mouseclick(n.Checkboxmain);
			Thread.sleep(1000);
			toClick(n.Dropdown);
			Thread.sleep(1000);
			mouseclick(n.Delete);
			Thread.sleep(1000);
			clickjavascript(n.Okpopup);

			driver.quit();



		}

	}


