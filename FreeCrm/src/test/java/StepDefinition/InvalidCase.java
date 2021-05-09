package StepDefinition;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.CasesPOM;
import POM.LoginPagePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidCase 
{
	WebDriver driver;
	@Test
	@Given("^User navigates to the login page of the freecrm$")
	public void user_navigates_to_the_login_page_of_the_freecrm() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VKHANDUG\\Desktop\\selsoftware\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
	   
	    
	}

	@Test(priority=1)
	@When("^User put his username and password$")
	public void user_put_his_username_and_password() throws Throwable
	{
		LoginPagePOM loginpage=PageFactory.initElements(driver, LoginPagePOM.class);
		//Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		loginpage.inputemail("vidyagade29498@gmail.com");
		loginpage.inputpassword("Vidya@123");
		loginpage.clicklogin();
	    
	}

	@Test(priority=2)
	@Then("^User should logged in and should be on home page of the freecrm$")
	public void user_should_logged_in_and_should_be_on_home_page_of_the_freecrm() throws Throwable 
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		case1.clickNavigationbar();
		case1.clickCasebutton();
	    
	}

	@Test(priority=3)
	@When("^User enters invalid data in title and click on save$")
     public void user_enters_invalid_data_in_title_and_click_on_save() throws Throwable  
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		case1.createButton();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		case1.takeTitle("ABC  @  1  23");
		case1.saveButton();
		
	
	}

	@Test(priority=4)
	@Then("^User should see a error message and case should not create$")
	public void user_should_see_a_error_message_and_case_should_not_create() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		boolean b = case1.checktitle();
		assertTrue(b);
		driver.close();
		
	   
	}
	@Test(priority=5)
	@When("^User enters invalid data in company and click on save$")
	public void user_enters_invalid_data_in_company_and_click_on_save() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		driver.get("https://ui.cogmento.com/cases");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		case1.createButton();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		case1.takeTitle("Tw123@!*");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		case1.companyName("shafblafbgjabfaaaaaaaaaaa");
		Thread.sleep(3000);
		case1.saveButton();
	}

	@Test(priority=6)
	@Then("^User should see error message and case should not be create$")
	public void user_should_see_error_message_and_case_should_not_be_create() throws Throwable 
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		boolean b = case1.checktitle();
		assertTrue(b);
		driver.close();
		
	    
	}
	
	@Test(priority=7)
	@When("^User enters invalid data in contact and click on save$")
	public void user_enters_invalid_data_in_contact_and_click_on_save() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		driver.get("https://ui.cogmento.com/cases");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		case1.createButton();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		case1.takeTitle("title1");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		case1.contactName("-23592contact");
		Thread.sleep(3000);
		case1.saveButton();
	    
	}

	@Test(priority=8)
	@Then("^User should see error message and case should not be create with that contact$")
	public void user_should_see_error_message_and_case_should_not_be_create_with_that_contact() throws Throwable 
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		boolean b = case1.checktitle();
		assertTrue(b);
		driver.close();
	    
	}
	


}
