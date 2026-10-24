package testscripts;

import org.testng.annotations.Test;

public class DependencyExample {
	
	@Test 
	public void login() {
		System.out.println("login succefull");
		// if this fails the dashboard test will be skipped
	}
 
	@Test(dependsOnMethods = {"login"})
	public void viewdashBoard() {
	System.out.println("dashboard loaded successfully");	
	}
}
