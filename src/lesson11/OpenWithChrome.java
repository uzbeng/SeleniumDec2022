package lesson11;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWithChrome {

	public static void main(String[] args) {
		String url = "https://www.facebook.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		// Opens web browser
		WebDriver driver = new ChromeDriver();
		
		// to move my brower to left monitor (ignore):
		driver.manage().window().setPosition(new Point(-1800, 0));
		
		// opens website
		driver.get(url);

	}

}
