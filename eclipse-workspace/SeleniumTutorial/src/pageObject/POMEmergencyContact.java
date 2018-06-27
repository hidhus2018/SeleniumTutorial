package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMEmergencyContact {
	
	static WebElement element = null;
	
	public static void EmergencyCntct(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/ul/li[3]/a"));
		element.click();
	}
	public static void AddButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='btnAddContact']"));
		element.click();
	}
	public static void Name(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='emgcontacts_name']"));
		element.sendKeys("John Kerry");
		}
	public static void Relationship(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='emgcontacts_relationship']"));
		element.sendKeys("Cousin");
		}
	public static void HomeTele(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='emgcontacts_homePhone']"));
		element.sendKeys("+1 773 773 7744");
		}
	public static void Mobile(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='emgcontacts_mobilePhone']"));
		element.sendKeys("+1 773 773 5511");
	}
	public static void WorkTele(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='emgcontacts_workPhone']"));
		element.sendKeys("+1 773 773 5533");
	}
	public static void SaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='btnSaveEContact']"));
		element.click();
		}
	public static void CheckBox(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ class='checkbox']"));
		element.click();
		}
	
	public static void Delete(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='delContactsBtn']"));
		element.click();
}
	}
