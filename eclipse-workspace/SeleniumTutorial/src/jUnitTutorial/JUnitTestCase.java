package jUnitTutorial;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import pageObject.POMEmployeeRegistration;
import pageObject.POMLeave;
import pageObject.POMLogin;
import pageObject.POMMouseHoverClass;
import pageObject.POMPIM;
import pageObject.POMTime;
import pageObject.POMAdmin;

public class JUnitTestCase {
	 WebDriver driver;
	

	
	@Before
	public  void beforeAll() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http:\\opensource.demo.orangehrmlive.com");
		POMLogin.username(driver);
		POMLogin.password(driver);
		POMLogin.loginButton(driver);
	}
	
	@Test
	public void MouseHoverAdmin() {
	POMAdmin.Admin(driver);
	POMAdmin.UserManagement(driver);
	POMAdmin.Users(driver);
		
	}
	@Test
	public void MouseHoverPIM() {
		POMEmployeeRegistration.PIM(driver);
		POMEmployeeRegistration.EmployeeList(driver);
		
		
	}
	@Test
	public void MouseHoverDataImport() throws InterruptedException {
		POMPIM.PIM1(driver);
		POMPIM.Configuration(driver);
		POMPIM.DataImport(driver);
	}
	@Test
	public void MouseHoverLeave() throws InterruptedException {
		POMLeave.Leave(driver);
		POMLeave.Entitlements(driver);
		POMLeave.AddEntitlements(driver);
	}
	@Test
	public void MouseHoverTime() throws InterruptedException {
		POMTime.Time(driver);
		POMTime.Reports(driver);
	}	
	
	@After
	public  void after() throws InterruptedException {

		Thread.sleep(2000);
		driver.quit();

	}
	
		
	}
