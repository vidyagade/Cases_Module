package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.CasesPOM;
import POM.LoginPagePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilterCase
{

	WebDriver driver;
	@Test
	@Given("^User navigates to the login page to the FreeCRM$")
	public void user_navigates_to_the_login_page_to_the_FreeCRM() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VKHANDUG\\Desktop\\selsoftware\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");  //Open a window
		driver.manage().window().maximize();     //Maximize the window
	   
	}

	@Test(priority=1)
	@When("^User enter the username and password$")
	public void user_enter_the_username_and_password() throws Throwable 
	{

		LoginPagePOM loginpage=PageFactory.initElements(driver, LoginPagePOM.class);    //Created object of LoginPagePom class
		//Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      //Implicit wait of 10 seconds to load email field
		loginpage.inputemail("vidyagade29498@gmail.com");
		loginpage.inputpassword("Vidya@123");
		loginpage.clicklogin();
	    
	}

	@Test(priority=2)
	@Then("^User should logged in and should be on the home page$")
	public void user_should_logged_in_and_should_be_on_the_home_page() throws Throwable 
	{

		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);         //Created object of CasesPom class
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     
		case1.clickNavigationbar();
		case1.clickCasebutton();
	    
	}

	@Test(priority=3)
	@Given("^User should click on show filter$")
	public void user_should_click_on_show_filter() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		case1.ShowFilterButton();
		
		
	}

	@Test(priority=4)
	@When("^User select title, operator and value and click filter$")
	public void user_select_title_operator_and_value_and_click_filter() throws Throwable 
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		
		Thread.sleep(3000);
		case1.searchfilter();
		Thread.sleep(3000);
		case1.searchfilterval();
		Thread.sleep(3000);
		case1.operatorfilter();
		case1.operatorfilterval();
		case1.filterValue("CaseTitle1");
		Thread.sleep(3000);
		case1.filterSearchButton();
	   
	}

	@Test(priority=5)
	@Then("^User should see that particular filtered cases$")
	public void user_should_see_that_particular_filtered_cases() throws Throwable 
	{
		assert driver.findElement(By.linkText("CaseTitle1")).isDisplayed();  //asserts the title of filtered case is displayed
		driver.close();
	    
	}

	@Test(priority=6)
	@Given("^User should see filtered cases$")
	public void user_should_see_filtered_cases() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		case1.ShowFilterButton();
		Thread.sleep(3000);
		case1.searchfilter();
		Thread.sleep(3000);
		case1.searchfilterval();
		Thread.sleep(3000);
		case1.operatorfilter();
		case1.operatorfilterval();
		case1.filterValue("caseVidya1");
		Thread.sleep(3000);
		case1.filterSearchButton();
		
		
	   
	}

	@Test(priority=7)
	@When("^User click on clear$")
	public void user_click_on_clear() throws Throwable 
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		Thread.sleep(5000);
		case1.filterClear();
	}

	@Test(priority=8)
	@Then("^User should see cases dashboard page$")
	public void user_should_see_cases_dashboard_page() throws Throwable 
	{
		String URL=driver.getCurrentUrl();
	    Assert.assertEquals(URL, "https://ui.cogmento.com/cases");  //asserts the url of case dashboard page
	    driver.close();
	}


}
