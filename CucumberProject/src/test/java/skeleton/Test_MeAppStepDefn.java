package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;




import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddProduct;

public class Test_MeAppStepDefn 
{
	WebDriver driver;
	@Before
	public void before() 
	{
		driver = DriverUtility.getDriver("Chrome");
		PageFactory.initElements(driver, AddProduct.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Enter the URL of Test_Me App")
	public void enter_the_URL_of_Test_Me_App() 
	{
		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("Enter data for Login")
	public void enter_data_for_Login() 
	{
		AddProduct.signIn.click();
		AddProduct.username.sendKeys("admin");
		AddProduct.password.sendKeys("Password456");
	}

	@When("User click on Login")
	public void user_click_on_Login() 
	{
		AddProduct.logIn.click();
	}

	@Then("User enters into Admin Home page")
	public void user_enters_into_Admin_Home_page()
	{
		Assert.assertEquals(driver.getTitle(),"Admin Home");
		AddProduct.addProducts.click();
	}

	@Given("Enter the Add Product page")
	public void enter_the_Add_Product_page() throws InterruptedException 
	{
		Thread.sleep(3000);
		Select s1 = new Select(AddProduct.categoryName);
		//s1.selectByVisibleText("Electronics");
		s1.selectByIndex(1);
		Select s2 = new Select(AddProduct.subCategoryName);
		//s2.selectByVisibleText("Head Phone");
		s2.selectByIndex(0);
		AddProduct.productName.sendKeys("JBL1 HeadPhone");
		AddProduct.price.sendKeys("2985");
		AddProduct.quantity.sendKeys("1");
		AddProduct.brand.sendKeys("JBL");
		AddProduct.desc.sendKeys("Bluetooth");
		Thread.sleep(3000);
		AddProduct.addProduct.click();
		
	}

	/*	@When("Click on Add Product")
	public void click_on_Add_Product()
	{
		AddProduct.addProduct.click();
	}
	 */
	@Then("Product Successfully Added")
	public void product_Successfully_Added()
	{
		String s = AddProduct.proResult.getText();
		System.out.println("Verefied Text : "+s);

		Assert.assertTrue(AddProduct.proResult.getText().contains("Succesfully"));

	}

}
