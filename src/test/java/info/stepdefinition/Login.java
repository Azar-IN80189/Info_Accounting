package info.stepdefinition;

import org.openqa.selenium.WebDriver;

import info.base.Reusableclass;
import info.pojo.Account_Login_POJO;
import io.cucumber.java.en.Given;

public class Login extends Reusableclass {

	public static WebDriver driver;
	public static Account_Login_POJO a;
	
	@Given("User need to enter Username and password and logged in as Normal User")
	public void user_need_to_enter_username_and_password_and_logged_in_as_normal_user() throws InterruptedException {
		a = new Account_Login_POJO();
	System.out.println("Entering Username and Password");
	Thread.sleep(3000);
	highLightElement(a.username);
	toClick(a.username);
	actionssendkeysdelete(a.username);	
	tofill(a.username, "azarudeenn@info-tech.co.in");

	highLightElement(a.password);
	toClick(a.password);
	actionssendkeysdelete(a.password);
	tofill(a.password, "Info@923");

	}


	@Given("User need to check whether it is logged in as Normal user")
	public void user_need_to_check_whether_it_is_logged_in_as_normal_user() {

		a = new Account_Login_POJO();
		System.out.println("Logged in as normal user");
		highLightElement(a.submit);
		toClick(a.submit);
	}
/*	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		  scenario.attach(fileContent, "image/png", "/Info_Accouting_Flow/Screenshots");
		
	} */
	/*@AfterStep
	public void addScreenshot(Scenario scenario){

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}*/
		
	

}
