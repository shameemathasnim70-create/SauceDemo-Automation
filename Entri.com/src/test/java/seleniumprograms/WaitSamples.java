package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitSamples extends Base {
	public void waitExamples() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement entermessagetextField =driver.findElement(By.xpath("//input[@id='single-input-field']"));
		entermessagetextField.sendKeys("Hai");
		WebElement showmessageButton =driver.findElement(By.xpath("//button[@id='button-one']"));
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(showmessageButton));
		showmessageButton.click();
		
	WebElement yourMessage = 	driver.findElement(By.xpath("//div[@id='message-one']"));
		 String msgtext = yourMessage.getText();
		 System.out.println(msgtext);
		 
	}

	public static void main(String[] args) {
	//TODO Auto.generated method stub
		WaitSamples waitsamples = new WaitSamples();
		waitsamples.intializeBrowser();
		waitsamples.waitExamples();
		waitsamples.browserQuit();
		

	}

}
