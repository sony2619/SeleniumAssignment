package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ActionDriver.Action;
import Base.BaseClass;

public class ProductsPage extends BaseClass{
	
	
	Action act=new Action();
	
	@FindBy(xpath="//a[@title='View']")
	public WebElement moreBtn;
    
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	public WebElement productTitle;
    
	@FindBy(xpath="//span[@class='category-name']")
	public WebElement TshirtsTitle;
    
	
	
	public ProductsPage() {
		
		PageFactory.initElements(getDriver(),this);
	}
	
	
	public boolean verifyshirtTitle() {
		
		boolean res=act.isDisplayed(getDriver(), TshirtsTitle);
		return res;
	}
	
    // Remove Item from Cart page
    public ProductDetailPage clickOnMoreBtn() throws InterruptedException {
    	
    	act.mouseOverElement(getDriver(), productTitle);
    	Thread.sleep(1000);
    	moreBtn.click();
    	Thread.sleep(1000);
        
        return new ProductDetailPage() ; }

}
