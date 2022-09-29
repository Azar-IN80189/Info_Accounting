package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Inventory_PriceList_POJO extends Reusableclass {
	
	public Inventory_PriceList_POJO() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[contains(.,'ballot Inventory')]")
	public WebElement Inventoryslide;
	
	@FindBy(xpath = "//a[@href='/inventory/pricelist']")
	public WebElement PriceListslide;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'add  Add Price List')]")
	public WebElement AddPriceListbtn;
	
	@FindBy(xpath = "//input[@formcontrolname='PriceListName']")
	public WebElement PriceListName;
	
	@FindBy(xpath = "(//input[@type='text'])[6]")
	public WebElement TypeDD;
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	public WebElement FirstselectTypeDD;
	
	@FindBy(xpath = "//input[@id='EffectiveFrom']")
	public WebElement EffectiveFrom;
	
	@FindBy(xpath = "//input[@id='EffectiveTo']")
	public WebElement EffectiveTo;
	
	@FindBy(xpath = "(//div[@col-id='ItemID'])[2]")
	public WebElement Items1table;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement Items1tabletype;
	
	
	@FindBy(xpath = "(//div[@col-id='Quantity'])[2]")
	public WebElement Quantity1table;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement Unit1Price;
	
	@FindBy(xpath = "//button[contains(.,'Add New Lines')]")
	public WebElement AddNewLinesbtn;
	
	@FindBy(xpath = "(//button[contains(.,'Save')])[1]")
	public WebElement Savebtn;
	
	@FindBy(xpath = "//input[@id='search-box']")
	public WebElement Searchboxmain;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement Checkboxmain;
	
	@FindBy(xpath = "(//button[contains(@aria-haspopup,'true')])[2]")
	public WebElement Dropdown;
	
	@FindBy(xpath = "//a[@class='dropdown-item ng-star-inserted'][contains(.,'Archive')]")
	public WebElement Archieve;
	
	@FindBy(xpath = "//a[contains(.,'Delete')]")
	public WebElement Delete;
	
	@FindBy(xpath = "//a[contains(.,'All')]")
	public WebElement Alltabmain;
	
	@FindBy(xpath = "//a[@data-toggle='tab'][contains(.,'Sales')]")
	public WebElement Salestabmain;
	
	@FindBy(xpath = "//a[contains(.,'Purchases')]")
	public WebElement Purchasestabmain;
	
	@FindBy(xpath = "//a[@data-toggle='tab'][contains(.,'Archive')]")
	public WebElement Archivetabmain;
	
	@FindBy(xpath = "//a[contains(.,'Expired')]")
	public WebElement Expiredtabmain;
	
	
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	public WebElement Okpopup;
	
	
	@FindBy(xpath = "(//div[contains(@role,'option')])[1]")
	public WebElement Option1select;
	
	@FindBy(xpath = "(//span[contains(.,'more_horiz')])[2]")
	public WebElement Select1edit;
	
	@FindBy(xpath = "//button[contains(.,'Edit')]")
	public WebElement Editbtn;
	
	@FindBy(xpath = "(//div[@col-id='Quantity'])[2]")
	public WebElement Quantityedit;
	
	@FindBy(xpath = "(//input[@type='text'])[7]")
	public WebElement Quantityfill;
	
	
	
	
	
}
