import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class TestClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1350)");
		List<WebElement> links = driver.findElements(By.xpath("//div//table//tbody//tr//li//a"));
		List<String> brokenLinks = new ArrayList<String>();
		
		SoftAssert sfAs = new SoftAssert();
		for (WebElement e : links) {
			String url = e.getAttribute("href");
			URL link = new URL(url);

			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			//httpURLConnection.setConnectTimeout(5000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();
			int responseCode = httpURLConnection.getResponseCode();
			System.out.println(httpURLConnection.getResponseCode());
		sfAs.assertTrue(responseCode<400, e.getText() + " - " + httpURLConnection.getResponseMessage());
//			if (responseCode >400) {
//				System.out.println(e.getText() + " - " + httpURLConnection.getResponseMessage());
//				sfAs.assertTrue(false);
//				brokenLinks.add(url);
//			}else
//			{
//				System.out.println(e.getText() + " - " + httpURLConnection.getResponseMessage() + httpURLConnection.getResponseCode()  );
//				//brokenLinks.add(url);
//			}
		}
		 System.out.println("there are " + brokenLinks.size() + " broken links");
		 sfAs.assertAll();
	}

}
