package googleSearch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSteps {
	WebDriver driver;

	@Before(value = "@Test1", order = 1)
	public void setupForChrome() {
		System.out.println("Inside chrome setup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	@Before(value = "@Test2", order = 2)
	public void setupForMozzila() {
		System.out.println("Inside mozzila setup");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

//		WebDriverManager.firefoxdriver().setup();
//		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

	@Given("User is on the google page")
	public void user_is_on_the_google_page() {
		driver.get("https://www.google.com");
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("User enters CapGemini")
	public void user_enters_cap_gemini() {
		driver.findElement(By.name("q")).sendKeys("Capgemini");
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("Clicks on search button")
	public void clicks_on_search_button() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("User gets result in Chrome browser")
	public void user_gets_result_in_chrome_browser() {
		System.out.println("Result Found in Chrome");

		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Given("User is on google page")
	public void user_is_on_google_page() {
		driver.get("https://www.google.com");
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@When("User enters Accenture")
	public void user_enters_accenture() {
		driver.findElement(By.name("q")).sendKeys("Accenture");
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@And("Click on search button")
	public void click_on_search_button() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}

	@Then("User gets result in Mozilla Firefox")
	public void user_gets_result_in_mozilla_firefox() {
		System.out.println("Result Found in Mozilla");
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}
	@After
	public void afterSetup() {
		driver.quit();
	}
}
