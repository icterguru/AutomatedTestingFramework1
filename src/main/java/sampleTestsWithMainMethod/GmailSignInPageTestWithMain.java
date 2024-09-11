package sampleTestsWithMainMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignInPageTestWithMain {

	//private WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// ChromDriver is a class
		// WebDriver is an interface which can be executed in any browser.
		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // Creates the object "driver" of the "ChromeDriver" class 

		driver.get("https://www.google.com"); // Opens up the Website with the given URL

		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);

		Thread.sleep(2000); // The open page will be closed in 5 seconds
		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(1000);
		driver.findElement(By.id("identifierId")).sendKeys("example@gmail.com");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"next\"]/div/div/a")).click();
		
	//	driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("12345678");
		Thread.sleep(1000);
		
		

		Thread.sleep(2000);//


		driver.quit();// This will close all associated window opened by Selenium

	}

}
