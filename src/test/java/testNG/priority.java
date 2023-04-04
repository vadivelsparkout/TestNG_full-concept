package testNG;

import org.testng.annotations.Test;

//order of priority -5,-1,enabled-true,alwaysrun-true,0,1,3,5,6

public class priority {
@Test(priority =-1)
	void signup() {
		System.out.println("signup");
	}
@Test(priority = 2)              
	void login() {
		System.out.println("login");
	}
@Test(alwaysRun=true)
	void search_product() {
		System.out.println("search_product");
	}
@Test(enabled = true)
	void add_to_kart() {
		System.out.println("add_to_kart");
	}
@Test(priority = 5)
	void signout() {
		System.out.println("signout");
	}
}
