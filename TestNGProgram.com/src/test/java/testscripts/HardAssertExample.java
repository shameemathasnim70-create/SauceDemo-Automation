package testscripts;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

@Test
public class HardAssertExample {
	
		WebDriver driver ; 
		
	public void alertSamples() {
			driver = new ChromeDriver();
			driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
			//Simple alert
			WebElement simplealertButton = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
			simplealertButton.click(); // simple alert popup
			String alertText = driver.switchTo().alert().getText(); //alert box text handling
			//Hard assert implement (actual output, expected output, assert failed message if not equal)
			Assert.assertEquals(alertText, "I am a Javascript alert box!", "Simple alert text mismatch");
			
			
			System.out.println(alertText); //console
			driver.switchTo().alert().accept(); //ok button click hanling
			
			//Confirmation alert
			WebElement secondconfirmationalertButton = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
			secondconfirmationalertButton.click();//confirmation alert ok click
			String conformation_alert_text = driver.switchTo().alert().getText();
			// Hard assert
			Assert.assertEquals(conformation_alert_text, "Press a button!", "Conformation alert text miss match");
			driver.switchTo().alert().dismiss();// cancel button click
			WebElement  dismiss_msg = driver.findElement(By.xpath("//p[@id='confirm-demo']"));
			String dismiss_message = dismiss_msg.getText();
			Assert.assertTrue(dismiss_message.contains("Cancel"), "Dismiss action failed!");
			//Prompt alert
			WebElement promptalertButton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
			promptalertButton.click(); 
			driver.switchTo().alert().sendKeys("Ajay j"); //Text Entered in prompt field
			
			driver.switchTo().alert().accept(); //accept
			
			String prompt_alert_message = driver.findElement(By.xpath("//p[@id='prompt-demo']")).getText();
			
			Assert.assertTrue(prompt_alert_message.contains("Ajay j"), "Prompt input not reflected");
			
			//driver.switchTo().alert().dismiss(); cancel
			driver.quit();
			
		}

	}

	

		