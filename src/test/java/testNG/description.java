package testNG;

import org.testng.annotations.Test;

public class description {
	
	
	//description-will describe about the block of @Test
	  
    @Test(description = "new testing")
	void search_product() {
		System.out.println("search_product");
	}
}
