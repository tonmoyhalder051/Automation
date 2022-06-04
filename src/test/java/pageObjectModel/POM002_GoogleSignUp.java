package pageObjectModel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.DriverSetup;

public class POM002_GoogleSignUp extends DriverSetup{
	
	 
	 public POM002_GoogleSignUp(WebDriver driver) {
		 this.driver= driver;
		 
	 }
	 
	 
	 
	 public WebElement sign=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	 public WebElement next=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));
	 
	 public void email() {
		 sign.sendKeys("automation29012355@gmail.com");
		 next.click();
		
	 }
	 
	 
	
	 
	

}
