package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CreateCompanyPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NewContactPage;
import utility.Utility1;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	NewContactPage newContactPage;
	CreateCompanyPage createCompanyPage;

	@Parameters({ "username", "password" })
	@BeforeMethod
	public void initialize() {
		init();
		loginPage = new LoginPage();

		
		  newContactPage =new NewContactPage(); 
		 createCompanyPage=new CreateCompanyPage();
		  
		 
		homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password") );
		//homePage = loginPage.login(uname, pwd);

	}

	@Test
	public void ValidateLogoutTest() {
		// driver.switchTo().frame("mainpanel");
		Utility1.switchToMainFrame();
		homePage.logout();
		boolean logoStatus = loginPage.Logo_is_Displyed();
		Assert.assertTrue(logoStatus);

	}

	@Test
	public void ValidateContactPage() {
		Utility1.switchToMainFrame();
		// driver.switchTo().frame("mainpanel");
		homePage.ClickOnNewContactPage();
		Assert.assertEquals(newContactPage.getContactInfoTxt(), prop.getProperty("contactInfo"));
	}

	
	  @Test
	  
	  public void ValidateCompanyPageTest() { 
	  Utility1.switchToMainFrame();
	  //driver.switchTo().frame("mainpanel");
	  homePage.ClickOnNewCompany();
	  Assert.assertEquals(createCompanyPage.getCompanyInfoTxt(),prop.getProperty("companyInfo")); }
	  
	  
	  
	 

	@AfterTest
	public void closeResource() {
		driver.close();
	}

}
