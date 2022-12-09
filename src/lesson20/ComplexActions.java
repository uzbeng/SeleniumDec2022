package lesson20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComplexActions {
	
	String url = "https://jqueryui.com/droppable/";
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
		
		driver.switchTo().frame(0);
		
//		Action action = null;
		Actions actions = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
//		actions.moveToElement(source)
//		.clickAndHold()
//		.moveToElement(target)
//		.release()
//		.build()
//		.perform();
		
		Action dragBoxAndDropIt = actions.dragAndDrop(source, target).build();
		
		dragBoxAndDropIt.perform();
		
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	}

}
