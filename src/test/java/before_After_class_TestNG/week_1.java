package before_After_class_TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class week_1 {
	@BeforeClass
	void before() {
		System.out.println("Before test run first");
	}
	
	@Test(priority = 1)
	void day1() {
		System.out.println("first moday");

	}
	@Test(priority = 2)
	void day2() {
		System.out.println("first tuesday");
	}
	@Test(priority = 3)
	void day3() {
		System.out.println("first wednesday");
	}
	@Test(priority = 4)
	void day4() {
		System.out.println("first thesday");
	}
	@Test(priority = 5)
	void day5() {
		System.out.println("first friday");
	}
}