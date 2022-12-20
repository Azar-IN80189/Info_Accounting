package info.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import info.base.Reusableclass;
import info.pojo.AccountLoginpojo;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Supportlogin extends Reusableclass  {

	public static AccountLoginpojo a;

	@Given("User need to enter Username and password and logged in as Support User")
	public void user_need_to_enter_username_and_password_and_logged_in_as_support_user() throws InterruptedException {
		a = new AccountLoginpojo();
		browserLaunch();
		launchUrl("https://staging.infotech-accounting.com/login");
		toMaximize();
		a = new AccountLoginpojo();
		 toClick(a.username);
		 tofill(a.username, "pachiyappanr@info-tech.co.in");
		 toClick(a.password);
		 tofill(a.password, "Test@12102022"); 
		 toClick(a.submit);
		 
		 
		String title = "https://staging.infotech-accounting.com/dashboard";
		Thread.sleep(3000);
		if (title.equals(driver.getCurrentUrl())) {
			
			Thread.sleep(2000);

			System.out.println(title);
			System.out.println("Normal user is logged in");

		} else {

			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
			System.out.println("Popup Section Entered");
			WebElement User = driver.findElement(By.xpath("//body/app-dashboard[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/select[1]"));
			Select dduser = new Select(User);
			dduser.selectByIndex(1);

			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			System.out.println("Support User Logged In Successfully");
	}
	}
		@And("User need to check whether it is logged in as support user")
		public void user_need_to_check_whether_it_is_logged_in_as_support_user() throws Exception {

		a = new AccountLoginpojo();
		getScreenshot(driver, "Login as support user");

		System.out.println("The user is in support login");
		Explicitwaitvisibility(a.headerlogout);
		tomovethecursor(a.headerlogout);
		Thread.sleep(3000);
		toClick(a.headerlogout);
		System.out.println("logged out ");

	}
		@AfterStep
		public void takeScreenShotOnFailedScenario(Scenario scenario) {

			System.out.println("Taking screenshot from Cucumber After hook with order=2 if the scenario fails");
			if ((scenario.isFailed())) {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", scenario.getName());
			}
		}

			}


