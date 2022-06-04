package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.DriverSetup;
import commonMethods.CommonMethods;

public class POM004_SelectAuthor extends DriverSetup {
	public POM004_SelectAuthor(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement author=driver.findElement(By.xpath("//body[1]/header[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
	public WebElement click=driver.findElement(By.xpath("//body[1]/header[1]/div[1]/nav[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[3]/div[1]/div[1]/li[1]/a[1]"));
	
	CommonMethods m= new CommonMethods();
	
	
	public void selectAuthor() {
		m.hover(author);
		click.click();
	}

}
