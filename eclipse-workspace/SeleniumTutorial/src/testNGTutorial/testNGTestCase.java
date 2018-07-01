package testNGTutorial;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testNGTestCase {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is beforeSuite Method ");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is beforeTest Method ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is beforeClass Method ");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is beforeMethod Method ");
	}
		
	@Test 
	public void f() {
		System.out.println("This is Test Method ");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is AfterMethod Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is AfterClass Method");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is AfterTest Method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is AfterSuite Method");
	}

}
