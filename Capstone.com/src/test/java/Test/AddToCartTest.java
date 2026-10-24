package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.ProductPage;

public class AddToCartTest extends BaseTest{
	
	@Test
	public void verifyAddToCart() {
		
		// Login first
	    driver.findElement(By.id("user-name"))
	          .sendKeys("standard_user");

	    driver.findElement(By.id("password"))
	          .sendKeys("secret_sauce");

	    driver.findElement(By.id("login-button"))
	          .click();
		
		// Add product to cart
		ProductPage product = new ProductPage(driver);
		product.addProductToCart();
		
		//Verify cart badge
		String cartCount = driver.findElement(By.className("shopping_cart_badge")).getText();
		
		Assert.assertEquals(cartCount, "1","cart count is incorrect");
	}
	

}
