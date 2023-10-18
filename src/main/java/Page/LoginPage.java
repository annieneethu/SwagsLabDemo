package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	By uname= By.id("user-name");
	By pass= By.id("password");
	By login= By.id("login-button");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}



	public void logs(String username, String password) {
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(login).click();
	}
}
