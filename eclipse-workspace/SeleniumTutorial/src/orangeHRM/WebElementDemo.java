package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http:\\opensource.demo.orangehrmlive.com");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Admin");
//		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//		
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
//		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
//		//driver.findElement(By.name("txtPassword")).sendKeys("admin");
//		
//		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//		//driver.findElement(By.xpath("//input[@type='submit']")).click();
//		//driver.findElement(By.name("Submit")).click();
	    
	  //	int x =2;
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		username.clear();
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("admin");
		password.clear();
		password.sendKeys("admin");
		
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginButton.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
