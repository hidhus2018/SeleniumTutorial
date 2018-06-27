package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.POMContactDetails;
import pageObject.POMEmergencyContact;
import pageObject.POMEmployeeRegistration;
import pageObject.POMLogin;

public class EmergencyContact {

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
		
		POMEmergencyContact.EmergencyCntct(driver);
		POMEmergencyContact.AddButton(driver);
		POMEmergencyContact.Name(driver);
		POMEmergencyContact.Relationship(driver);
		POMEmergencyContact.HomeTele(driver);
		POMEmergencyContact.Mobile(driver);
		POMEmergencyContact.WorkTele(driver);
		POMEmergencyContact.SaveBtn(driver);
		Thread.sleep(3000);
		
//		POMEmergencyContact.CheckBox(driver);
//		POMEmergencyContact.Delete(driver);
		driver.quit();
	System.out.println("My automation test passed, yahoooo");
	}
	
}
