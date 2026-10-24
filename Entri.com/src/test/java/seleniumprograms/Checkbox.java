package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox extends Base {

	public void verifysingleCheckbox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		 WebElement singleCheckbox =driver.findElement(By.xpath("//input[@id='gridCheck']"));
		singleCheckbox.click();
		boolean issingleCheckboxselected = singleCheckbox.isSelected();
	}
	
	
	public static void main(String[] args) {
	
		Checkbox obj = new Checkbox();
		obj.intializeBrowser();
		obj.verifysingleCheckbox();
		obj.browserQuit();
		
		
       	}

}
