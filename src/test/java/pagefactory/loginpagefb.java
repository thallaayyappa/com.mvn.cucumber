package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpagefb {
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_username;
	
	@FindBy(id="pass")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement btn_loginbtn;
	
	public void enterusername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void btnlogin() {
		btn_loginbtn.click();
	}
	
	
	
	
}
