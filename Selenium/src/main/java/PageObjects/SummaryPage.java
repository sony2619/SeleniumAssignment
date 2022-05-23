package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.Action;
import Base.BaseClass;

public class SummaryPage extends BaseClass {
	
	Action act=new Action();
	
	public SummaryPage() {
		
		PageFactory.initElements(getDriver(),this);
	}
	
	
	@FindBy(id="cart_title")
	public WebElement summaryPageTitle;
	
	//a[@title='Proceed to checkout']
	@FindBy(xpath="(//a[contains(@title,'checkout')])[2]")
	public WebElement ProceedToCheckOutBtn ;
	
	public boolean verifySummaryPageTitle() {
		boolean res=summaryPageTitle.isDisplayed();
		return res;
	}

	
	
	public AdressPage clickOnProceedToCheckOutBtn() {
		ProceedToCheckOutBtn.click();
		
		return new AdressPage();
	}
}
