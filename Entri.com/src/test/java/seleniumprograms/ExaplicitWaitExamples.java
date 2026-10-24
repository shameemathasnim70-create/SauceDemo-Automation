package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExaplicitWaitExamples {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/dynamic_controls");
			driver.findElement(By.xpath("//button[text()='Enable']")).click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //10s maximum wait explicitly for specific element
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
			WebElement text = driver.findElement(By.xpath("//p[@id='message']")); //stored
			System.out.println(text.getText());
			Thread.sleep(2000);//
			driver.quit();

	}

}
