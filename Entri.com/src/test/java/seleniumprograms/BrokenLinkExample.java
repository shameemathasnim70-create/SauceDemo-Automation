package seleniumprograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkExample {

	public static void main(String[] args) {

		//clicked link not working
				WebDriver driver= new ChromeDriver();
				driver.get("https://business.facebook.com/signup");
				List<WebElement> links = driver.findElements(By.tagName("a"));//all links in a tags from that page
				System.out.println("Total number of links :"+links.size()); //links count print
				for(WebElement link:links ) {
					String url = link.getAttribute("href"); //url value in href
					if(url == null || url.isEmpty()) { 
						continue; //skip
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


