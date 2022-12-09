package lesson19;


import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicDropdown {

	String url = "https://www.cheapoair.com/";
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
		
		// From box:
		WebElement fromBox = driver.findElement(By.id("from0"));
		fromBox.click();
		fromBox.sendKeys("aus");
		for(int i=0; i<4; i++) {
			fromBox.sendKeys(Keys.ARROW_DOWN);
		}
		fromBox.sendKeys(Keys.ENTER);
		
		// To box
		WebElement toBox = driver.findElement(By.id("to0"));
		toBox.sendKeys("new");
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[data-suggestion='LGA']")).click();
		
		// Calendar departure date:
		Thread.sleep(500);
		driver.findElement(By.cssSelector(".month-date.is--today")).click();

		// Calendar arrival date:
		Thread.sleep(500);
		driver.findElement(By.xpath("(//a[@data-date='7'])[1]")).click();

		// Select passengers:
		driver.findElement(By.id("travellerButton")).click();
		Thread.sleep(500);
		driver.findElement(By.id("removeadults")).click();
		for (int i = 0; i < 3; i++) {
			driver.findElement(By.id("addseniors")).click();
		}
		driver.findElement(By.id("addchild")).click();
		
		// dropdown for child age:
		// 1: Find and create a webelement for that drop down
		WebElement ageDrp = driver.findElement(By.name("ChildrenAge"));
		// 2: Create Select object and provide the webelement in the constructor
		Select childAgeDrpDown = new Select(ageDrp);
		// 3: Use select objects methods to control and use its options
		childAgeDrpDown.selectByValue("5");
		
		driver.findElement(By.id("addlapinfant")).click();
		// Done btn:
		driver.findElement(By.id("closeDialog")).click();
		
		// Click Search btn
		driver.findElement(By.id("searchNow")).click();
	}
}
