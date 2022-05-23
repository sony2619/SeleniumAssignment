package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ActionDriver.Action;
import Base.BaseClass;

public class ProductDetailPage extends BaseClass{

	Action act=new Action();
	
public ProductDetailPage() {
		
		PageFactory.initElements(getDriver(),this);
	}
	
	
	
	@FindBy(xpath="//i[@class='icon-plus']")
	public WebElement quntityIncreaseBtn;
    
	
	@FindBy(xpath="//a[@title='Blue']")
	public WebElement blackClr;
	
	
	@FindBy(name="Submit")
	public WebElement addToCartBtn;
	
	//h1[text()='Faded Short Sleeve T-shirts']
	
	@FindBy(xpath="//h1[text()='Faded Short Sleeve T-shirts']")
	public WebElement productTitle;
	
	
	
	@FindBy(xpath="//a[contains(@title,'checkout')]")
	public WebElement proceedToCheckOutBtn;
	
	public void clickOnPlusBtn() {
			
		act.click(getDriver(), quntityIncreaseBtn);
		
	}
	
	public void selectLSize() {
		Select size = new Select(getDriver().findElement(By.id("group_1")));
		size.selectByVisibleText("L");	
	}
	
	
	public void selectClr() {
		act.click(getDriver(), blackClr);	
	}
	
	public void clickOnAddToCart() {
		act.click(getDriver(),addToCartBtn);
		
	}
	
	public SummaryPage clickOnProcedToCheckOut() {
		try {
			act.JSClick(getDriver(), proceedToCheckOutBtn)	;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new SummaryPage();
	}
	
	public boolean verifyProductTitle()
	{
		boolean isDisplayed=productTitle.isDisplayed();
		return isDisplayed;
	}
	
	
}
