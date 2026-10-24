package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserWithoutTestNJ  {

	
	public static void main(String[] args) throws InterruptedException {

		runTest("chrome"); //jvm starting point
		runTest("firefox"); //browser value in ""
		runTest("edge");
		

	}
public static void runTest(String browser) throws InterruptedException {
	
	WebDriver driver;
	
	
	if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		
	}
	else if(browser.equalsIgnoreCase("firefox")){
		driver = new FirefoxDriver();
		
	}
	else if(browser.equalsIgnoreCase("edge")){
		driver = new EdgeDriver();
		
	}
	else {
		throw new IllegalArgumentException("Invalid browser");
	}
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	System.out.println("Title "+driver.getTitle());
	driver.quit();
}



}

