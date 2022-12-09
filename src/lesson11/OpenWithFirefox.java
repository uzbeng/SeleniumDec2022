package lesson11;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenWithFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// to move my brower to left monitor (ignore):
		driver.manage().window().setPosition(new Point(-1800, 0));

		driver.get("https://www.amazon.com");

	}

}
