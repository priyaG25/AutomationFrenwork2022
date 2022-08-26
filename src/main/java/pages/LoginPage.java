package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {


	//web elements repository
	//UsernameTestBox
	@FindBy(name="username")
	WebElement UsernameTextBox ;
	
	@FindBy(css = "[placeholder='Password']")
	WebElement PasswordTextBox ;
	  
	@FindBy(css = "[value='Login']")
	WebElement LogginButton ;
	
	@FindBy(className = "img-responsive")
	WebElement img;
	
	@FindBy(xpath = "//td[contains(text(),'GANESH KAKADE')]")
	WebElement userID;
	
	//we will initialize the WebElements by using the PageFactory
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//action
	
	public HomePage login(String username,String password) {
		UsernameTextBox.sendKeys(username);
		PasswordTextBox.sendKeys(password);
		LogginButton.click();
		HomePage abc=new HomePage();
		return abc;
		
	}
	
	 
	public boolean Logo_is_Displyed() {
		System.out.println("logo is Displyed");

		return img.isDisplayed();
		/*
		 * boolean logoo=img.isDisplayed(); if(logoo==true) {
		 * System.out.println("logo is displyed"); }else {
		 * System.out.println("Logo is not displyed"); }
		 */
		
		
	}
	public String getUserID() {
		return userID.getText();
	}
	
}
