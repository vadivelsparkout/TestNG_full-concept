package testNG;

import org.testng.annotations.Test;

public class groups {
	
	
	@Test(groups = {"smoke"})
	void signup() {
		System.out.println("signup");
	}
	
	
    @Test(groups = {"sanity"} )              
	void login() {
		System.out.println("login");
	}
    
    
    @Test(groups = {"reg"})
	void search_product() {
		System.out.println("search_product");
	}
    
    
    @Test(groups = {"smoke"})
	void add_to_kart() {
		System.out.println("add_to_kart");
	}
    
    
    @Test(groups = {"sanity"})
	void signout() {
		System.out.println("signout");
	}
}


