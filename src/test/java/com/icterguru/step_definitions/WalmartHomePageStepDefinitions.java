package com.icterguru.step_definitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WalmartHomePageStepDefinitions {

	WebDriver driver;

	@Before
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 

	}


	@Given("I go to Walmart Home page")
	public void i_go_to_walmart_home_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://www.walmart.com");
		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);
		Thread.sleep(5000); // The open page will be closed in 5 seconds

	}
	
	
	@When("I click on the Walmart\"Departments\" link")
	public void i_click_on_the_walmart_departments_link() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/div/section/section/nav/div/div[2]/ul/li[8]/button/span")).click();
	}



	
	@When("I click on the Departments link")
	public void i_click_on_the_departments_link() {
		driver.findElement(By.xpath("//*[@id=\"accessible-megamenu-nav-item-0\"]")).click();
		// //*[@id="accessible-megamenu-nav-item-0"]

	}
	@Then("I see the Departments page")
	public void i_see_the_department_page() throws InterruptedException {
		Assert.assertEquals(true, driver.getPageSource().contains("Department")); 	
		Thread.sleep(5000);
	}


	@When("I click on the Services link")
	public void i_click_on_the_services_link() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Services")).click();
	}
	@Then("I see the Services page")
	public void i_see_the_services_page() {
		// Write code here that turns the phrase above into concrete actions
		//Assert.assertEquals(1, 0);
		Assert.assertEquals(true, driver.getPageSource().contains("Services"));

	}


		 

	@When("I click on the Walmart {string} link")
	public void i_click_on_the_walmart_link(String menuLinkText) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText(menuLinkText)).click();
		Thread.sleep(2000);   // temporary wait

	}
	
	@Then("I see the Walmart {string} page")
	public void i_see_the_walmart_page(String menuLinkPage) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, driver.getPageSource().contains(menuLinkPage));
		Thread.sleep(2000);   // temporary wait

	}

	@After
	public void teardown() {

		driver.quit();
	}

}