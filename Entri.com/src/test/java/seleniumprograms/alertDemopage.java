package seleniumprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDemopage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Alert Accepted successfully");
	
		driver.quit();

}
}