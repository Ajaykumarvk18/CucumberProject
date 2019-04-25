package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tests.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.TestMe_Login;

public class AddingNewProduct 
{
	WebDriver driver;
	@Before
	public void start()
	{
		driver= DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, TestMe_Login.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void finish() 
	{
		
	}
	@Given("logging in using username and password")
	public void logging_in_using_username_and_password() 
	{
	   driver.get("http://10.232.237.143:443/TestMeApp");
	   driver.findElement(By.partialLinkText("SignIn")).click();
	   TestMe_Login.username.sendKeys("admin");
	   TestMe_Login.password.sendKeys("Password456");
	   TestMe_Login.loginButton.click();
	}

	@When("adding new product to the cart")
	public void adding_new_product_to_the_cart() 
	{
		driver.findElement(By.cssSelector("button[class='btn btn-nav']")).click();
		WebElement li=driver.findElement(By.id("categorydropid"));
		Select s1=new Select(li);
		s1.selectByValue("11290");
		WebElement li1=driver.findElement(By.id("subcategorydropid"));
		Select s2=new Select(li1);
		s2.selectByValue("112112");
		driver.findElement(By.id("prodid")).sendKeys("HP laptops");
		driver.findElement(By.id("priceid")).sendKeys("56000");
		driver.findElement(By.id("quantityid")).sendKeys("10");
		driver.findElement(By.id("brandid")).sendKeys("HP");
		driver.findElement(By.id("description")).sendKeys("Full crazy Full gichhh");
		driver.findElement(By.cssSelector("input[value='Add Product']")).click();
       		
		
		/*TestMe_Login.addProduct.click();
		TestMe_Login.catagoryname.
		te
		TestMe_Login.producName.sendKeys("HP laptops");
		TestMe_Login.price.sendKeys("56000");
		TestMe_Login.quantity.sendKeys("10");
		TestMe_Login.brand.sendKeys("HP");
		TestMe_Login.description.sendKeys("Full crazy Full gichhh");
		TestMe_Login.addProduct1.click();
		*/
	   //driver.findElement(By.cssSelector("span[class='glyphicon glyphicon glyphicon-plus']")).click();
	   //driver.findElement(By.id("catgName")).sendKeys("Laptops");
	  // driver.findElement(By.id("catgDesc")).sendKeys("HP Laptops");
	   //driver.findElement(By.cssSelector("input[value='Add']")).click();
	}

	@Then("new products are displayed")
	public void new_products_are_displayed() 
	{
		String msg=driver.findElement(By.cssSelector("i[style='font-size: 20px']")).getText();
		Assert.assertTrue(msg.contains("added Succesfully !!!"));
	}
}
