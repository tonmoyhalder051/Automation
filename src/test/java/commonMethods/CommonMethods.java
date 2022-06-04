package commonMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import base.DriverSetup;

public class CommonMethods extends DriverSetup{
	
	
	
	public void hover(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	public void scroll(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
	}
	

}
