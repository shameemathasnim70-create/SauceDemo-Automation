package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
	WebDriver driver;
	private By username;
	private By password;
	private By loginBtn;
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		 // Locators
	    //objects of by class
	    By username = By.name("username");
	    By password = By.name("password");
	    By loginBtn = By.xpath("//button[text()='Sign In']");

	}
	    // Actions (Methods)
	    //enter username
	    public void Username(String uname) {
	        driver.findElement(username).sendKeys(uname);
	    }
     //enter password
	    public void Password(String pwd) {
	        driver.findElement(password).sendKeys(pwd);
	    }

	    public void clickLogin() {
	        driver.findElement(loginBtn).click();
	    }
    	 
  
     public void loginToApplication(String username,String password) {
    	 this.Username(username);
    	 this.Password(password);
    	 this.clickLogin();
  
}
}