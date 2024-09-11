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

public class GmailSigninPageStepDefinitions {

	WebDriver driver;

	@Before
	public void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 

	}

	@Given("I go to Gmail Sign In  page")
	public void i_go_to_gmail_sign_in_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);
		Thread.sleep(5000); // The open page will be closed in 5 seconds
	}

	@When("I click on the Sign In link")
	public void i_click_on_the_Sign_In_link() {
		driver.findElement(By.linkText("Sign in")).click();

	}


	@When("I enter my email address and password")
	public void i_enter_my_email_address_and_password() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("identifierId")).sendKeys("example@gmail.com");
		Thread.sleep(2000);
		//	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		//	driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("12345678");

		Thread.sleep(2000);

	}
	@When("I click on the Next button")
	public void i_click_on_the_next_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.cssSelector("//*[@id=\"passwordNext\"]/div/button/span")).click();

		Thread.sleep(3000);
	}

	@Then("I can sign in my account")
	public void i_can_sign_in_my_account() {
		// Write code here that turns the phrase above into concrete actions


	}




	@After
	public void teardown() {

		driver.quit();
	}

}