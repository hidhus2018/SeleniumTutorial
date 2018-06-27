package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
	

	     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	     
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     Thread.sleep(2000);
	     driver.get("https://www.youtube.com");
	     Thread.sleep(2000);


	driver.findElement(By.xpath("html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[2]/div/ytd-guide-entry-renderer[7]/a/span[1]")).click();
	driver.findElement(By.xpath("html/body/ytd-app/div[1]/ytd-page-manager/ytd-browse[2]/ytd-two-column-browse-results-renderer/ytd-section-list-renderer/div[3]/ytd-item-section-renderer[7]/div[2]/ytd-shelf-renderer/div[1]/div[2]/yt-horizontal-list-renderer/div[2]/div/ytd-grid-video-renderer[1]/div[1]/div[1]/div[1]/h3/a")).click();
	Thread.sleep(2000);
   // WebElement a=driver.findElement(By.xpath("html/body/ytd-app/app-drawer/div[2]/div/div[2]/div[2]/ytd-guide-renderer/div[1]/ytd-guide-section-renderer[2]/div/ytd-guide-entry-renderer[7]/a/span[1]"));
	//driver.findElements(By.xpath("//a[@id='video-title']"));
	//a[@id='video-title']
     //a.click();
	Thread.sleep(20000);
	driver.quit();
}}
