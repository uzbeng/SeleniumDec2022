package lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.opentelemetry.sdk.metrics.internal.view.DropAggregation;

public class AlertDemo {

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
		
//		driver.findElement(By.id("alertbtn")).click();
		driver.findElement(By.id("confirmbtn")).click();
		
		// Alert opens and we need to switch to it.
		String alertText = driver.switchTo().alert().getText();
//		driver.switchTo().alert().accept();
		driver.switchTo().alert().sendKeys("certificate name");
		driver.switchTo().alert().dismiss();
		System.out.println(alertText);
		
		driver.findElement(By.id("bmwcheck")).click();
		
		
	}
}
