package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class AdressPage extends BaseClass{
	
	
public AdressPage() {
		
		PageFactory.initElements(getDriver(),this);
	}
	

	@FindBy(xpath="//h1[text()='Addresses']")
	public WebElement adressPageTitle;
	
	//h1[text()='Addresses']
	
	
	public boolean  verifyAdressPageTile() {
		boolean res=adressPageTitle.isDisplayed();
		return res;
	
}
}
