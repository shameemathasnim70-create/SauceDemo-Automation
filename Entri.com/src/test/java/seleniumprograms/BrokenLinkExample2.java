package seleniumprograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinkExample2 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://business.facebook.com/signup");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links :"+links.size()); 
		for(WebElement link:links ) {
			String url = link.getAttribute("href"); 
			if(url == null || url.isEmpty()) { 
				continue; 
			}
			
			try {
				URL linkurl = new URL(url); 
				HttpURLConnection con= (HttpURLConnection)linkurl.openConnection();
				con.setConnectTimeout(3000);
				con.connect();
				if(con.getResponseCode()>= 400) {
					System.out.println(url+"Broken link");
				}
				else {
					System.out.println(url+"Valid link");
				}
			}catch(Exception e) {
				System.out.println(url+"Error ");
				}
				}
			driver.quit();
		
	}

}
