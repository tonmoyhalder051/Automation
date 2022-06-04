package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.DriverSetup;

public class POM006_AddCart extends DriverSetup {
	public POM006_AddCart(WebDriver driver) {
		this.driver= driver;
	}
	public WebElement proceed=driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/a[2]"));
	
	
	public void checkOut() {
		proceed.click();
	}
}
