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

public class IRSHomePageStepDefinitions {

	WebDriver driver;

	@Before
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 

	}


	@Given("I go to IRS Home page")
	public void i_go_to_irs_home_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://irs.gov");
		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);
		Thread.sleep(5000); // The open page will be closed in 5 seconds

	}
	
	/*
	@When("I click on the File link")
	public void i_click_on_the_file_link() {
		driver.findElement(By.xpath("//*[@id=\"accessible-megamenu-nav-item-0\"]")).click();
		// //*[@id="accessible-megamenu-nav-item-0"]

	}
	@Then("I see the File page")
	public void i_see_the_file_page() throws InterruptedException {
		Assert.assertEquals(true, driver.getPageSource().contains("File")); 	
		Thread.sleep(5000);
	}


	@When("I click on the Pay link")
	public void i_click_on_the_pay_link() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Pay")).click();
	}
	@Then("I see the Pay page")
	public void i_see_the_pay_page() {
		// Write code here that turns the phrase above into concrete actions
		//Assert.assertEquals(1, 0);
		Assert.assertEquals(true, driver.getPageSource().contains("Pay"));

	}


	@When("I click on the Refunds link")
	public void i_click_on_the_refunds_link() {
		driver.findElement(By.linkText("Refunds")).click();

	}

	@Then("I see the Refunds page")
	public void i_see_the_refunds_page() throws InterruptedException {

		Assert.assertEquals(true, driver.getPageSource().contains("Refunds")); 	

		Thread.sleep(5000);

	}
	 */

	@When("I click on the {string} link")
	public void i_click_on_the_link(String menuLinkText) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText(menuLinkText)).click();
		Thread.sleep(2000);   // temporary wait

	}
	
	@Then("I see the {string} page")
	public void i_see_the_page(String menuLinkPage) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, driver.getPageSource().contains(menuLinkPage));
		Thread.sleep(2000);   // temporary wait

	}

	@After
	public void teardown() {

		driver.quit();
	}

}