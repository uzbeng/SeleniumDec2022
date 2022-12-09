package lesson15;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTests {
	
	String url = "https://www.facebook.com/";
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver2.exe");
		// Opens web browser
		driver = new ChromeDriver();
		
		// to move my brower to left monitor (ignore):
		driver.manage().window().setPosition(new Point(-1800, 0));
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
	@Test  // Annotation
	public void test1() {
		// opens website
		driver.get(url);
		
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();		
	}
	
	@Test  // Annotation
	public void test2() {	
		
		driver.get(url);
		
		driver.findElement(By.name("login")).click();
	}

}
