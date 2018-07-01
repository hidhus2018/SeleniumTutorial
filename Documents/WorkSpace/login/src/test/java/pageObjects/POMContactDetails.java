package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class POMContactDetails {

	static WebElement element = null;

	// public static void NextButton(WebDriver driver) {
	// element = driver.findElement(By.xpath("//a[@
	// href='javascript:submitPage(2)']"));
	// element.click();
	// }
	//
	public static void John(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@ href='/index.php/pim/viewEmployee/empNumber/27']"));
		element.click();

	}

	public static void ContactDet(WebDriver driver) {
		element = driver.findElement(By.xpath("html/body/div[1]/div[3]/div/div[1]/ul/li[2]/a"));
		element.click();
	}

	public static void EditButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='btnSave']"));
		element.click();
	}

	public static void Address1(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='contact_street1']"));
		element.sendKeys("415 S Hamilton Street, Apt 10");
	}

	public static void Address2(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='contact_street2']"));
		element.sendKeys("same as above");
	}

	public static void City(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='contact_city']"));
		element.sendKeys("Chicago");
	}

	public static void State(WebDriver driver) {
		element = driver.findElement(By.xpath("//input [@id='contact_province']"));
		element.sendKeys("Illinois");
	}

	public static void ZipPostal(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='contact_emp_zipcode']"));
		element.sendKeys("60666");
	}

	public static void Country(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@ id='contact_country']"));
		Select select = new Select(element);
		select.selectByValue("US");
	}

	public static void HomeTele(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='contact_emp_hm_telephone']"));
		element.sendKeys("+1 773 773 7733");
	}

	public static void Mobile(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='contact_emp_mobile']"));
		element.sendKeys("+1 773 773 7744");
	}

	public static void WorkTele(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='contact_emp_work_telephone']"));
		element.sendKeys("+1 773 773 7755");
	}

	public static void WorkEmail(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='contact_emp_work_email']"));
		element.sendKeys("davidstormmm@gmail.com");
	}

	public static void OtherEmail(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='contact_emp_oth_email']"));
		element.sendKeys("davidstorm.qaaaa@gmail.com");
	}

	// public static void CustomEdit(WebDriver driver) {
	// element = driver.findElement(By.xpath("//input[@ id='btnSave']"));
	// element.click();
	//
	// }
	// public static void gf(WebDriver driver) {
	// element = driver.findElement(By.xpath("//input[@ id='custom2']"));
	// element.sendKeys("None");
	// }
	public static void Save(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@ id='btnSave']"));
		element.click();
	}
}