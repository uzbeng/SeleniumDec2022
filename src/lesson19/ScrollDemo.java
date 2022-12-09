package lesson19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScrollDemo {
	
	String url = "https://www.cheapoair.com/";
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
		
		// use java script (JS)
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0, 1000)");
		WebElement signUpBtn = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		js.executeScript("arguments[0].scrollIntoView();", signUpBtn);
	}

}
