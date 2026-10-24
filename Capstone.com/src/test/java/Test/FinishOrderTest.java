package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class FinishOrderTest extends BaseTest {
	
	@Test
    public void verifyFinishOrder() {

        // Login
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        // Add product to cart
        driver.findElement(
            By.id("add-to-cart-sauce-labs-backpack")).click();

        // Open cart
        driver.findElement(By.className("shopping_cart_link")).click();

        // Checkout
        driver.findElement(By.id("checkout")).click();

        // Enter checkout information
        driver.findElement(By.id("first-name")).sendKeys("Shameema");

        driver.findElement(By.id("last-name")).sendKeys("thasnim");

        driver.findElement(By.id("postal-code")).sendKeys("680001");

        driver.findElement(By.id("continue")).click();

        // Finish order
        driver.findElement(By.id("finish")).click();

        // Verify order confirmation
        String confirmation = driver.findElement(By.className("complete-header")).getText();

        Assert.assertEquals(confirmation,"Thank you for your order!","Order confirmation message is incorrect");
    }
}


