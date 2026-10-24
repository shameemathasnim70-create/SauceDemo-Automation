package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
			//id locator
			driver.findElement(By.id("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
			//Name locator
			driver.findElement(By.name("//input[@name='field-keywords']")).click();
			//css selector 
			driver.findElement(By.cssSelector("//input[@name='field-keywords']")).click();
			//xpath
			driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
			//linktext
			driver.findElement(By.linkText("today's deals")).click();
			//tag name
			driver.findElement(By.tagName("a")).getSize();
			driver.quit();
		
	}
}
			
		
		
		
	


