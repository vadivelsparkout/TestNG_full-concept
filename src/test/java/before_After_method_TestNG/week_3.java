package before_After_method_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class week_3 {
	@Test(priority = 11)
	void day1() {
		System.out.println("third monday");

	}
	@Test(priority = 12)
	void day2() {
		System.out.println("third tuesday");
	}
	@Test(priority = 13)
	void day3() {
		System.out.println("third wednesday");
	}
	@Test(priority = 14)
	void day4() {
		System.out.println("third thesday");
	}
	@Test(priority = 15)
	void day5() {
		System.out.println("third friday");
	}
	@AfterMethod
	void after() {
		System.out.println("After class run last");
	}
}
