package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPages;

public class FBLoginSteps {

	
public  WebDriver driver;
public LoginPages lp;
	

	@Given("user loads FB page")
	public void user_loads_FB_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		/*WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Password=driver.findElement(By.id("pass"));
		email.sendKeys(username);
		Password.sendKeys(password);*/
		lp = new LoginPages(driver);
		lp.enterusername(username);
		lp.enterpassword(password);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@And("clicks on Login button")
	public void clicks_on_Login_button() {
		lp.loginbuton();
		
		
	}

	@Then("user lands on Dashboard page")
	public void user_lands_on_Dashboard_page() {
		System.out.println(driver.getTitle());
		driver.close();
		
	}



}
