package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import base.DriverSetup;
import commonMethods.CommonMethods;

public class POM005_ScrollDwon  extends DriverSetup{

	public POM005_ScrollDwon(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement scrollElement=driver.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[2]/section[2]/div[2]/div[1]/div[56]/div[1]/a[1]/div[2]/p[2]"));
	public WebElement next=driver.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[2]/section[2]/div[3]/a[8]"));
	public WebElement scrollElement2=driver.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[2]/section[2]/div[2]/div[1]/div[34]/div[1]/a[1]/div[1]/img[1]"));
	public WebElement book=driver.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[2]/section[2]/div[2]/div[1]/div[38]/div[1]/a[1]/div[1]/img[1]"));
	public WebElement cart=driver.findElement(By.xpath("//body[1]/div[5]/div[1]/div[1]/div[2]/section[2]/div[2]/div[1]/div[38]/div[1]/a[1]/div[1]/div[1]/button[1]"));
	public WebElement checkCart=driver.findElement(By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]"));
	
	
	
	
	CommonMethods cm= new CommonMethods();
	CommonMethods cm2= new CommonMethods();
	CommonMethods cm3= new CommonMethods();
	
	public void scroll() {
		cm.scroll(scrollElement);
			
	}
	public void nextPage() {
		next.click();
		
	}
	public void scrollAgain() {
		cm2.scroll(scrollElement2);
	}
	
	public void hoverBook() {
		cm3.hover(book);
		cart.click();
		checkCart.click();
	}

}
