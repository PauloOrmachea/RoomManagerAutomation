package roomManager.test.admin;

import org.openqa.selenium.*;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import roomManager.pages.admin.homePage.AdminHomePage;
import roomManager.pages.admin.login.LoginPage;
import roomManager.pages.admin.locations.LocationPage;
import roomManager.pages.admin.locations.AddLocationPage;
import roomManager.util.ConfigReader;
import roomManager.util.WebDriverConfig;

public class EditLocation {
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
		String newLocationName = "SeleniumLocation";
		String newLocationDisplayName = "SeleniumLocation";
		String NewLocationDescription = "Deleteme";
		
		LoginPage login = new LoginPage(driver);
		AdminHomePage adminHomePage = login
			.enterUserName(username)
			.enterPassword(password)
			.clickLoginButton();
		LocationPage location = adminHomePage
				.selectLocationsLink();
		AddLocationPage EditLocation = location
				.clickTableElementCheckBox()
				.doubleClickTableElement();
		AddLocationPage NewLocation = EditLocation
				.enterLocationName(newLocationName)
				.enterLocationDisplayName(newLocationDisplayName)
				.enterLocationDescription(NewLocationDescription);
		location = NewLocation
				.clickSaveLocationButton();
	}
}
