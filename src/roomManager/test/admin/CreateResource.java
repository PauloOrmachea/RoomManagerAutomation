package roomManager.test.admin;

import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//Libraries for the pages
import roomManager.pages.admin.homePage.AdminHomePage;
import roomManager.pages.admin.login.LoginPage;
import roomManager.pages.admin.resources.AddResourcesPage;
import roomManager.pages.admin.resources.ResourcesPage;
import roomManager.util.ConfigReader;

//Libraries for configure  the web driver
import roomManager.util.WebDriverConfig;

//Annotation for take the screenshots
@Listeners(roomManager.util.ScreenShot.class) 
public class CreateResource {
	private WebDriver driver;
	
	@Test
	public void verifyAResourceIsCreated() throws Exception {
		
		//1.-Variables for run the test case - need replace for a external data-driven
		String username = ConfigReader.getRoomManagerUserName();
		String password = ConfigReader.getRoomManagerPassword();
		String resourceName = "SeleniumTest";
		String resourceDisplayName = "SeleniumTest";
		String resourceDescription = "Deleteme";
		String errorMessage = "The resource in not created";
		
		//2.-Instance the login page
		LoginPage login = new LoginPage(driver);
				
		//3.-Method for login into Room Manager
		AdminHomePage adminHomePage = login
			.enterUserName(username)
			.enterPassword(password)
			.clickLoginButton();

/*		
		//4.-Method for Click in the resources button
		ResourcesPage resources =  adminHomePage
				.selectResources();
		//5.-Method for call the add resource page and introduce the resource name, display name, description
		AddResourcesPage addResource = resources
			.clickAddResourceButton()
			.enterResourceName(resourceName)
			.enterResourceDisplayName(resourceDisplayName)
			.enterResourceDescription(resourceDescription);
		//6.-Method for Save the new resource
		resources = addResource
			.clickSaveResourceButton()
		//7.-This step search for the new resource and confirms if the existence of the new resource	
			.searchResourceByName(resourceName);
		assertEquals(errorMessage, resources.getTableElementbyName(), resourceName);
	*/
	}

	//For get the Chrome WebDriver from the util.WebDriverConfig	
	@BeforeTest
	public void setUp() throws Exception {
		driver = WebDriverConfig.chromeDriver();
	}
	
	//For close the InternetBrowser 	
	@AfterTest
	public void testTearDown(){
		driver.quit();
	}
} 