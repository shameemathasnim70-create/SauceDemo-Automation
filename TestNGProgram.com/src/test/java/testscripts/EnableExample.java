package testscripts;

import org.testng.annotations.Test;

public class EnableExample {
	@Test(enabled = true) 
	public void activeTest() {
		System.out.println("this will execute");
	}
	@Test(enabled = false)
 public void deprecatedTest() {
	 System.out.println("this test disable and will not execute");
 }
}
