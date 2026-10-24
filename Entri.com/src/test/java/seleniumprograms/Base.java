package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	
	WebDriver driver;   // global

    public void intializeBrowser() {
		driver = new EdgeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();  //window size maximising
		
	}
	
	public void browserQuit() {
		//driver.close();     current page close not browser
		driver.quit();   //complete browser close
	}
	
	public  static void main(String args[]){
		Base base = new Base();
		base.intializeBrowser();
		base.browserQuit();
	}
	
	
	
	
}
