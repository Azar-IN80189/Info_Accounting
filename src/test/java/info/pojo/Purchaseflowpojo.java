package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Purchaseflowpojo extends Reusableclass{
	
	public Purchaseflowpojo()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(.,'shopping_bag Purchase')]")
	public WebElement purchase;
	
	@FindBy(xpath = "//a[@routerlinkactive='active'][contains(.,'arrow_rightPurchase order')]")
	public WebElement purchaseorder;
	
	@FindBy(xpath="(//span[@class='c-icon material-icons-outlined text-warning m-0'][contains(.,'add')])[1]")
	public WebElement addneworder;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[1]/div[1]/app-addcontact/ng-select/div/div/div[2]/input")
	public WebElement supliername;
	
	@FindBy(xpath="//a[text()='Save New Contact ']")
	public WebElement savenewcontact;
	
	@FindBy(xpath="/html/body")
	public WebElement savenext;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[1]/div[2]/input")
	public WebElement Date;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[1]/div[3]/input")
	public WebElement Deliverydate;
	
	@FindBy(xpath="//*[@id=\"PoOrder\"]")
	public WebElement orderno;
	
	@FindBy(xpath="//*[@id=\"reference\"]")
	public WebElement referno;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[3]/div[1]/ng-select/div/div/div[3]/input")
	public WebElement currency;
	
	@FindBy(xpath="(//input[@type='text'])[9]")
	public WebElement amount;
	
	@FindBy(xpath="//[text()='Tax Exclusive']")
	public WebElement taxexclusive;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[3]/div[4]/ng-select/div/div/div[3]/input")
	public WebElement theme;
	
	@FindBy(xpath="//*[@id=\"formItem.id\"]")
	public WebElement salesperson;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[4]/app-dynamicfield/div/div[2]/ng-select")
	public WebElement priority;
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	public WebElement test;
	
	@FindBy(xpath="//input[contains(@autocomplete,'a9e1691d9b66')]")
	public WebElement productname;
	
	@FindBy(xpath="//*[@id=\"InvItem\"]/ng-select")
	public WebElement selectone;
	
	@FindBy(xpath="//div[contains(@col-id,'item')])[2] ")
	public WebElement outsidebox;
	
	@FindBy(xpath="//div[contains(@col-id,'item')])[2] ")
	public WebElement insidebox;
	
	@FindBy(xpath="//*[@id=\"ac530fc9f687\"]/div[1]/a/text()")
	public WebElement newitem;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[5]/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[4]")
	public WebElement descriptionone;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[5]/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[6]")
	public WebElement qty;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[5]/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[7]")
	public WebElement unitprice;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[5]/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[8]")
	public WebElement Disc;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[5]/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[9]")
	public WebElement emergencycontact;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[5]/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[10]")
	public WebElement headerfield;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[5]/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[11]")
	public WebElement account;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[5]/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[12]")
	public WebElement taxrate;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[5]/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[11]")
	public WebElement taxamount;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[5]/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div[12]")
	public WebElement amntSGD;

	@FindBy(xpath="//button[text()=' Approve ']")
	public WebElement approvebutton;
	
	@FindBy(xpath="//*[@id=\"target-element\"]/div/div/div/div/div/div/div[2]/div[8]/div[1]/span/button")
	public WebElement approvearrow;
	
	@FindBy(xpath="//a[text()='Approve']")
	public WebElement approve;
	
	@FindBy(xpath="//a[text()='Approve & add another']")
	public WebElement aproveaddanother;
	
	@FindBy(xpath="(//button[text()=' Save '])[3]")
	public WebElement savebutton;
	
	@FindBy(xpath="//a[@id='btnDraft-2']")
	public WebElement saveasdraft;

	@FindBy(xpath = "//a[@id='btnDraftSubmitForApproval']")
	public WebElement saveforapproval;
	
	@FindBy(xpath="//button[@id='btnDraftOptions']")
	public WebElement savearrow;
	
	@FindBy(xpath="//button[text()='OK']")
	public WebElement ok;
	
	@FindBy(xpath = "(//td[@style='width: 150px; max-width: 150px; text-align: left;'])[1]")
	public WebElement Listitem1;
	
	@FindBy(xpath = "(//input[@type='text'])[11]")
	public WebElement Listitemname1;
	
	@FindBy(xpath="(//td[@style='width: 150px; max-width: 150px; text-align: left;'])[3]")
	public WebElement listitem2;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	public WebElement Listitemname2;
	
	@FindBy(xpath="(//td[@style='width: 150px; max-width: 150px; text-align: left;'])[5]")
	public WebElement listitem3;
	
	@FindBy(xpath="(//input[@type='text'])[11]")
	public WebElement Listitemname3;
	
	@FindBy(xpath = "//a[@href='#org-details_draft']")
	public WebElement draft;
	
	@FindBy(xpath = "//button[contains(.,'Option')]")
	public WebElement option;
	
	@FindBy(xpath = "(//a[contains(.,'Edit')])[1]")
	public WebElement edit;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'Update')]")
	public WebElement update;
	
	@FindBy(xpath = "//button[@type='button'][contains(.,'OK')]")
	public WebElement okforawiatingapproval;
	
	@FindBy(xpath = "(//a[contains(@data-toggle,'tab')])[3]")
	public WebElement awaitingapproval;
	
	@FindBy(xpath="//a[text()='Delete']")
	public WebElement delete;
	
	@FindBy(xpath="//a[text()='Copy To']")
	public WebElement copyto;
	
	@FindBy(xpath="//span[text()=' add ']")
	public WebElement addnewlines;
	
	@FindBy(xpath="//button[text()='Yes']")
	public WebElement yes;
	
	@FindBy(xpath="(//button[text()='OK'])[2]")
	public WebElement deleteok;
	
	@FindBy(xpath="//a[text()='Mark as Billed']")
	public WebElement markasbilled;
	
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container']")
	public WebElement billchkbox;
	
	@FindBy(xpath="//input[contains(@formcontrolname,'BillDueDate')]")
	public WebElement duedate;
	
	@FindBy(xpath="//a[contains(text(),'Billed ')]")
	public WebElement billed;
	
	@FindBy(xpath="//a[text()='Unmarked ']")
	public WebElement unmarkedbill;
	
	@FindBy(xpath="//a[contains(text(),'Approved ')]")
	public WebElement approval;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
