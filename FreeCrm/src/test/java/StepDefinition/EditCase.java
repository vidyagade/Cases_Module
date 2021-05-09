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

public class EditCase 
{
	WebDriver driver;
	@Test
	@Given("^User navigates to the login page of FreeCRM$")
	public void user_navigates_to_the_login_page_of_FreeCRM() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VKHANDUG\\Desktop\\selsoftware\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");    //Open a window
		driver.manage().window().maximize();         //Maximize the window
	}

	@Test(priority=1)
	@When("^User logs in with username and password in FreeCRM$")
	public void user_logs_in_with_username_and_password_in_FreeCRM() throws Throwable
	{
		LoginPagePOM loginpage=PageFactory.initElements(driver, LoginPagePOM.class);    //Created object of LoginPagePom class
		//Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);     //Implicit wait of 10 seconds to load email field
		loginpage.inputemail("vidyagade29498@gmail.com");
		loginpage.inputpassword("Vidya@123");
		loginpage.clicklogin();
	    
	}

	@Test(priority=2)
	@Then("^User should login and should be on home page of FreeCRM$")
	public void user_should_login_and_should_be_on_home_page_of_FreeCRM() throws Throwable 
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);    //Created object of CasesPom class
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		case1.clickNavigationbar();
		case1.clickCasebutton();
	    
	}

	@Test(priority=3)
	@When("^User select particular case and click on edit$")
	public void user_select_particular_case_and_click_on_edit() throws Throwable 
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		case1.editButton();
	   
	}

	@Test(priority=4)
	@Then("^User should edit case and click on save$")
	public void user_should_edit_case_and_click_on_save() throws Throwable
	{
		CasesPOM case1=PageFactory.initElements(driver, CasesPOM.class);
		case1.clickAssigned();
		case1.selectAssigned();
		case1.contactName("vidyagade");
		case1.companyName("Enterprise1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		case1.clickType();
		case1.selectType();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		case1.clickPriority();
		case1.selectPriority();
		case1.giveIdentifier("abc");
		case1.saveButton();
		//WebDriverWait Mywait=new WebDriverWait(driver,10);
       // Mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ui header item mb5 light-black']")));
      //  assert driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']")).isDisplayed();
       
	   
	}
	
	@Test(priority=5)
	@Then("^User should able to see edited case$")
	public void user_should_able_to_see_edited_case() throws Throwable
	{
		WebDriverWait Mywait=new WebDriverWait(driver,10);
        Mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ui header item mb5 light-black']")));
        assert driver.findElement(By.xpath("//div[@class='ui header item mb5 light-black']")).isDisplayed();   //asserts the title of edited case is displayed
        driver.close();    //closing the browser
	}

}
