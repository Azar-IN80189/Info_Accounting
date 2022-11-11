package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.AccountLoginpojo;
import info.pojo.Profileupdatepojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Profile extends Reusableclass {

	public static Profileupdatepojo p;
	public static AccountLoginpojo a;

	@Given("Give all information")
	public void give_all_information() throws InterruptedException, AWTException {

		p = new Profileupdatepojo();

		implicitwait();
		tomovethecursor(p.profile);

		highLightElement(p.managemyacc);
		toClick(p.managemyacc);

		Thread.sleep(1000);
		actionssendkeysdelete(p.firstname);
		highLightElement(p.firstname);
		Toclear(p.firstname);
		tofill(p.firstname, "Accountsoft");

		Thread.sleep(1000);
		actionssendkeysdelete(p.lastname);
		Thread.sleep(1000);
		highLightElement(p.lastname);
		Toclear(p.lastname);
		tofill(p.lastname, "ware");

		actionssendkeysdelete(p.location);
		Thread.sleep(1000);
		highLightElement(p.location);
		Toclear(p.location);
		tofill(p.location, "Chennai");

		p.dob.clear();
		Thread.sleep(1000);
		highLightElement(p.dob);
		Toclear(p.dob);
		tofill(p.dob, "03/11/2022");

		implicitwait();
		actionssendkeysdelete(p.bio);
		Thread.sleep(1000);
		highLightElement(p.bio);
		Toclear(p.bio);
		tofill(p.bio, "user account");

		totabkey();

		/*
		 * Explicitwaitvisibility(p.code); tomovethecursor(p.code);
		 * clickjavascript(p.code); Toclear(p.code); Thread.sleep(1000); tofill(p.code,
		 * "+91"); toenter();
		 */

		actionssendkeysdelete(p.mblno);
		highLightElement(p.mblno);
		Toclear(p.mblno);
		tofill(p.mblno, "9984433222");

		actionssendkeysdelete(p.mailid);
		highLightElement(p.mailid);
		Toclear(p.mailid);
		tofill(p.mailid, "azarudeenn@info-tech.co.in");

		highLightElement(p.website);
		Toclear(p.website);
		tofill(p.website, "https://staging.infotech-accounting.com/");

		Thread.sleep(2000);

		Scrolldownjavascript();

		Thread.sleep(1000);
	}

	@And("save the information")
	public void save_the_information() throws InterruptedException {

		p = new Profileupdatepojo();

		toClick(p.save);

		System.out.println("Profile information is saved");

		Thread.sleep(2000);

	}

	@Given("Give current new and confirm password")
	public void give_current_new_and_confirm_password() throws InterruptedException {

		p = new Profileupdatepojo();

		Explicitwaitvisibility(p.chngpwd);
		ScrolldownElement(p.chngpwd);
		toClick(p.chngpwd);

		highLightElement(p.crntpwd);
		tofill(p.crntpwd, "Info@903");

		Thread.sleep(1000);

		highLightElement(p.Newpwd);
		tofill(p.Newpwd, "Info@904");

		Thread.sleep(1000);

		highLightElement(p.cnfrmpwd);
		tofill(p.cnfrmpwd, "Info@904");

	}

	@When("save new password and login using new password")
	public void save_new_password_and_login_using_new_password() throws InterruptedException {
		
		p = new Profileupdatepojo();

		highLightElement(p.savenewpwd);
		toClick(p.savenewpwd);

		a = new AccountLoginpojo();
		Thread.sleep(3000);
		tomovethecursor(a.username);
		Thread.sleep(1000);
		toClick(a.username);
		Thread.sleep(1000);
		highLightElement(a.username);
		tofill(a.username, "azarudeenn@info-tech.co.in");

		Thread.sleep(1000);
		toClick(a.password);
		Thread.sleep(1000);
		highLightElement(a.password);
		tofill(a.password, "Info@904");
		Thread.sleep(1000);
		highLightElement(a.submit);
		toClick(a.submit);

		System.out.println("Logged in with new password");

	}

}
