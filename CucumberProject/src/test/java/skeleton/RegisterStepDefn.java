package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.util.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegisterPage;

public class RegisterStepDefn
{
	WebDriver driver;
	@Before
	public void before() 
	{
		driver = DriverUtility.getDriver("Chrome");
		PageFactory.initElements(driver, RegisterPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Given("URL of the Demo Web Shop")
	public void url_of_the_Demo_Web_Shop() 
	{
	   driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("User enters the data for Registration")
	public void user_enters_the_data_for_Registration()
	{
	   RegisterPage.gender.click();
	   RegisterPage.firstname.sendKeys("Lalitha12");
	   RegisterPage.lastname.sendKeys("Lalith");
	   RegisterPage.email.sendKeys("dgn@gmail.com");
	   RegisterPage.password.sendKeys("Password123");
	   RegisterPage.confirmpassword.sendKeys("Password123");
	   RegisterPage.register.click();
	}

	@Then("User is Registere Successfully")
	public void user_is_Registere_Successfully()
	{
		
	    String s = RegisterPage.result.getText();
	    
		System.out.println("Result : " +s);
		Assert.assertEquals("Your registration completed", s);
	}
}
