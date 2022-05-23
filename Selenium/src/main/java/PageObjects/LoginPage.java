package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ActionDriver.Action;
import Base.BaseClass;

public class LoginPage extends BaseClass{
	
	Action act=new Action();
	
	@FindBy(xpath="//input[@id='email']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@id='passwd']")
	public WebElement passWordField;
	
	@FindBy(id="SubmitLogin")
	public WebElement loginButton;
	
	public LoginPage() {
		
		PageFactory.initElements(getDriver(),this);
	}
	
	public MyAccountPage login() throws InterruptedException {
		
		userName.sendKeys("getsandhyap@gmail.com");
		passWordField.sendKeys("patilsony1234");
		loginButton.click();
		
		
		Thread.sleep(3000);
		return new MyAccountPage();
	}

}
