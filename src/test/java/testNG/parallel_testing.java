package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel_testing {
	// cross browser testing in parameter passing
	// run in parallel xml
	// different browser opens at a same time and run parallel

	WebDriver driver;

	@Parameters({ "Browser" })
	@Test(priority = 1)
	void launch(String Browser) {

		if (Browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.http.factory", "jdk-http-client");

			driver = new ChromeDriver();

			ChromeOptions options = new ChromeOptions();

			options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

			driver.manage().window().maximize();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.http.factory", "jdk-http-client");

			driver = new ChromeDriver();

			ChromeOptions options = new ChromeOptions();

			options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

			driver.manage().window().maximize();

		}

	}
	
	@Parameters({ "Browser" })
	@Test(priority = 2)
	void link(String Browser) {
		if (Browser.equalsIgnoreCase("chrome")) {
			driver.get("https://www.google.co.in/");
			String title = driver.getTitle();
			System.out.println(title);
		}
		else if (Browser.equalsIgnoreCase("firefox")) {
			driver.get("https://www.google.co.in/");
			String url = driver.getCurrentUrl();
			System.out.println(url);
		} {
			
		}
		
	}

}
