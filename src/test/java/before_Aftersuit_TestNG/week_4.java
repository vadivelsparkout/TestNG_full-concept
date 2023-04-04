package before_Aftersuit_TestNG;


import org.testng.annotations.AfterSuite;


import org.testng.annotations.Test;

public class week_4 {
	
	
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
	
	@AfterSuite
	void after() {
		System.out.println("After test run last");
	}
}
