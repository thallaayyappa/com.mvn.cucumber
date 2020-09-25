package testcases;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcpet {

		public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver(); //navigates to the Browser
				
				driver.get("http://facebook.com");  
				//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebDriverWait wait= new WebDriverWait(driver,10);
				
				driver.findElement(By.linkText("Create a Page")).click();
				driver.close();
		}
}