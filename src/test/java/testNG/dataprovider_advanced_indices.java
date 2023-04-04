package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import utils.incides;



public class dataprovider_advanced_indices extends incides{
	//alternative -we can extends the class - not recommended
	
	@Test(dataProvider = "webapp",dataProviderClass = incides.class )
	//if dataprovider is in diff package ,we should use dataproviderclass
	
	void launch(String email,String password) throws InterruptedException {

		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();

		driver.get("https://letcode.in/signin");
		Thread.sleep(8000);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);//called here
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);//called here
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();

	}
}
