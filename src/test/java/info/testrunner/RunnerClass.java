		
package info.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			"timeline:test-output-thread/","rerun:target/failedrun.txt"},tags=("@Chartofaccount"),
			features={"src/test/resources/Features"},glue= {"info.stepdefinition"},monochrome=false,dryRun=false
			)
			
public class RunnerClass {	  
		
		
	
	}				





		


		
		