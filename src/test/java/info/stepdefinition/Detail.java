package info.stepdefinition;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import info.base.Reusableclass;
import info.pojo.AccountLoginpojo;
import info.pojo.organizationpojo;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Details extends Reusableclass {
	
	public static AccountLoginpojo a;
	public static organizationpojo o;
	
	@Before("@Login")
	public void setup() throws AWTException, InterruptedException {
		a = new AccountLoginpojo();
		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		
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
	
	@Given("Give all details in organization details screen")
	public void give_all_details_in_organization_details_screen() throws InterruptedException, AWTException {
		
		o = new organizationpojo();
		
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(o.organaization).perform();
		Thread.sleep(1000);
		
		toClick(o.organaization);
		Thread.sleep(1000);
		toClick(o.details);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		a.moveToElement(o.displayname).perform();
		actionssendkeysdelete(o.displayname);
		tofill(o.displayname, "Staging organaization");
		totabkey();
		
		actionssendkeysdelete(o.legalname);
		tofill(o.legalname,"Info-Tech Systems Integrations Pte Ltd");
		totabkey();
		
		tomovethecursor(o.regno);
		actionssendkeysdelete(o.regno);
		tofill(o.regno, "Org-154411");
		totabkey();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		tomovethecursor(o.organaizationtype);
		Thread.sleep(1000);
		tofill(o.organaizationtype, "Person");
		toenter();
		totabkey();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		toClick(o.lineofbusiness);
		Thread.sleep(1000);
		tofill(o.lineinput, "Retail Sales");
		toenter();
		
		implicitwait();
		actionssendkeysdelete(o.attention);
		Thread.sleep(1000);
		tofill(o.attention, "The Attention");
		
		totabkey();
		actionssendkeysdelete(o.postaladd);
		Thread.sleep(1000);
		tofill(o.postaladd, "Ratha tek towers , Block c");

		totabkey();
		actionssendkeysdelete(o.city);
		Thread.sleep(1000);
		tofill(o.city, "Chennai");
		
		totabkey();
		actionssendkeysdelete(o.state);
		Thread.sleep(1000);
		tofill(o.state, "Tamilnadu");
		
		totabkey();
		actionssendkeysdelete(o.zipcode);
		Thread.sleep(1000);
		tofill(o.zipcode, "626100");
		
		totabkey();
		actionssendkeysdelete(o.country);
		Thread.sleep(1000);
		tofill(o.country, "India");
		toenter();	
		
		Thread.sleep(2000);
		
		tomovethecursor(o.Physicaladdress);
		Thread.sleep(1000);
		toClick(o.Physicaladdress);
		
		actionssendkeysdelete(o.telephone1);
		Thread.sleep(1000);
		tofill(o.telephone1, "+91");
		toenter();
		
		actionssendkeysdelete(o.telephone2);
		Thread.sleep(1000);
		tofill(o.telephone2, "+91");
		toenter();
		
		actionssendkeysdelete(o.mblphone);
		Thread.sleep(1000);
		tofill(o.mblphone, "+91");
		toenter();
		
		actionssendkeysdelete(o.DDIno);
		Thread.sleep(1000);
		tofill(o.DDIno, "1224");
		
		actionssendkeysdelete(o.website);
		Thread.sleep(1000);
		tofill(o.website, "www.info-tech.com.sg");
		
		actionssendkeysdelete(o.fbid);
		Thread.sleep(1000);
		tofill(o.fbid, "www.facebook.com");
		
		actionssendkeysdelete(o.emailid);
		Thread.sleep(1000);
		tofill(o.emailid, "test@test.com");
		
		actionssendkeysdelete(o.watsapp);
		Thread.sleep(1000);
		tofill(o.watsapp, "+91");
		toenter();
		
		actionssendkeysdelete(o.skype);
		Thread.sleep(1000);
		tofill(o.skype, "www.MIIndia.com/m");
		
		actionssendkeysdelete(o.twitter);
		Thread.sleep(1000);
tofill(o.twitter, "www.twiiter.com");
		
		Thread.sleep(1000);
		
	}

	@When("Save all information or cancel it")
	public void save_all_information_or_cancel_it() {
		
		ScrolldownElement(o.save);
		clickjavascript(o.save);
		
		
	}


}
