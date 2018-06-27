package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class POMTime {
	
	WebDriver driver;
	WebElement element = null;
	
	public static void Time(WebDriver driver) {
		
		WebElement Time = driver.findElement(By.xpath("//a [@ id='menu_time_viewTimeModule']"));
		Time.click();
		
	}
    public static void Reports(WebDriver driver) {
		
		WebElement Reports = driver.findElement(By.xpath("//a[@ id='menu_time_Reports']"));
		WebElement AttendanceSmry = driver.findElement(By.xpath("//a[@ id='menu_time_displayAttendanceSummaryReportCriteria']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(Reports).moveToElement(AttendanceSmry).click().build().perform();
		
		WebElement EmployeeName = driver.findElement(By.xpath("//input [@id='employee_name']"));
		EmployeeName.sendKeys("John Smith");
		
		WebElement JobTitle = driver.findElement(By.xpath("//select [@id='attendanceTotalSummary_jobTitle']"));
		Select select = new Select(JobTitle);
		select.selectByIndex(7);
		
//		WebElement DateFrom = driver.findElement(By.xpath("//input [@id='from_date']"));
//	    Actions action11 = new Actions(driver);
//	    action11.moveToElement(DateFrom).doubleClick().build().perform();
//	    
//	    WebElement MonthName = driver.findElement(By.xpath("//select [@class='ui-datepicker-month']"));
//	    Select selectMonth = new Select(MonthName);
//	    selectMonth.selectByIndex(6);
//	    
//	    WebElement Year = driver.findElement(By.xpath("//select [@class='ui-datepicker-year']"));
//	    Select selectYear = new Select(Year);
//	    selectYear.selectByVisibleText("2018");
	    
		
		
		

}
    }
