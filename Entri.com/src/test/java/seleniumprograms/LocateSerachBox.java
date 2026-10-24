package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateSerachBox {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.get(" https://www.google.com");
		driver.manage().window().maximize();
	    WebElement searchBox =	driver.findElement(By.xpath("//textarea[@name='q']"));
	    searchBox.sendKeys("Selenium WebDriver");
	    driver.findElement(By.name("q"));
		searchBox.submit();
		System.out.println("page title is"+ driver.getTitle());
	
		driver.quit();
	}
	

}
