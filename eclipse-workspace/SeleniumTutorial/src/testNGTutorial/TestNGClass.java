package testNGTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.POMAdmin;
import pageObject.POMEmployeeRegistration;
import pageObject.POMLogin;

public class TestNGClass {
	WebDriver driver;
	
	@BeforeMethod 
	public void LoginApp() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http:\\opensource.demo.orangehrmlive.com");
		
		
	}
	@Test (groups = {"login"})
	public void login () {
		POMLogin.username(driver);
		POMLogin.password(driver);
		POMLogin.loginButton(driver);
	}
	
	@Test (groups = {"MouseHover"})
	public void MouseHoverPIM() {
		POMEmployeeRegistration.PIM(driver);
		POMEmployeeRegistration.EmployeeList(driver);
		}
	
	@Test  (dependsOnMethods = {"MouseHoverPIM"})
		public void MouseHoverAdmin() {
			POMAdmin.Admin(driver);
			POMAdmin.UserManagement(driver);
			POMAdmin.Users(driver);
	}
	
	@AfterMethod 
	public void CloseApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}
	

}
