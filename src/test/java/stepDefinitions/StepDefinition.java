package stepDefinitions;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	
	ChromeOptions options = new ChromeOptions();
	WebDriver driver = new ChromeDriver(options.addArguments("--disable-notifications"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);

	@Given("Launch the Salesforce application")
	public void launch_the_salesforce_application() {
	   driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://login.salesforce.com/");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("chinnu@wellcare.com");
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("lakshmi@17");
	driver.findElement(By.id("Login")).click();
	System.out.println(driver.getTitle());
	}

	@When("User is on the HomePage, click on the AppLauncher")
	public void user_is_on_home_page_click_on_app_launcher()  {
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
	System.out.println("App Launcher Clicked");
	}

	@When("Select Sales from AppLauncher")
	public void selcted_sales_from_app_launcher() throws InterruptedException {
	Thread.sleep(10000);
	driver.findElement(By.xpath("//p[@class='slds-truncate']//following::p[6]//preceding::p[5]")).click();
	System.out.println("Clicked Sales");
	}

	@When("User is on sales Dashboard click on Leads")
	public void user_is_on_sales_dashboard_click_on_leads() {
	driver.findElement(By
	.xpath("//div[@class='slds-grid slds-has-flexi-truncate navUL']//child::one-app-nav-bar-item-root[4]"))
	.click();
	System.out.println("Leads");
	System.out.println(driver.getTitle());
	}

	@When("Click on New to create a New Lead")
	public void click_on_new_to_create_a_new_lead() throws InterruptedException {
	Thread.sleep(6000);
	driver.findElement(By.xpath("//div[@title='New']")).click();
	String titleNewLeads = driver.findElement(By.xpath("//h2[text()='New Lead']")).getText();
	System.out.println(titleNewLeads);
	}

	@When("Enter all the Mandatory Fileds {string} {string} {string} and click Save")
	public void enter_all_the_mandatory_fileds_nike_and_click_save(String First_Name, String Last_Name,
	String Company) {
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(First_Name);
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Last_Name);
	driver.findElement(By.xpath("//label[text()='Company']/following::input[1]")).sendKeys(Company);
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();

	}

	@Then("Lead should be created using given Name successfully")
	public void lead_should_created_using_given_name_successfully() {
	String msg = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).getText();
	System.out.println(msg);
	       }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
