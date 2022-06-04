package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.DriverSetup;

public class POM003_CompleteSignUp extends DriverSetup {
	
	
	public POM003_CompleteSignUp(WebDriver driver) {
		this.driver = driver;
		
	}


	public WebElement pass=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
	public WebElement next2=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]"));	 
	
	public void password() {
		 pass.sendKeys("tomarnamki01");
		 next2.click();
	}
		 


}
