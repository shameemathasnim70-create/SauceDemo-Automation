package hackearth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationScripts {
	//Barchart
	/* Navigate to Bar Chart Page
	   URL : https://projects.hackerearth.com/p5/index.html#/
		Steps to implement:
		1. Create a WebDriverWait with an appropriate timeout.
		2. Wait for the Bar Chart navigation element to be PRESENT using  
		   ExpectedConditions.presenceOfElementLocated().
		3. Scroll to the Bar Chart element using JavascriptExecutor for better visibility.
		4. Allow time for the scroll action to complete using Thread.sleep().
		5. Click on the Bar Chart element using JavascriptExecutor.
		6. Allow time for the page to fully load using Thread.sleep().
		7. Get the current URL using driver.getCurrentUrl().
		8. Wait for the header element to be PRESENT and extract its text.
		9. Return both the URL and header as a List<Object>.
		*/

	public List<Object> barchartNavigation(WebDriver driver) throws InterruptedException { 
	driver.get("");	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement barChartNav = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(//*[@id='features']/div/a[2]/h3)));
	JavascriptExecutor js = (JavascriptExcecutor)driver;
	js.excecutescript("arguments[0].scrollintoview(true");",barChartNav);"
			 Thread.sleep(3000);
			 js.executeScript("arguments[0].click();,barChartnav);
	Thread.sleep(3000);
		
				
		return null;  }
	//task2
	// 1. navigate to url : https://projects.hackerearth.com/p4/index.html#/");
	// 2. //Wait for the "Dynamic Table" link to be clickable using an explicit wait. (Use   ExpectedConditions.elementToBeClickable)
	// 3.  Click the Dynamic Table link
	 //4. Wait for 2 seconds (optional or can be replaced by a smarter wait if needed).
	 //5. Click the "Add Row" button using an explicit wait. (Use ExpectedConditions.elementToBeClickable)


	 //6. Wait for all table rows to become visible after clicking the Add Row button.(Use ExpectedConditions.visibilityOfAllElementsLocatedBy)
	// 7. Retrieve the table details
	//8. Navigate to the next step/page (you can modify this as needed) // Example: Clicking "Home" button if available
	//9 Get the current URL
	//10 Return the list with [ tablesdetails, URL]
	public List<String> tabledata(WebDriver driver) throws InterruptedException
	{
 driver.get(" https://projects.hackerearth.com/p4/index.html#");
 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
 WebElement dynamicTable =wait.until(null)
		return null; }

	
	//https://docs.google.com/document/d/1L1LVf7VKEb_81gfrf_obPzP73bvSFB5igJbuabX0Z-c/edit?usp=sharing
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		
	}
}




