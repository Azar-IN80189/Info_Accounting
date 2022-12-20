package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Currencies_POJO;
import info.pojo.Purchase_order_POJO;
import info.pojo.Tax_Rate_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Org_Currencie extends Reusableclass {
	public static Tax_Rate_POJO t;
	public static Purchase_order_POJO w;
	public static Currencies_POJO c;
	@Given("User need to navigate to Organization>Currencie page")
	public void user_need_to_navigate_to_organization_currencie_page()  throws InterruptedException {
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



	@And("User need to Add a currency by selecting a currency")
	public void user_need_to_add_a_currency_by_selecting_a_currency() throws AWTException, InterruptedException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();
		c=new Currencies_POJO();

		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
			Thread.sleep(1000);
			highLightElement(c.CurrenciesDD);
			clickjavascript(c.CurrenciesDD);
			Thread.sleep(1000);
			tofill(c.CurrenciesDD, "IDR - Indonesian Rupiah");

			Explicitwaitvisibility(c.MouseclickDDCurrencies);
			mouseclick(c.MouseclickDDCurrencies);
			Thread.sleep(1000);
			highLightElement(c.Addcurrenciesbtn);
			toClick(c.Addcurrenciesbtn);
		}

	}

	@Given("User need to edit the currencies and set the parameter date and currency value")
	public void user_need_to_edit_the_currencies_and_set_the_parameter_date_and_currency_value() throws InterruptedException, AWTException {
		t=new Tax_Rate_POJO();
		w = new Purchase_order_POJO();
		c=new Currencies_POJO();
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);

			highLightElement(c.Searchboxbtn);
			tofill(c.Searchboxbtn, "IDR - Indonesian Rupiah");


			Explicitwait(c.Editicon);

			highLightElement(c.Editicon);
			toClick(c.Editicon);

			/*	Explicitwait(c.Startdate);
			highLightElement(c.Startdate);
			Toclear(c.Startdate);
			tofill(c.Startdate, "24/11/2022");
			toenter();


			Explicitwaitvisibility(c.Enddate);
			highLightElement(c.Enddate);
			Toclear(c.Enddate);
			tofill(c.Enddate, "27/11/2022");
			toenter();

			Thread.sleep(2000);
			Explicitwaitvisibility(c.CurrencyRadiobtn);
			clickjavascript(c.CurrencyRadiobtn);

			highLightElement(c.Customratetxt);
			tofill(c.Customratetxt, "2");*/


			Thread.sleep(3000);
			Explicitwaitvisibility(c.Savebtn);
			clickjavascript(c.Savebtn);

			Explicitwaitvisibility(c.logoutbtn);
			clickjavascript(c.logoutbtn);

		}





	}



}
