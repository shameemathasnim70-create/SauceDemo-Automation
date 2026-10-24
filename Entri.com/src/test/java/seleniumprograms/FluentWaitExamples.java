package seleniumprograms;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExamples {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)     //fluent wait object creation
	            .withTimeout(Duration.ofSeconds(30)) //total 30s wait
	            .pollingEvery(Duration.ofSeconds(5)) //for each 5s, checking for elementc 
	            .ignoring(NoSuchElementException.class);
		
		WebElement textMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
		System.out.println(textMessage.getText());
		driver.quit();
		
		

	}
	



	}


