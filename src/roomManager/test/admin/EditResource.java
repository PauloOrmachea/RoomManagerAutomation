package roomManager.test.admin;

import static org.junit.Assert.*;
import org.openqa.selenium.*;
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

public class EditResource {
	private WebDriver driver;
	
	  @AfterTest
	  public void afterTest(){
	  }
	  @BeforeTest
	  public void beforeTest1(){
	  }
	  @BeforeSuite
	  public void beforeSuite() throws Exception {
		  driver = WebDriverConfig.getChromeDriver();
	  } 
	  @AfterSuite
	  public void afterSuite(){
		  driver.quit();
	  }
	  
	  @Test(priority=0)
	public void TestEditResource(){
		
		String username = ConfigReader.getRoomManagerUserName();
		String password = ConfigReader.getRoomManagerPassword();
		String resourceName = "SeleniumTest";
		String newResourceName = "Selenium";
		String newResourceDisplayName = "Selenium";
		String newResourceDescription = "Deleteme";

		LoginPage login = new LoginPage(driver);
		AdminHomePage adminHomePage = login
			.enterUserName(username)
			.enterPassword(password)
			.clickLoginButton();
		ResourcesPage resources =  adminHomePage
				.selectResourcesLink();
		ResourcesPage resourceNew = resources
				.searchResourceByName(resourceName);
		AddResourcesPage resourceNewRes = resourceNew.
				doubleClickTableElement();
		AddResourcesPage resourceNewResEd = resourceNewRes
				.enterResourceName(newResourceName)
				.enterResourceDisplayName(newResourceDisplayName)
				.enterResourceDescription(newResourceDescription);
		resources = resourceNewResEd
				.clickSaveResourceButton();
				
	  }
}


