package pages;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.Utility1;

public class HomePage extends TestBase {
	//web elements repository
	
	@FindBy(xpath = "(//a[@class='topnavlink'])[3]")
	WebElement logout1;
	
	@FindBy(xpath = "//a[text()='Contacts']")
	WebElement contact;
	 
	@FindBy(xpath = "//a[text()='New Contact']")
	WebElement contactLink;
	
	@FindBy(xpath = "//a[text()='Companies']")
	WebElement Company;
	
	@FindBy(xpath = "//a[text()='New Company']")
	WebElement NewCompanyLink;
	
	
	//action 
	
	
	
		public void logout() {
			 logout1.click();
	     
	     System.out.println("logout");
			
		}
		
		public NewContactPage ClickOnNewContactPage() {
			//Utility1.mouseOver(contact);
			
			  Actions act=new Actions(driver);
			  act.moveToElement(contact).build().perform();			
			  contactLink.click();
			System.out.println("Validate Contact Page");
			return new NewContactPage ();
			
		}
	
	public void ClickOnNewCompany() {			
		Utility1.mouseOver(Company);
		NewCompanyLink.click();
		System.out.println("validate company page");
		
	}
	
  //Page Factory class will be initialise by webElements
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
	
	

	
}
