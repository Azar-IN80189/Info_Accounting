package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.ByAngularButtonText;

import info.base.Reusableclass;

public class Purchase_order_POJO extends Reusableclass{
	
	public Purchase_order_POJO() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[contains(.,'shopping_bag Purchase')]")
	public WebElement PurchaseMenu;
	
	@FindBy(xpath = "//a[contains(.,'arrow_rightPurchase order')]")
	public WebElement PurchaseOrder;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'add  New Purchase Order')])[1]")
	public WebElement Newpurchaseorder;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	public WebElement Suppliername;
	
	@FindBy(xpath = "(//div[@role='option'])[1]")
	public WebElement Suppliernamedd;
	
	@FindBy(xpath = "//input[@formcontrolname='purchageOrderDateModel']")
	public WebElement Date;
	
	@FindBy(xpath = "//input[@formcontrolname='deliveryDateModel']")
	public WebElement DeliveryDate;
	
	
	@FindBy(xpath ="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[3]/div[1]/ng-select/div/div/div[3]/input")
	public WebElement Currencydropdown;
	
	@FindBy(xpath = "/html[1]/body[1]/app-dashboard[1]/div[1]/main[1]/div[1]/app-purchase-parent[1]/app-newpurchaseorder[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/ng-select[1]/div[1]/div[1]/div[3]/input[1]")
	public WebElement Amountaredropdown;
	
	
	@FindBy(xpath = "//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[3]/div[4]/ng-select/div/div/div[3]/input")
	public WebElement ThemeDropdown;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement Salespersontxtbox;
	
	@FindBy(xpath = "(//input[contains(@aria-autocomplete,'list')])[6]")
	public WebElement PriorityDropdown;
	
	@FindBy(xpath = "(//input[contains(@id,'formItem.id')])[2]")
	public WebElement Testtxtbox;
	
	@FindBy(xpath = "(//div[@role='gridcell'])[2]")
	public WebElement Listitem1;
	
	@FindBy(xpath = "//div[@aria-expanded='true']//input[@type='text']")
	public WebElement Listitemname1;
	
	@FindBy(xpath = "(//div[@role='gridcell'])[16]")
	public WebElement Listitem2;
	
	@FindBy(xpath = "//div[@aria-expanded='true']//input[@type='text']")
	public WebElement Listitemname2;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Add New Lines')])[1]")
	public WebElement addnewlinesbtn;
	
	@FindBy(xpath = "(//span[contains(@class,'close-x')])[3]")
	public WebElement Deleterow3;
	
	@FindBy(xpath = "//textarea[@name='deliveryInstruction']")
	public WebElement Deliveryinstxtbox;
	
	@FindBy(xpath = "(//button[@type='button'][contains(.,'Split button!')])[2]")
	public WebElement Approvebtnclick;
	
	@FindBy(xpath = "//a[@class='dropdown-item'][contains(.,'Approve & add another')]")
	public WebElement Approveandaddanothermouseclick;
	
	@FindBy(xpath = "(//button[contains(@type,'button')])[26]")
	public WebElement Savebtnclick;
	
	@FindBy(xpath = "//a[contains(.,'Save as draft')]")
	public WebElement Saveasdraft;
	
	@FindBy(xpath = "//a[contains(.,'save & submit for approval')]")
	public WebElement Savesubmitforapproval;
	
	@FindBy(xpath = "//a[contains(.,'Save & add another')]")
	public WebElement Saveandaddanother;
	
	@FindBy(xpath = "//button[@class='btn btn-danger btn-normal mr-auto']")
	public WebElement Cancelbtn;
	
	
	
	
	
	
	
	@FindBy(xpath = "//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[5]/ag-grid-angular")
	public WebElement Tableframe;
	
	
	
	
	@FindBy(xpath = "//a[contains(.,'+Save New Contact')]")
	public WebElement Savenewcontent;
	
	@FindBy(xpath="//input[@placeholder='Email Address / Mobile Number']")
	public WebElement username;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/div/div/div/div[2]/div/div/form/div[2]/input")
	public WebElement password;
	
	@FindBy(xpath="//button[text()='LOGIN']")
	public WebElement submit;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/app-sidebar/app-sidebar-nav-custom/ul/li[1]/a")
	public WebElement organization;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/app-sidebar/app-sidebar-nav-custom/ul/li[1]/ul/li[1]/a")
	public WebElement Details;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/app-sidebar/div/div/div[2]")
	public WebElement admin;
	
	@FindBy(xpath="//a[text()='Manage my Account']")
	public WebElement manageacc;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[2]/div[1]/div/div/input")
	public WebElement firstname;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[2]/div[4]/div/div/input")
	public WebElement location;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[2]/div[6]/div/div/textarea")
	public WebElement Biography;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[2]/div[2]/div/div/input")
	public WebElement lastname;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[2]/div[5]/div/div/input")
	public WebElement Birthdate;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[4]/div[1]/div/div[1]/ngx-select/div/input")
	public WebElement cntrymbl;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[4]/div[1]/div/div[2]/input")
	public WebElement mblnum;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[1]/div/div/div/div/form/div[4]/div[2]/div/div/input")
	public WebElement mailid;
	
	@FindBy(xpath="//button[text()=' Change Password ']")
	public WebElement chngpwd;
	
	@FindBy(xpath="(//button[text()=' Save '])[1]")
	public WebElement save;
	
	@FindBy(xpath="(//button[text()=' Cancel '])[1]")
	public WebElement cancel;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[2]/div/form/div/div[2]/div/div[1]/div[1]/div/input")
	public WebElement currentpwd;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[2]/div/form/div/div[2]/div/div[1]/div[2]/div/input")
	public WebElement newpwd;
	
	@FindBy(xpath="/html/body/app-dashboard/div[1]/main/div/app-profile/div[2]/div/form/div/div[2]/div/div[1]/div[3]/div/input")
	public WebElement confirmpwd;
	
	@FindBy(xpath="(//button[text()=' Save '])[2]")
	public WebElement saveforchangepwd;

	@FindBy(xpath="(//button[text()=' Cancel '])[2]")
	public WebElement cancelchangepwd;
	
}
