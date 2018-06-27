package orangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pageObject.POMLogin;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http:\\opensource.demo.orangehrmlive.com");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
//		//driver.findElement(By.name("txtPassword")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//		//driver.findElement(By.name("Submit")).click();
//		Thread.sleep(2000);
		//driver.quit();
		POMLogin.username(driver);
		POMLogin.password(driver);
		POMLogin.loginButton(driver);

	}

}
