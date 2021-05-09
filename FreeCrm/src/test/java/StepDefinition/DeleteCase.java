package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.CasesPOM;
import POM.LoginPagePOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteCase 
{
	
	WebDriver driver;
	@Test
	@Given("^User navigates to the login page of freecrm$")
	public void user_navigates_to_the_login_page_of_freecrm() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VKHANDUG\\Desktop\\selsoftware\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
	   
	}

	@Test(priority=1)
	@When("^User logs in with username and password to freecrm$")
	public void user_logs_in_with_username_and_password_to_freecrm() throws Throwable
	{
		LoginPagePOM loginpage=PageFactory.initElements(driver, LoginPagePOM.class);
		//Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		loginpage.inputemail("vidyagade29498@gmail.com");
		loginpage.inputpassword("Vidya@123");
		loginpage.clicklogin();
	   
	}

	@Test(priority=2)
	@Then("^User should login and should be on home page of freecrm$")
	public void user_should_login_and_should_be_on_home_page_of_freecrm() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		case1.clickNavigationbar();
		case1.clickCasebutton();
	    
	}

	//@Test(priority=3)
	@When("^User select particular case and click on delete$")
	public void user_select_particular_case_and_click_on_delete() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		case1.deleteButton();
		case1.deleteButtonAlert();
	    
	}

	//@Test(priority=4)
	@Then("^User should see case in bin$")
	public void user_should_see_case_in_bin() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		case1.clickBinButton();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		case1.clickBinCasesButton();
		WebDriverWait Mywait=new WebDriverWait(driver,10);
		Mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("title1")));
	    assert driver.findElement(By.linkText("title1")).isDisplayed();
	    driver.close();
	    
	}
	@Test(priority=5)
	@When("^User select multiple cases and clicks on delete$")
	public void user_select_multiple_cases_and_clicks_on_delete() throws Throwable 
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		case1.deleteButton();
		case1.deleteButtonAlert();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//tbody/tr[2]/td[5]/div[1]/button[1]/i[1]")).click();
		case1.deleteButtonAlert();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//tbody/tr[3]/td[5]/div[1]/button[1]/i[1]")).click();
		case1.deleteButtonAlert();
	  
	}
	@Test(priority=6)
	@Then("^User should see cases in bin$")
	public void user_should_see_cases_in_bin() throws Throwable 
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		case1.clickBinButton();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		case1.clickBinCasesButton();
		WebDriverWait Mywait=new WebDriverWait(driver,10);
		Mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("title1")));
	    assert driver.findElement(By.linkText("title1")).isDisplayed();
	    Mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("caseVidya1")));
	    assert driver.findElement(By.linkText("caseVidya1")).isDisplayed();
	    Mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("CaseTitle1")));
	    assert driver.findElement(By.linkText("CaseTitle1")).isDisplayed();
	    driver.close();	   
	}



}
