package lesson11;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenWithEdge {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		// to move my brower to left monitor (ignore):
		driver.manage().window().setPosition(new Point(-1800, 0));
		driver.get("https://ebay.com");

	}

}
