package skeleton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.util.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination 
{
	WebDriver driver;
	@Before
	public void before()
	{
		driver = DriverUtility.getDriver("Chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@After
	public void after()
	{
		driver.close();
	}
	@Given("The URL of TestMe App")
	public void the_URL_of_TestMe_App()
	{
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("User enters {word} as username")
	public void user_enters_as_username(String string)
	{
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("User enters {word} as password")
	public void user_enters_as_password(String string) 
	{
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("User click Login")
	public void user_click_Login()
	{
		driver.findElement(By.name("Login")).click();
	}

	@Then("User is in (Home|Admin Home)")
	public void user_is_in_Home_Page()
	{
		Assert.assertTrue(driver.getTitle().contains("Home"));
		
	}
	
	/*
	@Then("User is in (Home|Admin Home)")
	public void user_is_in_Home_Page(List<String> s)
	{
		Assert.assertTrue(driver.getTitle().contains("Home"));
		for (String string : s)
		{
			System.out.println(string);
		}
	}
    */
	
	@When("User enters invalid data")
	public void user_enters_invalid_data(io.cucumber.datatable.DataTable dataTable)
	{
		List<List<String>> list = dataTable.asLists();
		/*
		System.out.println(list.get(0).get(0));
		System.out.println(list.get(0).get(1));
		System.out.println(list.get(1).get(0));
		System.out.println(list.get(1).get(1));
		System.out.println(list.get(2).get(0));
		System.out.println(list.get(2).get(1));
		*/
		for (List<String> list2 : list)
		{
			for(String s : list2)
			{
				System.out.print(s +"\t");
			}
			System.out.println();
		}

		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		throw new cucumber.api.PendingException();
	}

}
