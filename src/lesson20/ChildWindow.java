package lesson20;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChildWindow {
	
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
		
		// Parent window id:
		String mainWinId = driver.getWindowHandle();
		
		// Open child window:
		driver.findElement(By.id("openwindow")).click();		

		Set<String> winIds = driver.getWindowHandles();
		
		System.out.println("Parent win id: " + mainWinId);
		System.out.println("All window ids: " + winIds);
		
		String childWinId = null;
		
		for(String id : winIds) {
			if(!id.equals(mainWinId)) {
				childWinId = id;
			}
		}
		
		// Inside child window:
		driver.switchTo().window(childWinId);
		
		driver.findElement(By.xpath("//input[@name='course']")).sendKeys("Test");
		Thread.sleep(1000);
//		driver.close();
		
		// Parent window:
		// Switch back to the first main window:
		driver.switchTo().window(mainWinId);
		driver.findElement(By.id("hondacheck")).click();

	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
