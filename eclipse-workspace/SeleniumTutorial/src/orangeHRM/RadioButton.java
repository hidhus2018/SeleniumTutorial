package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http:\\opensource.demo.orangehrmlive.com");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin");
		Thread.sleep(1000);
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginButton.click();
		Thread.sleep(2000);
		
		WebElement Admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement UserManagement = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement Users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(Admin).moveToElement(UserManagement).moveToElement(Users).click().build().perform();
		Thread.sleep(2000);
		
		WebElement Checkbox1 = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_6']"));
		action.moveToElement(Checkbox1).click().build().perform();
		Thread.sleep(2000);
		WebElement Checkbox2 = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_6']"));
		action.moveToElement(Checkbox2).click().build().perform();
		Thread.sleep(2000);
		driver.navigate();
		
		WebElement PIM = driver.findElement(By.xpath("//a[@ id='menu_pim_viewPimModule']"));
		WebElement Configuration = driver.findElement(By.xpath("//a[@ id='menu_pim_Configuration']"));
		WebElement EmployeeList = driver.findElement(By.xpath("//a[@ id='menu_pim_viewEmployeeList']"));
		action.moveToElement(PIM).moveToElement(Configuration).moveToElement(EmployeeList).click().build().perform();
		Thread.sleep(2000);
		driver.quit();
		


	}

}
