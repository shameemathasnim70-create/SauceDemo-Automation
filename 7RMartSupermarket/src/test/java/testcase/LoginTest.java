package testcase;

import org.testng.annotations.Test;

import Base.BaseTest;
import Utils.Excelutils;
import page.LoginPage;

public class LoginTest extends BaseTest  {

	LoginPage loginPage;

    @Test
    public void loginTest() throws Exception {

        loginPage = new LoginPage(driver);

        // Read data from Excel
        String username = Excelutils.getCellData(1, 0);
        String password = Excelutils.getCellData(1, 1);

        // Use POM
        loginPage.login(username, password);

        // Write result
        Excelutils.setCellData(1, 2, "Login Attempted");
    }
			
		
	}


