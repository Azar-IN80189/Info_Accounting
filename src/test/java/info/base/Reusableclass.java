package info.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;//Used For Fluent Wait
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paulhammant.ngwebdriver.NgWebDriver;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Reusableclass 
{


	public static WebDriver driver;
	public static NgWebDriver ngWebDriver;
	public static JavascriptExecutor JsDriver;
	public Wait<WebDriver> iWait; //Used for fluent Wait
	public static Actions ac;
	public static Action as;
	public static Robot r;
	public static Alert a;
	public static JavascriptExecutor js;
	public static Select s;
	public static Sheet sheet;
	public static Scenario scenario;
	private WebDriverWait wait;


	//1.Browser launch 

	public static Scenario getScenario() {
		return scenario;
	}

	public static void setScenario(Scenario scenario) {
		Reusableclass.scenario = scenario;
	}

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();	
		driver = new ChromeDriver();
		
		
		/*ChromeOptions options = new ChromeOptions();                        
		 options.addArguments("--headless");
		 options.addArguments("--disable-gpu");
		 options.addArguments("--window-size=1280,800");
		 options.addArguments("--allow-insecure-localhost");
		driver = new ChromeDriver(options);*/
	
		JsDriver = (JavascriptExecutor) driver;
		ngWebDriver= new NgWebDriver(JsDriver);
	}

	//2.Get url method

	public static void launchUrl(String url) {

		driver.get(url);

	}

	//	3.Maximize the window

	public static void toMaximize() {

		driver.manage().window().maximize();

	}

	//4.Delete Cookies

	public void deletecookies() {

		driver.manage().deleteAllCookies();

	}

	//5. Get page Title
	public static String pageTitle() {

		String title = driver.getTitle();
		return title;

	}

	//6.Get page URL

	public static String pageUrl() {

		String url = driver.getCurrentUrl();
		return url;

	}

	//7.passing text to particular field

	public static void tofill(WebElement element, String value) {

		element.sendKeys(value);
	}

	//8.click login or submit buttons

	public static void toClick(WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement welement = wait.until(ExpectedConditions.elementToBeClickable(element));
		welement.click();//old
	}

	//	9.close the browser

	public static void closetab() {

		driver.close();

	}
	//10.quit the browser

	public static void closebrowser() {

		driver.quit();

	}

	//11.isenabled

	public static void tocheckenable(WebElement element) {

		boolean enabled = element.isEnabled();

	}

	//12. tocheckdisplay

	public static void tocheckdisplay(WebElement element) {

		boolean displayed = element.isDisplayed();

		if(displayed)

		{
			System.out.println("Element is visible"+displayed);
		}

		else

		{
			System.out.println("Element is Not visible"+displayed);
		}




	}

	//13. tocheckselected

	public static void tocheckselected(WebElement element) {

		boolean selected = element.isSelected();

	}

	//14.tonavigateurl

	public static void tonavigateurl(String value) {

		driver.navigate().to(value);

	}

	//15 . toforward

	public static void toforward() {

		driver.navigate().forward();

	}

	//16.toback

	public static void toback() {

		driver.navigate().back();

	}

	//17.torefresh

	public static void torefresh() {

		driver.navigate().refresh();

	}

	//18. get the particular text

	public static String togettext(WebElement element) {

		String txt = element.getText();
		return txt;

	}

	//19. get the attribute value

	public static String toGetAttributevalue(WebElement element) {

		String attribute = element.getAttribute("value");
		return attribute;

	}

	//20. move the cursor one element to another

	public static void tomovethecursor(WebElement element) {

		ac = new Actions(driver);
		ac.moveToElement(element).perform();

	}

	//21. drag one field to another field

	public static void todraganddrop(WebElement source, WebElement target) {

		ac = new Actions(driver);
		ac.dragAndDrop(source, target).perform();

	}

	//22. double click the element

	public static void todoubleclick(WebElement element) {

		ac = new Actions(driver);
		ac.doubleClick(element).perform();

	}

	//23. Right click the element

	public static void tocontextclick(WebElement element) {

		ac = new Actions(driver);
		ac.contextClick(element).perform();

	}

	//24. release the key

	public static void tokeyup(WebElement element, CharSequence value) {

		ac = new Actions(driver);
		ac.keyUp(element, value);

	}

	//25.press the key

	public static void tokeydown(WebElement element, String value) {

		ac = new Actions(driver);
		ac.keyDown(element, value);

	}

	//	26. shiftkey function 

	public static void toshiftkey() throws AWTException {

		r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);

	}

	//27. tabkey function

	public static void totabkey() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	//28. ctrl+a function

	public static void toselectall() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}
	

	//. Delete function

	public static void Delete() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);

	}
	
	
	
	
	
	
	
	

	//29. ctrl+x function

	public static void tocut() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	//30. ctrl+c function

	public static void tocopy() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	//31. ctrl+z function

	public static void toundo() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_Z);
		r.keyRelease(KeyEvent.VK_Z);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	//32. ctrl+y function

	public static void toredo() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	//33.ctrl+v function

	public static void topaste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	//34. down arrow option

	public static void todown() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
	//35. topressup

	private void topressup() throws AWTException {
		r=new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_UP);

	}

	//36. enter option

	public static void toenter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	//37. selcet all option

	public static void topressA() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);

	}

	//38. cut option

	public static void topressX() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);

	}

	//39. copy option

	public static void topressC() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);

	}

	//40.paste option

	public static void topressV() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);

	}

	//41. undo option

	public static void topressZ() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_Z);
		r.keyRelease(KeyEvent.VK_Z);

	}
	//42.redo option

	public static void topressY() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_Y);

	}
	//43.toAcceptAlert

	public static void toAcceptAlert() {

		a = driver.switchTo().alert();
		a.accept();

	}

	//44. toDismissAlert

	public static void toDismissAlert() {

		a = driver.switchTo().alert();
		a.dismiss();

	}

	//45.tosendkeysalert

	private void tosendkeysalert(String value) {

		a = driver.switchTo().alert();
		a.sendKeys(value);

	}




	//46. take screen shot option

	public void tosnap(String name) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File temp = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\eclipse-workspace\\BrowserLaunch\\src\\test\\resources\\Screenshots"
				+ name + ".png");
		FileUtils.copyFile(temp, dest);

	}

	//47. passvalue in field using javascript

	public static void insertValue(WebElement element, String value) {

		js = (JavascriptExecutor) driver;
		js.executeScript(value, element);

	}

	//48. click the button using javascript

	public static void clickjavascript(WebElement element) 
	{

		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);


	}

	//49. get value using javascript

	public static String getValue(WebElement element) {

		js = (JavascriptExecutor) driver;
		Object txt = js.executeScript("return arguments[0].getAttributes('value')", element);
		String s = (String) txt;
		return s;

	}

	//50. scroll the page 

	public static void toscrollup(String value, WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript(value, element);

	}

	//51. scroll the page 

	public static void toscrolldown(String value, WebElement element) {

		js = (JavascriptExecutor) driver;
		js.executeScript(value, element);

	}

	//52. select the element by index

	public static void toselectbyindex(WebElement element, int i) {

		s = new Select(element);
		s.selectByIndex(i);

	}

	//53. select the element by its value

	public static void toselectbyvalue(WebElement element, String value) {

		s = new Select(element);
		s.selectByValue(value);

	}

	//54. select the element using text

	public static void toselectbyvisibletext(WebElement element, String text) {

		s = new Select(element);
		s.selectByVisibleText(text);

	}

	//55. select multiple element

	public static boolean selectismultiple(WebElement element) {

		s = new Select(element);
		boolean m = s.isMultiple();
		return m;

	}

	//56. deselect all element

	public static void todeselectAll(WebElement element) {

		s = new Select(element);
		s.deselectAll();

	}

	//57.deselect the element by its index

	public static void todeselectbyindex(WebElement element, int i) {

		s = new Select(element);
		s.deselectByIndex(i);

	}

	//58. deselect the element by its value

	public static void todeselectbyvalue(WebElement element, int i, String value) {

		s = new Select(element);
		s.deselectByValue(value);

	}

	//59. delselect the element by its visible text

	public static void todeselectbyvisibletext(WebElement element, String text) {

		s = new Select(element);
		s.deselectByVisibleText(text);

	}

	//60. select all element by using list

	public static void toselectAll(WebElement element) {

		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			s.deselectByIndex(i);

		}
	}

	//61. to get options by using list

	public static void togetoptions(WebElement element) {

		s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			String text = option.getText();
			System.out.println(text);
		}

	}

	//62. select all sected option using list

	public static void togetallselectedoptions(WebElement element) {

		s = new Select(element);
		List<WebElement> options = s.getAllSelectedOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement option = options.get(i);
			String text = option.getText();
			System.out.println(text);
		}

	}

	//63. select first option

	public static void togetfirstselectedoptions(WebElement element) {

		s = new Select(element);
		s.getFirstSelectedOption();

	}

	//64. to get window handle

	public static void tohandlewindow() {

		String Parid = driver.getWindowHandle();
		System.out.println(Parid);

	}

	//65.to get window handles

	public static void tohandlewindows() {

		Set<String> allwinid = driver.getWindowHandles();
		for (String allid : allwinid) {
			driver.switchTo().window(allid);
			System.out.println(allid);
		}

	}

	// 66. to window handles

	public static void towindowhandles(Object parId) {

		Set<String> allwinid = driver.getWindowHandles();
		for (String allid : allwinid) {
			if(!parId.equals(allid)) {
				driver.switchTo().window(allid);
			}

		}

	}


	// 67. tomultiplewindow

	private void tomultiplewindows(int value) {

		Set<String> Setofid = driver.getWindowHandles();
		List<String> li =new LinkedList();
		li.addAll(Setofid);
		driver.switchTo().window(li.get(value));

	}


	//68.wait method

	public static void implicitwait() {

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}


	//69. Scrolldownjavascript

	public static void Scrolldownjavascript() {

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");

	}



	//70. create the value in excel sheet

	public static void createExcel(int Rownum, int Cellnum, String passvalue, String Filename, String sheetname) throws IOException {

		// create sheet

		File f = new File(Filename);

		Workbook wb = new XSSFWorkbook();

		Sheet newsheet = wb.createSheet(sheetname);

		Row newrow = newsheet.createRow(Rownum);

		Cell newcell = newrow.createCell(Cellnum);

		newcell.setCellValue(passvalue);

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

		System.out.println("writed");
	}





	// 71.Create new cell in excel sheet

	public static void createCell(int Rownum, int Cellnum, String passvalue, String sheetname, String filename)
			throws IOException {

		File f = new File(filename);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(filename);

		Sheet newsheet = wb.getSheet(sheetname);

		Row r = newsheet.getRow(Rownum);

		Cell c = r.createCell(Cellnum);

		c.setCellValue(passvalue);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("writed");
	}



	// 72.Create row in excel sheet


	public static void createRow(int rownum, int cellNum, String passvalue, String filename, String sheetname)
			throws IOException {

		File f = new File(filename);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(filename);

		Sheet s = wb.getSheet(sheetname);

		Row r = s.createRow(rownum);

		Cell c = r.createCell(cellNum);

		c.setCellValue(passvalue);

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);

		System.out.println("writed");

	}

	//	73. read the existing value in excel sheet.

	/*
	public static void excelRead(String filename, String SheetName ) throws IOException {

		File f = new File("C:\\Users\\Sheik Mohammed\\Desktop\\Majulah Work Details\\Automation\\Project\\Excelfile");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheet(SheetName);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {

				Cell c = r.getCell(j);

				int cellType = c.getCellType();

				String value;

				if (cellType == 1) {

					value = c.getStringCellValue();

				}

				else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();

					SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");

					value = s1.format(d);

				} else {

					double dd = c.getNumericCellValue();

					long l = (long) dd;

					value = String.valueOf(l);

				}
				System.out.println(value);

			}

		}

	} */

	//	74. read the value from particular excel sheet.

	/*	
	public static String excelReadValue(String Sheetname, int rownum, int cellnum) throws IOException {

		File f = new File("C:\\Users\\Sheik Mohammed\\Desktop\\Majulah Work Details\\Automation\\Project\\Excelfile\\Test Data.xlsx");

		FileInputStream input = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(input);

		Sheet s = wb.getSheet(Sheetname);

		String value = null;

		Row r = s.getRow(rownum);

		Cell c = r.getCell(cellnum);

		int cellType = c.getCellType();

		if(cellType == 1)
		{
			value = c.getStringCellValue();
		}
		else {
			double d = c.getNumericCellValue();
			long l = (long)d;
			value = String.valueOf(l);
		}


		return value;

	}
	 */

	//75.getRowcount

	public static int getRowcount(String sheetname) throws IOException {

		File f =new File("src/test/resources/Excel File/Test Data.xlsx");

		FileInputStream input =new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(input);

		XSSFSheet s = wb.getSheet(sheetname);

		int rowcount = s.getLastRowNum();

		input.close();

		return rowcount;


	}

	//76.getCellcount //column count

	public static int getCellcount(String sheetname, int rownum) throws IOException {

		File f =new File("src/test/resources/Excel File/Test Data.xlsx");

		FileInputStream input =new FileInputStream(f);

		XSSFWorkbook wb = new XSSFWorkbook(input);

		XSSFSheet s = wb.getSheet(sheetname);

		XSSFRow r = s.getRow(rownum);

		int cellcount = r.getLastCellNum();

		input.close();

		return cellcount;

	}

	//77.Page Load Time Out
	public static void Pageloadtimeout() 
	{
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	}

	
	public Wait mFluentWait(WebDriver driver)  
	{
		ArrayList allExceptions = new ArrayList();
		allExceptions.add(NoSuchElementException.class);
		allExceptions.add(ElementNotVisibleException.class);
		allExceptions.add(NoSuchFrameException.class);
		allExceptions.add(StaleElementReferenceException.class);

		Wait<WebDriver> iWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				//.ignoring(NoSuchElementException.class);
				.ignoreAll(allExceptions);

		return iWait;
	}
	// gWait = new FluentWait(pDriver).withTimeout(180,
	// TimeUnit.SECONDS).pollingEvery(5, TimeUnit.MILLISECONDS)
	// .ignoring(NoSuchElementException.class);//
	// .ignoring(NoSuchElementException.class)


	public void waitUntilElementIsDisplayedOnScreen(By Selector)  //2
	{
		try {
			iWait = mFluentWait(driver);
			iWait.until(ExpectedConditions.presenceOfElementLocated(Selector));
			iWait.until(ExpectedConditions.visibilityOfElementLocated(Selector));
		} 
		catch (Exception e) 
		{
			throw new NoSuchElementException(String.format("The following element was not visible: %s ", Selector));
		}
	}

	public void explicitWDWaitClickable(By element)
	{
		WebDriverWait wdwait = new WebDriverWait(driver, 60);
		wdwait.until(ExpectedConditions.elementToBeClickable(element));

		//wdwait.until(ExpectedConditions.attributeContains(element, attribute, value));

	}

	public void explicitWDWaitSelect(By element)
	{
		WebDriverWait wdwait = new WebDriverWait(driver, 60);
		wdwait.until(ExpectedConditions.elementToBeSelected(element));
		wdwait.until(ExpectedConditions.invisibilityOf((WebElement) element));
		wdwait.until(ExpectedConditions.visibilityOfElementLocated(element));
		//wdwait.until(ExpectedConditions.attributeContains(element, attribute, value));

	}

	public void explicitWDWaitinvisibility(By element)
	{
		WebDriverWait wdwait = new WebDriverWait(driver, 60);
		wdwait.until(ExpectedConditions.invisibilityOf((WebElement) element));

		//wdwait.until(ExpectedConditions.attributeContains(element, attribute, value));	
	}
	
	

	public void explicitWDWaitvisibility(By element)
	{
		WebDriverWait wdwait = new WebDriverWait(driver, 60);
		wdwait.until(ExpectedConditions.visibilityOfElementLocated(element));
		//wdwait.until(ExpectedConditions.attributeContains(element, attribute, value));	
	}

	public void explicitWDWaitattributeContains(By element,String attribute, String value)
	{
		WebDriverWait wdwait = new WebDriverWait(driver, 60);
		wdwait.until(ExpectedConditions.attributeContains(element, attribute, value));	
	}


	//8.click login or submit buttons

	public static void byClick(By Selector) 
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement welement = wait.until(ExpectedConditions.elementToBeClickable(Selector));
		welement.click();//old
	}
	
	 public static void waitUntilFileToDownload(String folderLocation) throws InterruptedException {
	        File directory = new File(folderLocation);
	        boolean downloadinFilePresence = false;
	        File[] filesList =null;
	        LOOP:   
	            while(true) {
	                filesList =  directory.listFiles();
	                for (File file : filesList) {
	                    downloadinFilePresence = file.getName().contains(".crdownload");
	                }
	                if(downloadinFilePresence) {
	                    for(;downloadinFilePresence;) {
	                        sleep(5);
	                        continue LOOP;
	                    }
	                }else {
	                    break;
	                }
	            }
	    }

	public void byClickByMouse(By Selector) 
	{
		waitUntilElementIsDisplayedOnScreen(Selector);
		WebElement element = getElement(Selector).get(0);
		element.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.click();
		try {
			// element.sendKeys(value);
			Thread.sleep(1000);
			actions.build().perform();
			actions.click().build().perform();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(
					String.format("Error in sending [%s] to the following element: [%s]", element.toString()));
		}

	}

	public List<WebElement> getElement(By selector) {
		try {
			return driver.findElements(selector);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(String.format("Element %s does not exist - proceeding", selector));
		}
		return null;
	}
	
	public static  void Addition() {
		Float arrCost = Parse(driver.findElement(By.xpath("...")));
		Float numOfPass = Parse(driver.findElement(By.xpath("...")));
		Float taxes = Parse(driver.findElement(By.xpath("...")));
		Float total = Parse(driver.findElement(By.xpath("...")));
		Float depCost=Parse(driver.findElement(By.xpath("...")));
		Float sumTotal= ((depCost + arrCost) * numOfPass) + taxes;
	}
	public static Float Parse(WebElement element) {
		 return Float.parseFloat(element.getText().trim());
	}

	public static void setFocus(WebElement element) 
	{

		js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('element').focus();");

	}
	public static void Explicitwait(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void highlightElemts(WebElement element) 
	{

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//jse.executeScript("arguments[0].style.border='3px solid red'", element);
		//js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);
		js.executeScript("arguments[0].style.border='2px solid red'", element);
	}

	 public static void highlight1(WebDriver high, WebElement ele1) {    
	        JavascriptExecutor js1 = (JavascriptExecutor) high;
	        js1.executeScript("arguments[0].setAttribute('style', 'background: blue; border: 2px solid yellow;');", ele1);
	    }

	public static void ScrolldownElement(WebElement element) 
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void Explicitwaitvisibility(WebElement ele) {

		WebDriverWait wait=new WebDriverWait(driver, 100);
		//WebElement element= 
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public static void mouseclick(WebElement element) 
	{

		ac = new Actions(driver);
		Action seriesOfActions = ac.
				moveToElement(element)
				.click(element)
				.build();
		seriesOfActions.perform();
	}

	//Insert the value using JS Method 1 - Not Working
	public static void insertValueJs(WebElement element, String data) 
	{
		js = (JavascriptExecutor) driver;
		js.executeScript ("arguments[0].value='11'", element);    
	}

	//Insert the value using JS Method 2 - Not Working
	public static void insertValueJsM(WebElement element, String data) 
	{
		js = (JavascriptExecutor) driver;
		js.executeScript ("document.getElementById('element').value='data'");    
	}
	//	//find the element in selenium webdriver
	//	WebElement userNameTxt = driver.findElement(By.Id("username")); 
	//	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	//	// set the text
	//	jsExecutor.executeScript("arguments[0].value='testuser'", userNameTxt); 



	//78. Actions delete
	public static void actionssendkeysdelete(WebElement element) 
	{

		Actions a=new Actions(driver);
		a.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	}

	public static void mouseOver(WebElement element) 
	{

		ac = new Actions(driver);
		//Performing the mouse hover action on the target element.
		ac.moveToElement(element).perform();
	}

	public void explicitWaitClick(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement welement = wait.until(ExpectedConditions.elementToBeClickable(element));
		welement.click();
	}
   //Robot Upload File Method
	public void Clipboard(String file) {
		StringSelection obj=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}
	
	//Upload Method Robot Class
	public void uploadFile(String filepath) {
		Clipboard(filepath);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	//69. Scrolldownjavascript

	public static void Scrollupjavascript() 
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-600)");
	}

	public static void Click(By Selector) 
	{
		((WebElement) Selector).click();//old
	}

	public void takesScreenshot(String name) throws IOException {
		File temp=((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs(OutputType.FILE);
		try {
			File dest = new File("C:\\Users\\Azarudeen\\Documents\\Custom Office Templates\\Info\\info\\Screenshots"
					+ name + ".png");
			FileUtils.copyFile(temp, dest);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}
	public void SelectDatebyJS(WebElement element,String dateval) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"')", element);
		
	}
	//To unSelectcheckbox
	
	public static void unSelectcheckbox(WebElement element)
	{
		if(element.isSelected())
		{
			element.click();
		}
		else
		{
			System.out.println("Element is not Selected");
		}
	}
	
	//To Selectcheckbox
	
	public static void Selectcheckbox(WebElement element)
	{
		if(element.isSelected())
		{
			System.out.println("Element is Selected");
			
		}
		else
		{
			element.click();
		}

}

	
	public static void ScrollupElement(WebElement element) 
	
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
	public void sendEmail(String filepath,String Description,String Name,String Hostname, String addto,String addtomessage, String setFrom,String setFromMessage, String setSubject, String SetMessage ) throws EmailException {
		  // Create the attachment
		  EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath(filepath);
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription(Description);
		  attachment.setName(Name);

		  // Create the email message
		  MultiPartEmail email = new MultiPartEmail();
		  email.setHostName(Hostname);
		  email.addTo(addto, addtomessage);
		  email.setFrom(setFrom, setFromMessage);
		  email.setSubject(setSubject);
		  email.setMsg(SetMessage);

		  // add the attachment
		  email.attach(attachment);

		  // send the email
		  email.send();
	
	
	
	}
	
	// Element highlighter code
	public static void highLightElement(WebElement element) {

		 try {
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].setAttribute('style','background: skyblue; border: 4px solid red;');", element);
		  Thread.sleep(1000);
		  js.executeScript("arguments[0].style.border=''", element);
		// unhighlight
		  js.executeScript("arguments[0].removeAttribute('style','')", element);
		  Thread.sleep(1000);
		  
		 } catch (InterruptedException e) {
		  e.printStackTrace();
		 }
		}
	
	public static void highLightElements (WebElement element) {

		JavascriptExecutor js=(JavascriptExecutor)driver; 

		js.executeScript("arguments[0].style.border='4px solid red'", element);
		try 
		{
		Thread.sleep(1000);
		} 
		catch (InterruptedException e) {

		System.out.println(e.getMessage());
		js.executeScript("arguments[0].style.border='4px solid red'", element); 
		} 

		}
	
	public static void highlightElement1 (WebElement element) {

		   try {
		      JavascriptExecutor js = (JavascriptExecutor) driver;
		      js.executeScript("arguments[0].setAttribute('style','background: yellow; border: 2px solid red;');", element);
		      Thread.sleep(1000);
		      js.executeScript("arguments[0].style.border=''", element, "");
		      Thread.sleep(1000);
		   } catch (InterruptedException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		   }
		}
	
	public void selectDate(String month_year, String select_day) throws InterruptedException
	{ 
	List<WebElement> elements = driver.findElements(By.xpath(""));

	for (int i=0; i<elements.size();i++)
	{
	System.out.println(elements.get(i).getText());
	 

	//Selecting the month
	if(elements.get(i).getText().equals(month_year))
	{ 

	//Selecting the date 
	List<WebElement> days = driver.findElements(By.xpath(" ui-ulti-2']/div[2]/table/tbody/tr/td/a"));

	for (WebElement d:days)
	{ 
	System.out.println(d.getText());
	if(d.getText().equals(select_day))
	{
	d.click();
	Thread.sleep(10000);
	return;
	}
	} 

	} 

	}
	driver.findElement(By.xpath("")).click();
	selectDate(month_year,select_day);

	}
	
	 public static boolean isElementPresent(WebElement element) {
	        try {
	            if (element.isDisplayed() || element.isEnabled())
	                return true;
	        } catch (Exception e) {
	            return false;
	        } 
	        return false;
	    }
	
	// waits for the angular request
	public void waitforangularrequest() {
		JsDriver = (JavascriptExecutor) driver;
		ngWebDriver= new NgWebDriver(JsDriver);
	}
	
	
	
public static void Toclear(WebElement element) {

	element.clear();

}
public static WebDriver getDriver() {
	return driver;
}


public static void populateTextField(WebElement element , String data) {
	if ( data != null) {
		Toclear(element);		
		tofill(element, data);
	}
	
	
}

protected void populateSelectFieldByText(WebElement element , String data) {
	if ( data != null) {		
		selectByText(element,data);		
	}
	
}

protected void populateSelectFieldByValue(WebElement element , String data) {
	if ( data != null) {
		selectByValue(element,data);
	}
	
}

protected String getText(WebElement element) {
	waitForClickable(element);
	log("Getting text for", element);
	return element.getText();
}

protected void click(WebElement element) {
	waitForClickable(element);
	log("Clicking on", element);
	element.click();
	
}

protected void selectBox(WebElement element) {
	waitForClickable(element);
	if(!element.isSelected()) {
		log("Selecting", element);
		element.click();
	}
	
}

protected void unSelectBox(WebElement element) {
	waitForClickable(element);
	if(element.isSelected()) {
		log("Deselecting", element);
		element.click();
	}
	
}

protected void clear(WebElement element ) {
	waitForClickable(element);
	log("Clearing", element);
	element.clear();
}

private void enterText(WebElement element , String data) {
	waitForClickable(element);
	log("Entering " + data + " into", element);
	element.sendKeys(data.trim());
}

private void selectByText(WebElement element , String data) {
	waitForClickable(element);
	log("Selecting " + data + " by visible text for", element);
	Select item = new Select(element);
	item.selectByVisibleText(data);
}

private void selectByValue(WebElement element , String data) {
	waitForClickable(element);
	log("Selecting " + data + " by value for", element);
	Select item = new Select(element);
	item.selectByValue(data);
}

protected void executeJavaScript(String scriptToExecute) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript(scriptToExecute);
}

