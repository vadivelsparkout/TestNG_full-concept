package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	// don't run here .....,run in parameter xml
	//no need to match parameter and para_passing argument same
	//parameter order will follow-irrespective of argument in method
	@Parameters({"num2","num1"})
	@Test()
	public void para_passing(int a,int b) {
	System.out.println(a);
	System.out.println(b);
		int c=a+b;
		System.out.println(c);
		
	}

}
