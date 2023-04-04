package before_After_class_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class week_4 {
	@BeforeMethod
	void before() {
		System.out.println("Before class run first");
	}
	
	@Test(priority = 16)
	void day1() {
		System.out.println("fourth moday");

	}
	@Test(priority = 17)
	void day2() {
		System.out.println("fourth tuesday");
	}
	@Test(priority = 18)
	void day3() {
		System.out.println("fourth wednesday");
	}
	@Test(priority = 19)
	void day4() {
		System.out.println("fourth thesday");
	}
	@Test(priority = 20)
	void day5() {
		System.out.println("fourth friday");
	}
	
	@AfterClass
	void after() {
		System.out.println("After class run last");
	}
}
