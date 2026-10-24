package seleniumprograms;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationForm {

	

		public static Map<String,Boolean>RegistrationFormElements(WebDriver driver){
		
		driver.get("https://practice.qabrains.com/registration");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("input")));
		//create a HashMap
		Map<String,Boolean> elementMap = new HashMap<>();
		//verify elements
		boolean nameField  = driver.findElement(By.name("name")).isDisplayed();
		boolean country = driver.findElement(By.name("country")).isDisplayed();
		boolean emailField = driver.findElement(By.name("email")).isDisplayed();
		boolean accountType = driver.findElement(By.name("account")).isDisplayed();
		boolean passwordField = driver.findElement(By.name("password")).isDisplayed();
		boolean confirmPasswordField =driver.findElement(By.name("confirm_password")).isDisplayed();
		boolean signupButton = driver.findElement(By.xpath("//button[text()='Signup']")).isDisplayed();
		//store in map
		elementMap.put("EmailFiled", emailField);
		elementMap.put("namefield", nameField);
		elementMap.put("confirmPasswordField", confirmPasswordField);
		elementMap.put("country",country );
		elementMap.put("PasswordField", passwordField);
		elementMap.put("AccountType", accountType);
		elementMap.put("signupButton", signupButton);
		
		return elementMap;
}
		
		public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();

	        try {
	            Map<String, Boolean> output = RegistrationFormElements(driver);
	            System.out.println(output);
	        } finally {
	            driver.quit();
	        }
	    }
	
	
		
		
		
	}


