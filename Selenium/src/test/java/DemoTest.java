import org.apache.poi.ss.formula.functions.Address;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageObjects.AdressPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import PageObjects.ProductDetailPage;
import PageObjects.ProductsPage;
import PageObjects.SummaryPage;

public class DemoTest extends BaseClass {

	LoginPage loginPage;
	ProductsPage productpage;
	ProductDetailPage productDetailPage;
	SummaryPage summaryPage;
	AdressPage adressPage;
	
	
	@BeforeMethod()
	public void setup() {
		
		launchApp();
		
	}
	
	@AfterMethod()
		
		public void tearDown() {
			
		getDriver().quit();
		
		
		}
	
	@Test
	public void DemoTest() throws InterruptedException {
		
		HomePage home=new HomePage();
		loginPage=home.clickOnSignIn();
		
		MyAccountPage myacnt=loginPage.login();
		String expected="http://automationpractice.com/index.php?controller=my-account";
		String actual=myacnt.pageTitle();
		Assert.assertEquals(expected,  actual);
		Thread.sleep(1000);
		HomePage homepage=myacnt.clickOnHomeBtn();
		Thread.sleep(1000);
		String expectedForHomePage="http://automationpractice.com/index.php";
		String actualHomeURl=homepage.pageTitle();
		Assert.assertEquals(actualHomeURl,expectedForHomePage);
		homepage.mouseHoverOnWomenBtn();
		Thread.sleep(1000);
		productpage=homepage.clickOnTshirts();
		boolean isTshirtTitleVisible=productpage.verifyshirtTitle();
		Assert.assertTrue(isTshirtTitleVisible);
		productDetailPage=productpage.clickOnMoreBtn();
		Assert.assertTrue(productDetailPage.verifyProductTitle());
		productDetailPage.clickOnPlusBtn();
		//productDetailPage.clickOnPlusBtn();
		productDetailPage.selectLSize();
		Thread.sleep(1000);
		productDetailPage.selectClr();
		productDetailPage.clickOnAddToCart();
		Thread.sleep(2000);
		summaryPage=productDetailPage.clickOnProcedToCheckOut();
		Thread.sleep(3000);
		Assert.assertTrue(summaryPage.verifySummaryPageTitle());
		adressPage=summaryPage.clickOnProceedToCheckOutBtn();
		Thread.sleep(1000);
		Assert.assertTrue(adressPage.verifyAdressPageTile());
		
		
		
	
		
		
		
	}
}

