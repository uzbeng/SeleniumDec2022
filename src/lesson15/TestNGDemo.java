package lesson15;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void before() {
		System.out.println("Before");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("After");
	}
	
	@Test
	public void testA() {
		System.out.println("Test A");
	}
	
	@Test
	public void testE() {
		System.out.println("Test E");
	}
	
	@Test
	public void testB() {
		System.out.println("Test B");
	}
	
	@Test
	public void testC() {
		System.out.println("Test C");
		Assert.assertTrue(false);
	}
	
	@Test
	public void testD() {
		System.out.println("Test D");
	}

}
