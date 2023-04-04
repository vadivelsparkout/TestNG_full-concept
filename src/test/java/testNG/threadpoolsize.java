package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


//only used when invocation count called 
//--in @test method -browser launch invocation count 10(10 times)browser launch
//threadpoolsize will open 10 browser all will run paralelly 

public class threadpoolsize {
	 @Test(invocationTimeOut = 10,threadPoolSize = 10 )              
		void login() {
		    System.setProperty("webdriver.http.factory", "jdk-http-client");

			WebDriver driver = new ChromeDriver();

			ChromeOptions options = new ChromeOptions();

			options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

			driver.get("https://letcode.in/alert");
		}
	    
}
