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
/*	  private boolean isElementPresent(By by) {
		    try {driver.findElement(by);
		      return true;} catch (NoSuchElementException e) {return false;}
		  }*/

	@Test(priority=1)
	public void TestCreateResource() throws Exception {
		
		//1.-Variables for run the test case - need replace for a external data-driven
		String username = ConfigReader.getRoomManagerUserName();
		String password = ConfigReader.getRoomManagerPassword();
		String locationName = "SeleniumLocationTest";
		String locationDisplayName = "SeleniumLocationTest";
		String locationDescription = "Deleteme";
		
		//2.-Instance the login page
		LoginPage login = new LoginPage(driver);
				
		//3.-Method for login into Room Manager
		AdminHomePage adminHomePage = login
			.enterUserName(username)
			.enterPassword(password)
			.clickLoginButton();
		
		//4.-Method for Click in the resources button
		LocationPage location =  adminHomePage
				.selectLocationsLink();
		
		//5.-Method for call the add resource page and introduce the resource name, display name, description
		AddLocationPage addLocation = location
			.clickAddLocationButton()
			.enterLocationName(locationName)
			.enterLocationDisplayName(locationDisplayName)
			.enterLocationDescription(locationDescription);
		
		//6.-Method for Save the new resource
		location = addLocation
				.clickSaveLocationButton();
		//Assert.assertTrue(isElementPresent(By.name(locationName)),"Location not created");
	}
} 