package info.stepdefinition;



import java.awt.AWTException;
import java.io.IOException;

import info.base.Reusableclass;
import info.pojo.Forgot_Password_POJO;
import info.pojo.Purchase_order_POJO;
import info.pojo.UserCreation_POJO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Forgot_Password extends Reusableclass{
	public static Purchase_order_POJO w;
	public static UserCreation_POJO u;
	public static Forgot_Password_POJO f;
	@Given("User need to trigger the forgot password link")
	public void user_need_to_trigger_the_forgot_password_link() {
		f=new Forgot_Password_POJO();
		toClick(f.forgotpasswordlink);

	}


	@Given("User need to Reset the password")
	public void user_need_to_reset_the_password() throws IOException, AWTException, InterruptedException {
		f=new Forgot_Password_POJO();
		w=new Purchase_order_POJO ();
		u=new UserCreation_POJO();



		tofill(f.Emailenterforgot, "testautomation@mailinator.com");
		toClick(f.Sendresetlink);
		driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp");
		tofill(u.SearchMailinator, "testautomation");
		toenter();

		Explicitwaitvisibility(u.Displayemail);


		clickjavascript(u.mailinatorvisiblemail);
		Pageloadtimeout();
		Scrolldownjavascript();
		Pageloadtimeout();
		Scrolldownjavascript();
		driver.switchTo().frame(u.frames);
		toClick(u.mailinatorresetpass);
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		implicitwait();

		Thread.sleep(7000);
		toClick(u.Newpasswordreset);
		u.Newpasswordreset.sendKeys("Iteration@563222");
		toClick(u.ReNewpasswordreset);
		u.ReNewpasswordreset.sendKeys("Iteration@563222");
		toClick(u.savepasswordreset);
		Thread.sleep(1000);
		toenter();
	}





	@Then("User need to login using resetted password")
	public void user_need_to_login_using_resetted_password() throws InterruptedException {
		w = new Purchase_order_POJO();
		driver.navigate().to("https://staging.infotech-accounting.com/login");

		Thread.sleep(3000);
		toClick(w.username);
		tofill(w.username, "testautomation@mailinator.com");
		toClick(w.password);
		Thread.sleep(2000);
		tofill(w.password, "Iteration@563222");
		Thread.sleep(2000);
		toClick(w.submit);
		Thread.sleep(3000);
		toClick(f.logoutbtn);
		Thread.sleep(3000);
		Explicitwaitvisibility(w.username);
		toClick(w.username);
		tofill(w.username, "accounting@the23app.com");
		toClick(w.password);
		Thread.sleep(2000);
		tofill(w.password, "Iteration@2009");
		Thread.sleep(2000);
		toClick(w.submit);
		Thread.sleep(3000);

	}

}
