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

public class Detail extends Reusableclass {

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
		tofill(a.username, "azarudeenn@info-tech.co.in");
		Thread.sleep(1000);
		toClick(a.password);
		Thread.sleep(1000);
		tofill(a.password, "Info@904");
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

		highLightElement(o.organaization);
		toClick(o.organaization);
		Thread.sleep(1000);
		highLightElement(o.details);
		toClick(o.details);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		a.moveToElement(o.displayname).perform();
		actionssendkeysdelete(o.displayname);
		highLightElement(o.displayname);
		Toclear(o.displayname);
		tofill(o.displayname, "Staging organaization");

		totabkey();

		actionssendkeysdelete(o.legalname);
		highLightElement(o.legalname);
		Toclear(o.legalname);
		tofill(o.legalname,"Info-Tech Systems Integrations Pte Ltd");

		totabkey();

		tomovethecursor(o.regno);
		actionssendkeysdelete(o.regno);
		highLightElement(o.regno);
		Toclear(o.regno);
		tofill(o.regno, "Org-154411");
		totabkey();

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		tomovethecursor(o.organaizationtype);
		Thread.sleep(1000);
		highLightElement(o.organaizationtype);
		Toclear(o.organaizationtype);
		tofill(o.organaizationtype, "Person");

		toenter();
		totabkey();

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		toClick(o.lineofbusiness);
		Thread.sleep(1000);
		highLightElement(o.lineinput);
		Toclear(o.lineinput);
		tofill(o.lineinput, "Retail Sales");
		toenter();
		
		/*if (o.logoxmarkbtn.isDisplayed()) {
			Explicitwaitvisibility(o.logoxmarkbtn);
			clickjavascript(o.logoxmarkbtn);

			WebElement upload_file = driver.findElement(By.xpath("//input[@id='logoName']"));

			upload_file.sendKeys("\"C:\\Users\\Azarudeen\\Pictures\\true.png\"");
		} else {
			System.out.println("Logo Not present");
		}
*/

		implicitwait();
		actionssendkeysdelete(o.attention);
		Thread.sleep(1000);
		highLightElement(o.attention);
		Toclear(o.attention);
		tofill(o.attention, "The Attention");


		totabkey();
		actionssendkeysdelete(o.postaladd);
		Thread.sleep(1000);
		highLightElement(o.postaladd);
		Toclear(o.postaladd);
		tofill(o.postaladd, "Ratha tek towers , Block c");


		totabkey();
		actionssendkeysdelete(o.city);
		Thread.sleep(1000);
		highLightElement(o.city);
		Toclear(o.city);
		tofill(o.city, "Chennai");


		totabkey();
		actionssendkeysdelete(o.state);
		Thread.sleep(1000);
		highLightElement(o.state);
		Toclear(o.state);
		tofill(o.state, "Tamilnadu");


		totabkey();
		actionssendkeysdelete(o.zipcode);
		Thread.sleep(1000);
		highLightElement(o.zipcode);
		Toclear(o.zipcode);
		tofill(o.zipcode, "626100");


		totabkey();
		actionssendkeysdelete(o.country);
		Thread.sleep(1000);
		highLightElement(o.country);
		Toclear(o.country);
		tofill(o.country, "India");

		toenter();	

		Thread.sleep(2000);

		tomovethecursor(o.Physicaladdress);
		Thread.sleep(1000);
		highLightElement(o.Physicaladdress);
		Selectcheckbox(o.Physicaladdress);

		actionssendkeysdelete(o.telephone1);
		Thread.sleep(1000);
		ScrolldownElement(o.telephone1);
		tofill(o.telephone1, "+91");
		toenter();
		Thread.sleep(1000);
		Toclear(o.Telph1);
		tofill(o.Telph1, "7788888477");
		Thread.sleep(1000);
		actionssendkeysdelete(o.telephone2);
		Thread.sleep(1000);
		tofill(o.telephone2, "+91");
		toenter();
		Thread.sleep(1000);
		Toclear(o.Telph2);
		tofill(o.Telph2, "7788888478");
		Thread.sleep(1000);
		actionssendkeysdelete(o.mblphone);
		Thread.sleep(1000);
		tofill(o.mblphone, "+91");
		toenter();
		Thread.sleep(1000);
		Toclear(o.Mobileno);
		tofill(o.Mobileno, "7788888479");
		Thread.sleep(1000);
		actionssendkeysdelete(o.DDIno);
		Thread.sleep(1000);
		highLightElement(o.DDIno);
		tofill(o.DDIno, "1224");
		Thread.sleep(1000);

		actionssendkeysdelete(o.website);
		Thread.sleep(1000);
		highLightElement(o.website);
		tofill(o.website, "www.info-tech.com.sg");
		Thread.sleep(1000);

		actionssendkeysdelete(o.fbid);
		Thread.sleep(1000);
		highLightElement(o.fbid);
		tofill(o.fbid, "www.facebook.com");
		Thread.sleep(1000);

		actionssendkeysdelete(o.emailid);
		Thread.sleep(1000);
		highLightElement(o.emailid);
		tofill(o.emailid, "test@test.com");


		actionssendkeysdelete(o.watsapp);
		Thread.sleep(1000);
		tofill(o.watsapp, "+91");
		toenter();
		Thread.sleep(1000);
		Toclear(o.whatsAppNo);
		tofill(o.whatsAppNo, "8877747889");
		Thread.sleep(1000);
		actionssendkeysdelete(o.skype);
		Thread.sleep(1000);
		highLightElement(o.skype);
		tofill(o.skype, "www.MIIndia.com/m");


		actionssendkeysdelete(o.twitter);
		Thread.sleep(1000);
		highLightElement(o.twitter);
		tofill(o.twitter, "www.twitter.com");


		Thread.sleep(1000);

	}

	@When("Save all information or cancel it")
	public void save_all_information_or_cancel_it() throws InterruptedException {

		ScrolldownElement(o.save);
		highLightElement(o.save);
		clickjavascript(o.save);


	}


}
