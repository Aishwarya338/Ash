package Demo.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo1 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Hi...Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Hi...Before test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Hi...Before class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Hi...Before method");
	}

	@Test
	public void tc_1() {
		System.out.println("Hi..from tc_1");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Hi..After Mehtod");

	}

	@Test
	public void tc_2() {
		System.out.println("Hi..from tc_2");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Hi..After class");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("Hi..After Test");

	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Hi..After suit");

	}

}
