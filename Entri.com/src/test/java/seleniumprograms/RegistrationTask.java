package seleniumprograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationTask {

	private static By signupButton;

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		try {
			driver.get("https://practice.qabrains.com/registration");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("input")));
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy("Select"));
	WebElement nameField = driver.findElement(By.id("name"));
	nameField.sendKeys("shameema");
	
		WebElement countryDropdown = driver.findElement(By.id("country"));
		Select countrySelect = new Select(countryDropdown);
		countrySelect.selectByVisibleText("India");
		
		WebElement accountDropdown = driver.findElement(By.id("account"));
		Select accountSelect = new Select(accountDropdown);
		accountSelect.selectByVisibleText("Engineer");
		
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("shameema123@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("chichu123@");
		
		WebElement confirmPasswordField = driver.findElement(By.id("confirm_password"));
		confirmPasswordField.sendKeys("chichu123@");
		
		wait.until(ExpectedConditions.elementToBeClickable(signupButton));
		WebElement signupButton = driver.findElement(By.xpath("//button[text()='Signup']"));
		
	signupButton.click();
		
		//submit the form
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();
		
		//Wait for URL contains registered=true
		wait.until(ExpectedConditions.urlContains("registered = true"));
		
		//Return current URL after successful signup
		
		//capture current URL 
		String successURL = driver.getCurrentUrl();
		
		System.out.println(" Redirected URL:" + successURL);
		} catch(Exception e){
		System.out.println("An error occured during automation:" + e.getMessage());
		}finally {
		//close browser
		driver.quit();
		
		}	
	}
}
