package testNG;

import org.testng.annotations.Test;

public class expected_Exception {
	//If expectedExceptions was specified, its message must match the regular expression specified in this attribute.
	   
	
	@Test(expectedExceptions = {RuntimeException.class})
	void login() {
		throw new RuntimeException();
		
	}
}
