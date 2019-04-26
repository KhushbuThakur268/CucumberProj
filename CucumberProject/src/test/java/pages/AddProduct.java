package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddProduct 
{
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "SignIn")
	public static WebElement signIn;
	
	@FindBy(how = How.ID, using = "userName")
	public static WebElement username;
	@FindBy(how = How.ID, using = "password")
	public static WebElement password;
	@FindBy(how = How.CSS, using = "input[value='Login']")
	public static WebElement logIn;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/main/div/div/div/div[1]/button/h4")
	public static WebElement addProducts;
	
	@FindBy(how = How.ID, using = "categorydropid")
//	@FindBy(how = How.XPATH, using = "//select[@id='categorydropid']")
//	@FindBy(how = How.NAME, using = "categorydropname")
	public static WebElement categoryName;
	
	@FindBy(how = How.ID, using = "subcategorydropid")
	public static WebElement subCategoryName;
	
	@FindBy(how = How.ID, using = "prodid")
	public static WebElement productName;
	
	@FindBy(how = How.ID, using = "priceid")
	public static WebElement price;
	
	@FindBy(how = How.ID, using = "quantityid")
	public static WebElement quantity;
	
	@FindBy(how = How.ID, using = "brandid")
	public static WebElement brand;
	
	@FindBy(how = How.ID, using = "description")
	public static WebElement desc;
	
	@FindBy(how = How.CSS, using = "input[value='Add Product']")
	public static WebElement addProduct;
	
	@FindBy(how = How.XPATH, using = "/html/body/main/div/div/div/form/b/i")
	public static WebElement proResult;
}
