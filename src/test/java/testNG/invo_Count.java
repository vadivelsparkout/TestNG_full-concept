package testNG;

import org.testng.annotations.Test;

public class invo_Count {
	
	
	//invocation count-run the method nuumber of times required
	//invocationTimeOut-The maximum number of milliseconds that the total number of invocations on this test method should take
	  
	@Test(priority =-1,invocationCount = 20)
	void signup() {
		System.out.println("signup");
	}
	
	
    @Test(priority = 2,invocationTimeOut = 1000 )              
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

