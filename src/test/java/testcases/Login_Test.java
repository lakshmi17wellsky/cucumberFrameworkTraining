


package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.LoginPage;

public class Login_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 ChromeOptions options= new ChromeOptions();
 
 WebDriver driver = new ChromeDriver(options.addArguments("--disable-notifications"));
 driver.get("https://login.salesforce.com"); 
	LoginPage login = new LoginPage(driver); 
	//login.launchApplication("https://login.salesforce.com");
			  login.enterUserName("chinnu@wellcare.com");
			  login.enterPassword("lakshmi@17"); 
			  login.clickLoginBtn();
			  System.out.println(driver.getTitle());
			  System.out.println("LoginTest Run Successfully");
			 }

}






