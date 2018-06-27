package pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class POMPIM {
	WebDriver driver;
     WebElement element = null;
	public static void PIM1(WebDriver driver) throws InterruptedException {
	
    WebElement PIM1 = driver.findElement(By.xpath("//a [@id='menu_pim_viewPimModule']"));
    Actions action = new Actions(driver);
    action.moveToElement(PIM1).build().perform();
    Thread.sleep(1000);
    
	}
	public static void Configuration(WebDriver driver) throws InterruptedException {
    WebElement Configuration = driver.findElement(By.xpath("//a [@id='menu_pim_Configuration']"));
    Actions action = new Actions(driver);
    action.moveToElement(Configuration).build().perform();
    Thread.sleep(1000);
    
	}
	public static void DataImport(WebDriver driver) throws InterruptedException{
    WebElement DataImport = driver.findElement(By.xpath("//a [@href='/index.php/admin/pimCsvImport']"));
    Actions action = new Actions(driver);
    action.moveToElement(DataImport).click().build().perform();
    Thread.sleep(2000);
    driver.quit();

}}
