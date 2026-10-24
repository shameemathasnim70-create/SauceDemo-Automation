package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class CheckoutInformationTest extends BaseTest{
	
	@Test
    public void verifyProductDetails() {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
              .click();

        // Click product name
        driver.findElement(
            By.id("item_4_title_link")).click();

        // Verify product name
        String productName = driver.findElement(By.className("inventory_details_name")).getText();

        Assert.assertEquals(productName,"Sauce Labs Backpack","Product name is incorrect");

        // Verify product price is displayed
        Assert.assertTrue(driver.findElement(By.className("inventory_details_price")).isDisplayed(),"Product price is not displayed");
    }
}


