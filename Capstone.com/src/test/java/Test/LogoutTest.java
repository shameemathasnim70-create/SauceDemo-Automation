package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;

public class LogoutTest extends BaseTest {
	
	

    @Test
    public void verifyLogout() {

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        // Open the menu
        driver.findElement(By.id("react-burger-menu-btn")).click();

        // Click Logout
        driver.findElement(By.id("logout_sidebar_link")).click();

        // Verify logout
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(
            currentUrl.contains("saucedemo.com"),
            "User was not redirected to the login page"
        );

        Assert.assertTrue(
            driver.findElement(By.id("login-button")).isDisplayed(),
            "Login button is not displayed after logout"
        );
    }
}