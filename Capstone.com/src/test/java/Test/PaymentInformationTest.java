package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class PaymentInformationTest extends BaseTest {
	
	@Test
	public void VerifyPaymentInformation() {
		
		// login to saucedemo
		// driver.get("https://www.saucedemo.com/");

	        driver.findElement(By.id("user-name"))
	              .sendKeys("standard_user");

	        driver.findElement(By.id("password"))
	              .sendKeys("secret_sauce");
	        
	        driver.findElement(By.id("login-button")).click();
	        
	     // Add product to cart
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			
	      // open shopping cart
			driver.findElement(By.className("shopping_cart_link")).click();

		// click checkout
		driver.findElement(By.id("checkout")).click();
		
		// enter checkout information
		driver.findElement(By.id("first-name")).sendKeys("shameema");
		driver.findElement(By.id("last-name")).sendKeys("thasnim");
		driver.findElement(By.id("postal-code")).sendKeys("68001");
		
		// click continue
		driver.findElement(By.id("continue")).click();
		
		// verify payment information 
		String paymentInfo = driver.findElement(By.className("summary_value_label")).getText();
		Assert.assertEquals(paymentInfo, "SauceCard #31337","payment information is incorrect");
		
	}
}
		
		


