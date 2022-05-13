package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class PlaceOrder  extends DriverSetup{
	public static String baseUrl="https://rahulshettyacademy.com/seleniumPractise/#/";
	@Test
	public void orderPlace() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='products']/div[2]/div[@class='stepper-input']/a[2]")).click();
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//div[@class='products']/div[2]/div[@class='stepper-input']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='products']/div[2]/div[@class='stepper-input']/a[2]")).click();
		Thread.sleep(2000);*/
		driver.findElement(By.xpath("//div[@class='products']/div[2]/div[@class='product-action']/button[@Type='button']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='products']/div[4]/div[@class='stepper-input']/a[2]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='products']/div[4]/div[@class='product-action']/button[@Type='button']")).click();
		//Thread.sleep(2000);
		//driver.findElement()
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e=driver.findElement(By.xpath("//div[@class='products']/div[6]"));
		js.executeScript("arguments[0].scrollIntoView();", e);
		driver.findElement(By.xpath("//div[@class='products']/div[6]/div[@class='stepper-input']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='products']/div[6]/div[@class='product-action']/button[@Type='button']")).click();
		Thread.sleep(2000);
		WebElement w=driver.findElement(By.xpath("//div[@class='products']/div[14]"));
		js.executeScript("arguments[0].scrollIntoView();",w);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='products']/div[14]/div[@class='stepper-input']/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='products']/div[14]/div[@class='product-action']/button[@Type='button']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header/div[1]/div[3]/a[4]/img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(2000);
		WebElement s=driver.findElement(By.xpath("//button[contains(text(),'Place Order')]"));
		js.executeScript("arguments[0].scrollIntoView();", s);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[contains(text(),'Bangladesh')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		Thread.sleep(5000);
	}

}
