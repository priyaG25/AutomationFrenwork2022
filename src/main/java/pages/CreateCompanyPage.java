package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CreateCompanyPage extends TestBase {
	// WebElements repository	
	@FindBy(xpath = "//*[text()='Create New  Company']")
	WebElement CompanyInfo;
	
	
	//Action
	public String getCompanyInfoTxt() {
		return CompanyInfo.getText();
	}
	
	
	
	//initialize PageFactory
	
	public CreateCompanyPage() {
		PageFactory.initElements(driver, this);
	}
	

}
