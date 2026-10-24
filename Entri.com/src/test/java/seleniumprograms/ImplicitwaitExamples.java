package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitwaitExamples {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //global wait applied to all elements 
		WebElement text = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		System.out.println(text.getText());
		Thread.sleep(2000);
		//driver.quit();
		
	

}
}