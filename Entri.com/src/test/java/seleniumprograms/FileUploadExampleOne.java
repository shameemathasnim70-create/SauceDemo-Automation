package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExampleOne {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		
		choosefile.sendKeys("C:\\Users\\Rasheena Ali\\OneDrive\\Documents\\MINI PROJECT\\Book1.xlsx");
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		

	}

}
