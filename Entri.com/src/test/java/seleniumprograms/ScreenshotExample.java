package seleniumprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenshotExample {
	
	public void googlescreenShots() throws IOException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver; //convert driver type into screenshot type via type casting
		File src = ts.getScreenshotAs(OutputType.FILE); //take screenshot using method getscreenshots
		
		File des = new File("C:\\Users\\Rasheena Ali\\Downloads\\screenshot\\goole.png");
		FileUtils.copyFile(src, des);
		System.out.println("Screenshot taken successfully!");
		driver.quit();
	
	}


	public static void main(String[] args) throws IOException {
		
ScreenshotExample shot = new ScreenshotExample();
		
		shot.googlescreenShots();
		


	}

}
