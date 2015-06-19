package roomManager.test.admin;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import roomManager.pages.admin.homePage.AdminHomePage;
import roomManager.pages.admin.login.LoginPage;
import roomManager.pages.admin.resources.AddResourcesPage;
import roomManager.pages.admin.resources.ResourcesPage;
import roomManager.util.ConfigReader;
import roomManager.util.WebDriverConfig;

public class CreateResource {
	private WebDriver driver;
	  
	  @BeforeTest
	  public void beforeTest(){
	  }
	  @AfterTest
	  public void afterTest(){
	  }
	
	@Test(priority=1)
	public void TestCreateResource() throws Exception {
		
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
		
		//4.-Method for Click in the resources button
		ResourcesPage resources =  adminHomePage
				.selectResourcesLink();
		
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
		
		//Assert.assertTrue(isElementPresent(By.name(resourceName)),"Resource not created");
	}
	/*  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }*/
	
	@BeforeSuite
	public void beforeSuite() throws Exception {
		driver = WebDriverConfig.getChromeDriver();
	} 
	@AfterSuite
	public void afterSuite(){
		driver.quit();
	}
	
} 