package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Tax_Rate_POJO extends Reusableclass
{
	public Tax_Rate_POJO() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[contains(.,'more_horiz Organization')]")
	public WebElement Organizationslide;
	
	@FindBy(xpath = "//a[@href='/organization/taxrate']")
	public WebElement Taxrateslide;	
	
	@FindBy(xpath = "(//span[contains(.,'add')])[3]")
	public WebElement Newtaxratebtn;	
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'taxName')]")
	public WebElement TaxRateDisplayName;	
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'taxCode')]")
	public WebElement TaxCode;	
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	public WebElement BoxNumberDD;	
	
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[1]")
	public WebElement PurchaseTaxChkbox;
	
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[2]")
	public WebElement SalesTaxChkbox;
	
	@FindBy(xpath = "//input[@formcontrolname='compoundName']")
	public WebElement Componentname;
	
	@FindBy(xpath = "//input[contains(@formcontrolname,'rate')]")
	public WebElement Componentpercentage;
	
	@FindBy(xpath = "(//span[contains(.,'add')])[2]")
	public WebElement Addcomponentbtn;
	
	@FindBy(xpath = "//tbody/tr[2]/td[3]/button[1]/span[1]")
	public WebElement Removecomponentxbtn;
	
	
	@FindBy(xpath = "//button[contains(.,'Save')]")
	public WebElement Savebtn;
	
	@FindBy(xpath = "//input[contains(@id,'compound0')]")
	public WebElement compoundradiobtn;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Yes, remove it!')]")
	public WebElement Yesremovebtn;
	
	@FindBy(xpath = "//input[contains(@id,'search-box')]")
	public WebElement Searchboxtax;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	public WebElement Checkboxtax;
	
	@FindBy(xpath = "(//i[contains(@class,'fa fa-pencil t-link edit')])[1]")
	public WebElement Edittax;
	
	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public WebElement Deletebtn;
	
	@FindBy(xpath = "//button[contains(.,'Ok')]")
	public WebElement okbtn;
	
	
	
	
	
	
	
}
