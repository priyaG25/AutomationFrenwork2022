package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import base.TestBase;
import pages.LoginPage;
import utility.Utility1;

//import pages.LoginPage;

public class LoginPageTest extends TestBase  {
	
	LoginPage loginPage;
	
	@BeforeMethod  
	public void Initialization() {
		init();
		loginPage = new LoginPage();
		
		
       }
	@Parameters({"username","password"})
	@Test
	public void ValidateLoginPage(String uname,String pwd) {
		loginPage.login(uname,pwd);
		Utility1.switchToMainFrame();
		String  username=loginPage.getUserID();
		System.out.println(username);
		Assert.assertEquals(username,"  User: GANESH KAKADE");
	}
	
	
	  @Test 
	  public void ValidateLogoPage() {
		  boolean logoStatus=loginPage.Logo_is_Displyed();
	  Assert.assertEquals(logoStatus, true);
	  }
	 
	 @AfterMethod
	public void CloseResource() {
		driver.close();
	}
}
