package roomManager.test.admin;

import org.openqa.selenium.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
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
		@BeforeSuite
		public void beforeSuite() throws Exception {
			driver = WebDriverConfig.getChromeDriver();
		} 
		@AfterSuite
		public void afterSuite(){
			driver.quit();
		}

	@Test
	public void TestDeleteResource() throws Exception {
		
		String username = ConfigReader.getRoomManagerUserName();
		String password = ConfigReader.getRoomManagerPassword();
		String resourceN = "Selenium";
		
		LoginPage login = new LoginPage(driver);
		AdminHomePage adminHomePage = login
			.enterUserName(username)
			.enterPassword(password)
			.clickLoginButton();
		ResourcesPage resources =  adminHomePage
				.selectResourcesLink();
		DeleteResourcesPage deleteResources = resources
				.searchResourceByName(resourceN)
				.clickTableElementCheckBox()
				.clickDeleteResourceButton();
		resources = deleteResources
				.clickDeleteResourceButton()
				.searchResourceByName(resourceN);
	}
}

