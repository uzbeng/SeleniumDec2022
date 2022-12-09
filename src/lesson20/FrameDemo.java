package lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameDemo {
	
	String url = "https://courses.letskodeit.com/practice";
	WebDriver driver;


	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver2.exe");		
		driver = new ChromeDriver();	
		driver.manage().window().setPosition(new Point(-1800, 100));
		driver.manage().window().maximize();
	}

	@Test
	public void test1() throws InterruptedException {
		
		driver.get(url);
		
		driver.findElement(By.id("bmwcheck")).click();
		
		// Inside iframe:
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("iframe-name");
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		
		driver.findElement(By.xpath("//input[@name='course']")).sendKeys("Test");
		
		// Outside iframe:
		// Switch back to the first main window:
//		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("hondacheck")).click();

	}
}
