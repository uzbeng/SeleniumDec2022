package lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		String url = "https://www.yahoo.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		// Opens web browser
		WebDriver driver = new ChromeDriver();
		
		// to move my brower to left monitor (ignore):
		driver.manage().window().setPosition(new Point(-1800, 0));
		
		// opens website
		driver.get(url);
		
		driver.findElement(By.xpath("//a[@class='_yb_11j7u  rapid-noclick-resp' and @id='root_1']")).click();

	}

}
