package lesson16;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsefulMethods {

	String url = "https://www.facebook.com/";
	WebDriver driver;

	String motoByReq = "Connect with friends and the world around you on Facebook.";

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver2.exe");
		// Opens web browser
		driver = new ChromeDriver();

		// to move my brower to left monitor (ignore):
		driver.manage().window().setPosition(new Point(-1800, 100));
		
		// Set the window size
//		Dimension dim = new Dimension(800, 600);
		driver.manage().window().setSize(new Dimension(800, 600));
		
		// maximize window
//		driver.manage().window().maximize();

	}

	@Test
	public void test1() {
		driver.get(url);

		// Make fullscreen
//		driver.manage().window().fullscreen();
		
		// Get window position
		Point position = driver.manage().window().getPosition();
		System.out.println(position.x + " : " + position.y);
		
		// Get window size
		Dimension dimension = driver.manage().window().getSize();
		System.out.println(dimension.height + " : " + dimension.width);

		// Get page title
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		Assert.assertEquals("Testing page title", "Facebook - log in or sign up", pageTitle);

		// Get text from page
		String facebookMoto = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		System.out.println(facebookMoto);

		Assert.assertEquals(motoByReq, facebookMoto);

//		driver.findElement(By.xpath("//*[text()='Create new account']")).click();		
	}

//	@After
	public void tearDown() {
		driver.close();
	}

}
