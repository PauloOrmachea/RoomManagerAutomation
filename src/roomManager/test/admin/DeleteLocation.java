package roomManager.test.admin;

import static org.junit.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
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

	@Test(priority=2)
	public void TestDeleteLocation() throws Exception {
		String baseUrl;
		
		String username = ConfigReader.getRoomManagerUserName();
		String password = ConfigReader.getRoomManagerPassword();
		String locationName = "piso2";
		
		LoginPage login = new LoginPage(driver);
		AdminHomePage adminHomePage = login
			.enterUserName(username)
			.enterPassword(password)
			.clickLoginButton();
		
/*		WebElement searchLocation = driver.findElement(By.name(locationName));		
		Actions dclick = new Actions(driver);
		dclick.doubleClick(searchLocation);
		dclick.perform();
		*/
	    
	    driver.findElement(By.linkText("Locations")).click();
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
	    driver.findElement(By.xpath("//button[2]")).click();
	    driver.findElement(By.cssSelector("button.btn.btn-primary")).click(); 
	    
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