package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class POMEmployeeRegistration {

	static WebElement element = null;

	public static void PIM(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

	}

	public static void EmployeeList(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}

	public static void AddButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='btnAdd']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}

	public static void FirstName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='firstName']"));
		element.sendKeys("John");
	}

	public static void LastName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='lastName']"));
		element.sendKeys("Storm");

	}

	public static void EmployeeID(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='employeeId']"));
		element.clear();
		element.sendKeys("0087");
	}

	public static void CreateLogin(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='chkLogin']"));
		element.click();
	}

	public static void username(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='user_name']"));
		element.sendKeys("johnkerry");
	}

	public static void password(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='user_password']"));
		element.sendKeys("johnkerry");
	}

	public static void Cpassword(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='re_password']"));
		element.sendKeys("johnkerry");
	}

	public static void SaveButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='btnSave']"));
		element.click();
	}
}
