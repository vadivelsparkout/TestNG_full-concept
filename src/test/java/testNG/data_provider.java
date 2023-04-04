package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider {
    //one class will have multiple data provider so, name in dataprovider will help to match right data provider to the @test
	//name is not compulsory instead of naming dataprovider -specify method of data provider -this will also run
	//@Test(dataProvider = "provider" )-this will also run
	
	
	@DataProvider(name = "webapp")
	public String[][] provider() {

		// for 2 rows and 2 column
		String[][] data_pro = new String[2][2];

		// first row data
		data_pro[0][0] = "koushik350@gmail.com";
		data_pro[0][1] = "pass123$";

		// second row data
		data_pro[0][0] = "koushik350@gmail.com";
		data_pro[0][1] = "pass123$";

		return data_pro;
	}

	//call the data provider-passing the para in method 
	
	
	@Test(dataProvider = "webapp" )
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
