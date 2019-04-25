package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tests.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.RegisterPage;

public class RegisterStepDefinition 
{
	WebDriver driver;
	/*@Before
	public void initialize()
	{
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, RegisterPage.class);
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
	@Given("url of the demowebshop")
	public void url_of_the_demowebshop() 
	{
	   driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("user enters the data for registration")
	public void user_enters_the_data_for_registration() 
	{
	  RegisterPage.gender.click();
	  RegisterPage.firstName.sendKeys("Ajay");
	  RegisterPage.lastName.sendKeys("Kumar k");
	  RegisterPage.email.sendKeys("ajvk30@email.com");
	  RegisterPage.password.sendKeys("abc123");
	  RegisterPage.confirmpassword.sendKeys("abc123");
	  RegisterPage.registerButton.click();
	}

	@Then("user is registered successfully")
	public void user_is_registered_successfully() {
	  String s1=driver.findElement(By.cssSelector("div[class='result']")).getText();
	   Assert.assertTrue(s1.contains("registration completed"));
	}
	@After
	public void terminate()
	{
		//driver.close();
	}
}
