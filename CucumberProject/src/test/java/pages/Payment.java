package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Payment 
{
	@FindBy(how = How.ID,using = "userName")
	   public static WebElement username;
		@FindBy(how = How.ID,using = "password")
		public static WebElement password;
		@FindBy(how = How.CSS,using = "input[value='Login']" )
		public static WebElement loginButton;
	//@FindBy(how = How.XPATH,using = "//ul[@id=\"menu3\"]/li[2]/a/span")
    //public static WebElement allcatogories;
	//@FindBy(how = How.XPATH,using = "//ul[@id=\"menu3\"]/li[2]/ul/li[2]")
	//public static WebElement electronics;
	//@FindBy(how = How.XPATH,using = "/html/body")
	//public static WebElement headPhone;
		@FindBy(how = How.ID,using = "myInput")
		   public static WebElement myInput;
		@FindBy(how = How.CSS,using = "input[value='FIND DETAILS']")
		public static WebElement findDetails;
	@FindBy(how = How.CSS,using = "span[class='glyphicon glyphicon-shopping-cart']")
	public static WebElement addtocart;
	@FindBy(how = How.XPATH,using = "//header[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")
	public static WebElement cart;
	@FindBy(how = How.XPATH,using = "//table[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")
	public static WebElement checkout;
	@FindBy(how = How.CSS,using = "input[value='Proceed to Pay']")
	public static WebElement proceedToPay;
	@FindBy(how = How.XPATH,using = "//div[@id=\"swit\"][2]/div[2]/div/label")
	public static WebElement hdfcBank;
	@FindBy(how = How.ID,using = "btn")
	public static WebElement contnue;
	@FindBy(how = How.CSS,using = "input[type='text']")
	public static WebElement userName;
	@FindBy(how = How.CSS,using = "input[type='password']")
	public static WebElement passWord;
	@FindBy(how = How.CSS,using = "input[value='LOGIN']")
	public static WebElement logIn;
	@FindBy(how = How.CSS,using = "input[type='password']")
	public static WebElement transPassword;
	@FindBy(how = How.CSS,using = "input[value='PayNow']")
	public static WebElement payNow;
}
