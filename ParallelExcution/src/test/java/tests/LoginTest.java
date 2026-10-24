package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	 @Test(priority = 1, enabled = true)
	    public void enterUsername() {
	        driver.findElement(By.name("username")).sendKeys("admin");
	    }

	    @Test(priority = 2, dependsOnMethods = "enterUsername", enabled = true)
	    public void enterPassword() {
	        driver.findElement(By.name("password")).sendKeys("admin");
	    }

	    @Test(priority = 3, dependsOnMethods = {"enterUsername", "enterPassword"}, enabled = true)
	    public void clickLogin() {
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	    }

	    @Test(priority = 4, dependsOnMethods = "clickLogin", enabled = true)
	    public void verifyLogin() {
	        System.out.println("Login Successful");
	    }
	}

