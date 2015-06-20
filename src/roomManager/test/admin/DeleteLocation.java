package roomManager.test.admin;

import org.openqa.selenium.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import roomManager.pages.admin.homePage.AdminHomePage;
import roomManager.pages.admin.login.LoginPage;
import roomManager.pages.admin.locations.DeleteLocationPage;
import roomManager.pages.admin.locations.LocationPage;
import roomManager.util.ConfigReader;
import roomManager.util.WebDriverConfig;

public class DeleteLocation {
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
	public void TestDeleteLocation() throws Exception {

		String username = ConfigReader.getRoomManagerUserName();
		String password = ConfigReader.getRoomManagerPassword();
		
		LoginPage login = new LoginPage(driver);
		AdminHomePage adminHomePage = login
			.enterUserName(username)
			.enterPassword(password)
			.clickLoginButton();
		LocationPage location = adminHomePage
				.selectLocationsLink();
		DeleteLocationPage deleteLocation = location
				.clickTableElementCheckBox()
				.clickDeleteLocationButton();
		location = deleteLocation
				.clickDeleteLocationButton();
	}
}
