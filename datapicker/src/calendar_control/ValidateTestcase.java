package calendar_control;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidateTestcase {

	
	@Test(retryAnalyzer=RerunTestCase.class)
	public void verifySeleniumTitle()

	{  


		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\pc\\Downloads\\Compressed\\chromedriver_2.44.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.learn-automation.com");



		// Here we are verifying that title contains QTP or not. This test will fail because title does not contain QTP

		Assert.assertTrue(driver.getTitle().contains("QTP"));



	}



}


