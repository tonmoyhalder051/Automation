package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.DriverSetup;
import commonMethods.CommonMethods;

public class POM001_HomePage extends DriverSetup {

	public POM001_HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement signin = driver
			.findElement(By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]"));

	public WebElement google = driver.findElement(
			By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]"));
	CommonMethods c= new CommonMethods();
	

	public void clickOnGoogle() {
		c.hover(signin);
		google.click();
	}

}
