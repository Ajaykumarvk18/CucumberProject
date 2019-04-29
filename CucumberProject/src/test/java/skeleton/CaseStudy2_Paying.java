package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tests.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Payment;

public class CaseStudy2_Paying 
{
	WebDriver driver;
	@Before
	public void before()
	{
		driver= DriverUtility.getDriver("chrome");
		//PageFactory.initElements(driver, TestMe_Login.class);
		PageFactory.initElements(driver, Payment.class);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://10.232.237.143:443/TestMeApp");
	}
	@After
	public void after() 
	{
		
	}
	@When("Lalitha added a headphone to the cart")
	public void Lalitha_added_a_headphone_to_the_cart() 
	{
		driver.findElement(By.partialLinkText("SignIn")).click();
	    Payment.username.sendKeys("Lalitha");
	   Payment.password.sendKeys("Password123");
	    Payment.loginButton.click();
		
	}
    
	@When("checkout for the payment")
	public void checkout_for_the_payment() 
	{
		//Payment.allcatogories.click();
	   //Payment.electronics.click();
	   //Payment.headPhone.click();
		Payment.myInput.sendKeys("headphone");
		Payment.findDetails.click();
	   Payment.addtocart.click();
	   Payment.cart.click();
	   Payment.checkout.click();
	   Payment.proceedToPay.click();
	   Payment.hdfcBank.click();
	   Payment.contnue.click();
	   Payment.userName.sendKeys("123457");
	   Payment.passWord.sendKeys("Pass@457");
	   Payment.logIn.click();
	   Payment.transPassword.sendKeys("Trans@457");
	   Payment.payNow.click();
	}

	@Then("the product is successfully orderd")
	public void the_product_is_successfully_orderd() {
	   
	}
}
