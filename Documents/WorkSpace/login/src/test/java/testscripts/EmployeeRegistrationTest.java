package testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.POMContactDetails;
import pageObjects.POMEmergencyContact;
import pageObjects.POMEmployeeRegistration;
import pageObjects.POMLogin;

public class EmployeeRegistrationTest {

	WebDriver driver;

	@BeforeClass
	public void loginApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http:\\opensource.demo.orangehrmlive.com");

		POMLogin.username(driver);
		POMLogin.password(driver);
		POMLogin.loginButton(driver);

	}

	@Test
	public void employeeRegistration() {

		POMEmployeeRegistration.PIM(driver);
		POMEmployeeRegistration.EmployeeList(driver);
		POMEmployeeRegistration.AddButton(driver);
		POMEmployeeRegistration.FirstName(driver);
		POMEmployeeRegistration.LastName(driver);
		POMEmployeeRegistration.EmployeeID(driver);
		POMEmployeeRegistration.CreateLogin(driver);
		POMEmployeeRegistration.username(driver);
		POMEmployeeRegistration.password(driver);
		POMEmployeeRegistration.Cpassword(driver);
		POMEmployeeRegistration.SaveButton(driver);

		// POMContactDetails.John(driver);
		POMContactDetails.ContactDet(driver);
		POMContactDetails.EditButton(driver);
		POMContactDetails.Address1(driver);
		POMContactDetails.Address2(driver);
		POMContactDetails.City(driver);
		POMContactDetails.State(driver);
		POMContactDetails.ZipPostal(driver);
		POMContactDetails.Country(driver);
		POMContactDetails.HomeTele(driver);
		POMContactDetails.Mobile(driver);
		POMContactDetails.WorkTele(driver);
		POMContactDetails.WorkEmail(driver);
		POMContactDetails.OtherEmail(driver);
		POMContactDetails.Save(driver);

		POMEmergencyContact.EmergencyCntct(driver);
		POMEmergencyContact.AddButton(driver);
		POMEmergencyContact.Name(driver);
		POMEmergencyContact.Relationship(driver);
		POMEmergencyContact.HomeTele(driver);
		POMEmergencyContact.Mobile(driver);
		POMEmergencyContact.WorkTele(driver);
		POMEmergencyContact.SaveBtn(driver);

	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}

}
