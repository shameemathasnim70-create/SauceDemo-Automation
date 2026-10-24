package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptExecutorExample extends Base {
	
	public void JavaScript() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		JavascriptExecutor js = (JavascriptExecutor)driver; //object creation, type casting
		js.executeScript("window.scrollBy(0,350)", ""); //horizontally 0 vertically scroll 350 value down
		js.executeScript("window.scrollBy(0,-350)", "");//up vertical scroll -350 up
		WebElement entermessagetextField =driver.findElement(By.xpath("//input[@id='single-input-field']"));
		entermessagetextField.sendKeys("Hello");
		WebElement showmessageButton = driver.findElement(By.xpath("//button[@id=\"button-one\"]"));
		js.executeScript("arguments[0].click();", showmessageButton);//clickable element after ,
		WebElement valueaField = driver.findElement(By.xpath("//input[@id='value-a']"));
		valueaField.sendKeys("900");
		WebElement valuebField = driver.findElement(By.xpath("//input[@id='value-b']"));
		valuebField.sendKeys("200");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement totalButton = driver.findElement(By.xpath("//button[@id='button-two']"));
		wait.until(ExpectedConditions.elementToBeClickable(totalButton));
		js.executeScript("arguments[0].click();", totalButton);
		WebElement msgTwo = driver.findElement(By.xpath("//div[@id='message-two']"));
		System.out.println(msgTwo.getText());
	}
		
	public static void main(String[] args) {
		JavaScriptExecutorExample jee = new JavaScriptExecutorExample();
		jee.intializeBrowser();
		jee.JavaScript();
		jee.browserQuit();


	}
	}
		