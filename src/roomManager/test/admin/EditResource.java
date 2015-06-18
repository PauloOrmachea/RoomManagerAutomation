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
	  
	  @Test(priority=0)
	public void TestEditResource() throws Exception {
		
		String username = ConfigReader.getRoomManagerUserName();
		String password = ConfigReader.getRoomManagerPassword();
		String resourceName = "tech48";
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
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(resourceName);
		driver.findElement(By.cssSelector("div.ng-scope > span.ng-binding")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(newResourceName);
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(newResourceDisplayName); 
	    driver.findElement(By.xpath("//textarea")).clear();
		driver.findElement(By.xpath("//textarea")).sendKeys(newResourceDescription);
		driver.findElement(By.cssSelector("button.info")).click();

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

/*

driver.findElement(By.xpath("//input[@type='text']")).clear();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("techzone48");
driver.findElement(By.cssSelector("div.ng-scope > span.ng-binding")).click();
driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("tech48");
driver.findElement(By.xpath("//textarea")).clear();
driver.findElement(By.xpath("//textarea")).sendKeys("tech48");
driver.findElement(By.cssSelector("button.info")).click();
 
*/