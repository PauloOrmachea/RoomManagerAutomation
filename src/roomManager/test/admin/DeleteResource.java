package roomManager.test.admin;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import roomManager.pages.admin.homePage.AdminHomePage;
import roomManager.pages.admin.login.LoginPage;
import roomManager.pages.admin.resources.DeleteResourcesPage;
import roomManager.pages.admin.resources.ResourcesPage;
import roomManager.util.ConfigReader;
import roomManager.util.WebDriverConfig;

public class DeleteResource {
	private WebDriver driver;
	
	  @AfterTest
	  public void afterTest(){
	  }
	  @BeforeTest
	  public void beforeTest(){
	  }

	@Test(priority=2)
	public void TestDeleteResource() throws Exception {
		
		String username = ConfigReader.getRoomManagerUserName();
		String password = ConfigReader.getRoomManagerPassword();
		String resourceName = "StessTest001";
		
		LoginPage login = new LoginPage(driver);
		AdminHomePage adminHomePage = login
			.enterUserName(username)
			.enterPassword(password)
			.clickLoginButton();
		ResourcesPage resources =  adminHomePage
				.selectResourcesLink();
		DeleteResourcesPage deleteResources = resources
				.searchResourceByName(resourceName)
				.clickTableElementCheckBox()
				.clickDeleteResourceButton();
		resources = deleteResources
				.clickDeleteResourceButton()
				.searchResourceByName(resourceName);
	}
	@BeforeSuite
	public void beforeSuite() throws Exception {
		driver = WebDriverConfig.getChromeDriver();
	} 
	@AfterSuite
	public void afterSuite(){
		driver.quit();
	}
}