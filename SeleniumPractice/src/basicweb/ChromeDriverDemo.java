package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		
		String baseURL = "http://www.google.com";
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BoXX\\eclipse-workspace\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.findElement(By.id("lst-ib")).sendKeys("emulatronia");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("btnK"));
	 // driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		
	}

}
