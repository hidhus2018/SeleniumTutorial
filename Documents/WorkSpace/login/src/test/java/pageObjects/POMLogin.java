package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMLogin {

	static WebElement element = null;

	public static void username(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		element.sendKeys("Admin");

	}

	public static void password(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		element.sendKeys("admin");
	}

	public static void loginButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		element.click();
	}

}
