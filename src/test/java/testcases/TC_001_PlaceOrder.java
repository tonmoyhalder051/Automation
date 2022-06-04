package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import base.DriverSetup;
import pageObjectModel.POM001_HomePage;
import pageObjectModel.POM002_GoogleSignUp;
import pageObjectModel.POM003_CompleteSignUp;
import pageObjectModel.POM004_SelectAuthor;
import pageObjectModel.POM005_ScrollDwon;
import pageObjectModel.POM006_AddCart;
import pageObjectModel.POM007_Shipping;



public class TC_001_PlaceOrder extends DriverSetup {
	public static String baseUrl = "https://www.rokomari.com/book";

	@Test
	public void orderPlace() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		new WebDriverWait(driver, Duration.ofSeconds(10));
		Thread.sleep(3000);

		
		POM001_HomePage google = new POM001_HomePage(driver);
		google.clickOnGoogle();
		Thread.sleep(2000);

		POM002_GoogleSignUp click = new POM002_GoogleSignUp(driver);
		click.email();
		Thread.sleep(2000);

		POM003_CompleteSignUp clickagain = new POM003_CompleteSignUp(driver);
		clickagain.password();
		Thread.sleep(5000);

		POM004_SelectAuthor c = new POM004_SelectAuthor(driver);
		c.selectAuthor();
		Thread.sleep(1000);
		
		POM005_ScrollDwon sd= new POM005_ScrollDwon(driver);
		sd.scroll();
		Thread.sleep(1000);
		
		
		POM005_ScrollDwon fc =new POM005_ScrollDwon(driver); 
		fc.nextPage();
		Thread.sleep(1000);
		
		POM005_ScrollDwon fe= new POM005_ScrollDwon(driver);
		fe.scrollAgain();
		Thread.sleep(1000);
		
		POM005_ScrollDwon ff= new POM005_ScrollDwon(driver);
		ff.hoverBook();
		Thread.sleep(1000);
		
		POM006_AddCart checkout=new POM006_AddCart(driver);
		checkout.checkOut();
		Thread.sleep(1000);
		
		POM007_Shipping form= new POM007_Shipping(driver);
		form.fillName();
		Thread.sleep(1000);
		
		
		POM007_Shipping select= new POM007_Shipping(driver); 
		select.selectArea();
		Thread.sleep(1000);

		POM007_Shipping select1= new POM007_Shipping(driver); 
		select1.scroll();
		Thread.sleep(3000);
		
		POM007_Shipping select2= new POM007_Shipping(driver); 
		select2.radio();
		Thread.sleep(3000);
		
		POM007_Shipping submit= new POM007_Shipping(driver); 
		submit.scrollAgain();
		Thread.sleep(3000);
		
		POM007_Shipping submitOrder= new POM007_Shipping(driver); 
		submitOrder.submit();
		Thread.sleep(3000);
	}

}
