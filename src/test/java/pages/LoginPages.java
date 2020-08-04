package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class LoginPages {
	
	public  WebDriver driver;
	
	//objects of login page
	By txt_username=By.xpath("//input[@id='email']");
	By txt_password=By.id("pass");
	By btn_loginbutton=By.xpath("//input[@value='Log In']");
	
	public LoginPages(WebDriver driver) {
	this.driver=driver;
		
	}

	//Methods for login submit
	public void enterusername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void loginbuton() {
		driver.findElement(btn_loginbutton).click();
		
	}
}
