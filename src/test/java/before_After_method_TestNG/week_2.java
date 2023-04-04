package before_After_method_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class week_2 {
	@BeforeMethod
	void before() {
		System.out.println("Before class run first");
	}
	
	@Test(priority = 6)
	void day1() {
		System.out.println("second moday");

	}
	@Test(priority = 7)
	void day2() {
		System.out.println("second tuesday");
	}
	@Test(priority = 8)
	void day3() {
		System.out.println("second wednesday");
	}
	@Test(priority = 9)
	void day4() {
		System.out.println("second thesday");
	}
	@Test(priority = 10)
	void day5() {
		System.out.println("second friday");
	}
	@AfterMethod
	void after() {
		System.out.println("After class run last");
	}

}
