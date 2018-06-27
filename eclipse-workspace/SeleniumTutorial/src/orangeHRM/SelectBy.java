package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectBy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http:\\opensource.demo.orangehrmlive.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		WebElement Admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		WebElement UserManagement = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement Users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(Admin).moveToElement(UserManagement).moveToElement(Users).click().build().perform();
		
		WebElement UserRoleDD = driver.findElement(By.xpath("//select[@ id='searchSystemUser_userType']"));
	
		Select select = new Select(UserRoleDD);
    	select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("2");
		
		WebElement StatusDD = driver.findElement(By.xpath("//select[@id='searchSystemUser_status']"));
		Select select1 =new Select(StatusDD);
		select1.selectByIndex(1);
		Thread.sleep(2000);
		select1.selectByVisibleText("Disabled");
		Thread.sleep(2000);
		driver.quit();
	}

}
