package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionExamples extends Base{
	public void mouseEvents() {
	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");	
    WebElement firstElement =	driver.findElement(By.xpath("//span[text()='Draggable n°1']"));	
    WebElement secondElement =	driver.findElement(By.xpath("//div[@id='mydropzone']"));
    Actions action =new Actions(driver);
    action.moveToElement(firstElement).build().perform();
    action.contextClick(firstElement).perform();
    action.doubleClick(firstElement).perform();
    action.dragAndDrop(firstElement, secondElement).perform();
    
	}
	

	public static void main(String[] args) {
	ActionExamples actionexamples = new ActionExamples();
	actionexamples.intializeBrowser();
	actionexamples.mouseEvents();
	actionexamples.browserQuit();
	

	}

}
