package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestMe_Login 
{
	@FindBy(how = How.ID,using = "userName")
   public static WebElement username;
	@FindBy(how = How.ID,using = "password")
	public static WebElement password;
	@FindBy(how = How.CSS,using = "input[value='Login']" )
	public static WebElement loginButton;
	@FindBy(how = How.CSS,using = "span[class='glyphicon glyphicon glyphicon-plus']")
	public static WebElement addProduct;
	@FindBy(how = How.CSS,using = "options[value='11290']")
	public static WebElement catagoryname;
	@FindBy(how = How.CSS,using = "options[value='112112']")
	public static WebElement subcatagoryname;
    @FindBy(how = How.ID,using = "prodid")
    public static WebElement producName;
    @FindBy(how = How.ID,using = "priceid")
    public static WebElement price;
    @FindBy(how = How.ID,using = "quantityid")
    public static WebElement quantity;
    @FindBy(how = How.ID,using = "brandid")
    public static WebElement brand;
    @FindBy(how = How.ID,using = "description")
    public static 	WebElement description;
    @FindBy(how = How.CSS,using = "input[value='Add Product']" )
    public static WebElement addProduct1;
	
}
