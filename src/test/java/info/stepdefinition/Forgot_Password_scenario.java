package info.stepdefinition;



import java.awt.AWTException;
import java.io.IOException;

import info.base.Reusableclass;
import info.pojo.Forgot_Password_POJO;
import info.pojo.Purchase_order_POJO;
import info.pojo.UserCreation_POJO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Forgot_Password_scenario extends Reusableclass{
	public static Purchase_order_POJO w;
	public static UserCreation_POJO u;
	public static Forgot_Password_POJO f;
	@Given("User need to trigger the forgot password link")
	public void user_need_to_trigger_the_forgot_password_link() throws InterruptedException {
		f=new Forgot_Password_POJO();
		highLightElement(f.forgotpasswordlink);
		toClick(f.forgotpasswordlink);

	}


	@Given("User need to Reset the password by navigating to mailinator page")
	public void user_need_to_reset_the_password_by_navigating_to_mailinator_page() throws IOException, AWTException, InterruptedException {
		f=new Forgot_Password_POJO();
		w=new Purchase_order_POJO ();
		u=new UserCreation_POJO();


		highLightElement(f.Emailenterforgot);
		tofill(f.Emailenterforgot, "testautomation@mailinator.com");

		highLightElement(f.Sendresetlink);
		toClick(f.Sendresetlink);
		driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
		highLightElement(u.SearchMailinator);
		tofill(u.SearchMailinator, "testautomation");
		toenter();

		Explicitwaitvisibility(u.Displayemail);

		highLightElement(u.mailinatorvisiblemail);
		clickjavascript(u.mailinatorvisiblemail);
		Pageloadtimeout();
		Scrolldownjavascript();
		Pageloadtimeout();
		Scrolldownjavascript();
		driver.switchTo().frame(u.frames);
		highLightElement(u.mailinatorresetpass);
		toClick(u.mailinatorresetpass);
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		implicitwait();

		Thread.sleep(7000);
		highLightElement(u.Newpasswordreset);
		toClick(u.Newpasswordreset);
		u.Newpasswordreset.sendKeys("Iteration@9875");
		highLightElement(u.ReNewpasswordreset);
		toClick(u.ReNewpasswordreset);
		u.ReNewpasswordreset.sendKeys("Iteration@9875");
		highLightElement(u.savepasswordreset);
		toClick(u.savepasswordreset);
		Thread.sleep(1000);
		toenter();
	}





	@Then("User need to login using resetted password")
	public void user_need_to_login_using_resetted_password() throws InterruptedException {
		w = new Purchase_order_POJO();
		driver.navigate().to("https://staging.infotech-accounting.com/login");

		Thread.sleep(3000);
		highLightElement(w.username);
		toClick(w.username);
		tofill(w.username, "testautomation@mailinator.com");

		highLightElement(w.password);
		toClick(w.password);
		Thread.sleep(2000);
		tofill(w.password, "Iteration@9875");

		Thread.sleep(2000);
		highLightElement(w.submit);
		toClick(w.submit);
		Thread.sleep(3000);
		highLightElement(f.logoutbtn);
		toClick(f.logoutbtn);
	
	}

	@And("User need to login as existing user")
	public void user_need_to_login_as_existing_user() throws InterruptedException {
		w = new Purchase_order_POJO();
		Thread.sleep(3000);
		Explicitwaitvisibility(w.username);
		highLightElement(w.username);
		toClick(w.username);
		tofill(w.username, "azarudeenn@info-tech.co.in");

		highLightElement(w.password);
		toClick(w.password);
		Thread.sleep(2000);
		tofill(w.password, "Info@903");


		Thread.sleep(2000);
		highLightElement(w.submit);
		toClick(w.submit);
		Thread.sleep(3000);


	}
}
