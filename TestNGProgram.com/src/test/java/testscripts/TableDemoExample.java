package testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemoExample {

public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");

        // 1. Locate the table
        WebElement table = driver.findElement(By.name("BookTable"));

        // 2. Get all rows
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println("Total Rows: " + rows.size());

        // 3. Iterate through rows and columns
        for (int i = 1; i < rows.size(); i++) { // Starting from 1 to skip header
            List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

            for (WebElement cell : cols) {
                System.out.print(cell.getText() + " | ");
            }
            System.out.println(); // New line for each row
        }

        driver.quit();
    }



	}


