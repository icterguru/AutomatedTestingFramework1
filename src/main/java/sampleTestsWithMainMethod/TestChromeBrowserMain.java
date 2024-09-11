package sampleTestsWithMainMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeBrowserMain {

	public static void main(String[] args) throws InterruptedException {
		// ChromDriver is a class
		// WebDriver is a interface which can be executed in any browser.
		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);
		driver.wait(5000); // The open page will be closed in 5 seconds
		driver.quit();// This will close all associated window opened by selenium
	}

}
