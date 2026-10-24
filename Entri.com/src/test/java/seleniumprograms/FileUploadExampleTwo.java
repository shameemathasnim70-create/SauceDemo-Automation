package seleniumprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadExampleTwo {

	public static void main(String[] args) throws AWTException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://smallpdf.com/word-to-pdf");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        // Click Choose Files button
        WebElement chooseFilesClick = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span[text()='Choose Files']")));

        chooseFilesClick.click();

        // File path copy
        StringSelection stringSelection =
                new StringSelection("C:\\Users\\Rasheena Ali\\OneDrive\\Documents\\Doc1.docx");

        Toolkit.getDefaultToolkit().getSystemClipboard()
                .setContents(stringSelection, null);

        Robot robot = new Robot();

        robot.delay(2000);

        // CTRL + V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.delay(1000);

        // ENTER
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Wait for Convert button after upload
        WebElement convertBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[contains(text(),'Convert')]")));

        convertBtn.click();

        // Wait for Download button
        WebElement downloadBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//*[contains(text(),'Download')]")));

        downloadBtn.click();

        System.out.println("File uploaded and converted successfully!");

        driver.quit();
    }
}



