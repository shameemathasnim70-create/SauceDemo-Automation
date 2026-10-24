package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
    	//parameter driver we are assigning to class driver
        this.driver = driver;
    }

    // Locators
    //objects of by class
    By username = By.name("username");
    By password = By.name("password");
    By loginBtn = By.xpath("//button[text()='Sign In']");

    // Actions (Methods)
    public void enterUsername(String uname) {
        driver.findElement(username).sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public void login(String uname, String pwd) {
        enterUsername(uname);
        enterPassword(pwd);
        clickLogin();
    }
}
	
	


