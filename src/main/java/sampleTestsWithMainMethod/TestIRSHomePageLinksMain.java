package sampleTestsWithMainMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestIRSHomePageLinksMain {

	//private WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// ChromDriver is a class
		// WebDriver is an interface which can be executed in any browser.
		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // Creates the object "driver" of the "ChromeDriver" class 

		driver.get("https://www.irs.gov"); // Opens up the Website with the given URL

		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);

		Thread.sleep(5000); // The open page will be closed in 5 seconds

		//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//		Thread.sleep(2000);   // temporary wait	  
		/*	
		driver.findElement(By.id("accessible-megamenu-nav-item-0")).click();
		if (driver.getPageSource().contains("File"))
			System.out.println("The File menu link works");
		else
			System.out.println("The File menu link does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Filing information for"));
		Thread.sleep(2000);//
		 */

		driver.findElement(By.xpath("//*[@id=\"accessible-megamenu-nav-item-0\"]")).click();
		if (driver.getPageSource().contains("File")) {
			System.out.println("The File menu link works");
			System.out.println(2+3);
			System.out.println("2+3");
			System.out.println("2 " + " 3");
			System.out.println("Rahima"+"Akter");
			
			System.out.println("Rahima "+"Akter");
			System.out.println("Rahima" +" Akter");
			System.out.println("Rahima "+" Akter");
			System.out.println("Rahima"+ " " +"Akter");
			System.out.println("Rahima"+ "\t" +"Akter");
			System.out.println("Rahima"+ "\n" +"Akter");
			
			System.out.println("Rahima\\"+ "\\" +"Akter");
			System.out.println("Rahima"+ "\\" +"Akter");
					
			System.out.println("Rahima"+ "\\\\\\" +"Akter");
			System.out.println("Rahima"+ "\\\\" +"Akter");
			
			
			
		}else
			System.out.println("The File menu link does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Filing information for"));
		Thread.sleep(2000);

		Thread.sleep(2000);
		System.out.println(driver.getPageSource().contains("Rahima"));

		/*
		 driver.findElement(By.id("accessible-megamenu-nav-item-1")).click();
		if (driver.getPageSource().contains("Pay"))
			System.out.println("The Pay menu link works");
		else
			System.out.println("The Pay menu link does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Filing information for"));
		Thread.sleep(2000);
		 */

		System.out.println(driver.getPageSource().contains("Pay"));

		driver.findElement(By.xpath("//*[@id=\"accessible-megamenu-nav-item-1\"]")).click();

		if (driver.getPageSource().contains("Pay"))
			System.out.println("The Pay menu link works");
		else
			System.out.println("The Pay menu link does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Filing information for"));
		Thread.sleep(2000);//

		/*
		//driver.findElement(By.id("accessible-megamenu-nav-item-2")).click();
		if (driver.getPageSource().contains("Refunds"))
			System.out.println("The Refunds menu link works");
		else
			System.out.println("The Refunds menu link does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Filing information for"));
		Thread.sleep(2000);////
		 */

		driver.findElement(By.xpath("//*[@id=\"accessible-megamenu-nav-item-2\"]")).click();
		if (driver.getPageSource().contains("Refunds"))
			System.out.println("The Refunds menu link works");
		else
			System.out.println("The Refunds menu link does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Filing information for"));
		Thread.sleep(2000);//


		driver.quit();// This will close all associated window opened by Selenium

	}

}
