package info.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import info.base.Base;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks extends BasePage {
	Base base;
	//Base64
	public Hooks(Base base)
	{
		this.base = base;
	}
		public String getScreenshotPath(byte[] screenshotBytes)
		{
			String screenShotPath = "data:image/png;base64,"+Base64.getEncoder().encodeToString(screenshotBytes);
			return screenShotPath;
		}
		
		public byte[] getByteScreenshot()
		{
		    return ((TakesScreenshot) base.getDriver()).getScreenshotAs(OutputType.BYTES);
		}
	
		public static String getBase64Screenshot() throws IOException {
			String Base64StringOfScreenshot = "";
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
		Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
			String sDate = sdf.format(date);
			FileUtils.copyFile(src, new File(getBase64Screenshot() + "image_" + sDate + ".png"));
	
		byte[] fileContent = FileUtils.readFileToByteArray(src);
			Base64StringOfScreenshot = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
		return Base64StringOfScreenshot;
	}
		@AfterStep
		public void addScreenshot(Scenario scenario) throws IOException {
			  File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
			  scenario.attach(fileContent, "image/png", "target/");
			
		}
	
}	


