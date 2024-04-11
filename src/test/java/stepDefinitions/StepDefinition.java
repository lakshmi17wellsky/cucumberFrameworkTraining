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
import pages.LoginPage;

public class StepDefinition {
	
	WebDriver driver;
	LoginPage login= new LoginPage(this.driver);
	@Given("Launch the Salesforce application")
	public void launch_the_salesforce_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is on the HomePage, click on the AppLauncher")
	public void user_is_on_the_home_page_click_on_the_app_launcher() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Select Sales from AppLauncher")
	public void select_sales_from_app_launcher() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is on sales Dashboard click on Leads")
	public void user_is_on_sales_dashboard_click_on_leads() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on New to create a New Lead")
	public void click_on_new_to_create_a_new_lead() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter all the Mandatory Fileds {string} {string} {string} and click Save")
	public void enter_all_the_mandatory_fileds_and_click_save(String FirstName, String LastName, String Company) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Lead should be created using given Name successfully")
	public void lead_should_be_created_using_given_name_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
