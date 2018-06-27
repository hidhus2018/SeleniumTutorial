package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pageObject.POMLogin;

public class PIM {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http:\\opensource.demo.orangehrmlive.com");
		Thread.sleep(2000);
		
		POMLogin.username(driver);
		POMLogin.password(driver);
		POMLogin.loginButton(driver);
		
		WebElement element;
		
        WebElement PIM1 = driver.findElement(By.xpath("//a [@id='menu_pim_viewPimModule']"));
        WebElement Configuration = driver.findElement(By.xpath("//a [@id='menu_pim_Configuration']"));
        WebElement DataImport = driver.findElement(By.xpath("//a [id='menu_admin_pimCsvImport']"));
        
        Actions action = new Actions(driver);
        action.moveToElement(PIM1).moveToElement(Configuration).moveToElement(DataImport).click().build().perform();
        Thread.sleep(2000);
        driver.quit();
        
	}

}
