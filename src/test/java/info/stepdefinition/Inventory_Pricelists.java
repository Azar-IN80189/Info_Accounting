package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Inventory_PriceList_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Inventory_Pricelists extends Reusableclass{

	public static Inventory_PriceList_POJO n;

	@Given("User need to navigate to Pricelist slide")
	public void user_need_to_navigate_to_pricelist_slide() {
		n=new Inventory_PriceList_POJO();
		Explicitwaitvisibility(n.PriceListslide);
		highLightElement(n.PriceListslide);
		clickjavascript(n.PriceListslide);

	}


	@Then("User need to Add an purchase Price List")
	public void user_need_to_add_an_purchase_price_list() throws InterruptedException, AWTException {
		n=new Inventory_PriceList_POJO();
	
			Explicitwaitvisibility(n.AddPriceListbtn);
			highLightElement(n.AddPriceListbtn);
			toClick(n.AddPriceListbtn);
			Thread.sleep(3000);
			highLightElement(n.PriceListName);
			tofill(n.PriceListName, "Newprice");
			mouseOver(n.TypeDD);
			mouseclick(n.TypeDD);
			Thread.sleep(2000);
			tofill(n.TypeDDtxt, "Purchase");
			Thread.sleep(2000);
			toenter();
			Thread.sleep(2000);
			highLightElement(n.EffectiveFrom);
			tofill(n.EffectiveFrom, "10/11/2022");
			highLightElement(n.EffectiveTo);
			tofill(n.EffectiveTo, "27/11/2022");
			Thread.sleep(3000);
			highLightElement(n.Items1table);
			toClick(n.Items1table);
			tofill(n.Items1tabletype, "samsung");
			toenter();
			Thread.sleep(3000);
			highLightElement(n.Quantity1table);
			toClick(n.Quantity1table);
			tofill(n.Quantity1table, "1");
			Thread.sleep(3000);
			totabkey();
			Thread.sleep(1000);
			highLightElement(n.Unit1Price);
			tofill(n.Unit1Price, "100");
			Thread.sleep(1000);
			totabkey();
			highLightElement(n.AddNewLinesbtn);
			clickjavascript(n.AddNewLinesbtn);
			Thread.sleep(3000);
			highLightElement(n.Savebtn);
			toClick(n.Savebtn);
			Thread.sleep(1000);
			Explicitwaitvisibility(n.Searchboxmain);
			highLightElement(n.Searchboxmain);
			Toclear(n.Searchboxmain);
			tofill(n.Searchboxmain, "Newprice");
			Thread.sleep(2000);
			Explicitwaitvisibility(n.Select1edit);
			highLightElement(n.Select1edit);
			clickjavascript(n.Select1edit);
			Explicitwaitvisibility(n.Editbtn);
			highLightElement(n.Editbtn);
			clickjavascript(n.Editbtn);
			Thread.sleep(2000);
			Explicitwaitvisibility(n.Quantityedit);
			highLightElement(n.Quantityedit);
			actionssendkeysdelete(n.Quantityedit);
			Thread.sleep(2000);
			highLightElement(n.Quantityfill);
			tofill(n.Quantityfill, "200");
			Thread.sleep(2000);
			highLightElement(n.Savebtn);
			clickjavascript(n.Savebtn);
		}


	

	@And("User need to Delete an purchase price List")
	public void user_need_to_delete_an_purchase_price_list() throws InterruptedException {
		n=new Inventory_PriceList_POJO();
		
			Thread.sleep(1000);
			Explicitwaitvisibility(n.Searchboxmain);
			n.Searchboxmain.clear();
			highLightElement(n.Searchboxmain);
			Toclear(n.Searchboxmain);
			tofill(n.Searchboxmain, "Newprice");
			mouseclick(n.Checkboxmain);
			Thread.sleep(1000);
			highLightElement(n.Dropdown);
			toClick(n.Dropdown);
			Thread.sleep(1000);
			highLightElement(n.Delete);
			mouseclick(n.Delete);
			Thread.sleep(1000);
			highLightElement(n.Okpopup);
			clickjavascript(n.Okpopup);

		}

@Given("User need to navigate to Pricelist slide sales-scenario")
public void user_need_to_navigate_to_pricelist_slide_sales_scenario() {
	n=new Inventory_PriceList_POJO();
	
	Explicitwaitvisibility(n.PriceListslide);
	highLightElement(n.PriceListslide);
	clickjavascript(n.PriceListslide);

}



@Then("User need to Add an sales Price List")
public void user_need_to_add_an_sales_price_list() throws InterruptedException, AWTException {
	n=new Inventory_PriceList_POJO();
	
	Explicitwaitvisibility(n.AddPriceListbtn);
	highLightElement(n.AddPriceListbtn);
	toClick(n.AddPriceListbtn);
	Thread.sleep(3000);
	highLightElement(n.PriceListName);
	tofill(n.PriceListName, "Newprice");
	mouseOver(n.TypeDD);
	mouseclick(n.TypeDD);
	tofill(n.TypeDDtxt, "Sales");
	Thread.sleep(2000);
	toenter();
	Thread.sleep(2000);
	highLightElement(n.EffectiveFrom);
	tofill(n.EffectiveFrom, "10/11/2022");
	highLightElement(n.EffectiveTo);
	tofill(n.EffectiveTo, "27/11/2022");
	Thread.sleep(3000);
	highLightElement(n.Items1table);
	toClick(n.Items1table);
	tofill(n.Items1tabletype, "samsung");
	toenter();
	Thread.sleep(3000);
	highLightElement(n.Quantity1table);
	toClick(n.Quantity1table);
	tofill(n.Quantity1table, "1");
	Thread.sleep(3000);
	totabkey();
	Thread.sleep(1000);
	highLightElement(n.Unit1Price);
	tofill(n.Unit1Price, "100");
	Thread.sleep(1000);
	totabkey();
	highLightElement(n.AddNewLinesbtn);
	clickjavascript(n.AddNewLinesbtn);
	Thread.sleep(3000);
	highLightElement(n.Savebtn);
	toClick(n.Savebtn);
	Thread.sleep(1000);
	Explicitwaitvisibility(n.Searchboxmain);
	highLightElement(n.Searchboxmain);
	Toclear(n.Searchboxmain);
	tofill(n.Searchboxmain, "Newprice");
	Thread.sleep(3000);
	
	Explicitwaitvisibility(n.Select1edit);
	highLightElement(n.Select1edit);
	clickjavascript(n.Select1edit);
	
	Thread.sleep(3000);
	
	Explicitwaitvisibility(n.Editbtn);
	highLightElement(n.Editbtn);
	clickjavascript(n.Editbtn);
	Thread.sleep(2000);
	Explicitwaitvisibility(n.Quantityedit);
	highLightElement(n.Quantityedit);
	actionssendkeysdelete(n.Quantityedit);
	Thread.sleep(2000);
	highLightElement(n.Quantityfill);
	tofill(n.Quantityfill, "200");
	Thread.sleep(2000);
	highLightElement(n.Savebtn);
	clickjavascript(n.Savebtn);

}

@And("User need to Delete an sales price List")
public void user_need_to_delete_an_sales_price_list() throws InterruptedException {
	n=new Inventory_PriceList_POJO();
	
	Thread.sleep(1000);
	Explicitwaitvisibility(n.Searchboxmain);
	n.Searchboxmain.clear();
	highLightElement(n.Searchboxmain);
	Toclear(n.Searchboxmain);
	tofill(n.Searchboxmain, "Newprice");
	mouseclick(n.Checkboxmain);
	Thread.sleep(1000);
	highLightElement(n.Dropdown);
	toClick(n.Dropdown);
	Thread.sleep(1000);
	highLightElement(n.Delete);
	mouseclick(n.Delete);
	Thread.sleep(1000);
	highLightElement(n.Okpopup);
	clickjavascript(n.Okpopup);

}



	}


