package bbc;

	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.junit.*;
	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.*;
	import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class BbcUrdu {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
	    baseUrl = "https://www.bbc.com/";
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  }

	  @Test
	  public void test22() throws Exception {
	    driver.get(baseUrl + "/urdu/sport");
	    driver.findElement(By.cssSelector("a.navigation-wide-list__link > span")).click();
	   // driver.findElement(By.cssSelector("a.navigation-wide-list__link > span")).click();
	    driver.findElement(By.xpath("//div[@id='site-container']/div/div[2]/ul/li[2]/a/span")).click();
	   // driver.findElement(By.xpath("//div[@id='site-container']/div/div[2]/ul/li[2]/a/span")).click();
	    driver.findElement(By.xpath("//div[@id='site-container']/div/div[2]/ul/li[3]/a/span")).click();
	   // driver.findElement(By.xpath("//div[@id='site-container']/div/div[2]/ul/li[3]/a/span")).click();
	    driver.findElement(By.xpath("//*[@id='site-container']/div[1]/div[2]/ul/li[4]/a/span")).click();
	   // driver.findElement(By.linkText("ورلڈ")).click();
	    driver.findElement(By.xpath("//div[@id='site-container']/div/div[2]/ul/li[5]/a/span")).click();
	    //driver.findElement(By.xpath("//div[@id='site-container']/div/div[2]/ul/li[5]/a/span")).click();
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
