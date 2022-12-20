package info.stepdefinition;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;

import info.base.Reusableclass;
import info.pojo.Account_Login_POJO;
import info.pojo.organizationpojo;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Detail extends Reusableclass {

	public static Account_Login_POJO a;
	public static organizationpojo o;

	@Before("@LoginCredentials")
	public void setup() throws AWTException, InterruptedException {
		a = new Account_Login_POJO();
		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();

		a = new Account_Login_POJO();
	Thread.sleep(3000);
		tomovethecursor(a.username);
		Thread.sleep(1000);
		toClick(a.username);
		Thread.sleep(1000);
		tofill(a.username, "azarudeenn@info-tech.co.in");
		Thread.sleep(1000);
		toClick(a.password);
		Thread.sleep(1000);
		tofill(a.password, "Info@923");
		Thread.sleep(1000);
		toClick(a.submit);

	}

	@Given("User needs to navigate organization details screen")
	public void user_needs_to_navigate_organization_details_screen() throws InterruptedException, AWTException {

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
	}

	@And("User needs to give Basic information in Organaization details - DisplayName, OrganizationType , LegalName , Line of Business..Etc")
	public void user_needs_to_give_basic_information_in_organaization_details_display_name_organization_type_legal_name_line_of_business_etc() throws AWTException, InterruptedException {

		o = new organizationpojo();
		Actions a = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		a.moveToElement(o.displayname).perform();
		actionssendkeysdelete(o.displayname);
		highLightElement(o.displayname);
		Toclear(o.displayname);
		tofill(o.displayname, "Automation Testing Database");

		totabkey();

		actionssendkeysdelete(o.legalname);
		highLightElement(o.legalname);
		Toclear(o.legalname);
		tofill(o.legalname, "Info-Tech Systems Integrations Pte Ltd");

		totabkey();

		tomovethecursor(o.regno);
		actionssendkeysdelete(o.regno);
		highLightElement(o.regno);
		Toclear(o.regno);
		tofill(o.regno, "Org-154422");
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

		/*
		 * if (o.logoxmarkbtn.isDisplayed()) { Explicitwaitvisibility(o.logoxmarkbtn);
		 * clickjavascript(o.logoxmarkbtn);
		 * 
		 * WebElement upload_file =
		 * driver.findElement(By.xpath("//input[@id='logoName']"));
		 * 
		 * upload_file.sendKeys("\"C:\\Users\\Azarudeen\\Pictures\\true.png\""); } else
		 * { System.out.println("Logo Not present"); }
		 */
	}

	@And("User needs to give Address details in organization details - Postal , city ,state , zipcode..Etc")
	public void user_needs_to_give_address_details_in_organization_details_postal_city_state_zipcode_etc() throws InterruptedException, AWTException {

		o = new organizationpojo();
		
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

	@And("User needs to Save recorded information in Details page")
	public void user_needs_to_save_recorded_information_in_details_page() throws InterruptedException {

		o = new organizationpojo();
		ScrolldownElement(o.save);
		highLightElement(o.save);
		clickjavascript(o.save);

	}

}
