package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	
		WebDriver driver;
		@Test
		public void selectclassexamples() {
			driver = new ChromeDriver();
			driver.navigate().to("https://selenium.qabible.in/select-input.php");
			WebElement selectdropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
			Select select = new Select(selectdropDown); //dropdowns menu handling class by selenium
			SoftAssert softassert = new SoftAssert();
			
			select.selectByValue("Red");
			String selected_value_one = select.getFirstSelectedOption().getText();
			//Assert used for verifying displayed message same or not.
			softassert.assertEquals(selected_value_one, "Red", "Red selection Failed");
			select.selectByVisibleText("Yellow");//hw: implement soft assert 
			select.selectByIndex(3);
			driver.quit();
			
		}
		
	}


