package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.Account_Login_POJO;
import info.pojo.Profileupdatepojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Profile extends Reusableclass {

	public static Profileupdatepojo p;
	public static Account_Login_POJO a;

	@Given("User needs to give all the information like - Basic Information, Contact Details , Preferences..Etc")
	public void user_needs_to_give_all_the_information_like_basic_information_contact_details_preferences_etc()  throws InterruptedException, AWTException {

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
		tofill(p.dob, "17/11/2000");

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

	@And("User needs to update\\/save basic information")
	public void user_needs_to_update_save_basic_information() throws InterruptedException {

		p = new Profileupdatepojo();

		toClick(p.save);

		System.out.println("Profile information is saved");

		Thread.sleep(2000);

	}


	@Given("User need to give credentials to change the password - current password, new password and confirm password..Etc")
	public void user_need_to_give_credentials_to_change_the_password_current_password_new_password_and_confirm_password_etc() throws InterruptedException {

		p = new Profileupdatepojo();

		Explicitwaitvisibility(p.chngpwd);
		ScrolldownElement(p.chngpwd);
		toClick(p.chngpwd);

		highLightElement(p.crntpwd);
		tofill(p.crntpwd, "Info@923");

		Thread.sleep(1000);

		highLightElement(p.Newpwd);
		tofill(p.Newpwd, "Info@924");

		Thread.sleep(1000);

		highLightElement(p.cnfrmpwd);
		tofill(p.cnfrmpwd, "Info@924");

	}

	@And("User need to save the newly changed password and login with new password with the same user")
	public void user_need_to_save_the_newly_changed_password_and_login_with_new_password_with_the_same_user()throws InterruptedException {

		p = new Profileupdatepojo();

		highLightElement(p.savenewpwd);
		toClick(p.savenewpwd);

		a = new Account_Login_POJO();
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
		tofill(a.password, "Info@924");
		Thread.sleep(1000);
		highLightElement(a.submit);
		toClick(a.submit);

		System.out.println("Login with new password");

	}

}