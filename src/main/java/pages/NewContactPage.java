package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class NewContactPage extends TestBase {
	// web elements repository
@FindBy(xpath = "//*[text()='Contact Information']")
WebElement ContactInfo;

// to create contact Elements
@FindBy(id = "first_name")
WebElement FirstNameTxtBox;
@FindBy(id = "surname")
WebElement LastNameTxtBox;
@FindBy(name = "client_lookup")
WebElement CompanyNameTxtBox;
@FindBy(id = "mobile")
WebElement MobileNoTxtBox;
@FindBy(name = "address_title")
WebElement AddressTxtBox;
@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")
WebElement SaveBtn;


//initialize page factory
public NewContactPage() {
	PageFactory.initElements(driver, this);
}


public void CreateContact(String FN,String LN,String CompName,String MobNo,String Addrs) {
	FirstNameTxtBox.sendKeys(FN);
	LastNameTxtBox.sendKeys(LN);
	CompanyNameTxtBox.sendKeys(CompName);
	MobileNoTxtBox.sendKeys(MobNo);
	AddressTxtBox.sendKeys(Addrs);
	SaveBtn.click();
}

public String getContactInfoTxt() {
	// TODO Auto-generated method stub
	return ContactInfo.getText();
}


}

