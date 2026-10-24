package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {
  
	
	public void locatorsExamples() {
		
		
		WebElement idAttribute = driver.findElement(By.id("button-one"));
	WebElement nameAttribute =	driver.findElement(By.name("description"));
		WebElement linkTest = driver.findElement(By.linkText("radio-button-demo"));
		WebElement partialLinkText =driver.findElement(By.partialLinkText("button-demo"));
	WebElement className =	driver.findElement(By.className("card-header"));
	WebElement tagName =	driver.findElement(By.tagName("button"));
	WebElement cssSelector =driver.findElement(By.cssSelector("button#button-one"));
WebElement cssSelector2 =	driver.findElement(By.cssSelector("button.btn btn-primary"));
WebElement cssSelector3 =	driver.findElement(By.cssSelector("button[id='button-one']"));
	}
	
	public void xpathlocators() {
	WebElement xpath =	driver.findElement(By.xpath("//input[@id='single-input-field']"));//smiple xpath
	 WebElement containsmethod =driver.findElement(By.xpath("//button[contains(@class,'btn btn')]"));
	WebElement startswithmethod = driver.findElement(By.xpath("//input[starts-with(@class,'form-control')]"));
	 WebElement textof =driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		
	}
	public static void main(String[] args) {
		
	}

}
