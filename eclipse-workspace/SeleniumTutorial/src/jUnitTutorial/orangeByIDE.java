package jUnitTutorial;


	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.junit.*;
	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class orangeByIDE {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://opensource.demo.orangehrmlive.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testOrange() throws Exception {
	    driver.get(baseUrl + "/");
	    driver.findElement(By.id("txtPassword")).clear();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	    driver.findElement(By.id("txtUsername")).clear();
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//a [@id='menu_admin_viewAdminModule']")).click();
	    //driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
	    driver.findElement(By.xpath("html/body/div[1]/div[2]/ul/li[2]/a/b")).click();
	   // driver.findElement(By.id("menu_pim_viewTerminationReasons")).click();
	    driver.findElement(By.id("menu_leave_viewLeaveBalanceReport")).click();
	   // driver.findElement(By.id("menu_leave_viewLeaveBalanceReport")).click();
	    driver.findElement(By.id("menu_time_displayAttendanceSummaryReportCriteria")).click();
	    //driver.findElement(By.id("menu_time_displayAttendanceSummaryReportCriteria")).click();
	    driver.findElement(By.id("from_date")).click();
	    driver.findElement(By.linkText("7")).click();
	   // driver.findElement(By.linkText("7")).click();
	    driver.findElement(By.id("menu_recruitment_viewJobVacancy")).click();
	   // driver.findElement(By.id("menu_recruitment_viewJobVacancy")).click();
	    driver.findElement(By.id("menu_performance_viewEmployeePerformanceTrackerList")).click();
	    //driver.findElement(By.id("menu_performance_viewEmployeePerformanceTrackerList")).click();
	    driver.findElement(By.cssSelector("#menu_dashboard_index > b")).click();
	   // driver.findElement(By.cssSelector("#menu_dashboard_index > b")).click();
	    driver.findElement(By.cssSelector("#menu_directory_viewDirectory > b")).click();
	    driver.findElement(By.cssSelector("#menu_directory_viewDirectory > b")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }



}
