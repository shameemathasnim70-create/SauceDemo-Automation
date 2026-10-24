package jenkinsexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsLogin {
	WebDriver driver;
	@Test
	public void inintializeBrowser() {
	driver = new ChromeDriver();
	driver.get("https://selenium.qabible.in/simple-form-demo.php");
	driver.manage().window().maximize();
	driver.quit();
	}
	
	
	

}
