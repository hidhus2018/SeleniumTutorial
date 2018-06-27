package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
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
     
     driver.quit();
     
	}
	
	

}
