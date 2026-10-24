package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[text()='Click Here']")).click(); 
		String mainWindow = driver.getWindowHandle();
		for(String window: driver.getWindowHandles()) {
			if(!window.equals(mainWindow)) { 
				driver.switchTo().window(window);
				break;
			}
			
		}
	
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		driver.close();
		driver.switchTo().window(mainWindow);
		String title= driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}



	}


