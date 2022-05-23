package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class MyAccountPage extends BaseClass{

	@FindBy(xpath="//a[@title='Home']")
	public WebElement homeBtn;
	
	
	public MyAccountPage() {
		
		PageFactory.initElements(getDriver(),this);
	}
	
	
	
	
	public String pageTitle() {
		String title=getDriver().getCurrentUrl();
		return title;
	}
	
	public HomePage clickOnHomeBtn() throws InterruptedException {
		
		//JavascriptExecutor js = ((JavascriptExecutor) driver);
	//	js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		homeBtn.click();
		Thread.sleep(1000);
		return new HomePage();
	}
	
	
}
