package info.stepdefinition;

import org.openqa.selenium.WebDriver;

import info.base.Reusableclass;
import info.pojo.AccountLoginpojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login extends Reusableclass {

	public static WebDriver driver;
	public static AccountLoginpojo a;

	@Given("user gives InfoAccounting App URL")
	public void user_gives_info_accounting_app_url() {
		
		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();

	}

	@When("User gives Credentials for InfoAccounting login")
	public void user_gives_credentials_for_info_accounting_login() throws InterruptedException {
		
		a = new AccountLoginpojo();
		Thread.sleep(3000);
		toClick(a.username);
		actionssendkeysdelete(a.username);
		tofill(a.username, "accounting@the23app.com");
		toClick(a.password);
		actionssendkeysdelete(a.password);
		tofill(a.password, "Iteration@2008");
		
	}

	@And("User submit the button")
	public void user_submit_the_button() {

		a = new AccountLoginpojo();
		toClick(a.submit);
		
	}
	

}
