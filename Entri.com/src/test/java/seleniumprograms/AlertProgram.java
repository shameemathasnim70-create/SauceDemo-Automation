package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertProgram extends Base {
	public void alertSamples() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		//Simple alert
		WebElement simplealertButton = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		simplealertButton.click(); // simple alert popup
		String alertText = driver.switchTo().alert().getText(); //alert box text handling
		System.out.println(alertText); //console
		driver.switchTo().alert().accept(); //ok button click hanling
		
		//Confirmation alert
		WebElement secondconfirmationalertButton = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		secondconfirmationalertButton.click();//confirmation alert ok click
		driver.switchTo().alert().dismiss();// cancel button click
		
		//Prompt alert
		WebElement promptalertButton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		promptalertButton.click(); 
		driver.switchTo().alert().sendKeys("Ajay j"); //Text Entered in prompt field
		driver.switchTo().alert().accept(); //accept
		//driver.switchTo().alert().dismiss(); cancel
		
		
	}

	public static void main(String[] args) {
		AlertProgram alertprogram = new AlertProgram();
		alertprogram.intializeBrowser();
		alertprogram.alertSamples();
		alertprogram.browserQuit();

	}


	




	}


	

	


