package lesson12;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	static String url = "https://www.facebook.com/";
	static String url2 = "https://www.amazon.com/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		// Opens web browser
		WebDriver driver = new ChromeDriver();

		// to move my brower to left monitor (ignore):
		driver.manage().window().setPosition(new Point(-1800, 0));

		// opens website and url
		driver.get(url);
		
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(2000);

		// Switch the website
		driver.navigate().to(url2);
		System.out.println(driver.getCurrentUrl());

		Thread.sleep(2000);

		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().refresh();

		// you write your test case steps

		Thread.sleep(2000);

//		driver.close();
		driver.quit();

	}

}
