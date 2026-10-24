package crossBrowserTestExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Base {
	WebDriver driver;//global declare
	
	@Parameters("browser")//from xml file value to here
	@Test
	public void launchbrowser(String browserName) {
	if(browserName.equalsIgnoreCase("Chrome")) {
		driver =new ChromeDriver();//browser launch
	}
	else if(browserName.equalsIgnoreCase("Firefox")) {
		driver =new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("Edge")) {
		driver =new EdgeDriver();
	}
	driver.get("https://www.allrecipes.com/");
	System.out.println("test running on"+browserName);
	driver.quit();
	}

}
