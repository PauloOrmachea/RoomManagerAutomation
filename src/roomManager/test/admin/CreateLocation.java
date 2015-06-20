package roomManager.test.admin;

import org.openqa.selenium.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import roomManager.pages.admin.homePage.AdminHomePage;
import roomManager.pages.admin.login.LoginPage;
import roomManager.pages.admin.locations.AddLocationPage;
import roomManager.pages.admin.locations.LocationPage;
import roomManager.util.ConfigReader;
import roomManager.util.WebDriverConfig;

public class CreateLocation {
	private WebDriver driver;
	  
	  @BeforeTest
	  public void beforeTest(){
	  }
	  @AfterTest
	  public void afterTest(){
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
	public void TestCreateResource() throws Exception {
		
		String username = ConfigReader.getRoomManagerUserName();
		String password = ConfigReader.getRoomManagerPassword();
		String locationName = "SeleniumLocationTest";
		String locationDisplayName = "SeleniumLocationTest";
		String locationDescription = "Deleteme";
		LoginPage login = new LoginPage(driver);
		AdminHomePage adminHomePage = login
			.enterUserName(username)
			.enterPassword(password)
			.clickLoginButton();
		LocationPage location =  adminHomePage
				.selectLocationsLink();
		AddLocationPage addLocation = location
			.clickAddLocationButton()
			.enterLocationName(locationName)
			.enterLocationDisplayName(locationDisplayName)
			.enterLocationDescription(locationDescription);
		location = addLocation
				.clickSaveLocationButton();
	}
} 