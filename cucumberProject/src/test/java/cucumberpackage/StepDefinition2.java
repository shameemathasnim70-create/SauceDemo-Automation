package cucumberpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 {
	WebDriver driver;
	@Given("the user is on the product search page")
	public void theuserisontheproductsearchpage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/inventory.html");
	}
	
	@When(" the user selects a product")
	public void theuserselectsaproduct() {
		WebElement product = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		product.click();
	}
	@Then("the product details page should be displayed")	
	public void theproductdetailspageshouldbedisplayed() {
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}
		
	}
			


