package info.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import info.base.Base;

public class GenericFunctions extends Base {
	static WebDriver driver;
	Base b = new Base();

	public static String getBase64Screenshot() throws IOException {
		String Base64StringOfScreenshot = "";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
		String sDate = sdf.format(date);
		FileUtils.copyFile(src, new File("screenshotdir" + "image_" + sDate + ".png"));

		byte[] fileContent = FileUtils.readFileToByteArray(src);
		Base64StringOfScreenshot = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
		return Base64StringOfScreenshot;
	}
	public static byte[] getBytescreenshot(WebDriver driver) throws IOException {

	File src = ((TakesScreenshot) driver) .getScreenshotAs (OutputType.FILE);
	byte[] fileContent = FileUtils.readFileToByteArray(src);
	return fileContent;
	}
}
