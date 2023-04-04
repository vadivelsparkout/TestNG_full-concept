package testNG;

import org.testng.annotations.Test;


//@Test(dependsOnMethods ="testNG.depends_On.signup")  -if the dependent method in diff package and diff class follow the syntax         




public class depends_On {
	
	//depends on block will run only after the dependent block run sucessfully 
	//depends and priority same time - depends order will execute and prioriity will be supressed
	
	
	@Test
	void signup() {
		System.out.println("signup");
	}
	
	
    @Test(dependsOnMethods ="signup")           
	void login() {
		System.out.println("login");
	}
    
    
    @Test(dependsOnMethods ="login")  
	void search_product() {
		System.out.println("search_product");
	}
    
    
    @Test(dependsOnMethods ="search_product") 
	void add_to_kart() {
		System.out.println("add_to_kart");
	}
    
    
    @Test(dependsOnMethods ="add_to_kart") 
	void signout() {
		System.out.println("signout");
	}

}
