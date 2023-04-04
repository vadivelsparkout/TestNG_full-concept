package testNG;

import org.testng.annotations.Test;

public class timeout {

	// The maximum number of milliseconds that this @test method should take
	

	@Test(timeOut = 3000)
	void login() {
		System.out.println("login");
	}
}
