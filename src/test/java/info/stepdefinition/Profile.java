package info.stepdefinition;

import java.awt.AWTException;

import info.base.Reusableclass;
import info.pojo.AccountLoginpojo;
import info.pojo.Profileupdatepojo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Profile extends Reusableclass{
	
	public static Profileupdatepojo p;
	public static AccountLoginpojo a;
	
	
	@Given("Give all information")
	public void give_all_information() throws InterruptedException, AWTException {

		p = new Profileupdatepojo();
		
		implicitwait();		
		tomovethecursor(p.profile);
		
		toClick(p.managemyacc);
		
		Thread.sleep(1000);
		actionssendkeysdelete(p.firstname);
		tofill(p.firstname, "Hyue");
		Thread.sleep(1000);
		actionssendkeysdelete(p.lastname);
		Thread.sleep(1000);
		tofill(p.lastname, "Hinch");
		actionssendkeysdelete(p.location);
		Thread.sleep(1000);
		tofill(p.location, "Chennai");
		
		actionssendkeysdelete(p.dob);
		Thread.sleep(1000);
		tofill(p.dob, "14/07/2022");
		
		implicitwait();
		actionssendkeysdelete(p.bio);
		Thread.sleep(1000);
		tofill(p.bio, "user account");
		totabkey();
		
		/*tomovethecursor(p.code);
		actionssendkeysdelete(p.code);
		Thread.sleep(1000);
		tofill(p.code, "+91");
		toenter();*/
		
		actionssendkeysdelete(p.mblno);
		tofill(p.mblno, "77878787821");
		
		actionssendkeysdelete(p.mailid);
		tofill(p.mailid, "accounting@the23app.com");
		
		tofill(p.website, "https://staging.infotech-accounting.com/");
		
		Thread.sleep(2000);

		Scrolldownjavascript();
		
		Thread.sleep(1000);
	}


	@And("save the information")
	public void save_the_information() throws InterruptedException {
		
		toClick(p.save);
		
		Thread.sleep(2000);
		
		Explicitwaitvisibility(p.chngpwd);
		toClick(p.chngpwd);
		
		tofill(p.crntpwd, "Iteration@2008");
		
		Thread.sleep(1000);
		
		tofill(p.Newpwd, "Iteration@2009");
		
		Thread.sleep(1000);
		
		tofill(p.cnfrmpwd, "Iteration@2009");
		
		toClick(p.savenewpwd);
		
		a = new AccountLoginpojo();
		Thread.sleep(3000);
		tomovethecursor(a.username);
		Thread.sleep(1000);
		toClick(a.username);
		Thread.sleep(1000);
		tofill(a.username, "accounting@the23app.com");
		Thread.sleep(1000);
		toClick(a.password);
		Thread.sleep(1000);
		tofill(a.password, "Iteration@2009");
		Thread.sleep(1000);
		toClick(a.submit);
		
		
		
	}

	

}
