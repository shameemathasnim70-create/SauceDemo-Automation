package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		try {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice-automation.com/iframes/");
		driver.manage().window().maximize();
		WebElement textBox = driver.findElement(By.id("main"));
		driver.switchTo().frame("top-Iframes");
	
	textBox.sendKeys("Hello selenium!");
		driver.switchTo().defaultContent();
		System.out.println("Returned to main page:"+ driver.getTitle());
		}catch (Exception e) {
		driver.quit();
		}
		}
}