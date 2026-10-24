package testscripts;

import org.testng.annotations.Test;

public class example {
	@Test (priority = 1)
    public void loginTest() {
		System.out.println("Executing loginTest");
	}
	@Test(priority =2)
		public void searchProductTest() {
			System.out.println("Executing search product test");
		}
	}

