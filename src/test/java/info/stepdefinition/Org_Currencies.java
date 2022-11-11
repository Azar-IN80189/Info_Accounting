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
try {
	Explicitwaitvisibility(c.Currenciesslide);
	highLightElement(c.Currenciesslide);
	toClick(c.Currenciesslide);
} catch (Exception e) {
	
	System.out.println("Failed due to slide uninformed exceptions");
}
		Explicitwaitvisibility(c.Currenciesslide);
		highLightElement(c.Currenciesslide);
		toClick(c.Currenciesslide);


		Thread.sleep(4000);
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}

		Explicitwait(c.AddCurrencies);
		highLightElement(c.AddCurrencies);
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
			highLightElement(c.CurrenciesDD);
			clickjavascript(c.CurrenciesDD);
			Thread.sleep(1000);
			tofill(c.CurrenciesDD, "BZD - Belize Dollar");

			Explicitwaitvisibility(c.MouseclickDDCurrencies);
			mouseclick(c.MouseclickDDCurrencies);
			Thread.sleep(1000);
			highLightElement(c.Addcurrenciesbtn);
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

			highLightElement(c.Searchboxbtn);
			tofill(c.Searchboxbtn, "BZD - Belize Dollar");


			Explicitwait(c.Editicon);

			highLightElement(c.Editicon);
			toClick(c.Editicon);

			Explicitwait(c.Startdate);

			actionssendkeysdelete(c.Startdate);

			highLightElement(c.Startdate);
			tofill(c.Startdate, "10/11/2022");


			c.Enddate.clear();

			highLightElement(c.Enddate);
			tofill(c.Enddate, "15/11/2022");


			clickjavascript(c.CurrencyRadiobtn);

			highLightElement(c.Customratetxt);
			tofill(c.Customratetxt, "2");


			Thread.sleep(3000);

			highLightElement(c.Savebtn);
			clickjavascript(c.Savebtn);

			Explicitwaitvisibility(c.logoutbtn);
			highLightElement(c.logoutbtn);
			clickjavascript(c.logoutbtn);

		}





	}



}
