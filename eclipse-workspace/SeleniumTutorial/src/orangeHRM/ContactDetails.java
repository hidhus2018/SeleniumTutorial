package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.POMContactDetails;
import pageObject.POMEmergencyContact;
import pageObject.POMEmployeeRegistration;
import pageObject.POMLogin;

public class ContactDetails {

	
	public static void main(String[] args) throws InterruptedException {
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
		
		//POMContactDetails.NextButton(driver);
        POMContactDetails.John(driver);
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
		//POMContactDetails.CustomEdit(driver);
		//POMContactDetails.gf(driver);
		POMContactDetails.Save(driver);
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
