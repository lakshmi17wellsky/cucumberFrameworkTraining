package Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import enums.BrowserType;
import enums.ExecutionMode;
import Manager.*;

public class WebDriverManager {
 WebDriver driver ;
 private BrowserType browserType;
 private ExecutionMode executionMode;
 
	public WebDriverManager (){
		
		browserType=FileReaderManager.getInstance().getConfigFileReader().getBrowser();
		executionMode=FileReaderManager.getInstance().getConfigFileReader().getexecutionMode();
		
	}
private WebDriver createDriver()  {
	switch (executionMode) {
	case LOCAL:
	driver= createLocalDriver();
		break;
	case HEADLESS:
driver= createHEADLESS();
	break;
	}
    return driver;

}
       
private WebDriver createHEADLESS() {
	switch (browserType) {
	case CHROME:
		ChromeOptions options= new ChromeOptions();
		options.addArguments ("--disable notifications" );
		options.addArguments ("--headless=new" );
		driver=new ChromeDriver(options);	
		break;
	case FIREFOX:
		FirefoxOptions Ff = new FirefoxOptions();
			Ff.addArguments ("--disable notifications" );
			Ff.addArguments ("--firefox=new" );
		driver=new FirefoxDriver(Ff);
	     break;
	}

  return driver;
}
private WebDriver createLocalDriver() {
	switch (browserType) {
	case CHROME:
		ChromeOptions options= new ChromeOptions();
		options.addArguments ("--disable notifications" );
		driver=new ChromeDriver();
	break;
	case FIREFOX:
		driver=new FirefoxDriver();
	break;
	}

  return driver;
}

}
	
