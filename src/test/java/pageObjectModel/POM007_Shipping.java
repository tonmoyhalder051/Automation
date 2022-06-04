package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.DriverSetup;
import commonMethods.CommonMethods;

public class POM007_Shipping extends DriverSetup{
	public POM007_Shipping(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement name= driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[1]/input[1]"));
	public WebElement phone= driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/fieldset[1]/input[1]"));
	public WebElement Altphone= driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/fieldset[2]/input[1]"));
	
	public WebElement place= driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[2]/fieldset[2]/select[1]"));
	public WebElement area= driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[3]/fieldset[1]/select[1]"));
	public WebElement address= driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/fieldset[2]/textarea[1]"));
	public WebElement checkBox= driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[1]/label[1]"));
	public WebElement button= driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[3]/button[1]/span[1]"));
	public WebElement scroll= driver.findElement(By.xpath("//tbody/tr[1]/td[1]"));
	CommonMethods c= new CommonMethods();
	CommonMethods d= new CommonMethods();
	public void fillName() {
		name.clear();
		name.sendKeys("Akbar");
		fillPhone();
		selectPlace();	
	}
	public void fillPhone() {
		phone.clear();
		phone.sendKeys("+8801951858580");
		Altphone.clear();
		Altphone.sendKeys("+8801567890312");
	}
	
	public void selectPlace() {
		Select s= new Select(place);
		s.selectByValue("2");
	
	}
	public void selectArea() {
		Select s1= new Select(area); 
		s1.selectByValue("34");
		fillAddress();
	}
	public void fillAddress() {
		address.clear();
		address.sendKeys("23/8,Gendaria,Dhaka");
		
	}
	
	
	public void scroll() {
		c.scroll(address);
	}
	public void radio() {
		checkBox.click();
		
	}
	public void scrollAgain() {
		d.scroll(scroll);
		//button.click();
		
	}
	public void submit() {
		button.click();
		
	}
	

}
