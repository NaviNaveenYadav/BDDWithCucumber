package stepDefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef {
	
	WebDriver driver;

	@Given("User is on Google Home page")
	public void user_is_on_google_home_page() {
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	
	@When("User search Java Tutorial")
	public void user_search_java_tutorial() {

		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.submit();
		
	}
	
	@Then("Should display Java Result page")
	public void should_display_java_result_page() {
		Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	}
	
	@When("User search Selenium Tutorial")
	public void user_search_Selenium_tutorial() {

		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Selenium Tutorial");
		srcBox.submit();
		
	}
	
	@Then("Should display Selenium Result page")
	public void should_display_Selenium_result_page() {
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	}

	
}
