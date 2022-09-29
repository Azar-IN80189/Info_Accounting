
package info.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"timeline:test-output-thread/","rerun:target/failedrun.txt"},
			features={"src/test/resources/Features/A_login.feature",
					"src/test/resources/Features/B_profile.feature",
					"src/test/resources/Features/C_details.feature",
					"src/test/resources/Features/D_Info_Accounting_TaxRate.feature",
					"src/test/resources/Features/E_Info_Accounting_Currencies.feature",
					"src/test/resources/Features/F_Info_Accounting_ForgotPassword.feature",
					"src/test/resources/Features/G_Info_Accounting_Inventory_Itemsection.feature",
					"src/test/resources/Features/H_Accounting_Inventory_Pricelist.feature"},
			glue= {"info.stepdefinition"},monochrome=true,dryRun=false)
			
public class RunnerClass {	  
		

	
	}
		
		
		
		