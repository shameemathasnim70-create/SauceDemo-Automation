package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetPageTitle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.qabrains.com/registration");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("registration"));
		String actualTitle = driver.getTitle();
		String exepectedTitle ="QA Practice Site";
		if(actualTitle.equals(exepectedTitle)) {
			System.out.println("Validation Successful!");
			System.out.println("page Title =\"" + actualTitle +"\"" );
		}else {
			System.out.println("Validation Failed.");
			System.out.println("Expected:" + exepectedTitle + "but found:" + actualTitle);
		
		
			
		
		driver.quit();
	}

	}
}
