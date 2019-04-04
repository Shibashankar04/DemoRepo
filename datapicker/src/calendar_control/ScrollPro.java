package calendar_control;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPro {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\pc\\Downloads\\Compressed\\chromedriver_2.44.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.javatpoint.com/java-tutorial");
		
		WebElement ele=driver.findElement(By.xpath("(//a[text()='Hello Java Program'])[2]"));
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		
		je.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		System.out.println(ele.getText());

		DateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		Date date=new Date();
		
		String date1=dateformat.format(date);
		
		System.out.println("current system ate is > "+date1);
		
		
	}

}
