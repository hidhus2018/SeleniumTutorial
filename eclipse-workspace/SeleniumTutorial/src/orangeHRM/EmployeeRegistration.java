package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.POMContactDetails;
import pageObject.POMEmergencyContact;
import pageObject.POMEmployeeRegistration;
import pageObject.POMLogin;

public class EmployeeRegistration {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http:\\opensource.demo.orangehrmlive.com");
		
		POMLogin.username(driver);
		POMLogin.password(driver);
		POMLogin.loginButton(driver);
		
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
		
		
		//POMContactDetails.John(driver);
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
		
		driver.quit();
		

			
	}

}
