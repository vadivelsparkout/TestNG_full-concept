package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_newconcept {
	@DataProvider(name = "webapp")
	public String[][] provider() {

		// for 2 rows and 2 column
		String[][] data_pro = new String[2][2];

		// first row data
		data_pro[0][0] = "koushik350@gmail.com";
		data_pro[0][1] = "pass123$";
        
	
		return data_pro;
	}

	@Test(dataProvider = "webapp" )
	void launch(String data_pro[] )  {
        //String data_pro[]-in forms there will be multiple input field in-order to overcome argument passing in methods 
		//we use this structure (String name of dataprovider[])
		//input starts from [0] to [n]
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeDriver driver = new ChromeDriver();

		ChromeOptions options = new ChromeOptions();

		options.addArguments("-allow-origins", "http://127.0.0.1:45411/");

		driver.manage().window().maximize();

		driver.get("https://letcode.in/signin");
		

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data_pro[0]);//called here
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data_pro[1]);//called here
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();

	}

}
