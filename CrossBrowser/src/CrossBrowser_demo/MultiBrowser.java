package CrossBrowser_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void Firefoxtest(String browsername)
	{
		
		if(browsername.equalsIgnoreCase("firefox")){
			
		System.setProperty("webdriver.gecko.driver", "E:\\seleniumExcel\\geckodriver.exe");
		
		driver=new FirefoxDriver();
			
		}		
		else if(browsername.equalsIgnoreCase("chrome")){
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\Compressed\\chromedriver_2.44.exe");
		
		driver=new ChromeDriver();
	
		}
		
		else if(browsername.equalsIgnoreCase("ie")){
			
			System.setProperty("webdriver.ie.driver", "C:\\Users\\pc\\Downloads\\Compressed\\IEDriverServer.exe");
			
			driver=new InternetExplorerDriver();
			
			

		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
				
		System.out.println("Site tittle is ====> "+driver.getTitle());
		
		driver.quit();
		
		

	}
		

}
