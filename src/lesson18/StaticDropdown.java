package lesson18;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	String url = "https://www.saucedemo.com/";
	WebDriver driver;
	String username1 = "standard_user";
	String password = "secret_sauce";


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
		
		// Dropdown
		Select sortDrp = new Select(driver.findElement(By.cssSelector(".product_sort_container")));
		Select sortDrp2 = new Select(driver.findElement(By.cssSelector(".product_sort_container")));
		Select sortDrp3 = new Select(driver.findElement(By.cssSelector(".product_sort_container")));
		Select sortDrp4 = new Select(driver.findElement(By.cssSelector(".product_sort_container")));
//		sortDrp.selectByIndex(2);
//		sortDrp.selectByValue("hilo");
		sortDrp.selectByVisibleText("Name (Z to A)");
		
		sortDrp.deselectAll();
		sortDrp.isMultiple();
		sortDrp.deselectByValue("");


	}
}
