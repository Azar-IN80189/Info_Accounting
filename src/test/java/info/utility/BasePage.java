package info.utility;

import org.openqa.selenium.WebDriver;

import io.cucumber.core.cli.Main;
public class BasePage {
	public static WebDriver driver;
	public static void main(String args[]) throws Throwable {
	    try {
	        Main.main(new String[] { 
	    

	        "-g","com.sadakar.common",
	        "-g","com.sadakar.stepdefinitions",
	        "-g","com.sadakar.testng.runner",
	                    
	        "classpath:features", 
	        
	        "-t","@SmokeTest",
	        
	                
	        "-p", "pretty", 
	        "-p", "json:target/cucumber-reports/cucumber.json", 
	        "-p", "html:target/cucumber-reports/cucumberreport.html",
	        "-p","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	        
	        "-m"
	    }
	    );
	} catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("Main method exception : " + e);
	}
	}

}
