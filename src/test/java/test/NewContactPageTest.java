package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import pages.NewContactPage;
import utility.Utility1;

public class NewContactPageTest  extends TestBase{
LoginPage loginPage;
HomePage homePage;
NewContactPage contactPage;

	@BeforeMethod
	
	public void initialization() {
		init();
		loginPage=new LoginPage();
		homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password") );
		//homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
		
	}

	@Test
	public void ValidateNewContactPageTest() {
		Utility1.switchToMainFrame();
		contactPage=homePage.ClickOnNewContactPage();
		//homePage.ClickOnNewContactPage();
		contactPage.CreateContact("Priya","Gurme","Infosys","123456789","Pune");
	}
	
	
	
	@AfterMethod
	public void closeResources() {
		//driver.close();
	}
	
	
	
}
