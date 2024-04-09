
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	By usernametxt = By.id("username");
	By passwordtxt = By.id("password");
	By loginBtn = By.id("Login");

	// Locators for WebElement in Login page

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	
}
	// Test Methods

	public void launchApplication(String Url) {
		driver.get(Url);
	}

	public void enterUserName(String UserName) {
      driver.findElement(usernametxt).sendKeys(UserName);
	}

	public void enterPassword(String Password) {
		driver.findElement(passwordtxt).sendKeys(Password);
	}

	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
		
	}

	public void getPageTitle() {
		System.out.println("Get the Title:"+driver.getTitle());
	}

}