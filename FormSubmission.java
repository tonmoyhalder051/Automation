package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class FormSubmission extends DriverSetup {
	public static String baseUrl="https://rahulshettyacademy.com/angularpractice/";
	
	
	@Test
	public void submitForm() throws InterruptedException{
		
		driver.get(baseUrl);
		new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("name")).sendKeys("Tonmoy Halder");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("tonmoyhalder051@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("01781155153t");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.id("exampleFormControlSelect1"));
		Select s= new Select(e);
		s.selectByIndex(0);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		Thread.sleep(1000);
		WebElement w=driver.findElement(By.xpath("//input[@name='bday']"));
		w.click();
		w.sendKeys("7/5/2022");
		Thread.sleep(2000);
		WebElement a=driver.findElement(By.xpath("//*[@type='submit']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",a);
		a.click();
		Thread.sleep(1000);
		String c=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(c);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Shop")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
	} 
	

}
