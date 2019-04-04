package calendar_control;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\Compressed\\chromedriver_2.44.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement cal=driver.findElement(By.xpath("//label[@class='db text-trans-uc']"));
		
		Boolean status=cal.isDisplayed();
		
		cal.click();
		
//		driver.switchTo().alert().dismiss();
		
		System.out.println("element status is  "+status);
		
		List<WebElement> alldatas=driver.findElements(By.xpath("//div[@class='rb-calendar']/table/tbody/tr/td"));
		
		for(WebElement ele:alldatas){
			
			String data=ele.getText();
			
//			System.out.println(data);
			
			
			
			if(data.equalsIgnoreCase("18")){
				
				System.out.println("element located");
				
				ele.click();
				break;
			}
		}

	}

}
