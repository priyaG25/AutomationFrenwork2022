package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.TestBase;

public class Utility1 extends TestBase {

	public static void switchToMainFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
	
	  public static void mouseOver(WebElement target) {
		  Actions act=new Actions(driver);
		  act.moveToElement(target).build().perform();
	  
	  }
	 
}
