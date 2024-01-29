
//import static org.junit.Assert.assertEquals;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.tools.javac.Main;
//import org.junit.Assert;
import org.junit.Test;
import org.testng.Assert;
//import org.testng.*;
import org.testng.asserts.*;
//import org.tes

public class SalesforceLogin {

	public static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hasna\\OneDrive\\Documents\\selenium chrome path\\ChromeDriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		try {
		
		// login to salesforce
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("packagetest@devorg1.com");
		driver.findElement(By.name("pw")).sendKeys("SFQA!321");
		driver.findElement(By.name("Login")).click();
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	      
		
		// Open App Launcher and search for account
		
		driver.findElement(By.cssSelector("button.salesforceIdentityAppLauncherHeader")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@part='input']")).sendKeys("accounts");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		
		// Select an existing Account and Update it
		
		WebElement selectListView = driver.findElement(By.xpath("//button[@title='Select a List View: Accounts']"));
		selectListView.click();
		
		WebElement allAccounts = driver.findElement(By.xpath("//span[text()='All Accounts']"));
		allAccounts.click();
		
		
		
		WebElement sForceAccount1 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[1]/div/div/div/div/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div[1]/div/div/table/tbody/tr[9]/th/span/a"));
		sForceAccount1.click();
		
	
		
		WebElement editDropdown = driver.findElement(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___sfa__-account_rec_-l___-account___-v-i-e-w/forcegenerated-flexipage_account_rec_l_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[1]/slot/flexipage-component2/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_account___012000000000000aaa___compact___view___recordlayout2/records-highlights2/div[1]/div[1]/div[3]/div/runtime_platform_actions-actions-ribbon/ul/li[4]/lightning-button-menu/button"));
		editDropdown.click();
		
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"brandBand_2\"]/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___sfa__-account_rec_-l___-account___-v-i-e-w/forcegenerated-flexipage_account_rec_l_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[1]/slot/flexipage-component2/slot/records-lwc-highlights-panel/records-lwc-record-layout/forcegenerated-highlightspanel_account___012000000000000aaa___compact___view___recordlayout2/records-highlights2/div[1]/div[1]/div[3]/div/runtime_platform_actions-actions-ribbon/ul/li[4]/lightning-button-menu/div/div/slot/runtime_platform_actions-action-renderer[5]"));
		edit.click();
		Thread.sleep(1000);
		WebElement typePicklist = driver.findElement(By.xpath("//button[@aria-label='Type, --None--']"));
		typePicklist.click();
		
		Thread.sleep(2000);
		
		WebElement updateToInstallationPartner = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Installation Partner']"));
		updateToInstallationPartner.click();
		
		WebElement saveRecord = driver.findElement(By.xpath("//button[@name='SaveEdit']"));
		saveRecord.click();
		
		Thread.sleep(5000);
		
		WebElement recordDetailsTab = driver.findElement(By.xpath("//a[@id='detailTab__item']"));
		recordDetailsTab.click();
		WebElement editTypeOnRecordDetailPage = driver.findElement(By.xpath("//button[@title='Edit Type']"));
		editTypeOnRecordDetailPage.click();
		
		driver.findElement(By.xpath("//button[@aria-label='Type, Installation Partner']")).click();
		driver.findElement(By.xpath("//lightning-base-combobox-item[.='--None--']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		
		
		createContact();
		Thread.sleep(3000);
		deleteContact();
		taskCreationComponent();
		
		
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// continue from here now need to explore how to check do next function when page is completely loaded

	}
	
	//Method to Create a contact related to account
	
	public static void createContact() throws InterruptedException {
		
		
		Thread.sleep(2000);
		WebElement relatedListTab =  driver.findElement(By.xpath("//a[@id=\"relatedListsTab__item\"]"));
		relatedListTab.click();
		
		WebElement newConBtn = driver.findElement(By.xpath("//button[@name=\"NewContact\"]"));
		newConBtn.click();
		
		
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Test Contact Sel Script 1");
		
		driver.findElement(By.xpath("//input[@placeholder='Search Contacts...']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Contacts...']")).sendKeys("Sidhartha");
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='0032t00000RCZX5AAP']")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		System.out.println("Contact Created");

	}

	//Method delete the Above contact
	
	
	
	public static  void deleteContact() throws InterruptedException{
		
	
		
		String conDeleted = "Your recently created contact has been deleted successfully";
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/div/one-record-home-flexipage2/forcegenerated-adg-rollup_component___force-generated__flexipage_-record-page___sfa__-account_rec_-l___-account___-v-i-e-w/forcegenerated-flexipage_account_rec_l_account__view_js/record_flexipage-desktop-record-page-decorator/div[1]/records-record-layout-event-broker/slot/slot/flexipage-record-home-template-desktop2/div/div[2]/div[1]/slot/flexipage-component2/slot/flexipage-tabset2/div/lightning-tabset/div/slot/slot/flexipage-tab2[1]/slot/flexipage-component2[2]/slot/lst-related-list-container/div/div[1]/lst-related-list-single-container/laf-progressive-container/slot/lst-related-list-single-app-builder-mapper/article/lst-related-list-view-manager/lst-common-list-internal/div/div/lst-primary-display-manager/div/lst-primary-display/lst-primary-display-card/lst-customized-template-list/div/lst-template-list-item-factory[3]/lst-related-preview-card/article/slot/lst-template-list-field/lst-list-view-row-level-action/lightning-button-menu/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[8]/div/ul/li[2]/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div[3]/div/button[2]")).click();
		//Thread.sleep(5000);
		//driver.quit();
		System.out.println(conDeleted);
		
	}
	
	@Test
	public static void taskCreationComponent() throws  InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@title='New Task']")).click();
		Thread.sleep(5000);
		WebElement subject =driver.findElement(By.xpath("//input[@aria-haspopup='listbox']"));
		subject.click();
		subject.sendKeys("Call");
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Call']")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[2]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div[2]/div[2]/button")).click();
		Thread.sleep(5000);
		System.out.println("Task has been created successfully");
		
		WebElement openTaskFromAppLauncher = driver.findElement(By.xpath("/html/body/div[4]/div[1]/section/div[1]/div[1]/one-appnav/div/div/div/div/one-app-launcher-header/button"));
		openTaskFromAppLauncher.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div[2]/one-app-launcher-menu/div/one-app-launcher-search-bar/lightning-input/div/div/input")).sendKeys("Tasks");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();		
		//softAsserts(callTask, taskCreatedTrue);
		Thread.sleep(2000);
		WebElement subjectIsCall = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grid itemBody']/span[.='Call']"));
		subjectIsCall.getText();
		String callTask = "Call";
		
		Assert.assertSame(callTask, subjectIsCall);
		//Assert.assertEquals(callTask, callTask, subjectIsCall);
		
	
		
	
	}

	

}
