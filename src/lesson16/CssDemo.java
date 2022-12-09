package lesson16;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssDemo {

	String url = "https://www.saucedemo.com/";
	WebDriver driver;
	String username1 = "standard_user";
	String password = "secret_sauce";

	String motoByReq = "Connect with friends and the world around you on Facebook.";

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver2.exe");		
		driver = new ChromeDriver();	
		driver.manage().window().setPosition(new Point(-1800, 100));
		driver.manage().window().maximize();
	}

	@Test
	public void test1() {
		driver.get(url);
		
		// CSS locator
		driver.findElement(By.cssSelector("input[placeholder=Username]")).sendKeys(username1);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector("#login-button")).click();


	}

//	@After
	public void tearDown() {
		driver.close();
	}

	
}
