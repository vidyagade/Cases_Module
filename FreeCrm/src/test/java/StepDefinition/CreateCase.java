package StepDefinition;


import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.CasesPOM;
import POM.LoginPagePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCase 
{
	WebDriver driver;
	@Test
	@Given("^User navigates to the login page$")
	public void user_navigates_to_the_login_page() throws Throwable
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VKHANDUG\\Desktop\\selsoftware\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();    
		driver.get("https://ui.cogmento.com/"); //Open a window
		driver.manage().window().maximize();  //Maximize the window
    
	}

	@Test(priority=1)
	@When("^User logs in with username and password$")
	public void user_logs_in_with_username_and_password() throws Throwable 
	{
		
		LoginPagePOM loginpage=PageFactory.initElements(driver, LoginPagePOM.class);  //Created object of LoginPagePom class
		//Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //Implicit wait of 10 seconds to load email field
		loginpage.inputemail("vidyagade29498@gmail.com");
		loginpage.inputpassword("Vidya@123");
		loginpage.clicklogin();
		
	  
	}
	
	@Test(priority=2)
	@Then("^User should login and should be on home page$")
	public void user_should_login_and_should_be_on_home_page() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);    //Created object of CasesPom class
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		case1.clickNavigationbar();
		case1.clickCasebutton();
		
	   
	}
	
	@Test(priority=3)
	@When("^User enters title and clicks on save$")
	public void user_enters_title_and_clicks_on_save() throws Throwable {
	   CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		
		case1.createButton();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		case1.takeTitle("title_1");
		case1.saveButton();
		
	  
	}

	@Test(priority=4)
	@Then("^User should see the cases on the dashboard$")
	public void user_should_see_the_cases_on_the_dashboard() throws Throwable 
	{	
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		driver.get("https://ui.cogmento.com/cases");
	
		WebDriverWait Mywait=new WebDriverWait(driver,10);    //created object for explicit wait
        Mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("title_1")));
        assert driver.findElement(By.linkText("title_1")).isDisplayed();  //asserts if the case is created and displayed
        driver.close();
	}

	@Test(priority=5)
	@When("^User enters contact and clicks on save$")
	public void user_enters_contact_and_clicks_on_save() throws Throwable 
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		
		driver.get("https://ui.cogmento.com/cases");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		case1.createButton();
		case1.contactName("contactvidya1");
		case1.saveButton();
		
	}

	@Test(priority=6)
	@Then("^User should see a error message$")
	public void user_should_see_a_error_message() throws Throwable 
	{
		assert driver.findElement(By.xpath("//span[contains(text(),'The field Title is required')]")).isDisplayed();  //Asserts the error message after clicking on save
		driver.close();
	}

	@Test(priority=7)
	@When("^User enters tile, description, identifier and clicks on save$")
	public void user_enters_tile_description_identifier_and_clicks_on_save() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		driver.get("https://ui.cogmento.com/cases");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		case1.createButton();
		File credentials=new File("C:\\Users\\VKHANDUG\\Desktop\\software\\Book1.xlsx"); //created object if File and passing path
        FileInputStream fis = new FileInputStream(credentials);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet1 = wb.getSheetAt(0);
       
        String title=sheet1.getRow(0).getCell(0).getStringCellValue();
        case1.takeTitle(title);
		String desc=sheet1.getRow(0).getCell(1).getStringCellValue();
		case1.giveDescription(desc);
		String identifier=sheet1.getRow(0).getCell(2).getStringCellValue();
		case1.giveIdentifier(identifier);
		case1.saveButton();
        
		
	}

	@Test(priority=8)
	@Then("^User should see the case on the cases dashboard$")
	public void user_should_see_the_case_on_the_cases_dashboard() throws Throwable
	{
		driver.get("https://ui.cogmento.com/cases");
		
		WebDriverWait Mywait=new WebDriverWait(driver,10);
        Mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("CaseTitle1")));
        assert driver.findElement(By.linkText("CaseTitle1")).isDisplayed(); //asserts the title of case is displayed
        driver.close();
	}
	
	@Test(priority=9)
	@When("^User enters the fields such as title, access, assigned to, contact, company, deal, type, deadline, tags, priority, status and clicks on cancel$")
	public void user_enters_the_fields_such_as_title_access_assigned_to_contact_company_deal_type_deadline_tags_priority_status_and_clicks_on_cancel() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		driver.get("https://ui.cogmento.com/cases");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		case1.createButton();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		case1.takeTitle("CaseVidya123");
		case1.accessButton();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		case1.clickaccfield();
		case1.selectNameAcc();
		case1.clickAssigned();
		case1.selectAssigned();
		case1.contactName("sayali");
		case1.companyName("Shree private limited");
		case1.dealName("Dealvidya1");
		case1.clickType();
		case1.selectType();
		case1.clickcalender();
		case1.selectDate();
		case1.selectTime();
		case1.clickPriority();
		case1.selectPriority();
		case1.clickStatus();
		case1.selectStatus();
		case1.cancelButton();
	
	   
	}

	@Test(priority=10)
	@Then("^User should see case dashboard page$")
	public void user_should_see_case_dashboard_page() throws Throwable 
	{
		String URL=driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://ui.cogmento.com/cases"); //asserts the url of case dashboard page
		driver.close();    //closing the browser
	    
	}

}
