package seleniumprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadExampleThree {

	

	    public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.get("https://smallpdf.com/pdf-to-word");
	        WebDriverWait wait =
	                new WebDriverWait(driver, Duration.ofSeconds(60));

	        // Upload file directly
	        WebElement upload =
	                driver.findElement(By.xpath("//input[@type='file']"));

	        upload.sendKeys(
	                "C:\\Users\\Rasheena Ali\\Downloads\\Untitled document.pdf");

	        // Wait for Convert button
	        WebElement convertBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(
	                        By.xpath("//span[contains(text(),'Convert')]")));

	        convertBtn.click();

	        // Download
	        WebElement downloadBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(
	                        By.xpath("//span[contains(text(),'Download')]")));

	        downloadBtn.click();

	        System.out.println("Conversion successful!");

	        driver.quit();
	    }

}
	     