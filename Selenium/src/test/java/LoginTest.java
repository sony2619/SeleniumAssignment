import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;

public class LoginTest extends BaseClass {
	
	LoginPage loginPage;
	
	
	@BeforeMethod()
	public void setup() {
		
		launchApp();
		
	}
	
	@AfterMethod()
		
		public void tearDown() {
			
		getDriver().quit();
		
		
		}
	
	@Test
	public void login() throws InterruptedException {
		HomePage home=new HomePage();
		loginPage=home.clickOnSignIn();
		
		MyAccountPage myacnt=loginPage.login();
		String expected="http://automationpractice.com/index.php?controller=my-account";
		String actual=myacnt.pageTitle();
		Assert.assertEquals(expected,  actual);
		Thread.sleep(2000);
	}

}
