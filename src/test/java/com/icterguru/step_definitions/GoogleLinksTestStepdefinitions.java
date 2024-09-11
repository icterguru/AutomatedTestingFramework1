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
 
public class GoogleLinksTestStepdefinitions {
 
    WebDriver driver;
     
    @Before
    public void setUp() throws InterruptedException {
 
    	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    	
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
    	driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
        
 
    }
      
   
    @Given("I go to Google Home page")
    public void i_go_to_google_home_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
     	  driver.get("https://google.com");
        	String title = driver.getTitle();
    		System.out.println("Title of the web page is: " + title);
    		String url = driver.getCurrentUrl();
    		System.out.println("URL of the page is: " + url);
    		Thread.sleep(5000); // The open page will be closed in 5 seconds

    }
    @When("I click on the Privacy link")
    public void i_click_on_the_privacy_link() {
    	driver.findElement(By.linkText("Privacy")).click();
    	
    }
    @Then("I see the Privacy page")
    public void i_see_the_privacy_page() throws InterruptedException {
           	
    	Assert.assertEquals(true, driver.getPageSource().contains("Privacy Policy")); 	
    	
		Thread.sleep(5000);
		
    }


    @When("I click on the Terms link")
    public void i_click_on_the_terms_link() {
        // Write code here that turns the phrase above into concrete actions
    	driver.findElement(By.linkText("Terms")).click();
    }
    @Then("I see the Terms page")
    public void i_see_the_terms_page() {
        // Write code here that turns the phrase above into concrete actions
     //Assert.assertEquals(1, 0);
     Assert.assertEquals(true, driver.getPageSource().contains("Terms"));
    	
    }


    @After
    public void teardown() {
 
        driver.quit();
    }
   
}