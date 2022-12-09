package lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		String url = "https://www.facebook.com/";

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		// Opens web browser
		WebDriver driver = new ChromeDriver();

		// to move my brower to left monitor (ignore):
		driver.manage().window().setPosition(new Point(-1800, 0));

		// opens website
		driver.get(url);
		
//		driver.findElement(By.className("inputtext")).sendKeys("my text");
//		driver.findElement(By.id("email")).sendKeys("MyUserName");
//		driver.findElement(By.name("email")).sendKeys("UsingName");
//		driver.findElement(By.linkText("Forgot password?")).click();
//		driver.findElement(By.partialLinkText("password?")).click();
//		driver.findElement(By.tagName("a"));
//		driver.findElement(By.xpath(""));
//		driver.findElement(By.cssSelector(""));
		
		WebElement usernameBox = driver.findElement(By.id("email"));
		usernameBox.sendKeys("MyUserName");
		
		driver.findElement(By.name("pass")).sendKeys("MyPassword");
		driver.findElement(By.name("login")).click();
		usernameBox.sendKeys("Something else");

	}

}
