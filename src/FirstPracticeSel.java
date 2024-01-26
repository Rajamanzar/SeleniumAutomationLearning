import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPracticeSel {

	public static void main(String[] args) {
		
		// First Invoking Browser
		// Chrome - ChromeDriver exten -> Methods (Close , get etc)
		// Webdriver -> in webdriver we have all methods but initially they are empty we will use same method with browser 
		// driver methods if we use Separately chrome driver then we can't use that code from another driver e.g. Firefox, safari etc
		// ChromeDriver driver = new ChromeDriver();
		
		//WebDriver driver = new ChromeDriver();
		
		// ChromeDriver.exe -> Chrome Browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// webdriver.chrome.driver => value of path
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
