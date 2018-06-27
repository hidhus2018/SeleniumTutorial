package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {
   
	static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {

		ABC();
	}
	

	public static void ABC() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
        driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     driver.get("http:\\www.google.com");
	     Thread.sleep(2000);
	     driver.navigate().back();
	     driver.get("http://opensource.demo.orangehrmlive.com");
	     driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='txtUsername']")).clear();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	     driver.findElement(By.xpath("//input[@id = 'txtPassword']")).sendKeys("admin");
         driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	     Thread.sleep(2000);
	
		
   
	   Actions action = new Actions(driver);

	   WebElement Admin = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
	   WebElement UserManagement = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
	   WebElement User = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
	   action.moveToElement(Admin).build().perform();
	   Thread.sleep(2000);
        action.moveToElement(UserManagement).build().perform();
	   Thread.sleep(2000);
	   action.moveToElement(User).click().build().perform();
	  
	   Thread.sleep(2000);
	   
	  WebElement CheckBox5 = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_3']"));
	  CheckBox5.click();
	  Thread.sleep(2000);
	  WebElement CheckBox6 = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_3']")); 
	  CheckBox6.click();
	  Thread.sleep(2000);
	 driver.quit();

	 

	}

}
