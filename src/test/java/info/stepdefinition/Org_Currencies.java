package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Currencies_POJO;
import info.pojo.Purchase_order_POJO;
import info.pojo.Tax_Rate_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Org_Currencies extends Reusableclass {
	public static Tax_Rate_POJO t;
	public static Purchase_order_POJO w;
	public static Currencies_POJO c;
	@Given("User need to navigate to Currencie section")
	public void user_need_to_navigate_to_currencie_section() throws InterruptedException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();
		c=new Currencies_POJO();
		toClick(t.Organizationslide);
		toClick(c.Currenciesslide);
		Thread.sleep(4000);
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		Explicitwait(c.AddCurrencies);
		clickjavascript(c.AddCurrencies);

	}



	@And("User need to Add a currency")
	public void user_need_to_add_a_currency() throws AWTException, InterruptedException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();
		c=new Currencies_POJO();

		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
			Thread.sleep(1000);
			clickjavascript(c.CurrenciesDD);
			Thread.sleep(1000);
			tofill(c.CurrenciesDD, "PLN - Polish Zloty");
			Explicitwaitvisibility(c.MouseclickDDCurrencies);
			mouseclick(c.MouseclickDDCurrencies);
			Thread.sleep(1000);
			toClick(c.Addcurrenciesbtn);
		}

	}

	@Then("User need to edit the currencies")
	public void user_need_to_edit_the_currencies() throws InterruptedException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();
		c=new Currencies_POJO();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
			
			tofill(c.Searchboxbtn, "PLN - Polish Zloty");
			
			Explicitwait(c.Editicon);
			
			toClick(c.Editicon);
			
			Explicitwait(c.Startdate);
			
			actionssendkeysdelete(c.Startdate);
			
			tofill(c.Startdate, "21/09/2022");
			
			actionssendkeysdelete(c.Enddate);
			actionssendkeysdelete(c.Enddate);
			
			tofill(c.Enddate, "29/09/2022");
			
			clickjavascript(c.CurrencyRadiobtn);
			
			tofill(c.Customratetxt, "2");

			Thread.sleep(3000);
			
			clickjavascript(c.Savebtn);
			
			Explicitwaitvisibility(c.logoutbtn);
			clickjavascript(c.logoutbtn);
			
		}
		




	}



}
