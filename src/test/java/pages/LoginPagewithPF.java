package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagewithPF {
	WebDriver driver;

	// Initiating PageFactory using initElements
	
	public LoginPagewithPF(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	// Using Annotations
	
		@FindBy(id="username")
		@CacheLookup
		WebElement txtUserName;
		
		@FindBy(id="password")
		@CacheLookup
		WebElement txtPassword;
		@FindBy(id="Login")
		@CacheLookup
		WebElement btnLogin;
		
		// Method
		public void launchApplication(String Url) {
			driver.get(Url);
		}

		public void enterUserName(String UserName) {
	      (txtUserName).sendKeys(UserName);
		}

		public void enterPassword(String Password) {
			(txtPassword).sendKeys(Password);
		}

		public void clickLoginBtn() {
			btnLogin.click();

		}

	}
		

