package seleniumprograms;

import java.io.IOException;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotExample1 {
	public void googlescreenShots() throws IOException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE); 
		File des = new File("homepage.png");
		FileUtils.copyFile(src, des);
		System.out.println("Screenshot taken successfully!");
		driver.quit();
	
	}
		
	
	
	public static void main(String[] args) throws IOException  {
 
ScreenshotExample shot = new ScreenshotExample();
		
		shot.googlescreenShots();
		
	}

}
