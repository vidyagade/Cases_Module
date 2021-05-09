package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CasesPOM
{
	WebDriver driver;
	
	@FindBy(xpath="//div[@id='main-nav' and @class='ui left fixed vertical  icon menu sidebar-dark left-to-right']")
	WebElement Navigationbar;
	
	@FindBy(xpath="//span[contains(text(),'Cases')]")
	WebElement Casebutton;
	
	@FindBy(xpath = "//button[normalize-space()='Create']")
	WebElement Createbutton;
	
	@FindBy(xpath= "//input[@name='title']")
	WebElement Title;
	
	@FindBy(xpath="//button[@class='ui small fluid positive toggle button']")
	WebElement Publicbutton;
	
	@FindBy(xpath="//div[@class='ui fluid multiple selection dropdown']//i[@class='dropdown icon']")
	WebElement Clickaccessfield;
	@FindBy(xpath="//div[@class='visible menu transition']//span[@class='text'][normalize-space()='Vidya Gade']")
	WebElement Selectnameacc;
	
	@FindBy(xpath="//div[@class='ui fluid selection dropdown']")
	WebElement Assignedto;
	@FindBy(xpath="//div[@class='visible menu transition']//span[@class='text'][normalize-space()='Vidya Gade']")
	WebElement Selectassignedto;
	
	@FindBy(xpath="//div[@name='company']//input[@type='text']")
	WebElement Company;
	
	@FindBy(xpath="//div[@name='type']//i[@class='dropdown icon']")
	WebElement Type;
	@FindBy(xpath="//span[contains(text(),'Technical Support')]")
	WebElement Selecttype;
	
	@FindBy(name="priority")
	WebElement Priority;
	@FindBy(xpath="//span[contains(text(),'Normal')]")
	WebElement Selectprio;
	
	@FindBy(name="description")
	WebElement Description;
	
	@FindBy(name="status")
	WebElement Status;
	@FindBy(xpath="//span[contains(text(),'Reviewing')]")
	WebElement Selectstatus;
	
	@FindBy(xpath="//div[@name='contact']//input[@type='text']")
	WebElement Contacts;
	
	@FindBy(xpath="//div[@name='deal']//input[@type='text']")
	WebElement Deal;
	
	@FindBy(xpath="//input[@class='calendarField']")
	WebElement Deadline;
	@FindBy(xpath="//div[@aria-label='Choose Friday, May 21st, 2021']")
	WebElement Selectdate;
	@FindBy(xpath="//li[normalize-space()='01:15']")
	WebElement Selecttime;
	
	@FindBy(xpath="//input[@name='identifier']")
	WebElement Identifier;
	
	@FindBy(xpath="//i[@class='cancel icon']")
	WebElement Cancelbutton;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement Savebutton;
	
	@FindBy(xpath="//button[contains(text(),'Show Filters')]")
	WebElement Showfilter;
	
	//@FindBy(css="input[class='search']")
	@FindBy(xpath="//input[@class='search']")
	WebElement Searchfilter;
	@FindBy(xpath="//span[contains(text(),'Title')]")
	WebElement Searchfiltervalue;
	
	
	@FindBy(name="operator")
	WebElement Opertatorfilter;
	@FindBy(xpath="//span[contains(text(),'Equals')]")
	WebElement Opertatorfiltervalue;
	
	
	@FindBy(xpath="//input[@placeholder='Value']")
	WebElement Valuefilter;
	
	@FindBy(xpath="//button[5]")
	WebElement Filterbutton;
	
	@FindBy(xpath="//div[@class='ui fluid container main-content']//button[2]")
	WebElement Filterclear;
	
	@FindBy(xpath="//button[normalize-space()='Add Filter Row']")
	WebElement FilteraddButton;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]/button[1]/i[1]")
	WebElement Viewbutton;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[2]/button[1]/i[1]")
	WebElement Editbutton;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/div[1]/button[1]/i[1]")
	WebElement Deletebutton;
	
	@FindBy(xpath = "//button[normalize-space()='Delete']")
	WebElement DeletebuttonAlert;
	
	@FindBy(xpath = "//button[normalize-space()='Cancel']")
	WebElement CancelbuttonAlert;
	
	@FindBy(xpath = "//button[@class='ui basic button item']")
	WebElement Binbutton;
	
	@FindBy(xpath = "//a[@class='item']//i[@class='comments large icon']")
	WebElement Bincases;
	
	@FindBy(xpath = "//tbody/tr[7]/td[1]/div[1]/label[1]")
	WebElement Checkbox1case;
	
	@FindBy(xpath="//th[@class='collapsing']//label")
	WebElement BincheckboxAll;
	
	@FindBy(xpath="//button[normalize-space()='Restore Selected']")
	WebElement Restoreselectedbutton;
	
	public CasesPOM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickNavigationbar() 
	{
		Actions act=new Actions(driver);
		act.moveToElement(Navigationbar).build().perform(); 
	
	}
	
	public void clickCasebutton() 
	{
		Casebutton.click();
	}
	
	public void createButton() 
	{
		Createbutton.click();
	}
	
	public void takeTitle(String title)
	{
		Title.sendKeys(title);
	}
	public void accessButton()
	{
		Publicbutton.click();
	}
	public void clickaccfield()
	{
		Clickaccessfield.click();
	}
	public void selectNameAcc()
	{
		Selectnameacc.click();
	}
	public void clickAssigned()
	{
		Assignedto.click();
	}
	public void selectAssigned()
	{
		Selectassignedto.click();
	}
	public void companyName(String cn)
	{
		Company.sendKeys(cn);
		 Actions act2=new Actions(driver);
	        act2.sendKeys(Keys.ENTER).perform();
	}
	public void clickType()
	{
		Type.click();
	}
	public void selectType()
	{
		Selecttype.click();
	}

	public void clickPriority()
	{
		Priority.click();
	}

	public void selectPriority()
	{
		Selectprio.click();
	}
	public void giveDescription(String des) 
	{
		Description.sendKeys(des);
	}
	public void clickStatus()
	{
		Status.click();
	}
	public void selectStatus()
	{
		Selectstatus.click();
	}
	public void contactName(String cont)
	{
		Contacts.sendKeys(cont);
		 Actions act3=new Actions(driver);
	        act3.sendKeys(Keys.ENTER).perform();
	}
	
	public void dealName(String dn)
	{
		Deal.sendKeys(dn);
		 Actions act4=new Actions(driver);
	        act4.sendKeys(Keys.ENTER).perform();
	}

	public void clickcalender()
	{
		Deadline.click();
	}

	public void selectDate()
	{
		Selectdate.click();
	}

	public void selectTime()
	{
		Selecttime.click();
	}
	public void giveIdentifier(String iden) 
	{
		Identifier.sendKeys(iden);
	}
	
	
	
	public void cancelButton()
	{
		Cancelbutton.click();
	}
	
	public void saveButton()
	{
		Savebutton.click();
	}
	
	public void ShowFilterButton()
	{
		Showfilter.click();
	}
	
	/*public void searchFilter(String sf)
	{
		Select sel1=new Select(Searchfilter);
		sel1.selectByVisibleText(sf);
	}*/
	public void searchfilter()
	{
		Searchfilter.click();
	}
	public void searchfilterval()
	{
		Searchfiltervalue.click();
	}
	
	/*public void opertatorFilter(String fo) 
	{
		Select sel2=new Select(Opertatorfilter);
		sel2.selectByVisibleText(fo);
	}*/
	public void operatorfilter()
	{
		Opertatorfilter.click();
	}
	public void operatorfilterval()
	{
		Opertatorfiltervalue.click();
	}
	
	public void filterValue(String fv) 
	{
		Valuefilter.sendKeys(fv);
	}
	
	public void filterSearchButton()
	{
		Filterbutton.click();
	}
	public void filterClear() 
	{
		Filterclear.click();
	}
	public void filterAddButton()
	{
		FilteraddButton.click();
	}
	public void viewButton() 
	{
		Viewbutton.click();
	}
	public void editButton() 
	{
		Editbutton.click();
	}
	public void deleteButton() 
	{
		Deletebutton.click();
	}
	public void deleteButtonAlert()
	{
		DeletebuttonAlert.click();
	}
	public void cancelButtonAlert()
	{
		CancelbuttonAlert.click();
	}
	public void clickBinButton()
	{
		Binbutton.click();
	}
	public void clickBinCasesButton()
	{
		Bincases.click();
	}
	public void bincheckBox1Case() 
	{
		Checkbox1case.click();
	}
	public void bincheckBoxCaseAll() 
	{
		BincheckboxAll.click();
	}
	public void restoreSelectedButton()
	{
		Restoreselectedbutton.click();
	} 
	
	
	@FindBy(xpath="//button[contains(text(),'Export')]")
	WebElement export;
	
	@FindBy(xpath="//div[@class='table-wrapper']//tr[1]//td[1]//div")
	WebElement exportcase;
	//div[@class='table-wrapper']//tr[1]//td[1]//div
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement exportokbutton;
	
	@FindBy(xpath="//div[@class='ui fluid container']")
	WebElement dashboard;
	
	@FindBy(xpath="//span[contains(text(),'Documents')]")
	WebElement document;
	
	@FindBy(xpath="//a[contains(text(),'Exports')]")
	WebElement documentexp;
	
	public void clickexport()
	{
		export.click();
	}
	public void clickexpcase()
	{
		exportcase.click();
	}
	public void clickexportok()
	{
		exportokbutton.click();
	}
	
	public void dashboard()
	{
		dashboard.click();
	}
	
	public void clickdocument()
	{
		document.click();
	}
	
	public void clickexportcheck()
	{
		documentexp.click();
	}
	
	@FindBy(xpath="//span[@class='inline-error-msg']")
	WebElement errormsg;
	
	public boolean checktitle()
	{
		try {
		errormsg.isDisplayed();
		return true;
		}
		catch(NoSuchElementException e)
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
