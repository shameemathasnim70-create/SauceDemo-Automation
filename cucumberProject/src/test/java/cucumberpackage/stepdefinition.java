package cucumberpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
	WebDriver driver;
	@Given("The user is on the login page")
	public void theuserisontheloginpage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	}
    @When("The user enters a valid username and password")
	public void theuserentersavalidusernameandpassword() {
		WebElement usernamefield = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passwordfield = driver.findElement(By.xpath("//input[@name='password']"));
		usernamefield.sendKeys("admin");
		passwordfield.sendKeys("admin");
	}
	
    @When("Clicks the login button")
	public void clickstheloginbutton() {
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Sign In']"));
		loginbutton.click();
	}
    
    @Then("The User Should be redirected to the home page")
	public void usershouldberedirecttothehomepage() {
		String title =driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}
    @When("The user enters invalid username and invalid password")
    public void theuserentersinvalidusernameandinvalidpassword() {
    	WebElement usernameField = driver.findElement(By.xpath("//input[@name='username']")); 
        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']")); 
        usernameField.sendKeys("invalid");
        passwordField.sendKeys("invalid");
    }
    @Then("An error message should be displayed")
    public void anerrormessageshouldbedisplayed() {
    
            String errorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
            
            System.out.println(errorMsg);
           // assertTrue(errorMsg.contains("Invalid Username/Password"));
            driver.quit();
    	    }
	}
		
	


