package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.Action;
import Base.BaseClass;

public class HomePage extends BaseClass{
	
	Action act=new Action();
	
	@FindBy(xpath="//a[@class='login']")
	public WebElement signIn;

	@FindBy(xpath="//a[@title='Women']")
	public WebElement Women;

	@FindBy(xpath="//a[@title='Women']/ancestor::li/ul/li/ul/li/a")
	public WebElement Tshirs;
	
	
	public LoginPage clickOnSignIn()
	{
		signIn.click();
		return new LoginPage();
	}
	
	public HomePage() {
			
			PageFactory.initElements(getDriver(),this);
		}
		
	public void mouseHoverOnWomenBtn() {
		act.mouseOverElement(getDriver(), Women);
		
	}
	
	public ProductsPage clickOnTshirts() {
		
		Tshirs.click();
		return new ProductsPage();
	}
	
	public String pageTitle() {
		String title=getDriver().getCurrentUrl();
		return title;
	}
	
	
	}
