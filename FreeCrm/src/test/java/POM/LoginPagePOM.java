package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM
{
	WebDriver driver;
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginbutton;
	
	@FindBy(linkText="Forgot your password?")
	WebElement forgotpass;
	
	@FindBy(linkText="Sign Up")
	WebElement signup;
	
	public LoginPagePOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void inputemail(String eml)
	{
		Email.sendKeys(eml);
	}
	
	public void inputpassword(String pw)
	{
		Password.sendKeys(pw);
	}
	
	public void clicklogin()
	{
		loginbutton.click();
	}
	
	public void clickforgotpass()
	{
		forgotpass.click();
	}
	
	public void clickssignup()
	{
		signup.click();
	}

	
}