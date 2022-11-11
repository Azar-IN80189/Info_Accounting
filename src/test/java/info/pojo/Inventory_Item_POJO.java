package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Inventory_Item_POJO extends Reusableclass
{
	public Inventory_Item_POJO() {

		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath = "(//li[@class='nav-item nav-dropdown open'])[1]")
	public WebElement Dropdownexpanded;

	@FindBy(xpath = "(//li[@class='nav-item nav-dropdown'])[1]")
	public WebElement Dropdownclosed;

	@FindBy(xpath = "//a[contains(.,'ballot Inventory')]")
	public WebElement Inventoryslide;

	@FindBy(xpath = "//a[@href='/inventory/items']")
	public WebElement Itemslide;

	@FindBy(xpath = "//button[@type='button'][contains(.,'add  Add Item')]")
	public WebElement Additembtn;

	@FindBy(xpath = "(//button[@type='button'])[5]")
	public WebElement ManageCategorybtn;

	@FindBy(xpath = "//button[contains(.,'add  Manage Unit Type')]")
	public WebElement ManageUnitType;

	@FindBy(xpath = "//a[contains(.,'All')]")
	public WebElement AllTabheader;

	@FindBy(xpath = "//a[@data-toggle='tab'][contains(.,'Sales')]")
	public WebElement SalesTab;

	@FindBy(xpath = "//a[contains(.,'Purchases')]")
	public WebElement PurchasesTab;

	@FindBy(xpath = "//a[contains(.,'Inactive')]")
	public WebElement Inactivetab;


	//ADD ITEM SECTION POJO

	@FindBy(xpath = "//input[contains(@formcontrolname,'itemCode')]")
	public WebElement Itemcodesku;

	@FindBy(xpath = "//input[@formcontrolname='itemName']")
	public WebElement Itemname;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement TestDD;

	@FindBy(xpath = "//input[contains(@formcontrolname,'purchasePrice')]")
	public WebElement costpricetxtbox;

	@FindBy(xpath = "//label[@for='chkPurchaseItem']")
	public WebElement Ipurchasechkbox;

	@FindBy(xpath = "//label[contains(@for,'chkISellItem')]")
	public WebElement Isellchkbox;	

	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
	public WebElement Savebtn;	

	//SERVICE TAB

	@FindBy(xpath = "(//a[@role='tab'])[6]")
	public WebElement ServiceTab;	


	//PRODUCT GROUP TAB

	@FindBy(xpath = "//a[contains(.,'Product Group')]")
	public WebElement ProductGroup;	

	@FindBy(xpath = "//input[@formcontrolname='itemCode']")
	public WebElement ItemcodeProductGroup;	

	@FindBy(xpath = "//input[@formcontrolname='itemName']")
	public WebElement ItemnameProductGroup;	

	@FindBy(xpath = "//textarea[@formcontrolname='groupDescription']")
	public WebElement DescriptionProductGroup;	

	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement items1ProductGroupenter;	

	@FindBy(xpath = "(//div[@col-id='ItemID'])[2]")
	public WebElement items1click;	

	@FindBy(xpath = "(//div[@col-id='Quantity'])[2]")
	public WebElement QuantityProductGroupclick;	

	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement QuantityProductGroupenter;	

	@FindBy(xpath = "(//div[@col-id='PGPurchasePrice'])[2]")
	public WebElement PurchaseUnitpriceProductGroup;	

	@FindBy(xpath = "(//div[@col-id='SellingPrice'])[2]")
	public WebElement SellingpriceProductGroup;	

	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
	public WebElement SavebtnProductGroup;	


	//COMMON PATHS


	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement CheckallboxItems;	

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement Searchitems;	

	@FindBy(xpath = "//button[contains(.,'Delete')]")
	public WebElement Deletebtn;	



	//ManageCategory

	@FindBy(xpath = "//input[@formcontrolname='productCategoryName']")
	public WebElement Categorynametxtbox;

	@FindBy(xpath = "//button[contains(.,'add Add Category')]")
	public WebElement AddcategoryBtn;

	@FindBy(xpath = "(//button[@type='button'])[12]")
	public WebElement Cancelbtn;

	//ManageUnitType

	@FindBy(xpath = "(//button[@type='button'])[6]")
	public WebElement manageUnitTypebtn;

	@FindBy(xpath = "//input[@formcontrolname='ItemUnitTypeName']")
	public WebElement manageUnitTypename;

	@FindBy(xpath = "//label[contains(.,'Active')]")
	public WebElement Activechkbox;

	@FindBy(xpath = "//label[contains(.,'Default')]")
	public WebElement Defaultchkbox;

	@FindBy(xpath = "(//button[contains(.,'Save')])[3]")
	public WebElement SavebtnManageunittype;

	@FindBy(xpath = "(//font[contains(.,'OK')])[2]")
	public WebElement Okbtnclick;

	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[5]")
	public WebElement PurchaseaccountDD;

	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[6]")
	public WebElement TaxrateDD;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	public WebElement Purchaseaccounttxtdd;

	@FindBy(xpath = "(//input[@type='text'])[13]")
	public WebElement TaxrateDDtxtdd;

	@FindBy(xpath = "//textarea[@formcontrolname='purchaseDescription']")
	public WebElement PurchaseDescriptiontxt;

	@FindBy(xpath = "//input[@formcontrolname='salesPrice']")
	public WebElement SellingPrice;

	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[7]")
	public WebElement SalesAccountDD;

	@FindBy(xpath = "(//div[@class='ng-select-container ng-has-value'])[8]")
	public WebElement TaxRateSellingDD;

	@FindBy(xpath = "(//input[@type='text'])[15]")
	public WebElement SalesAccounttxtDD;

	@FindBy(xpath = "(//input[@type='text'])[16]")
	public WebElement TaxRateSellingtxtDD;

	@FindBy(xpath = "//textarea[@formcontrolname='salesDescription']")
	public WebElement SalesDescription;

	@FindBy(xpath = "//label[contains(.,'Keep track of this item')]")
	public WebElement Keeptrackchkbox;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement ProductCategoryDD;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	public WebElement UnitofmeasurementDD;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement Testtxt;



	//Product group

	@FindBy(xpath = "(//div[@col-id='ItemID'])[3]")
	public WebElement Item2product;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	public WebElement Item2producttypetxt;


	@FindBy(xpath = "//a[contains(.,'Product Group')]")
	public WebElement ProductGrouptab;


	@FindBy(xpath = "//input[@formcontrolname='itemCode']")
	public WebElement ItemcodePG;


	@FindBy(xpath = "//input[@formcontrolname='itemName']")
	public WebElement ItemNamePG;


	@FindBy(xpath = "//textarea[@formcontrolname='groupDescription']")
	public WebElement GroupDescriptionPG;

	@FindBy(xpath = "(//div[@col-id='ItemID'])[2]")
	public WebElement ItemIDPG1;

	@FindBy(xpath = "(//div[@col-id='Quantity'])[2]")
	public WebElement QuantityPG1;

	@FindBy(xpath = "(//div[@col-id='PGPurchasePrice'])[2]")
	public WebElement PurchaseUnitPricePG;

	@FindBy(xpath = "(//div[@col-id='SellingPrice'])[2]")
	public WebElement SellingUnitPricePG;

	@FindBy(xpath = "(//span[@class='close-x'])[2]")
	public WebElement secondrowclose;

	@FindBy(xpath = "//button[@type='button'][contains(.,'Add New Lines')]")
	public WebElement Addlinesbtn;

	@FindBy(xpath = "(//button[contains(.,'Save')])[2]")
	public WebElement SavebtnPG;

	@FindBy(xpath = "(//button[contains(.,'Cancel')])[2]")
	public WebElement CancelbtnPG;























}
