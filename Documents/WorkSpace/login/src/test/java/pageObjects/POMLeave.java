package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class POMLeave {
	WebElement element = null;
	WebDriver driver;

	public static void Leave(WebDriver driver) throws InterruptedException {
		WebElement Leave = driver.findElement(By.xpath("//a [@id='menu_leave_viewLeaveModule']"));
		Actions action = new Actions(driver);
		action.moveToElement(Leave).build().perform();
		Thread.sleep(1000);

	}

	public static void Entitlements(WebDriver driver) throws InterruptedException {
		WebElement Entitlements = driver.findElement(By.xpath("//a [@id='menu_leave_Entitlements']"));
		Actions action = new Actions(driver);
		action.moveToElement(Entitlements).build().perform();
		Thread.sleep(1000);
	}

	public static void AddEntitlements(WebDriver driver) throws InterruptedException {
		WebElement AddEntitlements = driver.findElement(By.xpath("//a [@id='menu_leave_addLeaveEntitlement']"));
		Actions action = new Actions(driver);
		action.moveToElement(AddEntitlements).click().build().perform();
		Thread.sleep(1000);
		driver.quit();

	}
}
