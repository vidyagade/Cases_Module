package StepDefinition;

import java.util.concurrent.TimeUnit;

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

public class ExportCase
{	
	WebDriver driver;
	@Test
	@Given("^User navigates to login page$")
	public void user_navigates_to_login_page() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VKHANDUG\\Desktop\\selsoftware\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
	   
	}

	@Test(priority=1)
	@When("^User logged in with username and password$")
	public void user_logged_in_with_username_and_password() throws Throwable 
	{
		LoginPagePOM loginpage=PageFactory.initElements(driver, LoginPagePOM.class);
		//Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		loginpage.inputemail("vidyagade29498@gmail.com");
		loginpage.inputpassword("Vidya@123");
		loginpage.clicklogin();
		
	   
	}

	@Test(priority=2)
	@Then("^User should login and be on home page$")
	public void user_should_login_and_be_on_home_page() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		case1.clickNavigationbar();
		case1.clickCasebutton();
	}

	@Test(priority=3)
	@When("^User selects case from dashboard and clicks on export option$")
	public void user_selects_case_from_dashboard_and_clicks_on_export_option() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		
		//Thread.sleep(3000);
		//case1.clickexpcase();
		Thread.sleep(5000);
		case1.clickexport();
		case1.clickexportok();
		
	}

	@Test(priority=4)
	@Then("^Case should be exported to documents section$")
	public void case_should_be_exported_to_documents_section() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		case1.clickdocument();
		Thread.sleep(3000);
		case1.dashboard();
		Thread.sleep(3000);
		case1.clickexportcheck();
		
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url, "https://ui.cogmento.com/documents/folder/a4524ae9-f9bf-41ca-a5ea-75ac257468f0");
		driver.close();
	}


}