protected void specialClick(WebElement element) {
	waitForClickable(element);
	log("Clicking on", element);
	Actions actions = new Actions(driver);
	actions.moveToElement(element);
	actions.click().build().perform();
}

protected void hover(WebElement element) {
	waitForClickable(element);
	log("Hovering over", element);
	Actions actions = new Actions(driver);
	actions.moveToElement(element);
	actions.build().perform();
}

protected void changeWait(int waitTime) {
	driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
}



protected void waitForVisible(WebElement element) {
	wait.until(ExpectedConditions.visibilityOf(element));
}

protected void waitForText(WebElement element, String text) {
	wait.until(ExpectedConditions.textToBePresentInElement(element, text));
}

protected void waitForClickable(WebElement element) {
	wait.until(ExpectedConditions.elementToBeClickable(element));
}

protected void waitForNotVisible(WebElement element) {
	wait.until(ExpectedConditions.invisibilityOf(element));
}

protected void acceptAlert() {

	try {
		Alert alert = driver.switchTo().alert();
		log("Accepting alert");
		alert.accept();

	} catch (Exception e) {
		try {
			Alert alert = driver.switchTo().alert();
			log("Accepting alert");
			alert.accept();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public static void selectSearchDropdown(By element, String value){
driver.findElement(element).click();
driver.findElement(element).sendKeys(value);
driver.findElement(element).sendKeys(Keys.ENTER);
}


private void log(String message, WebElement element) {
	String name = getLogicalName(element);
	//StepBase.getScenarioContext().getScenario().write(message + " " + name);
}

private void log(String message) {
	//StepBase.getScenarioContext().getScenario().write(message);
}

private String getLogicalName(WebElement element) {
	String name = "";
	if ((element.getTagName().equals("input") && 
			(element.getAttribute("type").contains("text") || element.getAttribute("type").contains("password"))) || 
			element.getTagName().equals("select")) {
		name = element.getAttribute("name");
		if (name == null || name.isEmpty()) {
			name = element.getAttribute("id");
		}
	} else if (element.getTagName().equals("input") && 
			(element.getAttribute("type").contains("radio") || element.getAttribute("type").contains("checkbox"))) {
		name = element.getAttribute("name") + " : " + element.getAttribute("id");
	} else if (element.getText() != null) {
		name = element.getText();
		if (name == null || name.isEmpty()) {
			name = element.getAttribute("id");
		}
		if (name == null || name.isEmpty()) {
			name = element.getAttribute("name");
		}
	}
	
	if (name == null) {
		name = "Unknown Element";
	}
	
	return name;
}
public static String captureScreen(WebDriver driver,String screenshotname)throws IOException {
    String date = new SimpleDateFormat("MM-dd-yy,hh:mm:ss").format(new Date());
    TakesScreenshot ts = (TakesScreenshot)driver;
    File src= ts.getScreenshotAs(OutputType.FILE);
    String path = System.getProperty(("user.dir")+"/ScreenShots/"+screenshotname+date+".png");
    File destination = new File(path);
    FileUtils.copyFile(src, destination);
    return path;
   
}

//Creating a method getScreenshot and passing two parameters
//driver and screenshotName
public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
                //below line is just to append the date format with the screenshot name to avoid duplicate names
                String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
String destination = System.getProperty("user.dir") + "/Screenshots/"+screenshotName+dateName+".png";
File finalDestination = new File(destination);
FileUtils.copyFile(source, finalDestination);
                //Returns the captured file path

return destination;

}

protected static void sleep(int seconds) {

	try {
		Thread.sleep(seconds * 1000);
	} catch (Exception e) {

	}
}
}
	
	

