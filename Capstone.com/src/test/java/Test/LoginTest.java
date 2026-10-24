package Test;

import org.openqa.selenium.By;
import org.testng.Assert;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test
	public void validLoginTest() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		//verify successful login
		String actualUrl = driver.getCurrentUrl();
		Assert.assertTrue(actualUrl.contains("inventory.html"), "Login failed!");
	}
	
	@Test
	public void invalidLoginTest() {
	driver.findElement(By.id("user-name")).sendKeys("wrong_user");
	driver.findElement(By.id("password")).sendKeys("wrong_password");
	driver.findElement(By.id("login-button")).click();
	
	String actualError =driver.findElement(By.cssSelector("[data-test='error']")).getText();
	Assert.assertTrue(actualError.contains("Username and password do not match"), "Expected invalid login error message was not displayed");
	
	
			
		
	}

}
