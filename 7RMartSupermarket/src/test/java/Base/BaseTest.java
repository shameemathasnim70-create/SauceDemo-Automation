package Base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BaseTest {
	
	WebDriver driver;   // global

    public void intializeBrowser() {
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();  //window size maximising
		
	}
	
	public void browserQuit() {
		//driver.close();     current page close not browser
		driver.quit();   //complete browser close
	}
	
	public  static void main(String args[]){
		BaseTest base = new BaseTest();
		base.intializeBrowser();
		base.browserQuit();
	}
	
	
	
	}
	

