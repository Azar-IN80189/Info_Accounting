package info.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import info.base.Reusableclass;

public class Journalentriespojo extends Reusableclass{
	
	public Journalentriespojo() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),' Accounting')]")
	public WebElement Accounting;
	
	@FindBy(xpath="//a[contains(text(),'Journal Entries ')]")
	public WebElement journalentries;
	
	@FindBy(xpath="//button[@type='button'][contains(.,'add  New Journals')]")
	public WebElement newjournals;
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	public WebElement contact;
	
	@FindBy(xpath="(//input[contains(@maxlength,'10')])[1]")
	public WebElement Date;
	
	@FindBy(xpath = "(//input[@type='text'])[6]")
	public WebElement journalno;
	
	@FindBy(xpath = "//textarea[contains(@type,'text')]")
	public WebElement Narration;
	
	@FindBy(xpath = "(//input[contains(@type,'text')])[8]")
	public WebElement tax;
	
	@FindBy(xpath = "(//div[@col-id='description'])[2]")
	public WebElement Description_Outer;
	
	@FindBy(xpath = "(//div[@col-id='description'])[3]")
	public WebElement Description_Outer_Row2;
	
	@FindBy(xpath = "//textarea[contains(@aria-label,'Input Editor')]")
	public WebElement Description_inner;
	
	@FindBy(xpath = "//button[text()='OK']")
	public WebElement Okbtn_JE;
	
	@FindBy(xpath = "(//div[@col-id='caAccountID'])[2]")
	public WebElement accountgrid_Out;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement accountarea;
	
	@FindBy(xpath = "(//div[@col-id='debit'])[2]")
	public WebElement debitgrid;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement debitarea;
	
	@FindBy(xpath="(//div[@col-id='description'])[3]")
	public WebElement accountgriddestwo;
	
	@FindBy(xpath="(//div[@col-id='caAccountID'])[3]")
	public WebElement accountgridtwo;
	
	@FindBy(xpath = "//textarea[contains(@aria-label,'Input Editor')]")
	public WebElement accountareatwo;
	
	@FindBy(xpath = "(//div[@col-id='credit'])[2]")
	public WebElement creditgrid;
	
	@FindBy(xpath = "(//input[@type='text'])[9]")
	public WebElement creditarea;
	
	@FindBy(xpath = "//button[contains(.,'Save as draft')]")
	public WebElement saveasdraft;
	
	@FindBy(xpath="//a[text()='Draft']")
	public WebElement draft;
	
	@FindBy(xpath="(//a[contains(@class,'t-link edit')])[1]")
	public WebElement narrationlink;
	
	@FindBy(xpath="//a[contains(text(),'Posted')]")
	public WebElement posted;
	
	@FindBy(xpath="//button[text()=' Post']")
	public WebElement post;
	
	@FindBy(xpath="//button[contains(text(),' Option ')]")
	public WebElement options;
	
	@FindBy(xpath="//a[contains(text(),'Edit')]")
	public WebElement Edit;
	
	@FindBy(xpath="//a[contains(text(),'Copy')]")
	public WebElement copy;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
