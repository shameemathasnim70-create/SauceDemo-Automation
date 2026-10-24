package tests;

import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {

	@Test(priority = 1, enabled = true)
    public void verifyDashboardTitle() {
        String title = driver.getTitle();
        System.out.println("Dashboard Title: " + title);
    }

    @Test(priority = 2, dependsOnMethods = "verifyDashboardTitle", enabled = true)
    public void verifyURL() {
        String url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
    }
}




